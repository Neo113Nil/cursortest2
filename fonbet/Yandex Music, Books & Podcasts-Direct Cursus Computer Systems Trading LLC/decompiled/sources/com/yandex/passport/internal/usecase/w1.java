package com.yandex.passport.internal.usecase;

import android.accounts.Account;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w1 extends com.yandex.plus.core.locale.b {
    public final Account a;

    public w1(Account account) {
        account.getClass();
        this.a = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1) && Intrinsics.d(this.a, ((w1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ByAccount(account=" + this.a + ')';
    }
}
