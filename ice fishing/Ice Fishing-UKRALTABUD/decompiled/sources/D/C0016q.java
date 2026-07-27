package D;

/* renamed from: D.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016q extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f253j;

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0016q) l((m0) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0016q c0016q = new C0016q(2, dVar);
        c0016q.f253j = obj;
        return c0016q;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.C(obj);
        return Boolean.valueOf(!(((m0) this.f253j) instanceof d0));
    }
}
