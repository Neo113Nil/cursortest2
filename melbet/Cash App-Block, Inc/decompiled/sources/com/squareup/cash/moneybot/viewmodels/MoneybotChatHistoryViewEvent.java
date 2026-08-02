package com.squareup.cash.moneybot.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface MoneybotChatHistoryViewEvent {

    public final class CancelDelete implements MoneybotChatHistoryViewEvent {
        public static final CancelDelete INSTANCE = new CancelDelete();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelDelete);
        }

        public final int hashCode() {
            return 915696521;
        }

        public final String toString() {
            return "CancelDelete";
        }
    }

    public final class ConfirmDelete implements MoneybotChatHistoryViewEvent {
        public final String sessionId;

        public ConfirmDelete(String str) {
            this.sessionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmDelete) && this.sessionId.equals(((ConfirmDelete) obj).sessionId);
        }

        public final int hashCode() {
            return this.sessionId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmDelete(sessionId=", this.sessionId, ")");
        }
    }

    public final class Exit implements MoneybotChatHistoryViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -2022847518;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class LoadNextPage implements MoneybotChatHistoryViewEvent {
        public static final LoadNextPage INSTANCE = new LoadNextPage();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadNextPage);
        }

        public final int hashCode() {
            return 1591386604;
        }

        public final String toString() {
            return "LoadNextPage";
        }
    }

    public final class NewChatClicked implements MoneybotChatHistoryViewEvent {
        public static final NewChatClicked INSTANCE = new NewChatClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NewChatClicked);
        }

        public final int hashCode() {
            return -333133389;
        }

        public final String toString() {
            return "NewChatClicked";
        }
    }

    public final class OpenChat implements MoneybotChatHistoryViewEvent {
        public final String sessionId;

        public OpenChat(String str) {
            this.sessionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenChat) && this.sessionId.equals(((OpenChat) obj).sessionId);
        }

        public final int hashCode() {
            return this.sessionId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenChat(sessionId=", this.sessionId, ")");
        }
    }

    public final class SwipedToDelete implements MoneybotChatHistoryViewEvent {
        public final String sessionId;

        public SwipedToDelete(String str) {
            this.sessionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SwipedToDelete) && this.sessionId.equals(((SwipedToDelete) obj).sessionId);
        }

        public final int hashCode() {
            return this.sessionId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SwipedToDelete(sessionId=", this.sessionId, ")");
        }
    }

    public final class TryLoadingHistoryListAgain implements MoneybotChatHistoryViewEvent {
        public static final TryLoadingHistoryListAgain INSTANCE = new TryLoadingHistoryListAgain();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryLoadingHistoryListAgain);
        }

        public final int hashCode() {
            return 2137772051;
        }

        public final String toString() {
            return "TryLoadingHistoryListAgain";
        }
    }
}
