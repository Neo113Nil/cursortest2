package com.squareup.cash.family.db;

import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GetDependentSavingsBalance {
    public final Money balance;
    public final Money general_balance;

    public GetDependentSavingsBalance(Money money, Money money2) {
        this.balance = money;
        this.general_balance = money2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDependentSavingsBalance)) {
            return false;
        }
        GetDependentSavingsBalance getDependentSavingsBalance = (GetDependentSavingsBalance) obj;
        return Intrinsics.areEqual(this.balance, getDependentSavingsBalance.balance) && Intrinsics.areEqual(this.general_balance, getDependentSavingsBalance.general_balance);
    }

    public final int hashCode() {
        Money money = this.balance;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        Money money2 = this.general_balance;
        return hashCode + (money2 != null ? money2.hashCode() : 0);
    }

    public final String toString() {
        return "GetDependentSavingsBalance(balance=" + this.balance + ", general_balance=" + this.general_balance + ")";
    }
}
