package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public interface AtmPickerAmountBlockerViewEvent {

    public final class ConfirmAtmPickerOption implements AtmPickerAmountBlockerViewEvent {
        public final int index;

        public ConfirmAtmPickerOption(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmAtmPickerOption) && this.index == ((ConfirmAtmPickerOption) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "ConfirmAtmPickerOption(index=", ")");
        }
    }

    /* loaded from: classes5.dex */
    public final class ConfirmKeypadAmount implements AtmPickerAmountBlockerViewEvent {
        public final Money amount;

        public ConfirmKeypadAmount(Money money) {
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmKeypadAmount) && this.amount.equals(((ConfirmKeypadAmount) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "ConfirmKeypadAmount(amount=", ")");
        }
    }

    public final class Dismiss implements AtmPickerAmountBlockerViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 735644379;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class SelectAtmPickerOption implements AtmPickerAmountBlockerViewEvent {
        public final int index;

        public SelectAtmPickerOption(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectAtmPickerOption) && this.index == ((SelectAtmPickerOption) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "SelectAtmPickerOption(index=", ")");
        }
    }
}
