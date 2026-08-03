package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m0 extends y0.m implements x1.w {

    /* renamed from: u, reason: collision with root package name */
    public float f8985u;

    /* renamed from: v, reason: collision with root package name */
    public float f8986v;

    @Override // x1.w
    public final v1.f0 e(x1.o0 o0Var, v1.d0 d0Var, long j3) {
        int j6;
        int i10 = 0;
        if (s2.f.a(this.f8985u, Float.NaN) || s2.a.j(j3) != 0) {
            j6 = s2.a.j(j3);
        } else {
            j6 = o0Var.D(this.f8985u);
            int h10 = s2.a.h(j3);
            if (j6 > h10) {
                j6 = h10;
            }
            if (j6 < 0) {
                j6 = 0;
            }
        }
        int h11 = s2.a.h(j3);
        if (s2.f.a(this.f8986v, Float.NaN) || s2.a.i(j3) != 0) {
            i10 = s2.a.i(j3);
        } else {
            int D = o0Var.D(this.f8986v);
            int g8 = s2.a.g(j3);
            if (D > g8) {
                D = g8;
            }
            if (D >= 0) {
                i10 = D;
            }
        }
        v1.j0 e10 = d0Var.e(s2.b.a(j6, h11, i10, s2.a.g(j3)));
        return o0Var.H(e10.f7085g, e10.f7086h, bc.w.f1068g, new c1.h(e10, 8));
    }
}
