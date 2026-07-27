package r0;

import t0.C0252g;

/* renamed from: r0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239k extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2894i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G.d f2895j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2896k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0239k(G.d dVar, String str, v0.d dVar2) {
        super(2, dVar2);
        this.f2895j = dVar;
        this.f2896k = str;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        C0239k c0239k = (C0239k) l((G.b) obj, (v0.d) obj2);
        C0252g c0252g = C0252g.f2994a;
        c0239k.n(c0252g);
        return c0252g;
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0239k c0239k = new C0239k(this.f2895j, this.f2896k, dVar);
        c0239k.f2894i = obj;
        return c0239k;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.z(obj);
        ((G.b) this.f2894i).d(this.f2895j, this.f2896k);
        return C0252g.f2994a;
    }
}
