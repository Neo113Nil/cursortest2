package D;

/* loaded from: classes.dex */
public final class E extends x0.f implements D0.l {

    /* renamed from: j, reason: collision with root package name */
    public Throwable f71j;

    /* renamed from: k, reason: collision with root package name */
    public int f72k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f73l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(S s2, v0.d dVar) {
        super(1, dVar);
        this.f73l = s2;
    }

    @Override // D0.l
    public final Object i(Object obj) {
        return new E(this.f73l, (v0.d) obj).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        Throwable th;
        m0 m0Var;
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f72k;
        S s2 = this.f73l;
        try {
        } catch (Throwable th2) {
            l0 f2 = s2.f();
            this.f71j = th2;
            this.f72k = 2;
            Integer a2 = f2.a();
            if (a2 == aVar) {
                return aVar;
            }
            th = th2;
            obj = a2;
        }
        if (i2 == 0) {
            o.g.C(obj);
            this.f72k = 1;
            obj = S.e(s2, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f71j;
                o.g.C(obj);
                m0Var = new f0(th, ((Number) obj).intValue());
                return new t0.b(m0Var, Boolean.TRUE);
            }
            o.g.C(obj);
        }
        m0Var = (m0) obj;
        return new t0.b(m0Var, Boolean.TRUE);
    }
}
