package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l0 extends pc.k implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0 f7458g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y.i f7459h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(i0 i0Var, y.i iVar) {
        super(3);
        this.f7458g = i0Var;
        this.f7459h = iVar;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        m0.r rVar = (m0.r) obj2;
        ((Number) obj3).intValue();
        rVar.X(-353972293);
        j0 b2 = this.f7458g.b(this.f7459h, rVar);
        boolean f10 = rVar.f(b2);
        Object M = rVar.M();
        if (f10 || M == m0.l.f4646a) {
            M = new m0(b2);
            rVar.i0(M);
        }
        m0 m0Var = (m0) M;
        rVar.q(false);
        return m0Var;
    }
}
