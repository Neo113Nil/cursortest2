package com.squareup.cash.moneybot.backend.api.managers;

import com.squareup.cash.moneybot.backend.api.model.chat.Chat;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ChatSession {

    public final class Error implements ChatSession {
        public final Chat chat;
        public final ChatSessionError error;
        public final String sessionId;

        public Error(Chat chat, String str, ChatSessionError chatSessionError) {
            this.chat = chat;
            this.sessionId = str;
            this.error = chatSessionError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.chat, error.chat) && Intrinsics.areEqual(this.sessionId, error.sessionId) && this.error.equals(error.error);
        }

        @Override // com.squareup.cash.moneybot.backend.api.managers.ChatSession
        public final Chat getChat() {
            return this.chat;
        }

        @Override // com.squareup.cash.moneybot.backend.api.managers.ChatSession
        public final String getSessionId() {
            return this.sessionId;
        }

        public final int hashCode() {
            Chat chat = this.chat;
            int hashCode = (chat == null ? 0 : chat.hashCode()) * 31;
            String str = this.sessionId;
            return this.error.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Error(chat=" + this.chat + ", sessionId=" + this.sessionId + ", error=" + this.error + ")";
        }
    }

    public final class NotInitialized implements ChatSession {
        public static final NotInitialized INSTANCE = new NotInitialized();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotInitialized);
        }

        @Override // com.squareup.cash.moneybot.backend.api.managers.ChatSession
        public final Chat getChat() {
            return null;
        }

        @Override // com.squareup.cash.moneybot.backend.api.managers.ChatSession
        public final String getSessionId() {
            return null;
        }

        public final int hashCode() {
            return 1327830262;
        }

        public final String toString() {
            return "NotInitialized";
        }
    }

    public final class Ok implements ChatSession {
        public final Chat chat;
        public final boolean isWaitingForResponse;
        public final String sessionId;

        public Ok(Chat chat, String str, boolean z) {
            this.chat = chat;
            this.sessionId = str;
            this.isWaitingForResponse = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ok)) {
                return false;
            }
            Ok ok = (Ok) obj;
            return Intrinsics.areEqual(this.chat, ok.chat) && Intrinsics.areEqual(this.sessionId, ok.sessionId) && this.isWaitingForResponse == ok.isWaitingForResponse;
        }

        @Override // com.squareup.cash.moneybot.backend.api.managers.ChatSession
        public final Chat getChat() {
            return this.chat;
        }

        @Override // com.squareup.cash.moneybot.backend.api.managers.ChatSession
        public final String getSessionId() {
            return this.sessionId;
        }

        public final int hashCode() {
            Chat chat = this.chat;
            int hashCode = (chat == null ? 0 : chat.hashCode()) * 31;
            String str = this.sessionId;
            return Boolean.hashCode(this.isWaitingForResponse) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ok(chat=");
            sb.append(this.chat);
            sb.append(", sessionId=");
            sb.append(this.sessionId);
            sb.append(", isWaitingForResponse=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isWaitingForResponse, ")");
        }
    }

    Chat getChat();

    String getSessionId();
}
