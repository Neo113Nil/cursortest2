package com.squareup.cash.moneybot.backend.api.model.extension;

/* loaded from: classes4.dex */
public final class ExtensionConfig$Tool {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ExtensionConfig$Tool);
    }

    public final int hashCode() {
        return -557693948;
    }

    public final String toString() {
        return "Tool(name=launch_flow, description=Launch a flow with a client route. Provide a header text and a description that explains the flow being launched. We will complete the flow and respond with a message regarding how the flow was completed. The word \"flow\" should not be used in any of the text, say \"action\" instead if needed, configJson={\n  \"type\": \"object\",\n  \"properties\": {\n    \"client_route\": {\n      \"type\": \"string\",\n      \"description\": \"The client route to launch.\"\n    },\n    \"header_text\": {\n      \"type\": \"string\",\n      \"description\": \"The text as the header of the card that will allow the user to launch the client route\"\n    },\n    \"description\": {\n      \"type\": \"string\",\n      \"description\": \"The description to display under the header.\"\n    },\n     \"button_text\": {\n      \"type\": \"string\",\n      \"description\": \"The text to display on the button.\"\n    }\n  },\n  \"required\": [\"client_route\", \"header_text\", \"button_text\"]\n})";
    }
}
