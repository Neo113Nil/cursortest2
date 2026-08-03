package cd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends f {

    /* renamed from: k, reason: collision with root package name */
    public final hc.j f1367k;

    /* JADX WARN: Multi-variable type inference failed */
    public k(oc.f fVar, bd.e eVar, fc.i iVar, int i10, ad.a aVar) {
        super(eVar, iVar, i10, aVar);
        this.f1367k = (hc.j) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hc.j, oc.f] */
    @Override // cd.f
    public final f a(fc.i iVar, int i10, ad.a aVar) {
        return new k(this.f1367k, this.f1351j, iVar, i10, aVar);
    }

    @Override // cd.f
    public final Object d(bd.f fVar, fc.d dVar) {
        Object e10 = yc.a0.e(new h(this, fVar, null), dVar);
        return e10 == gc.a.f2559g ? e10 : ac.o.f277a;
    }
}
