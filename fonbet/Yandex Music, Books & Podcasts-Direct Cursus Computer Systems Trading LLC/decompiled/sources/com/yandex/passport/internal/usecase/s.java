package com.yandex.passport.internal.usecase;

import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s {
    public final com.yandex.passport.common.core.b a;
    public final long b;
    public final com.yandex.passport.common.account.a c;
    public final com.yandex.passport.api.x1 d;
    public final com.yandex.passport.internal.analytics.a e;

    public s(com.yandex.passport.common.core.b bVar, long j, com.yandex.passport.common.account.a aVar, com.yandex.passport.api.x1 x1Var, com.yandex.passport.internal.analytics.a aVar2) {
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.a = bVar;
        this.b = j;
        this.c = aVar;
        this.d = x1Var;
        this.e = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && this.b == sVar.b && Intrinsics.d(this.c, sVar.c) && this.d == sVar.d && Intrinsics.d(this.e, sVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + tlm.c(this.b, this.a.hashCode() * 31, 31)) * 31;
        com.yandex.passport.api.x1 x1Var = this.d;
        return this.e.hashCode() + ((hashCode + (x1Var == null ? 0 : x1Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ", locationId=" + this.b + ", masterToken=" + this.c + ", socialCode=" + this.d + ", analyticsFromValue=" + this.e + ')';
    }
}
