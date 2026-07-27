package O0;

/* loaded from: classes.dex */
public final class e extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f818j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f819k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f820l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, v0.d dVar) {
        super(2, dVar);
        this.f820l = fVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((e) l((M0.p) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        e eVar = new e(this.f820l, dVar);
        eVar.f819k = obj;
        return eVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f818j;
        if (i2 == 0) {
            o.g.C(obj);
            M0.p pVar = (M0.p) this.f819k;
            this.f818j = 1;
            if (this.f820l.a(pVar, this) == aVar) {
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
