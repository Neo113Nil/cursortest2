package r0;

/* renamed from: r0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229C extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2828j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G.d f2829k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2830l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0229C(G.d dVar, boolean z2, v0.d dVar2) {
        super(2, dVar2);
        this.f2829k = dVar;
        this.f2830l = z2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        C0229C c0229c = (C0229C) l((G.b) obj, (v0.d) obj2);
        t0.g gVar = t0.g.f2989a;
        c0229c.n(gVar);
        return gVar;
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0229C c0229c = new C0229C(this.f2829k, this.f2830l, dVar);
        c0229c.f2828j = obj;
        return c0229c;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.C(obj);
        ((G.b) this.f2828j).d(this.f2829k, Boolean.valueOf(this.f2830l));
        return t0.g.f2989a;
    }
}
