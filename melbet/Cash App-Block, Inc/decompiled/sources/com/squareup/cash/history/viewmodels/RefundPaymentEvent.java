package com.squareup.cash.history.viewmodels;

/* loaded from: classes6.dex */
public interface RefundPaymentEvent {

    public final class NegativeButtonClick implements RefundPaymentEvent {
        public static final NegativeButtonClick INSTANCE = new NegativeButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeButtonClick);
        }

        public final int hashCode() {
            return 1098271058;
        }

        public final String toString() {
            return "NegativeButtonClick";
        }
    }

    public final class PositiveButtonClick implements RefundPaymentEvent {
        public static final PositiveButtonClick INSTANCE = new PositiveButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveButtonClick);
        }

        public final int hashCode() {
            return 1594046734;
        }

        public final String toString() {
            return "PositiveButtonClick";
        }
    }
}
