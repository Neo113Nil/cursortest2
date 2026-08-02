package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.eta;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 {
    public final com.yandex.passport.common.core.f a;
    public final com.yandex.passport.common.core.f b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;

    public n0(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, boolean z, boolean z2, boolean z3, List list) {
        list.getClass();
        this.a = fVar;
        this.b = fVar2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.a.equals(n0Var.a) && Intrinsics.d(this.b, n0Var.b) && this.c == n0Var.c && this.d == n0Var.d && this.e == n0Var.e && Intrinsics.d(this.f, n0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.passport.common.core.f fVar = this.b;
        return this.f.hashCode() + k5r.e(k5r.e(k5r.e((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowButtons(uid=");
        sb.append(this.a);
        sb.append(", muid=");
        sb.append(this.b);
        sb.append(", showYandex=");
        sb.append(this.c);
        sb.append(", showDelete=");
        sb.append(this.d);
        sb.append(", showLogoutOnDevice=");
        sb.append(this.e);
        sb.append(", masterMembers=");
        return eta.h(sb, this.f, ')');
    }
}
