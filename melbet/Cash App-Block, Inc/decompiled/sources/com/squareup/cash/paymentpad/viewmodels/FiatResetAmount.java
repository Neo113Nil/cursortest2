package com.squareup.cash.paymentpad.viewmodels;

import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FiatResetAmount {
    public final String formattedAmount;
    public final Money money;

    public FiatResetAmount(Money money, String str) {
        str.getClass();
        this.money = money;
        this.formattedAmount = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiatResetAmount)) {
            return false;
        }
        FiatResetAmount fiatResetAmount = (FiatResetAmount) obj;
        return this.money.equals(fiatResetAmount.money) && Intrinsics.areEqual(this.formattedAmount, fiatResetAmount.formattedAmount);
    }

    public final int hashCode() {
        return this.formattedAmount.hashCode() + (this.money.hashCode() * 31);
    }

    public final String toString() {
        return "FiatResetAmount(money=" + this.money + ", formattedAmount=" + this.formattedAmount + ")";
    }
}
