package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jzk implements w2q, ach, dup, p7q, pur {
    public final /* synthetic */ int a;

    public /* synthetic */ jzk(int i) {
        this.a = i;
    }

    public static uvu a(izs izsVar) {
        if (!(izsVar instanceof e6v)) {
            if (Intrinsics.d(izsVar, hzs.a)) {
                return null;
            }
            b6e.s();
            return null;
        }
        e6v e6vVar = (e6v) izsVar;
        if (!(e6vVar instanceof d6v)) {
            if (e6vVar instanceof b6v) {
                return null;
            }
            b6e.s();
            return null;
        }
        z4q z4qVar = ((d6v) e6vVar).a;
        if (z4qVar instanceof u4q) {
            u4q u4qVar = (u4q) z4qVar;
            return new uvu(u4qVar.a.a, u4qVar.c.a);
        }
        if (z4qVar instanceof s4q) {
            s4q s4qVar = (s4q) z4qVar;
            return new uvu(s4qVar.a.a, s4qVar.c.a);
        }
        if (z4qVar instanceof w4q) {
            w4q w4qVar = (w4q) z4qVar;
            return new uvu(w4qVar.a.a, w4qVar.c.a);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.dup
    public ocg I(long j, xof xofVar, jx7 jx7Var) {
        return new ayj(ywf.d(0L, j));
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.ach
    public /* bridge */ /* synthetic */ zbh d() {
        return xbh.b;
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.pur
    public void l(zco zcoVar, float f) {
        zcoVar.getClass();
        zcoVar.y((1.0f - f) * nmq.b(zcoVar.p) * 0.32592592f);
        zcoVar.a(f);
        float f2 = (f * 0.1f) + 0.9f;
        zcoVar.k(f2);
        zcoVar.n(f2);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return a(szuVar.l.g);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        return a(q7g.I(maqVar.b().e()));
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        z3q z3qVar = t1qVar.a;
        if (z3qVar instanceof u1q) {
            u1q u1qVar = (u1q) z3qVar;
            return new uvu((s9p) u1qVar.c.d.getValue(), u1qVar.d);
        }
        if ((z3qVar instanceof c1q) || (z3qVar instanceof e1q) || (z3qVar instanceof r1q) || (z3qVar instanceof h1q) || (z3qVar instanceof k1q) || (z3qVar instanceof a2q)) {
            return null;
        }
        b6e.s();
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return null;
    }
}
