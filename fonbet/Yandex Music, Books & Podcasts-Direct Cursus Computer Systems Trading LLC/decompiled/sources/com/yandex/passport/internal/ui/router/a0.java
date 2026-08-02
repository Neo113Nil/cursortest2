package com.yandex.passport.internal.ui.router;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 implements b0 {
    public final com.yandex.passport.internal.properties.l a;
    public final com.yandex.passport.internal.l b;

    public a0(com.yandex.passport.internal.properties.l lVar, com.yandex.passport.internal.l lVar2) {
        lVar.getClass();
        this.a = lVar;
        this.b = lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.a, a0Var.a) && Intrinsics.d(this.b, a0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.passport.internal.l lVar = this.b;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        return "MailGimap(loginProperties=" + this.a + ", selectedAccount=" + this.b + ')';
    }
}
