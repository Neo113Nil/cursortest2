package F;

import h1.C0234d;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class E extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public Throwable f363e;

    /* renamed from: f, reason: collision with root package name */
    public int f364f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P f366h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f367i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(P p2, int i2, l1.d dVar) {
        super(2, dVar);
        this.f366h = p2;
        this.f367i = i2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        E e2 = new E(this.f366h, this.f367i, dVar);
        e2.f365g = ((Boolean) obj).booleanValue();
        return e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        Throwable th;
        int i2;
        boolean z2;
        k0 k0Var;
        boolean z3;
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        boolean z4 = this.f364f;
        P p2 = this.f366h;
        try {
        } catch (Throwable th2) {
            if (z4 != 0) {
                j0 f2 = p2.f();
                this.f363e = th2;
                this.f365g = z4;
                this.f364f = 2;
                Integer a2 = f2.a();
                if (a2 == enumC0985a) {
                    return enumC0985a;
                }
                z2 = z4;
                th = th2;
                obj = a2;
            } else {
                boolean z5 = z4;
                th = th2;
                i2 = this.f367i;
                z2 = z5;
            }
        }
        if (z4 == 0) {
            R1.l.F(obj);
            boolean z6 = this.f365g;
            this.f365g = z6;
            this.f364f = 1;
            obj = P.e(p2, z6, this);
            z4 = z6;
            if (obj == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (z4 != 1) {
                if (z4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = this.f365g;
                th = this.f363e;
                R1.l.F(obj);
                i2 = ((Number) obj).intValue();
                d0 d0Var = new d0(th, i2);
                z3 = z2;
                k0Var = d0Var;
                return new C0234d(k0Var, Boolean.valueOf(z3));
            }
            boolean z7 = this.f365g;
            R1.l.F(obj);
            z4 = z7;
        }
        k0Var = (k0) obj;
        z3 = z4;
        return new C0234d(k0Var, Boolean.valueOf(z3));
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) b(bool, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
