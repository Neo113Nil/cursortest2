package z;

import h3.a1;
import m0.l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8930a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8931b;

    /* renamed from: c, reason: collision with root package name */
    public final l1 f8932c = m0.z.s(a3.b.f193e);

    /* renamed from: d, reason: collision with root package name */
    public final l1 f8933d = m0.z.s(Boolean.TRUE);

    public a(String str, int i10) {
        this.f8930a = i10;
        this.f8931b = str;
    }

    @Override // z.o0
    public final int a(x1.o0 o0Var, s2.l lVar) {
        return e().f196c;
    }

    @Override // z.o0
    public final int b(x1.o0 o0Var) {
        return e().f195b;
    }

    @Override // z.o0
    public final int c(x1.o0 o0Var) {
        return e().f197d;
    }

    @Override // z.o0
    public final int d(x1.o0 o0Var, s2.l lVar) {
        return e().f194a;
    }

    public final a3.b e() {
        return (a3.b) this.f8932c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f8930a == ((a) obj).f8930a;
        }
        return false;
    }

    public final void f(a1 a1Var, int i10) {
        int i11 = this.f8930a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f8932c.setValue(a1Var.f2745a.f(i11));
            this.f8933d.setValue(Boolean.valueOf(a1Var.f2745a.p(i11)));
        }
    }

    public final int hashCode() {
        return this.f8930a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8931b);
        sb.append('(');
        sb.append(e().f194a);
        sb.append(", ");
        sb.append(e().f195b);
        sb.append(", ");
        sb.append(e().f196c);
        sb.append(", ");
        return a4.d.l(sb, e().f197d, ')');
    }
}
