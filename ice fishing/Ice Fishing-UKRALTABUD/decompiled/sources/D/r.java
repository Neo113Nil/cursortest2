package D;

/* loaded from: classes.dex */
public final class r extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f256j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m0 f257k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m0 m0Var, v0.d dVar) {
        super(2, dVar);
        this.f257k = m0Var;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((r) l((m0) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        r rVar = new r(this.f257k, dVar);
        rVar.f256j = obj;
        return rVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.C(obj);
        m0 m0Var = (m0) this.f256j;
        return Boolean.valueOf((m0Var instanceof C0003d) && m0Var.f241a <= this.f257k.f241a);
    }
}
