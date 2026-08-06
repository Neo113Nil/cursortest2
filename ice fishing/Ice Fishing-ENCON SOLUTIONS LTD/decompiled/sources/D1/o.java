package D1;

import F.P;
import F.b0;
import h1.C0239i;
import m1.EnumC0985a;

/* loaded from: classes.dex */
public final class o implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f286b;

    public /* synthetic */ o(int i2, Object obj) {
        this.f285a = i2;
        this.f286b = obj;
    }

    @Override // D1.e
    public final Object a(Object obj, l1.d dVar) {
        Object d2;
        switch (this.f285a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f286b).f8076a = obj;
                throw new E1.a(this);
            case 1:
                P p2 = (P) this.f286b;
                boolean z2 = p2.f419h.l() instanceof b0;
                C0239i c0239i = C0239i.f3393a;
                return (z2 || (d2 = P.d(p2, true, dVar)) != EnumC0985a.f8194a) ? c0239i : d2;
            default:
                ((P0.q) this.f286b).accept(obj);
                return C0239i.f3393a;
        }
    }
}
