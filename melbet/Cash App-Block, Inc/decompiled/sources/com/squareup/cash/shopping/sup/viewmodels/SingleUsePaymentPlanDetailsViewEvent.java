package com.squareup.cash.shopping.sup.viewmodels;

/* loaded from: classes7.dex */
public interface SingleUsePaymentPlanDetailsViewEvent {

    public final class CancelPlanButtonPressed implements SingleUsePaymentPlanDetailsViewEvent {
        public static final CancelPlanButtonPressed INSTANCE = new CancelPlanButtonPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelPlanButtonPressed);
        }

        public final int hashCode() {
            return -2111571507;
        }

        public final String toString() {
            return "CancelPlanButtonPressed";
        }
    }

    public final class CardDetailsButtonPressed implements SingleUsePaymentPlanDetailsViewEvent {
        public static final CardDetailsButtonPressed INSTANCE = new CardDetailsButtonPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardDetailsButtonPressed);
        }

        public final int hashCode() {
            return 1200427870;
        }

        public final String toString() {
            return "CardDetailsButtonPressed";
        }
    }

    public final class CloseButtonPressed implements SingleUsePaymentPlanDetailsViewEvent {
        public static final CloseButtonPressed INSTANCE = new CloseButtonPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseButtonPressed);
        }

        public final int hashCode() {
            return 662759480;
        }

        public final String toString() {
            return "CloseButtonPressed";
        }
    }
}
