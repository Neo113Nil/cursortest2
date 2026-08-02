package com.squareup.cash.investing.viewmodels.ordertype.autoinvest;

/* loaded from: classes6.dex */
public abstract class InvestingRecurringPurchaseReceiptViewEvent {

    public final class CancelPurchasePressed extends InvestingRecurringPurchaseReceiptViewEvent {
        public static final CancelPurchasePressed INSTANCE = new CancelPurchasePressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelPurchasePressed);
        }

        public final int hashCode() {
            return -1510429697;
        }

        public final String toString() {
            return "CancelPurchasePressed";
        }
    }

    public final class ClosePressed extends InvestingRecurringPurchaseReceiptViewEvent {
        public static final ClosePressed INSTANCE = new ClosePressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClosePressed);
        }

        public final int hashCode() {
            return 1960988178;
        }

        public final String toString() {
            return "ClosePressed";
        }
    }
}
