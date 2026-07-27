package P0;

import L0.AbstractC0064w;
import L0.C;
import L0.InterfaceC0063v;
import t0.C0252g;

/* loaded from: classes.dex */
public final class d extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f833i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f834j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O0.e f835k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f836l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(O0.e eVar, f fVar, v0.d dVar) {
        super(2, dVar);
        this.f835k = eVar;
        this.f836l = fVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((d) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        d dVar2 = new d(this.f835k, this.f836l, dVar);
        dVar2.f834j = obj;
        return dVar2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f833i;
        C0252g c0252g = C0252g.f2994a;
        if (i2 == 0) {
            o.g.z(obj);
            InterfaceC0063v interfaceC0063v = (InterfaceC0063v) this.f834j;
            f fVar = this.f836l;
            int i3 = fVar.f841f;
            if (i3 == -3) {
                i3 = -2;
            }
            D0.p eVar = new e(fVar, null);
            N0.b a2 = N0.i.a(i3, fVar.f842g, 4);
            v0.i a3 = AbstractC0064w.a(interfaceC0063v.o(), fVar.f840e, true);
            S0.d dVar = C.f611a;
            if (a3 != dVar && a3.i(v0.e.f3013e) == null) {
                a3 = a3.f(dVar);
            }
            N0.o oVar = new N0.o(a3, a2);
            oVar.W(3, oVar, eVar);
            this.f833i = 1;
            Object b2 = O0.r.b(this.f835k, oVar, true, this);
            if (b2 != aVar) {
                b2 = c0252g;
            }
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return c0252g;
    }
}
