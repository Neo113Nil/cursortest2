package com.yandex.passport.internal.usecase.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 {
    public final com.yandex.passport.internal.d a;
    public final com.yandex.passport.internal.account.e b;

    public e0(com.yandex.passport.internal.d dVar, com.yandex.passport.internal.account.e eVar) {
        dVar.getClass();
        this.a = dVar;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.a, e0Var.a) && this.b.equals(e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(accountsSnapshot=" + this.a + ", relevantAccounts=" + this.b + ')';
    }
}
