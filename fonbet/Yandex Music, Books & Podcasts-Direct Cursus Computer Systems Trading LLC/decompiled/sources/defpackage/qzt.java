package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qzt extends ozt {
    public final String a;
    public final List b;
    public final int c;
    public final ai3 d;
    public final float e;
    public final ai3 f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public qzt(String str, List list, int i, ai3 ai3Var, float f, ai3 ai3Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = ai3Var;
        this.e = f;
        this.f = ai3Var2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qzt.class != obj.getClass()) {
            return false;
        }
        qzt qztVar = (qzt) obj;
        return this.a.equals(qztVar.a) && Intrinsics.d(this.d, qztVar.d) && this.e == qztVar.e && Intrinsics.d(this.f, qztVar.f) && this.g == qztVar.g && this.h == qztVar.h && this.i == qztVar.i && this.j == qztVar.j && this.k == qztVar.k && this.l == qztVar.l && this.m == qztVar.m && this.n == qztVar.n && this.c == qztVar.c && Intrinsics.d(this.b, qztVar.b);
    }

    public final int hashCode() {
        int d = k5r.d(this.a.hashCode() * 31, 31, this.b);
        ai3 ai3Var = this.d;
        int a = eta.a((d + (ai3Var != null ? ai3Var.hashCode() : 0)) * 31, this.e, 31);
        ai3 ai3Var2 = this.f;
        return Integer.hashCode(this.c) + eta.a(eta.a(eta.a(eta.a(f1d.a(this.j, f1d.a(this.i, eta.a(eta.a((a + (ai3Var2 != null ? ai3Var2.hashCode() : 0)) * 31, this.g, 31), this.h, 31), 31), 31), this.k, 31), this.l, 31), this.m, 31), this.n, 31);
    }
}
