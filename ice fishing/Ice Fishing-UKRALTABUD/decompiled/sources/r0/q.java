package r0;

/* loaded from: classes.dex */
public final class q implements N0.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N0.d f2908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ G.d f2909h;

    public /* synthetic */ q(N0.d dVar, G.d dVar2, int i2) {
        this.f2907f = i2;
        this.f2908g = dVar;
        this.f2909h = dVar2;
    }

    @Override // N0.d
    public final Object n(N0.e eVar, v0.d dVar) {
        switch (this.f2907f) {
            case 0:
                Object n2 = this.f2908g.n(new C0255p(eVar, this.f2909h, 0), dVar);
                if (n2 != w0.a.f3071f) {
                    break;
                }
                break;
            case 1:
                Object n3 = this.f2908g.n(new C0255p(eVar, this.f2909h, 1), dVar);
                if (n3 != w0.a.f3071f) {
                    break;
                }
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object n4 = this.f2908g.n(new C0255p(eVar, this.f2909h, 2), dVar);
                if (n4 != w0.a.f3071f) {
                    break;
                }
                break;
            default:
                Object n5 = this.f2908g.n(new C0255p(eVar, this.f2909h, 3), dVar);
                if (n5 != w0.a.f3071f) {
                    break;
                }
                break;
        }
        return t0.g.f2989a;
    }
}
