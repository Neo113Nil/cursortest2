package bd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q implements c0, e, cd.s {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e0 f1134g;

    public q(e0 e0Var) {
        this.f1134g = e0Var;
    }

    @Override // bd.e
    public final Object c(f fVar, fc.d dVar) {
        this.f1134g.c(fVar, dVar);
        return gc.a.f2559g;
    }

    @Override // bd.c0
    public final Object getValue() {
        return this.f1134g.getValue();
    }

    @Override // cd.s
    public final e l(fc.i iVar, int i10, ad.a aVar) {
        return ((((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != ad.a.f281h) && !((i10 == 0 || i10 == -3) && aVar == ad.a.f280g)) ? new cd.g(this, iVar, i10, aVar) : this;
    }
}
