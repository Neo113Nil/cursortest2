package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends y0.m implements x1.w {

    /* renamed from: u, reason: collision with root package name */
    public int f9033u;

    /* renamed from: v, reason: collision with root package name */
    public float f9034v;

    @Override // x1.w
    public final v1.f0 e(x1.o0 o0Var, v1.d0 d0Var, long j3) {
        int j6;
        int h10;
        int g8;
        int i10;
        if (!s2.a.d(j3) || this.f9033u == 1) {
            j6 = s2.a.j(j3);
            h10 = s2.a.h(j3);
        } else {
            j6 = uc.e.h(Math.round(s2.a.h(j3) * this.f9034v), s2.a.j(j3), s2.a.h(j3));
            h10 = j6;
        }
        if (!s2.a.c(j3) || this.f9033u == 2) {
            int i11 = s2.a.i(j3);
            g8 = s2.a.g(j3);
            i10 = i11;
        } else {
            i10 = uc.e.h(Math.round(s2.a.g(j3) * this.f9034v), s2.a.i(j3), s2.a.g(j3));
            g8 = i10;
        }
        v1.j0 e10 = d0Var.e(s2.b.a(j6, h10, i10, g8));
        return o0Var.H(e10.f7085g, e10.f7086h, bc.w.f1068g, new c1.h(e10, 6));
    }
}
