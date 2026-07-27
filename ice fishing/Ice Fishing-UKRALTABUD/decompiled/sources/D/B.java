package D;

import K0.C0036l;
import K0.InterfaceC0045v;

/* loaded from: classes.dex */
public final class B extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f58j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f59k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(S s2, v0.d dVar) {
        super(2, dVar);
        this.f59k = s2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((B) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new B(this.f59k, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f58j;
        t0.g gVar = t0.g.f2989a;
        S s2 = this.f59k;
        if (i2 == 0) {
            o.g.C(obj);
            this.f58j = 1;
            Object U2 = ((C0036l) s2.f133n.f243b).U(this);
            if (U2 != aVar) {
                U2 = gVar;
            }
            if (U2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    o.g.C(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        N0.d dVar = s2.f().f232c;
        N0.d a2 = dVar instanceof O0.j ? O0.l.a((O0.j) dVar, null, 0, 2, 1) : new O0.h(dVar, v0.j.f3009f, 0, 2);
        A a3 = new A(0, s2);
        this.f58j = 2;
        return a2.n(a3, this) == aVar ? aVar : gVar;
    }
}
