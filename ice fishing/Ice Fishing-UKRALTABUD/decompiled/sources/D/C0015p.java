package D;

/* renamed from: D.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015p extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f250j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f251k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015p(S s2, v0.d dVar) {
        super(2, dVar);
        this.f251k = s2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0015p) l((N0.e) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new C0015p(this.f251k, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f250j;
        if (i2 == 0) {
            o.g.C(obj);
            this.f250j = 1;
            if (S.c(this.f251k, this) == aVar) {
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
