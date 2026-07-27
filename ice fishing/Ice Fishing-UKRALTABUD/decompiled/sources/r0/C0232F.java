package r0;

/* renamed from: r0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232F extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2839j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G.d f2840k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ double f2841l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232F(G.d dVar, double d2, v0.d dVar2) {
        super(2, dVar2);
        this.f2840k = dVar;
        this.f2841l = d2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        C0232F c0232f = (C0232F) l((G.b) obj, (v0.d) obj2);
        t0.g gVar = t0.g.f2989a;
        c0232f.n(gVar);
        return gVar;
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0232F c0232f = new C0232F(this.f2840k, this.f2841l, dVar);
        c0232f.f2839j = obj;
        return c0232f;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.C(obj);
        ((G.b) this.f2839j).d(this.f2840k, new Double(this.f2841l));
        return t0.g.f2989a;
    }
}
