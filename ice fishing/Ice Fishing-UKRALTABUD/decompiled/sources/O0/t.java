package O0;

/* loaded from: classes.dex */
public final class t extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f844j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f845k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N0.e f846l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(N0.e eVar, v0.d dVar) {
        super(2, dVar);
        this.f846l = eVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((t) l(obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        t tVar = new t(this.f846l, dVar);
        tVar.f845k = obj;
        return tVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f844j;
        if (i2 == 0) {
            o.g.C(obj);
            Object obj2 = this.f845k;
            this.f844j = 1;
            if (this.f846l.b(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        return t0.g.f2989a;
    }
}
