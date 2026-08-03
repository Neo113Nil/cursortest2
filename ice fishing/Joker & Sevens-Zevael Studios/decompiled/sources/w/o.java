package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o extends pc.k implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7474g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oc.a f7475h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z10, oc.a aVar) {
        super(3);
        this.f7474g = z10;
        this.f7475h = aVar;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        y.i iVar;
        m0.r rVar = (m0.r) obj2;
        ((Number) obj3).intValue();
        rVar.X(-756081143);
        i0 i0Var = (i0) rVar.j(androidx.compose.foundation.c.f511a);
        if (i0Var instanceof o0) {
            rVar.X(617140216);
            rVar.q(false);
            iVar = null;
        } else {
            rVar.X(617248189);
            Object M = rVar.M();
            if (M == m0.l.f4646a) {
                M = new y.i();
                rVar.i0(M);
            }
            iVar = (y.i) M;
            rVar.q(false);
        }
        y.i iVar2 = iVar;
        y0.n b2 = androidx.compose.foundation.a.b(y0.k.f8442a, iVar2, i0Var, this.f7474g, null, this.f7475h);
        rVar.q(false);
        return b2;
    }
}
