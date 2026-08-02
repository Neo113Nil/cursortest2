package com.squareup.cash.moneybot.backend.api.managers;

import com.squareup.cash.moneybot.backend.api.model.chat.Chat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ChatResult {
    public final Chat chat;

    public ChatResult(Chat chat) {
        this.chat = chat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatResult) && Intrinsics.areEqual(this.chat, ((ChatResult) obj).chat);
    }

    public final int hashCode() {
        Chat chat = this.chat;
        if (chat == null) {
            return 0;
        }
        return chat.hashCode();
    }

    public final String toString() {
        return "ChatResult(chat=" + this.chat + ")";
    }
}
