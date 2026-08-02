package com.yandex.passport.internal.usecase;

import android.accounts.Account;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p2 {
    public final Account a;
    public final com.yandex.passport.common.core.b b;

    public p2(Account account, com.yandex.passport.common.core.b bVar) {
        account.getClass();
        bVar.getClass();
        this.a = account;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return Intrinsics.d(this.a, p2Var.a) && this.b == p2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(account=" + this.a + ", environment=" + this.b + ')';
    }
}
