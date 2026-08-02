package com.squareup.cash.shopping.sup.viewmodels;

/* loaded from: classes7.dex */
public interface SingleUsePaymentCheckoutViewEvent {

    public final class ActionButtonPressed implements SingleUsePaymentCheckoutViewEvent {
        public static final ActionButtonPressed INSTANCE = new ActionButtonPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActionButtonPressed);
        }

        public final int hashCode() {
            return -1282663223;
        }

        public final String toString() {
            return "ActionButtonPressed";
        }
    }

    public final class ExplanationTextPressed implements SingleUsePaymentCheckoutViewEvent {
        public static final ExplanationTextPressed INSTANCE = new ExplanationTextPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExplanationTextPressed);
        }

        public final int hashCode() {
            return 446839085;
        }

        public final String toString() {
            return "ExplanationTextPressed";
        }
    }
}
