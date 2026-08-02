package com.squareup.cash.history.viewmodels;

/* loaded from: classes6.dex */
public interface CancelPaymentViewEvent {

    public final class NegativeClick implements CancelPaymentViewEvent {
        public static final NegativeClick INSTANCE = new NegativeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeClick);
        }

        public final int hashCode() {
            return 2101286017;
        }

        public final String toString() {
            return "NegativeClick";
        }
    }

    public final class PositiveClick implements CancelPaymentViewEvent {
        public static final PositiveClick INSTANCE = new PositiveClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveClick);
        }

        public final int hashCode() {
            return 1144619325;
        }

        public final String toString() {
            return "PositiveClick";
        }
    }
}
