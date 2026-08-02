package com.squareup.cash.directdeposit.viewmodels;

/* loaded from: classes6.dex */
public interface DirectDepositEditPaycheckAmountViewEvent {

    public final class NavigationIconClick implements DirectDepositEditPaycheckAmountViewEvent {
        public static final NavigationIconClick INSTANCE = new NavigationIconClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationIconClick);
        }

        public final int hashCode() {
            return -2107645825;
        }

        public final String toString() {
            return "NavigationIconClick";
        }
    }

    public final class SelectPaycheckAmount implements DirectDepositEditPaycheckAmountViewEvent {
        public final PaycheckDepositAllocationType paycheckDepositAmount;

        public SelectPaycheckAmount(PaycheckDepositAllocationType paycheckDepositAllocationType) {
            this.paycheckDepositAmount = paycheckDepositAllocationType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectPaycheckAmount) && this.paycheckDepositAmount == ((SelectPaycheckAmount) obj).paycheckDepositAmount;
        }

        public final int hashCode() {
            return this.paycheckDepositAmount.hashCode();
        }

        public final String toString() {
            return "SelectPaycheckAmount(paycheckDepositAmount=" + this.paycheckDepositAmount + ")";
        }
    }

    public final class Submit implements DirectDepositEditPaycheckAmountViewEvent {
        public static final Submit INSTANCE = new Submit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submit);
        }

        public final int hashCode() {
            return 409759220;
        }

        public final String toString() {
            return "Submit";
        }
    }
}
