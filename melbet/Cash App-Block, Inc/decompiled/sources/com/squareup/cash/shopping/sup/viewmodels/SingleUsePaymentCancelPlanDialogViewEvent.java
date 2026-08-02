package com.squareup.cash.shopping.sup.viewmodels;

/* loaded from: classes7.dex */
public interface SingleUsePaymentCancelPlanDialogViewEvent {

    public final class CancelPlanPressed implements SingleUsePaymentCancelPlanDialogViewEvent {
        public static final CancelPlanPressed INSTANCE = new CancelPlanPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelPlanPressed);
        }

        public final int hashCode() {
            return -1265299287;
        }

        public final String toString() {
            return "CancelPlanPressed";
        }
    }

    public final class GoBackPressed implements SingleUsePaymentCancelPlanDialogViewEvent {
        public static final GoBackPressed INSTANCE = new GoBackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBackPressed);
        }

        public final int hashCode() {
            return -1434703107;
        }

        public final String toString() {
            return "GoBackPressed";
        }
    }
}
