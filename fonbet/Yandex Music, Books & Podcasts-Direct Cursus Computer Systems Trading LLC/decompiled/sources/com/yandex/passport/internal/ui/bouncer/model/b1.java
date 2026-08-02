package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b1 {
    public final com.yandex.passport.internal.properties.l a;
    public final List b;
    public final Map c;
    public final com.yandex.passport.internal.l d;
    public final com.yandex.passport.internal.l e;
    public final boolean f;

    public b1(com.yandex.passport.internal.properties.l lVar, List list, Map map, com.yandex.passport.internal.l lVar2, com.yandex.passport.internal.l lVar3, boolean z) {
        list.getClass();
        map.getClass();
        this.a = lVar;
        this.b = list;
        this.c = map;
        this.d = lVar2;
        this.e = lVar3;
        this.f = z;
    }

    public static b1 a(b1 b1Var, com.yandex.passport.internal.properties.l lVar, List list, int i) {
        if ((i & 1) != 0) {
            lVar = b1Var.a;
        }
        com.yandex.passport.internal.properties.l lVar2 = lVar;
        if ((i & 2) != 0) {
            list = b1Var.b;
        }
        List list2 = list;
        Map map = b1Var.c;
        com.yandex.passport.internal.l lVar3 = b1Var.d;
        com.yandex.passport.internal.l lVar4 = b1Var.e;
        boolean z = b1Var.f;
        b1Var.getClass();
        list2.getClass();
        map.getClass();
        return new b1(lVar2, list2, map, lVar3, lVar4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.a.equals(b1Var.a) && Intrinsics.d(this.b, b1Var.b) && Intrinsics.d(this.c, b1Var.c) && Intrinsics.d(this.d, b1Var.d) && Intrinsics.d(this.e, b1Var.e) && this.f == b1Var.f;
    }

    public final int hashCode() {
        int b = f1d.b(this.c, k5r.d(this.a.hashCode() * 31, 31, this.b), 31);
        com.yandex.passport.internal.l lVar = this.d;
        int hashCode = (b + (lVar == null ? 0 : lVar.hashCode())) * 31;
        com.yandex.passport.internal.l lVar2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BouncerParameters(loginProperties=");
        sb.append(this.a);
        sb.append(", accounts=");
        sb.append(this.b);
        sb.append(", childInfoAccount=");
        sb.append(this.c);
        sb.append(", selectedAccount=");
        sb.append(this.d);
        sb.append(", bindPhoneAccount=");
        sb.append(this.e);
        sb.append(", isRelogin=");
        return dfi.j(sb, this.f, ')');
    }
}
