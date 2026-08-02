package com.squareup.cash.borrow.viewmodels;

import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class LoanSelectorItem extends AmountSelectorWidgetModel.Item {

    public final class Amount extends LoanSelectorItem {
        public final Money amount;
        public final String label;

        public Amount(Money money, String str) {
            str.getClass();
            money.getClass();
            this.label = str;
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj;
            return Intrinsics.areEqual(this.label, amount.label) && Intrinsics.areEqual(this.amount, amount.amount);
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final String getLabel() {
            return this.label;
        }

        public final int hashCode() {
            return this.amount.hashCode() + (this.label.hashCode() * 31);
        }

        public final String toString() {
            return "Amount(label=" + this.label + ", amount=" + this.amount + ")";
        }
    }

    public final class CustomAmount extends LoanSelectorItem {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CustomAmount);
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final String getLabel() {
            return "...";
        }

        public final int hashCode() {
            return 45678;
        }

        public final String toString() {
            return "CustomAmount(label=...)";
        }
    }
}
