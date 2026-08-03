package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 extends y0.m implements x1.w {

    /* renamed from: u, reason: collision with root package name */
    public c0 f8948u;

    @Override // x1.w
    public final v1.f0 e(x1.o0 o0Var, v1.d0 d0Var, long j3) {
        float f10 = 0;
        if (Float.compare(this.f8948u.a(o0Var.getLayoutDirection()), f10) < 0 || Float.compare(this.f8948u.f8945b, f10) < 0 || Float.compare(this.f8948u.b(o0Var.getLayoutDirection()), f10) < 0 || Float.compare(this.f8948u.f8947d, f10) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int D = o0Var.D(this.f8948u.b(o0Var.getLayoutDirection())) + o0Var.D(this.f8948u.a(o0Var.getLayoutDirection()));
        int D2 = o0Var.D(this.f8948u.f8947d) + o0Var.D(this.f8948u.f8945b);
        v1.j0 e10 = d0Var.e(s2.b.h(-D, -D2, j3));
        return o0Var.H(s2.b.f(e10.f7085g + D, j3), s2.b.e(e10.f7086h + D2, j3), bc.w.f1068g, new a0.r(e10, o0Var, this, 9));
    }
}
