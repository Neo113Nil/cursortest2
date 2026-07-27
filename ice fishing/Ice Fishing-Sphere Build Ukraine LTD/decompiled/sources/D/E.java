package D;

import t0.C0247b;
import t0.C0252g;

/* loaded from: classes.dex */
public final class E extends x0.f implements D0.l {

    /* renamed from: i, reason: collision with root package name */
    public Throwable f71i;

    /* renamed from: j, reason: collision with root package name */
    public int f72j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f73k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(S s2, v0.d dVar) {
        super(1, dVar);
        this.f73k = s2;
    }

    @Override // D0.l
    public final Object i(Object obj) {
        return new E(this.f73k, (v0.d) obj).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        Throwable th;
        m0 m0Var;
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f72j;
        S s2 = this.f73k;
        try {
        } catch (Throwable th2) {
            l0 f2 = s2.f();
            this.f71i = th2;
            this.f72j = 2;
            Integer a2 = f2.a();
            if (a2 == aVar) {
                return aVar;
            }
            th = th2;
            obj = a2;
        }
        if (i2 == 0) {
            o.g.z(obj);
            this.f72j = 1;
            obj = S.e(s2, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f71i;
                o.g.z(obj);
                m0Var = new f0(th, ((Number) obj).intValue());
                return new C0247b(m0Var, Boolean.TRUE);
            }
            o.g.z(obj);
        }
        m0Var = (m0) obj;
        return new C0247b(m0Var, Boolean.TRUE);
    }
}
