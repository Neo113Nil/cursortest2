package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class qfp {
    public final xci a;
    public final boolean b;
    public final mpf c;
    public final jfp d;
    public boolean e;
    public qfp f;
    public final int g;

    public qfp(xci xciVar, boolean z, mpf mpfVar, jfp jfpVar) {
        this.a = xciVar;
        this.b = z;
        this.c = mpfVar;
        this.d = jfpVar;
        this.g = mpfVar.b;
    }

    public static /* synthetic */ List h(int i, qfp qfpVar) {
        return qfpVar.g((i & 1) != 0 ? !qfpVar.b : false, (i & 2) == 0);
    }

    public final qfp a(meo meoVar, Function1 function1) {
        jfp jfpVar = new jfp();
        jfpVar.c = false;
        jfpVar.d = false;
        function1.invoke(jfpVar);
        qfp qfpVar = new qfp(new pfp(function1), false, new mpf(this.g + (meoVar != null ? 1000000000 : 2000000000), true), jfpVar);
        qfpVar.e = true;
        qfpVar.f = this;
        return qfpVar;
    }

    public final void b(mpf mpfVar, ArrayList arrayList) {
        eqi x = mpfVar.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar2 = (mpf) objArr[i2];
            if (mpfVar2.G() && !mpfVar2.v0) {
                if (mpfVar2.F.M(8)) {
                    arrayList.add(bfg.g(mpfVar2, this.b));
                } else {
                    b(mpfVar2, arrayList);
                }
            }
        }
    }

    public final f8j c() {
        if (this.e) {
            qfp j = j();
            if (j != null) {
                return j.c();
            }
            return null;
        }
        sv7 u = bfg.u(this.c);
        if (u == null) {
            u = this.a;
        }
        return bcx.D(u, 8);
    }

    public final void d(ArrayList arrayList, ArrayList arrayList2) {
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            qfp qfpVar = (qfp) arrayList.get(size2);
            if (qfpVar.l()) {
                arrayList2.add(qfpVar);
            } else if (!qfpVar.d.d) {
                qfpVar.d(arrayList, arrayList2);
            }
        }
    }

    public final ynn e() {
        f8j c = c();
        if (c != null) {
            if (!c.b1().n) {
                c = null;
            }
            if (c != null) {
                return ltg.D(c).y(c, true);
            }
        }
        return ynn.e;
    }

    public final ynn f() {
        f8j c = c();
        if (c != null) {
            if (!c.b1().n) {
                c = null;
            }
            if (c != null) {
                return ltg.w(c);
            }
        }
        return ynn.e;
    }

    public final List g(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!l()) {
            return o(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        d(arrayList, arrayList2);
        return arrayList2;
    }

    public final jfp i() {
        boolean l = l();
        jfp jfpVar = this.d;
        if (!l) {
            return jfpVar;
        }
        jfp a = jfpVar.a();
        n(new ArrayList(), a);
        return a;
    }

    public final qfp j() {
        mpf mpfVar;
        qfp qfpVar = this.f;
        if (qfpVar != null) {
            return qfpVar;
        }
        mpf mpfVar2 = this.c;
        boolean z = this.b;
        if (z) {
            mpfVar = mpfVar2.u();
            while (mpfVar != null) {
                jfp w = mpfVar.w();
                if (w != null && w.c) {
                    break;
                }
                mpfVar = mpfVar.u();
            }
        }
        mpfVar = null;
        if (mpfVar == null) {
            mpf u = mpfVar2.u();
            while (true) {
                if (u == null) {
                    mpfVar = null;
                    break;
                }
                if (u.F.M(8)) {
                    mpfVar = u;
                    break;
                }
                u = u.u();
            }
        }
        if (mpfVar == null) {
            return null;
        }
        return bfg.g(mpfVar, z);
    }

    public final jfp k() {
        return this.d;
    }

    public final boolean l() {
        return this.b && this.d.c;
    }

    public final boolean m() {
        if (this.e || !h(4, this).isEmpty()) {
            return false;
        }
        mpf u = this.c.u();
        while (true) {
            if (u == null) {
                u = null;
                break;
            }
            jfp w = u.w();
            if (w != null && w.c) {
                break;
            }
            u = u.u();
        }
        return u == null;
    }

    public final void n(ArrayList arrayList, jfp jfpVar) {
        if (this.d.d) {
            return;
        }
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            qfp qfpVar = (qfp) arrayList.get(size2);
            if (!qfpVar.l()) {
                jfpVar.m(qfpVar.d);
                qfpVar.n(arrayList, jfpVar);
            }
        }
    }

    public final List o(ArrayList arrayList, boolean z) {
        if (this.e) {
            return c5b.a;
        }
        b(this.c, arrayList);
        if (z) {
            jfp jfpVar = this.d;
            tpi tpiVar = jfpVar.a;
            Object g = tpiVar.g(ufp.w);
            if (g == null) {
                g = null;
            }
            meo meoVar = (meo) g;
            if (meoVar != null && jfpVar.c && !arrayList.isEmpty()) {
                arrayList.add(a(meoVar, new hxo(3, meoVar)));
            }
            xfp xfpVar = ufp.a;
            if (tpiVar.c(xfpVar) && !arrayList.isEmpty() && jfpVar.c) {
                Object g2 = tpiVar.g(xfpVar);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new r23(str, 8)));
                }
            }
        }
        return arrayList;
    }
}
