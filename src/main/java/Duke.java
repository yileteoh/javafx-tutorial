public class Duke {

    private String commandType;

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        String trimmedInput = input.trim();
        String commandWord = trimmedInput.isEmpty()
                ? ""
                : trimmedInput.split("\\s+", 2)[0].toLowerCase();

        switch (commandWord) {
        case "todo":
        case "deadline":
        case "event":
            commandType = "AddCommand";
            break;
        case "mark":
            commandType = "ChangeMarkCommand";
            break;
        case "delete":
            commandType = "DeleteCommand";
            break;
        default:
            commandType = null;
        }

        return "Duke heard: " + input;
    }

    public String getCommandType() {
        return commandType;
    }
}
