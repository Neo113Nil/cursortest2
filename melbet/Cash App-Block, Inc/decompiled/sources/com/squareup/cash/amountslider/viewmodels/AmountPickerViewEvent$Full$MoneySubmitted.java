package com.squareup.cash.amountslider.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;

/* loaded from: classes5.dex */
public final class AmountPickerViewEvent$Full$MoneySubmitted extends AmountPickerViewEvent {
    public final Money amount;

    public AmountPickerViewEvent$Full$MoneySubmitted(Money money) {
        this.amount = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmountPickerViewEvent$Full$MoneySubmitted) && this.amount.equals(((AmountPickerViewEvent$Full$MoneySubmitted) obj).amount);
    }

    public final int hashCode() {
        return this.amount.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "MoneySubmitted(amount=", ")");
    }
}
