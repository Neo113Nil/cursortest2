package r0;

import t0.C0252g;

/* loaded from: classes.dex */
public final class D extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2841i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G.d f2842j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ double f2843k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(G.d dVar, double d2, v0.d dVar2) {
        super(2, dVar2);
        this.f2842j = dVar;
        this.f2843k = d2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        D d2 = (D) l((G.b) obj, (v0.d) obj2);
        C0252g c0252g = C0252g.f2994a;
        d2.n(c0252g);
        return c0252g;
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        D d2 = new D(this.f2842j, this.f2843k, dVar);
        d2.f2841i = obj;
        return d2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.z(obj);
        ((G.b) this.f2841i).d(this.f2842j, new Double(this.f2843k));
        return C0252g.f2994a;
    }
}
