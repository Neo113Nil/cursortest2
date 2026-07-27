package O0;

import K0.AbstractC0046w;
import K0.C;
import K0.InterfaceC0045v;

/* loaded from: classes.dex */
public final class d extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f814j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f815k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N0.e f816l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f817m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(N0.e eVar, f fVar, v0.d dVar) {
        super(2, dVar);
        this.f816l = eVar;
        this.f817m = fVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((d) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        d dVar2 = new d(this.f816l, this.f817m, dVar);
        dVar2.f815k = obj;
        return dVar2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f814j;
        t0.g gVar = t0.g.f2989a;
        if (i2 == 0) {
            o.g.C(obj);
            InterfaceC0045v interfaceC0045v = (InterfaceC0045v) this.f815k;
            f fVar = this.f817m;
            int i3 = fVar.f822g;
            if (i3 == -3) {
                i3 = -2;
            }
            D0.p eVar = new e(fVar, null);
            M0.b a2 = M0.i.a(i3, fVar.f823h, 4);
            v0.i a3 = AbstractC0046w.a(interfaceC0045v.o(), fVar.f821f, true);
            R0.d dVar = C.f463a;
            if (a3 != dVar && a3.i(v0.e.f3008f) == null) {
                a3 = a3.f(dVar);
            }
            M0.o oVar = new M0.o(a3, a2);
            oVar.W(3, oVar, eVar);
            this.f814j = 1;
            Object b2 = N0.r.b(this.f816l, oVar, true, this);
            if (b2 != aVar) {
                b2 = gVar;
            }
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        return gVar;
    }
}
