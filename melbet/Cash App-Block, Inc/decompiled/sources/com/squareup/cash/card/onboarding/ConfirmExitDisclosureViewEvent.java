package com.squareup.cash.card.onboarding;

/* loaded from: classes6.dex */
public interface ConfirmExitDisclosureViewEvent {

    public final class NegativeClick implements ConfirmExitDisclosureViewEvent {
        public static final NegativeClick INSTANCE = new NegativeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeClick);
        }

        public final int hashCode() {
            return -1406576234;
        }

        public final String toString() {
            return "NegativeClick";
        }
    }

    public final class PositiveClick implements ConfirmExitDisclosureViewEvent {
        public static final PositiveClick INSTANCE = new PositiveClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveClick);
        }

        public final int hashCode() {
            return 1931724370;
        }

        public final String toString() {
            return "PositiveClick";
        }
    }
}
