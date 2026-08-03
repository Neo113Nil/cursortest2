package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s0 extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t0 f8158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m1 f8159h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8160i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, m1 m1Var, long j3) {
        super(0);
        this.f8158g = t0Var;
        this.f8159h = m1Var;
        this.f8160i = j3;
    }

    @Override // oc.a
    public final Object invoke() {
        p0 z02;
        k0 k0Var = this.f8158g.f8166l;
        v1.i0 i0Var = null;
        if (f.r(k0Var.f8088a) || k0Var.f8090c) {
            f1 f1Var = k0Var.a().f8035w;
            if (f1Var != null) {
                i0Var = f1Var.f8127r;
            }
        } else {
            f1 f1Var2 = k0Var.a().f8035w;
            if (f1Var2 != null && (z02 = f1Var2.z0()) != null) {
                i0Var = z02.f8127r;
            }
        }
        if (i0Var == null) {
            i0Var = ((y1.r) this.f8159h).getPlacementScope();
        }
        p0 z03 = k0Var.a().z0();
        pc.j.b(z03);
        v1.i0.h(i0Var, z03, this.f8160i);
        return ac.o.f277a;
    }
}
