package com.squareup.cash.reactions.viewmodels;

/* loaded from: classes7.dex */
public abstract class ReactionViewEvent {

    public final class ShowAdditionalEmojis extends ReactionViewEvent {
        public static final ShowAdditionalEmojis INSTANCE = new ShowAdditionalEmojis();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowAdditionalEmojis);
        }

        public final int hashCode() {
            return 83353980;
        }

        public final String toString() {
            return "ShowAdditionalEmojis";
        }
    }

    public final class SubmitReaction extends ReactionViewEvent {
        public final String reaction;

        public SubmitReaction(String str) {
            str.getClass();
            this.reaction = str;
        }
    }

    public final class ViewCloseRequested extends ReactionViewEvent {
        public static final ViewCloseRequested INSTANCE = new ViewCloseRequested();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewCloseRequested);
        }

        public final int hashCode() {
            return 1987910022;
        }

        public final String toString() {
            return "ViewCloseRequested";
        }
    }

    public final class ViewClosed extends ReactionViewEvent {
        public static final ViewClosed INSTANCE = new ViewClosed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewClosed);
        }

        public final int hashCode() {
            return -479192420;
        }

        public final String toString() {
            return "ViewClosed";
        }
    }

    public final class ViewInitialized extends ReactionViewEvent {
        public static final ViewInitialized INSTANCE = new ViewInitialized();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewInitialized);
        }

        public final int hashCode() {
            return 1402448804;
        }

        public final String toString() {
            return "ViewInitialized";
        }
    }
}
