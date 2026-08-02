package com.squareup.cash.card.onboarding;

/* loaded from: classes6.dex */
public interface CardStudioExitDialogViewEvent {

    public final class Exit implements CardStudioExitDialogViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -848487990;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class Stay implements CardStudioExitDialogViewEvent {
        public static final Stay INSTANCE = new Stay();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Stay);
        }

        public final int hashCode() {
            return -848075003;
        }

        public final String toString() {
            return "Stay";
        }
    }
}
