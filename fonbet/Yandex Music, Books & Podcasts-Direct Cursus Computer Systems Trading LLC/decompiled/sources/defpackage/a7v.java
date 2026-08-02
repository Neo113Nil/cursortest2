package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a7v {
    public final j7v a;
    public final w8v b;
    public final n8v c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final l7v r;

    public a7v(j7v j7vVar, w8v w8vVar, n8v n8vVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        j7vVar.getClass();
        w8vVar.getClass();
        n8vVar.getClass();
        this.a = j7vVar;
        this.b = w8vVar;
        this.c = n8vVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = j7vVar.a;
        this.j = j7vVar.b;
        this.k = z;
        this.l = z2;
        Long valueOf = n8vVar.a ? Long.valueOf(n8vVar.b) : null;
        this.m = valueOf != null ? valueOf.longValue() : Long.MAX_VALUE;
        this.n = w8vVar.a;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = new l7v();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7v)) {
            return false;
        }
        a7v a7vVar = (a7v) obj;
        return Intrinsics.d(this.a, a7vVar.a) && Intrinsics.d(this.b, a7vVar.b) && Intrinsics.d(this.c, a7vVar.c) && this.d == a7vVar.d && this.e == a7vVar.e && this.f == a7vVar.f && this.g == a7vVar.g && this.h == a7vVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + k5r.e(k5r.e(k5r.e(k5r.e((this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b.a)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WaveWordsConfig(exp=");
        sb.append(this.a);
        sb.append(", sub=");
        sb.append(this.b);
        sb.append(", slowNetwork=");
        sb.append(this.c);
        sb.append(", smoothIconEnabled=");
        sb.append(this.d);
        sb.append(", dynamicIconEnabled=");
        dfi.t(sb, this.e, ", bigWords=", this.f, ", paywallEnabled=");
        return v3w.g(sb, this.g, ", directLinksEnabled=", this.h, ")");
    }
}
