package D;

/* loaded from: classes.dex */
public final class F extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public Throwable f74j;

    /* renamed from: k, reason: collision with root package name */
    public int f75k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ boolean f76l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f77m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f78n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(S s2, int i2, v0.d dVar) {
        super(2, dVar);
        this.f77m = s2;
        this.f78n = i2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((F) l(bool, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        F f2 = new F(this.f77m, this.f78n, dVar);
        f2.f76l = ((Boolean) obj).booleanValue();
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // x0.b
    public final Object n(Object obj) {
        Throwable th;
        int i2;
        boolean z2;
        m0 m0Var;
        boolean z3;
        w0.a aVar = w0.a.f3071f;
        boolean z4 = this.f75k;
        S s2 = this.f77m;
        try {
        } catch (Throwable th2) {
            if (z4 != 0) {
                l0 f2 = s2.f();
                this.f74j = th2;
                this.f76l = z4;
                this.f75k = 2;
                Integer a2 = f2.a();
                if (a2 == aVar) {
                    return aVar;
                }
                z2 = z4;
                th = th2;
                obj = a2;
            } else {
                boolean z5 = z4;
                th = th2;
                i2 = this.f78n;
                z2 = z5;
            }
        }
        if (z4 == 0) {
            o.g.C(obj);
            boolean z6 = this.f76l;
            this.f76l = z6;
            this.f75k = 1;
            obj = S.e(s2, z6, this);
            z4 = z6;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z4 != 1) {
                if (z4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = this.f76l;
                th = this.f74j;
                o.g.C(obj);
                i2 = ((Number) obj).intValue();
                f0 f0Var = new f0(th, i2);
                z3 = z2;
                m0Var = f0Var;
                return new t0.b(m0Var, Boolean.valueOf(z3));
            }
            boolean z7 = this.f76l;
            o.g.C(obj);
            z4 = z7;
        }
        m0Var = (m0) obj;
        z3 = z4;
        return new t0.b(m0Var, Boolean.valueOf(z3));
    }
}
