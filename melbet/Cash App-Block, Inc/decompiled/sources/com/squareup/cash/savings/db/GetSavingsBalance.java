package com.squareup.cash.savings.db;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetSavingsBalance {
    public final Money balance;

    public GetSavingsBalance(Money money) {
        this.balance = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetSavingsBalance) && Intrinsics.areEqual(this.balance, ((GetSavingsBalance) obj).balance);
    }

    public final int hashCode() {
        Money money = this.balance;
        if (money == null) {
            return 0;
        }
        return money.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.balance, "GetSavingsBalance(balance=", ")");
    }
}
