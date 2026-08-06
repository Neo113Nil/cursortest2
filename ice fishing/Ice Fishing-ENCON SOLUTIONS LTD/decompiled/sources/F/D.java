package F;

import h1.C0234d;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class D extends AbstractC0995f implements t1.l {

    /* renamed from: e, reason: collision with root package name */
    public Throwable f360e;

    /* renamed from: f, reason: collision with root package name */
    public int f361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f362g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(P p2, l1.d dVar) {
        super(1, dVar);
        this.f362g = p2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        Throwable th;
        k0 k0Var;
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f361f;
        P p2 = this.f362g;
        try {
        } catch (Throwable th2) {
            j0 f2 = p2.f();
            this.f360e = th2;
            this.f361f = 2;
            Integer a2 = f2.a();
            if (a2 == enumC0985a) {
                return enumC0985a;
            }
            th = th2;
            obj = a2;
        }
        if (i2 == 0) {
            R1.l.F(obj);
            this.f361f = 1;
            obj = P.e(p2, true, this);
            if (obj == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f360e;
                R1.l.F(obj);
                k0Var = new d0(th, ((Number) obj).intValue());
                return new C0234d(k0Var, Boolean.TRUE);
            }
            R1.l.F(obj);
        }
        k0Var = (k0) obj;
        return new C0234d(k0Var, Boolean.TRUE);
    }

    @Override // t1.l
    public final Object invoke(Object obj) {
        return new D(this.f362g, (l1.d) obj).g(C0239i.f3393a);
    }
}
