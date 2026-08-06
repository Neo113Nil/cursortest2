package F;

import A1.InterfaceC0020v;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class I extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(P p2, l1.d dVar) {
        super(2, dVar);
        this.f389f = p2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new I(this.f389f, dVar);
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f388e;
        P p2 = this.f389f;
        try {
            if (i2 == 0) {
                R1.l.F(obj);
                if (p2.f419h.l() instanceof b0) {
                    return p2.f419h.l();
                }
                this.f388e = 1;
                if (p2.g(this) == enumC0985a) {
                    return enumC0985a;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.l.F(obj);
                    return (k0) obj;
                }
                R1.l.F(obj);
            }
            this.f388e = 2;
            obj = P.d(p2, false, this);
            if (obj == enumC0985a) {
                return enumC0985a;
            }
            return (k0) obj;
        } catch (Throwable th) {
            return new d0(th, -1);
        }
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((I) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
