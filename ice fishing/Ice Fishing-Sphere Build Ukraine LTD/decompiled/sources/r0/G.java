package r0;

import t0.C0252g;

/* loaded from: classes.dex */
public final class G extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2852i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G.d f2853j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2854k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(G.d dVar, long j2, v0.d dVar2) {
        super(2, dVar2);
        this.f2853j = dVar;
        this.f2854k = j2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        G g2 = (G) l((G.b) obj, (v0.d) obj2);
        C0252g c0252g = C0252g.f2994a;
        g2.n(c0252g);
        return c0252g;
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        G g2 = new G(this.f2853j, this.f2854k, dVar);
        g2.f2852i = obj;
        return g2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.z(obj);
        ((G.b) this.f2852i).d(this.f2853j, new Long(this.f2854k));
        return C0252g.f2994a;
    }
}
