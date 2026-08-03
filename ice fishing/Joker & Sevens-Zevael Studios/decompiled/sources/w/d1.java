package w;

import m0.i1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d1 extends y0.m implements x1.w {

    /* renamed from: u, reason: collision with root package name */
    public b1 f7404u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7405v;

    @Override // x1.w
    public final v1.f0 e(x1.o0 o0Var, v1.d0 d0Var, long j3) {
        ud.g.g(j3, this.f7405v ? x.e0.f7769g : x.e0.f7770h);
        v1.j0 e10 = d0Var.e(s2.a.a(j3, 0, this.f7405v ? s2.a.h(j3) : Integer.MAX_VALUE, 0, this.f7405v ? Integer.MAX_VALUE : s2.a.g(j3), 5));
        int i10 = e10.f7085g;
        int h10 = s2.a.h(j3);
        if (i10 > h10) {
            i10 = h10;
        }
        int i11 = e10.f7086h;
        int g8 = s2.a.g(j3);
        if (i11 > g8) {
            i11 = g8;
        }
        int i12 = e10.f7086h - i11;
        int i13 = e10.f7085g - i10;
        if (!this.f7405v) {
            i12 = i13;
        }
        b1 b1Var = this.f7404u;
        i1 i1Var = b1Var.f7385d;
        i1 i1Var2 = b1Var.f7382a;
        i1Var.h(i12);
        w0.g d10 = w0.r.d();
        oc.c e11 = d10 != null ? d10.e() : null;
        w0.g g10 = w0.r.g(d10);
        try {
            if (i1Var2.g() > i12) {
                i1Var2.h(i12);
            }
            w0.r.j(d10, g10, e11);
            this.f7404u.f7383b.h(this.f7405v ? i11 : i10);
            return o0Var.H(i10, i11, bc.w.f1068g, new c1(this, i12, e10));
        } catch (Throwable th) {
            w0.r.j(d10, g10, e11);
            throw th;
        }
    }
}
