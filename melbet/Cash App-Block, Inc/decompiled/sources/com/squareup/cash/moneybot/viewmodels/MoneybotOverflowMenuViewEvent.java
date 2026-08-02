package com.squareup.cash.moneybot.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface MoneybotOverflowMenuViewEvent {

    public final class CancelDelete implements MoneybotOverflowMenuViewEvent {
        public static final CancelDelete INSTANCE = new CancelDelete();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelDelete);
        }

        public final int hashCode() {
            return 240583664;
        }

        public final String toString() {
            return "CancelDelete";
        }
    }

    public final class Close implements MoneybotOverflowMenuViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1800462035;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class ConfirmDelete implements MoneybotOverflowMenuViewEvent {
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

    public final class MenuItemClickEvent implements MoneybotOverflowMenuViewEvent {
        public final OverflowMenuItem item;

        public MenuItemClickEvent(OverflowMenuItem overflowMenuItem) {
            this.item = overflowMenuItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MenuItemClickEvent) && this.item == ((MenuItemClickEvent) obj).item;
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final String toString() {
            return "MenuItemClickEvent(item=" + this.item + ")";
        }
    }

    public final class OpenChat implements MoneybotOverflowMenuViewEvent {
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

    public final class OpenTerms implements MoneybotOverflowMenuViewEvent {
        public static final OpenTerms INSTANCE = new OpenTerms();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenTerms);
        }

        public final int hashCode() {
            return -249286126;
        }

        public final String toString() {
            return "OpenTerms";
        }
    }

    public final class RefreshChatHistory implements MoneybotOverflowMenuViewEvent {
        public static final RefreshChatHistory INSTANCE = new RefreshChatHistory();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RefreshChatHistory);
        }

        public final int hashCode() {
            return 1740414764;
        }

        public final String toString() {
            return "RefreshChatHistory";
        }
    }

    public final class ShowDebugSheet implements MoneybotOverflowMenuViewEvent {
        public static final ShowDebugSheet INSTANCE = new ShowDebugSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowDebugSheet);
        }

        public final int hashCode() {
            return 126630420;
        }

        public final String toString() {
            return "ShowDebugSheet";
        }
    }

    public final class SwipedToDelete implements MoneybotOverflowMenuViewEvent {
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
}
