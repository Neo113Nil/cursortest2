package r0;

/* renamed from: r0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235I extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2850j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G.d f2851k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2852l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235I(G.d dVar, long j2, v0.d dVar2) {
        super(2, dVar2);
        this.f2851k = dVar;
        this.f2852l = j2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        C0235I c0235i = (C0235I) l((G.b) obj, (v0.d) obj2);
        t0.g gVar = t0.g.f2989a;
        c0235i.n(gVar);
        return gVar;
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0235I c0235i = new C0235I(this.f2851k, this.f2852l, dVar);
        c0235i.f2850j = obj;
        return c0235i;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.C(obj);
        ((G.b) this.f2850j).d(this.f2851k, new Long(this.f2852l));
        return t0.g.f2989a;
    }
}
