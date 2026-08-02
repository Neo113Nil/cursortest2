package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.c5b;
import defpackage.dfi;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 implements k0 {
    public final com.yandex.passport.internal.properties.l a;
    public final List b;
    public final com.yandex.passport.internal.l c;
    public final com.yandex.passport.internal.l d;
    public final boolean e;
    public final boolean f;
    public final com.yandex.passport.common.core.f g;
    public final String h;

    public c0(com.yandex.passport.internal.properties.l lVar, ArrayList arrayList, com.yandex.passport.internal.l lVar2, com.yandex.passport.internal.l lVar3, boolean z, boolean z2, com.yandex.passport.common.core.f fVar, String str, int i) {
        List list = (i & 2) != 0 ? c5b.a : arrayList;
        lVar2 = (i & 4) != 0 ? null : lVar2;
        lVar3 = (i & 8) != 0 ? null : lVar3;
        z = (i & 16) != 0 ? true : z;
        z2 = (i & 32) != 0 ? true : z2;
        fVar = (i & 64) != 0 ? null : fVar;
        str = (i & 128) != 0 ? null : str;
        lVar.getClass();
        list.getClass();
        this.a = lVar;
        this.b = list;
        this.c = lVar2;
        this.d = lVar3;
        this.e = z;
        this.f = z2;
        this.g = fVar;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.a, c0Var.a) && this.b.equals(c0Var.b) && Intrinsics.d(this.c, c0Var.c) && Intrinsics.d(this.d, c0Var.d) && this.e == c0Var.e && this.f == c0Var.f && Intrinsics.d(this.g, c0Var.g) && Intrinsics.d(this.h, c0Var.h);
    }

    public final int hashCode() {
        int d = k5r.d(this.a.hashCode() * 31, 31, this.b);
        com.yandex.passport.internal.l lVar = this.c;
        int hashCode = (d + (lVar == null ? 0 : lVar.hashCode())) * 31;
        com.yandex.passport.internal.l lVar2 = this.d;
        int e = k5r.e(k5r.e((hashCode + (lVar2 == null ? 0 : lVar2.hashCode())) * 31, 31, this.e), 31, this.f);
        com.yandex.passport.common.core.f fVar = this.g;
        int hashCode2 = (e + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.h;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowMansion(properties=");
        sb.append(this.a);
        sb.append(", accounts=");
        sb.append(this.b);
        sb.append(", selectedAccount=");
        sb.append(this.c);
        sb.append(", bindPhoneAccount=");
        sb.append(this.d);
        sb.append(", isRelogin=");
        sb.append(this.e);
        sb.append(", canGoBack=");
        sb.append(this.f);
        sb.append(", uidForProfile=");
        sb.append(this.g);
        sb.append(", customUrl=");
        return dfi.i(sb, this.h, ')');
    }
}
