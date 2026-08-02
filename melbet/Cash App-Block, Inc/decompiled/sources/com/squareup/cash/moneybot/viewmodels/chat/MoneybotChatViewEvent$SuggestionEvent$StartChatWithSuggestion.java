package com.squareup.cash.moneybot.viewmodels.chat;

import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;

/* loaded from: classes6.dex */
public final class MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion implements MoneybotChatViewEvent {
    public final ChatKickoffParams params;

    public MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion(ChatKickoffParams chatKickoffParams) {
        this.params = chatKickoffParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion) && this.params.equals(((MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion) obj).params);
    }

    public final int hashCode() {
        return this.params.hashCode();
    }

    public final String toString() {
        return "StartChatWithSuggestion(metadata=null, params=" + this.params + ")";
    }
}
