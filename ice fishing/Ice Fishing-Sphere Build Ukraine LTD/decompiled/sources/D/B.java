package D;

import L0.C0054l;
import L0.InterfaceC0063v;
import t0.C0252g;

/* loaded from: classes.dex */
public final class B extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f58i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f59j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(S s2, v0.d dVar) {
        super(2, dVar);
        this.f59j = s2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((B) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new B(this.f59j, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f58i;
        C0252g c0252g = C0252g.f2994a;
        S s2 = this.f59j;
        if (i2 == 0) {
            o.g.z(obj);
            this.f58i = 1;
            Object U2 = ((C0054l) s2.f133m.f244b).U(this);
            if (U2 != aVar) {
                U2 = c0252g;
            }
            if (U2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    o.g.z(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        O0.d dVar = s2.f().f232c;
        O0.d a2 = dVar instanceof P0.j ? P0.l.a((P0.j) dVar, null, 0, 2, 1) : new P0.h(dVar, v0.j.f3014e, 0, 2);
        A a3 = new A(0, s2);
        this.f58i = 2;
        return a2.c(a3, this) == aVar ? aVar : c0252g;
    }
}
