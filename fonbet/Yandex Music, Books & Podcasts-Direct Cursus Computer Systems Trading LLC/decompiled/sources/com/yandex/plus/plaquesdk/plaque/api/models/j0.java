package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 {
    public final String a;
    public final x b;
    public final g0 c;
    public final i0 d;
    public final h0 e;
    public final boolean f;

    public j0(String str, x xVar, g0 g0Var, i0 i0Var, h0 h0Var, boolean z) {
        str.getClass();
        xVar.getClass();
        i0Var.getClass();
        this.a = str;
        this.b = xVar;
        this.c = g0Var;
        this.d = i0Var;
        this.e = h0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.a, j0Var.a) && Intrinsics.d(this.b, j0Var.b) && Intrinsics.d(this.c, j0Var.c) && this.d == j0Var.d && this.e == j0Var.e && this.f == j0Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        g0 g0Var = this.c;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueModel(id=");
        sb.append(this.a);
        sb.append(", rootWidget=");
        sb.append(this.b);
        sb.append(", notification=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", canBeSwiped=");
        return dfi.j(sb, this.f, ')');
    }
}
