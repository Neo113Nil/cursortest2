package D;

import t0.C0247b;
import t0.C0252g;

/* loaded from: classes.dex */
public final class F extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public Throwable f74i;

    /* renamed from: j, reason: collision with root package name */
    public int f75j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f76k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f77l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f78m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(S s2, int i2, v0.d dVar) {
        super(2, dVar);
        this.f77l = s2;
        this.f78m = i2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((F) l(bool, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        F f2 = new F(this.f77l, this.f78m, dVar);
        f2.f76k = ((Boolean) obj).booleanValue();
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
        w0.a aVar = w0.a.f3076e;
        boolean z4 = this.f75j;
        S s2 = this.f77l;
        try {
        } catch (Throwable th2) {
            if (z4 != 0) {
                l0 f2 = s2.f();
                this.f74i = th2;
                this.f76k = z4;
                this.f75j = 2;
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
                i2 = this.f78m;
                z2 = z5;
            }
        }
        if (z4 == 0) {
            o.g.z(obj);
            boolean z6 = this.f76k;
            this.f76k = z6;
            this.f75j = 1;
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
                z2 = this.f76k;
                th = this.f74i;
                o.g.z(obj);
                i2 = ((Number) obj).intValue();
                f0 f0Var = new f0(th, i2);
                z3 = z2;
                m0Var = f0Var;
                return new C0247b(m0Var, Boolean.valueOf(z3));
            }
            boolean z7 = this.f76k;
            o.g.z(obj);
            z4 = z7;
        }
        m0Var = (m0) obj;
        z3 = z4;
        return new C0247b(m0Var, Boolean.valueOf(z3));
    }
}
