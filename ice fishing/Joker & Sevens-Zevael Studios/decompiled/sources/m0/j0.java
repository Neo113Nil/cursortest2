package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 implements e2 {

    /* renamed from: g, reason: collision with root package name */
    public final oc.c f4628g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f4629h;

    public j0(oc.c cVar) {
        this.f4628g = cVar;
    }

    @Override // m0.e2
    public final void c() {
        this.f4629h = (k0) this.f4628g.invoke(z.f4839b);
    }

    @Override // m0.e2
    public final void h() {
        k0 k0Var = this.f4629h;
        if (k0Var != null) {
            k0Var.a();
        }
        this.f4629h = null;
    }

    @Override // m0.e2
    public final void e() {
    }
}
