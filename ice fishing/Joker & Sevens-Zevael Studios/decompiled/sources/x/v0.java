package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f7915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f7916b;

    public v0(z0 z0Var, x0 x0Var) {
        this.f7915a = z0Var;
        this.f7916b = x0Var;
    }

    @Override // x.i0
    public final float a(float f10) {
        z0 z0Var = this.f7915a;
        long d10 = z0Var.d(z0Var.g(f10));
        z0 z0Var2 = this.f7916b.f7935a;
        z0Var2.f7957g = 2;
        w.w0 w0Var = z0Var2.f7952b;
        return z0Var.c(z0Var.f((w0Var == null || !(z0Var2.f7951a.c() || z0Var2.f7951a.a())) ? z0.a(z0Var2, z0Var2.f7958h, d10, 2) : w0Var.c(d10, z0Var2.f7957g, z0Var2.f7960j)));
    }
}
