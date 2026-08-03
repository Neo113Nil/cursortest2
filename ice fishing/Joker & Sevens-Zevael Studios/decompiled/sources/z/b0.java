package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 extends y0.m implements x1.w {

    /* renamed from: u, reason: collision with root package name */
    public float f8937u;

    /* renamed from: v, reason: collision with root package name */
    public float f8938v;

    /* renamed from: w, reason: collision with root package name */
    public float f8939w;

    /* renamed from: x, reason: collision with root package name */
    public float f8940x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8941y;

    @Override // x1.w
    public final v1.f0 e(x1.o0 o0Var, v1.d0 d0Var, long j3) {
        int D = o0Var.D(this.f8939w) + o0Var.D(this.f8937u);
        int D2 = o0Var.D(this.f8940x) + o0Var.D(this.f8938v);
        v1.j0 e10 = d0Var.e(s2.b.h(-D, -D2, j3));
        return o0Var.H(s2.b.f(e10.f7085g + D, j3), s2.b.e(e10.f7086h + D2, j3), bc.w.f1068g, new a0.r(this, e10, o0Var, 8));
    }
}
