package com.squareup.cash.savings.db;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetGeneralSavingsBalance {
    public final Money generalBalance;

    public GetGeneralSavingsBalance(Money money) {
        this.generalBalance = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetGeneralSavingsBalance) && Intrinsics.areEqual(this.generalBalance, ((GetGeneralSavingsBalance) obj).generalBalance);
    }

    public final int hashCode() {
        Money money = this.generalBalance;
        if (money == null) {
            return 0;
        }
        return money.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.generalBalance, "GetGeneralSavingsBalance(generalBalance=", ")");
    }
}
