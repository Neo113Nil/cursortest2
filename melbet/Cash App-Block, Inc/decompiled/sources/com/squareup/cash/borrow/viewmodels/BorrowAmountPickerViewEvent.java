package com.squareup.cash.borrow.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public interface BorrowAmountPickerViewEvent {

    public final class ConfirmCustomAmount implements BorrowAmountPickerViewEvent {
        public final Money amount;

        public ConfirmCustomAmount(Money money) {
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmCustomAmount) && this.amount.equals(((ConfirmCustomAmount) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "ConfirmCustomAmount(amount=", ")");
        }
    }

    public final class ConfirmQuickAmount implements BorrowAmountPickerViewEvent {
        public final int index;

        public ConfirmQuickAmount(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmQuickAmount) && this.index == ((ConfirmQuickAmount) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "ConfirmQuickAmount(index=", ")");
        }
    }

    public final class Dismiss implements BorrowAmountPickerViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -1236165442;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    /* loaded from: classes4.dex */
    public final class SelectQuickAmount implements BorrowAmountPickerViewEvent {
        public final int index;

        public SelectQuickAmount(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectQuickAmount) && this.index == ((SelectQuickAmount) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "SelectQuickAmount(index=", ")");
        }
    }
}
