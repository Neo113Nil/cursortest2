package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rxk implements dup, p7q {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    public static sxk a(c5b c5bVar, int i) {
        jzb jzbVar = jzb.c;
        c5b c5bVar2 = c5bVar;
        if ((i & 64) != 0) {
            c5bVar2 = u75.h("artist1", "artist2");
        }
        c5b c5bVar3 = c5bVar2;
        c5bVar3.getClass();
        return new sxk(new un6(qo6.a, "", -65281), "На заре", "Баста", "2026", jzbVar, true, true, c5bVar3, null, false);
    }

    public static t1u b(izs izsVar) {
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
            return new t1u(u4qVar.a.a, u4qVar.c.a);
        }
        if (z4qVar instanceof s4q) {
            s4q s4qVar = (s4q) z4qVar;
            return new t1u(s4qVar.a.a, s4qVar.c.a);
        }
        if (z4qVar instanceof w4q) {
            w4q w4qVar = (w4q) z4qVar;
            return new t1u(w4qVar.a.a, w4qVar.c.a);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.dup
    public ocg I(long j, xof xofVar, jx7 jx7Var) {
        xofVar.getClass();
        jx7Var.getClass();
        nh0 a = ph0.a();
        Path path = a.a;
        a.h();
        float b = nmq.b(j);
        float b2 = nmq.b(j);
        bak bakVar = bak.a;
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF = a.b;
        rectF.getClass();
        rectF.set(0.0f, 0.0f, b, b2);
        RectF rectF2 = a.b;
        rectF2.getClass();
        path.addOval(rectF2, ph0.b(bakVar));
        float d = nmq.d(j) - nmq.b(j);
        float d2 = nmq.d(j);
        float b3 = nmq.b(j);
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF3 = a.b;
        rectF3.getClass();
        rectF3.set(d, 0.0f, d2, b3);
        RectF rectF4 = a.b;
        rectF4.getClass();
        path.addOval(rectF4, ph0.b(bakVar));
        a.b();
        return new zxj(a);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return b(szuVar.l.g);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        f5q k = maqVar.k();
        if (k instanceof bbq) {
            return b(q7g.I(maqVar.b().e()));
        }
        if ((k instanceof s9q) || (k instanceof baq) || (k instanceof oaq) || (k instanceof taq)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        z3q z3qVar = t1qVar.a;
        if (z3qVar instanceof u1q) {
            u1q u1qVar = (u1q) z3qVar;
            return new t1u((s9p) u1qVar.c.d.getValue(), u1qVar.d);
        }
        if ((z3qVar instanceof c1q) || (z3qVar instanceof e1q) || (z3qVar instanceof r1q) || (z3qVar instanceof h1q) || (z3qVar instanceof k1q) || (z3qVar instanceof a2q)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return null;
    }
}
