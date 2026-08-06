package E1;

import A1.AbstractC0022x;
import A1.C0016q;
import h1.C0239i;
import m1.EnumC0985a;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: d, reason: collision with root package name */
    public final D1.d f327d;

    public h(D1.d dVar, l1.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f327d = dVar;
    }

    @Override // E1.f
    public final Object a(C1.r rVar, l1.d dVar) {
        Object r2 = this.f327d.r(new r(rVar), dVar);
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        C0239i c0239i = C0239i.f3393a;
        if (r2 != enumC0985a) {
            r2 = c0239i;
        }
        return r2 == enumC0985a ? r2 : c0239i;
    }

    @Override // E1.f
    public final f b(l1.i iVar, int i2, int i3) {
        return new h(this.f327d, iVar, i2, i3);
    }

    @Override // E1.f, D1.d
    public final Object r(D1.e eVar, l1.d dVar) {
        Object r2;
        C0239i c0239i = C0239i.f3393a;
        int i2 = this.f322b;
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        if (i2 == -3) {
            l1.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            C0016q c0016q = C0016q.f66g;
            l1.i iVar = this.f321a;
            l1.i l2 = !((Boolean) iVar.k(bool, c0016q)).booleanValue() ? context.l(iVar) : AbstractC0022x.a(context, iVar, false);
            if (kotlin.jvm.internal.i.a(l2, context)) {
                r2 = this.f327d.r(eVar, dVar);
                if (r2 != enumC0985a) {
                    r2 = c0239i;
                }
                if (r2 != enumC0985a) {
                    return c0239i;
                }
            } else {
                l1.e eVar2 = l1.e.f8137a;
                if (kotlin.jvm.internal.i.a(l2.m(eVar2), context.m(eVar2))) {
                    l1.i context2 = dVar.getContext();
                    if (!(eVar instanceof r)) {
                        eVar = new D1.l(eVar, context2);
                    }
                    r2 = l.b(l2, eVar, F1.a.l(l2), new g(this, null), dVar);
                    if (r2 != enumC0985a) {
                        r2 = c0239i;
                    }
                    if (r2 != enumC0985a) {
                        return c0239i;
                    }
                }
            }
            return r2;
        }
        r2 = super.r(eVar, dVar);
        if (r2 != enumC0985a) {
            return c0239i;
        }
        return r2;
    }

    @Override // E1.f
    public final String toString() {
        return this.f327d + " -> " + super.toString();
    }
}
