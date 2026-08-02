package com.squareup.cash.earnings.viewmodels.payers;

/* loaded from: classes6.dex */
public interface PayerTaggingPromptViewEvent {

    public final class Confirm implements PayerTaggingPromptViewEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return -1102600449;
        }

        public final String toString() {
            return "Confirm";
        }
    }

    public final class Dismiss implements PayerTaggingPromptViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -382045495;
        }

        public final String toString() {
            return "Dismiss";
        }
    }
}
