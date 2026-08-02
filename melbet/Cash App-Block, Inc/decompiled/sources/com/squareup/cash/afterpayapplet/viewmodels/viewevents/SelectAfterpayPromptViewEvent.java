package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

/* loaded from: classes5.dex */
public interface SelectAfterpayPromptViewEvent {

    public final class ConfirmClick implements SelectAfterpayPromptViewEvent {
        public static final ConfirmClick INSTANCE = new ConfirmClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmClick);
        }

        public final int hashCode() {
            return 1048879732;
        }

        public final String toString() {
            return "ConfirmClick";
        }
    }

    public final class Dismiss implements SelectAfterpayPromptViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -162527426;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class SheetViewed implements SelectAfterpayPromptViewEvent {
        public static final SheetViewed INSTANCE = new SheetViewed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetViewed);
        }

        public final int hashCode() {
            return 851350263;
        }

        public final String toString() {
            return "SheetViewed";
        }
    }
}
