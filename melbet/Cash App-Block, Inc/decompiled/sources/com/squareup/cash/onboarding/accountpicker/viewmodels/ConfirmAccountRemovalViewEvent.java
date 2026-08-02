package com.squareup.cash.onboarding.accountpicker.viewmodels;

/* loaded from: classes6.dex */
public interface ConfirmAccountRemovalViewEvent {

    public final class NegativeClick implements ConfirmAccountRemovalViewEvent {
        public static final NegativeClick INSTANCE = new NegativeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeClick);
        }

        public final int hashCode() {
            return 1951095654;
        }

        public final String toString() {
            return "NegativeClick";
        }
    }

    public final class PositiveClick implements ConfirmAccountRemovalViewEvent {
        public static final PositiveClick INSTANCE = new PositiveClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveClick);
        }

        public final int hashCode() {
            return 994428962;
        }

        public final String toString() {
            return "PositiveClick";
        }
    }
}
