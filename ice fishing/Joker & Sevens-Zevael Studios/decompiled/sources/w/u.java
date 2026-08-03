package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends y0.m implements x1.n {

    /* renamed from: u, reason: collision with root package name */
    public final y.i f7509u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7510v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7511w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7512x;

    public u(y.i iVar) {
        this.f7509u = iVar;
    }

    @Override // x1.n
    public final void b(x1.i0 i0Var) {
        i0Var.a();
        h1.b bVar = i0Var.f8081g;
        if (this.f7510v) {
            h1.d.l(i0Var, f1.q.b(f1.q.f2277b, 0.3f), bVar.d(), 122);
        } else if (this.f7511w || this.f7512x) {
            h1.d.l(i0Var, f1.q.b(f1.q.f2277b, 0.1f), bVar.d(), 122);
        }
    }

    @Override // y0.m
    public final void j0() {
        yc.a0.q(f0(), null, new ld.c(this, null, 5), 3);
    }
}
