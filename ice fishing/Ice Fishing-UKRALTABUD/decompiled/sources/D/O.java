package D;

/* loaded from: classes.dex */
public final class O extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f111j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f112k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f113l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(S s2, v0.d dVar) {
        super(2, dVar);
        this.f113l = s2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((O) l((e0) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        O o2 = new O(this.f113l, dVar);
        o2.f112k = obj;
        return o2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f111j;
        if (i2 == 0) {
            o.g.C(obj);
            e0 e0Var = (e0) this.f112k;
            this.f111j = 1;
            if (S.b(this.f113l, e0Var, this) == aVar) {
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
