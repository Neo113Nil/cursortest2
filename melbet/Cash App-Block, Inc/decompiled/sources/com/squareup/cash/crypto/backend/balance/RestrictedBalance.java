package com.squareup.cash.crypto.backend.balance;

import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RestrictedBalance {
    public final Money amount;
    public final String token;

    public RestrictedBalance(Money money, String str) {
        money.getClass();
        str.getClass();
        this.amount = money;
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestrictedBalance)) {
            return false;
        }
        RestrictedBalance restrictedBalance = (RestrictedBalance) obj;
        return Intrinsics.areEqual(this.amount, restrictedBalance.amount) && Intrinsics.areEqual(this.token, restrictedBalance.token);
    }

    public final int hashCode() {
        return this.token.hashCode() + (this.amount.hashCode() * 31);
    }

    public final String toString() {
        return "RestrictedBalance(amount=" + this.amount + ", token=" + this.token + ")";
    }
}
