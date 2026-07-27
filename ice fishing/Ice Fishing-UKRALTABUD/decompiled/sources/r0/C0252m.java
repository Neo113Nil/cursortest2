package r0;

/* renamed from: r0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252m extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2895j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G.d f2896k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2897l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0252m(G.d dVar, String str, v0.d dVar2) {
        super(2, dVar2);
        this.f2896k = dVar;
        this.f2897l = str;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        C0252m c0252m = (C0252m) l((G.b) obj, (v0.d) obj2);
        t0.g gVar = t0.g.f2989a;
        c0252m.n(gVar);
        return gVar;
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0252m c0252m = new C0252m(this.f2896k, this.f2897l, dVar);
        c0252m.f2895j = obj;
        return c0252m;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.C(obj);
        ((G.b) this.f2895j).d(this.f2896k, this.f2897l);
        return t0.g.f2989a;
    }
}
