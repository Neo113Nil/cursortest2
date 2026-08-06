package E1;

import A1.AbstractC0022x;
import A1.D;
import A1.InterfaceC0020v;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class d extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f314e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D1.e f316g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f317h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(D1.e eVar, f fVar, l1.d dVar) {
        super(2, dVar);
        this.f316g = eVar;
        this.f317h = fVar;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        d dVar2 = new d(this.f316g, this.f317h, dVar);
        dVar2.f315f = obj;
        return dVar2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f314e;
        C0239i c0239i = C0239i.f3393a;
        if (i2 == 0) {
            R1.l.F(obj);
            InterfaceC0020v interfaceC0020v = (InterfaceC0020v) this.f315f;
            f fVar = this.f317h;
            int i3 = fVar.f322b;
            if (i3 == -3) {
                i3 = -2;
            }
            t1.p eVar = new e(fVar, null);
            C1.c a2 = C1.j.a(i3, fVar.f323c, 4);
            l1.i a3 = AbstractC0022x.a(interfaceC0020v.h(), fVar.f321a, true);
            H1.d dVar = D.f2a;
            if (a3 != dVar && a3.m(l1.e.f8137a) == null) {
                a3 = a3.l(dVar);
            }
            C1.q qVar = new C1.q(a3, a2);
            qVar.V(3, qVar, eVar);
            this.f314e = 1;
            Object b2 = D1.s.b(this.f316g, qVar, true, this);
            if (b2 != enumC0985a) {
                b2 = c0239i;
            }
            if (b2 == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.l.F(obj);
        }
        return c0239i;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
