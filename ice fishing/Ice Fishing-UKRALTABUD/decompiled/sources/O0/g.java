package O0;

/* loaded from: classes.dex */
public final class g extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f824j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f825k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f826l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, v0.d dVar) {
        super(2, dVar);
        this.f826l = hVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((g) l((N0.e) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        g gVar = new g(this.f826l, dVar);
        gVar.f825k = obj;
        return gVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f824j;
        t0.g gVar = t0.g.f2989a;
        if (i2 == 0) {
            o.g.C(obj);
            N0.e eVar = (N0.e) this.f825k;
            this.f824j = 1;
            Object n2 = this.f826l.f827i.n(eVar, this);
            if (n2 != aVar) {
                n2 = gVar;
            }
            if (n2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        return gVar;
    }
}
