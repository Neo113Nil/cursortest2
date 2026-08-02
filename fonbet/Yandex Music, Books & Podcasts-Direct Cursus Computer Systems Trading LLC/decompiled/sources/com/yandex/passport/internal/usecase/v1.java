package com.yandex.passport.internal.usecase;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v1 {
    public final com.yandex.passport.internal.l a;
    public final com.yandex.passport.common.account.a b;
    public final com.yandex.plus.core.locale.b c;
    public final com.yandex.passport.common.core.f d;
    public final com.yandex.passport.internal.report.reporters.x0 e;
    public final boolean f;

    public v1(com.yandex.passport.internal.l lVar, com.yandex.passport.common.account.a aVar, com.yandex.plus.core.locale.b bVar, com.yandex.passport.common.core.f fVar, com.yandex.passport.internal.report.reporters.x0 x0Var, boolean z) {
        aVar.getClass();
        bVar.getClass();
        fVar.getClass();
        x0Var.getClass();
        this.a = lVar;
        this.b = aVar;
        this.c = bVar;
        this.d = fVar;
        this.e = x0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return Intrinsics.d(this.a, v1Var.a) && Intrinsics.d(this.b, v1Var.b) && Intrinsics.d(this.c, v1Var.c) && Intrinsics.d(this.d, v1Var.d) && this.e == v1Var.e && this.f == v1Var.f;
    }

    public final int hashCode() {
        com.yandex.passport.internal.l lVar = this.a;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + com.appsflyer.internal.k.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(account=");
        sb.append(this.a);
        sb.append(", masterToken=");
        sb.append(this.b);
        sb.append(", revokeMode=");
        sb.append(this.c);
        sb.append(", uid=");
        sb.append(this.d);
        sb.append(", revokePlace=");
        sb.append(this.e);
        sb.append(", invalidatePushSubscriptions=");
        return dfi.j(sb, this.f, ')');
    }
}
