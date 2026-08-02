package com.yandex.passport.internal.usecase;

import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y0 {
    public final com.yandex.passport.common.account.a a;
    public final com.yandex.passport.internal.credentials.f b;
    public final com.yandex.passport.common.core.b c;
    public final long d;
    public final com.yandex.passport.internal.analytics.a e;

    public y0(com.yandex.passport.common.account.a aVar, com.yandex.passport.internal.credentials.f fVar, com.yandex.passport.common.core.b bVar, long j, com.yandex.passport.internal.analytics.a aVar2) {
        aVar.getClass();
        fVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.a = aVar;
        this.b = fVar;
        this.c = bVar;
        this.d = j;
        this.e = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.a, y0Var.a) && Intrinsics.d(this.b, y0Var.b) && this.c == y0Var.c && this.d == y0Var.d && Intrinsics.d(this.e, y0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + tlm.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Params(masterToken=" + this.a + ", masterCredentials=" + this.b + ", environment=" + this.c + ", locationId=" + this.d + ", analyticsFromValue=" + this.e + ')';
    }
}
