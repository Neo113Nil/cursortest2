package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 {
    public final com.yandex.passport.common.core.f a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final f f;
    public final f g;
    public final f h;
    public final f i;
    public final e j;

    public g0(com.yandex.passport.common.core.f fVar, List list, boolean z, boolean z2, boolean z3, f fVar2, f fVar3, f fVar4, f fVar5, e eVar) {
        list.getClass();
        this.a = fVar;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = fVar2;
        this.g = fVar3;
        this.h = fVar4;
        this.i = fVar5;
        this.j = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a.equals(g0Var.a) && Intrinsics.d(this.b, g0Var.b) && this.c == g0Var.c && this.d == g0Var.d && this.e == g0Var.e && this.f.equals(g0Var.f) && this.g.equals(g0Var.g) && this.h.equals(g0Var.h) && this.i.equals(g0Var.i) && this.j.equals(g0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + k5r.e(k5r.e(k5r.e(k5r.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LogoutBottomSheetData(uid=" + this.a + ", masterMembers=" + this.b + ", showYandex=" + this.c + ", showDelete=" + this.d + ", showLogoutOnDevice=" + this.e + ", onShow=" + this.f + ", onThisApp=" + this.g + ", onAllApps=" + this.h + ", onDelete=" + this.i + ", onCancel=" + this.j + ')';
    }
}
