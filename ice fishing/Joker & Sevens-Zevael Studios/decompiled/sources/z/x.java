package z;

import m0.l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x implements v1.q, w1.e, y0.l {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f9039a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f9040b;

    /* renamed from: c, reason: collision with root package name */
    public final l1 f9041c;

    public x(a aVar) {
        this.f9039a = aVar;
        this.f9040b = m0.z.s(aVar);
        this.f9041c = m0.z.s(aVar);
    }

    @Override // v1.q
    public final v1.f0 e(x1.o0 o0Var, v1.d0 d0Var, long j3) {
        l1 l1Var = this.f9040b;
        int d10 = ((o0) l1Var.getValue()).d(o0Var, o0Var.getLayoutDirection());
        int b2 = ((o0) l1Var.getValue()).b(o0Var);
        int a6 = ((o0) l1Var.getValue()).a(o0Var, o0Var.getLayoutDirection()) + d10;
        int c3 = ((o0) l1Var.getValue()).c(o0Var) + b2;
        v1.j0 e10 = d0Var.e(s2.b.h(-a6, -c3, j3));
        return o0Var.H(s2.b.f(e10.f7085g + a6, j3), s2.b.e(e10.f7086h + c3, j3), bc.w.f1068g, new j0.y(e10, d10, b2, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return pc.j.a(((x) obj).f9039a, this.f9039a);
        }
        return false;
    }

    @Override // w1.e
    public final w1.g getKey() {
        return r0.f9028a;
    }

    @Override // w1.e
    public final Object getValue() {
        return (o0) this.f9041c.getValue();
    }

    public final int hashCode() {
        return this.f9039a.hashCode();
    }
}
