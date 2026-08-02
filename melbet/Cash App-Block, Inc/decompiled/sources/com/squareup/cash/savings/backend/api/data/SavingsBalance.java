package com.squareup.cash.savings.backend.api.data;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SavingsBalance {
    public final Money balance;
    public final boolean isAdopted;
    public final String token;

    public SavingsBalance(Money money, String str, boolean z) {
        str.getClass();
        money.getClass();
        this.token = str;
        this.balance = money;
        this.isAdopted = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsBalance)) {
            return false;
        }
        SavingsBalance savingsBalance = (SavingsBalance) obj;
        return Intrinsics.areEqual(this.token, savingsBalance.token) && Intrinsics.areEqual(this.balance, savingsBalance.balance) && this.isAdopted == savingsBalance.isAdopted;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isAdopted) + NavAction$$ExternalSyntheticOutline0.m(this.balance, this.token.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingsBalance(token=");
        sb.append(this.token);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", isAdopted=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isAdopted, ")");
    }
}
