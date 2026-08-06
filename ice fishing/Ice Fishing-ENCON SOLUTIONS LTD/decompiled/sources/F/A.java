package F;

import A1.C0011l;
import A1.InterfaceC0020v;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class A extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(P p2, l1.d dVar) {
        super(2, dVar);
        this.f348f = p2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new A(this.f348f, dVar);
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f347e;
        C0239i c0239i = C0239i.f3393a;
        P p2 = this.f348f;
        if (i2 == 0) {
            R1.l.F(obj);
            this.f347e = 1;
            Object T2 = ((C0011l) p2.f420i.f533b).T(this);
            if (T2 != enumC0985a) {
                T2 = c0239i;
            }
            if (T2 == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    R1.l.F(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.l.F(obj);
        }
        D1.d dVar = p2.f().f507c;
        D1.d a2 = dVar instanceof E1.j ? E1.l.a((E1.j) dVar, null, 0, 2, 1) : new E1.h(dVar, l1.j.f8138a, 0, 2);
        D1.o oVar = new D1.o(1, p2);
        this.f347e = 2;
        return a2.r(oVar, this) == enumC0985a ? enumC0985a : c0239i;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((A) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
