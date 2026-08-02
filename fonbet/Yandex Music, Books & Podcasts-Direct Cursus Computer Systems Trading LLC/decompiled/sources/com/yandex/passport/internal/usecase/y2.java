package com.yandex.passport.internal.usecase;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y2 {
    public final com.yandex.passport.common.core.f a;
    public final com.yandex.passport.common.core.f b;
    public final com.yandex.passport.internal.d c;

    public y2(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, com.yandex.passport.internal.d dVar) {
        fVar.getClass();
        fVar2.getClass();
        dVar.getClass();
        this.a = fVar;
        this.b = fVar2;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return Intrinsics.d(this.a, y2Var.a) && Intrinsics.d(this.b, y2Var.b) && Intrinsics.d(this.c, y2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.appsflyer.internal.k.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "UpdateMasterTokenParams(uid=" + this.a + ", masterUid=" + this.b + ", accountSnapshot=" + this.c + ')';
    }
}
