package com.squareup.cash.savings.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;

/* loaded from: classes6.dex */
public interface TransferOutViewEvent {

    public final class AmountChanged implements TransferOutViewEvent {
        public final Money amount;

        public AmountChanged(Money money) {
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountChanged) && this.amount.equals(((AmountChanged) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "AmountChanged(amount=", ")");
        }
    }

    public final class Submit implements TransferOutViewEvent {
        public final Money amount;

        public Submit(Money money) {
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Submit) && this.amount.equals(((Submit) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "Submit(amount=", ")");
        }
    }
}
