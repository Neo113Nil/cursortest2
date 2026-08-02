package com.squareup.cash.amountslider.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;

/* loaded from: classes5.dex */
public final class AmountPickerViewEvent$Full$MoneyChanged extends AmountPickerViewEvent {
    public final Money amount;

    public AmountPickerViewEvent$Full$MoneyChanged(Money money) {
        this.amount = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmountPickerViewEvent$Full$MoneyChanged) && this.amount.equals(((AmountPickerViewEvent$Full$MoneyChanged) obj).amount);
    }

    public final int hashCode() {
        return this.amount.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "MoneyChanged(amount=", ")");
    }
}
