package defpackage;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class quk implements puk, tzt, ev3, w2q {
    public static Typeface e(String str, tqc tqcVar, int i) {
        if (i == 0 && Intrinsics.d(tqcVar, tqc.m) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int N = vwb.N(tqcVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(N) : Typeface.create(str, N);
    }

    public static boolean f() {
        jyr jyrVar = dzq.g;
        return Intrinsics.d((String) jyrVar.getValue(), "on") || Intrinsics.d((String) jyrVar.getValue(), "on1");
    }

    @Override // defpackage.rzt
    public cn0 A(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return j < ((long) 0) * 1000000 ? cn0Var : cn0Var2;
    }

    @Override // defpackage.puk
    public Typeface b(tqc tqcVar, int i) {
        return e(null, tqcVar, i);
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return liw.a;
    }

    @Override // defpackage.puk
    public Typeface d(l5d l5dVar, tqc tqcVar, int i) {
        String str = l5dVar.f;
        int i2 = tqcVar.a / 100;
        if (i2 >= 0 && i2 < 2) {
            str = str.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            str = str.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                str = str.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                str = str.concat("-black");
            }
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface e = e(str, tqcVar, i);
            if (!Intrinsics.d(e, Typeface.create(Typeface.DEFAULT, vwb.N(tqcVar, i))) && !Intrinsics.d(e, e(null, tqcVar, i))) {
                typeface = e;
            }
        }
        return typeface == null ? e(l5dVar.f, tqcVar, i) : typeface;
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        return faqVar.d();
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        mqs mqsVar = jzsVar.a;
        mqsVar.getClass();
        return ngg.q(mqsVar);
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            mqs mqsVar = ((c2q) m1qVar).d;
            mqsVar.getClass();
            return ngg.q(mqsVar);
        }
        if (m1qVar instanceof e2q) {
            return liw.a;
        }
        if (m1qVar instanceof j1q) {
            return new jiw(((j1q) m1qVar).d.a);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return new miw(i5uVar.a.a);
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return new jiw(k4dVar.a.a);
    }

    @Override // defpackage.tzt
    public int o() {
        return 0;
    }

    @Override // defpackage.tzt
    public int u() {
        return 0;
    }

    @Override // defpackage.rzt
    public cn0 x(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return cn0Var3;
    }
}
