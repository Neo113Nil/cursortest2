package D;

/* loaded from: classes.dex */
public final class A implements N0.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f56f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f57g;

    public /* synthetic */ A(int i2, Object obj) {
        this.f56f = i2;
        this.f57g = obj;
    }

    @Override // N0.e
    public final Object b(Object obj, v0.d dVar) {
        Object d2;
        switch (this.f56f) {
            case 0:
                S s2 = (S) this.f57g;
                boolean z2 = s2.f132m.x() instanceof d0;
                t0.g gVar = t0.g.f2989a;
                return (z2 || (d2 = S.d(s2, true, dVar)) != w0.a.f3071f) ? gVar : d2;
            case 1:
                ((E0.p) this.f57g).f312f = obj;
                throw new O0.a(this);
            default:
                ((U.i) this.f57g).accept(obj);
                return t0.g.f2989a;
        }
    }
}
