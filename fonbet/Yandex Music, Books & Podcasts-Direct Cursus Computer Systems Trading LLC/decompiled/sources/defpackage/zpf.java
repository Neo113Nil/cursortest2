package defpackage;

import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zpf implements op5 {
    public final mpf a;
    public tr5 b;
    public fnr c;
    public int d;
    public int e;
    public final tpi f;
    public final tpi g;
    public final upf h;
    public final rpf i;
    public final tpi j;
    public final enr k;
    public final tpi l;
    public final eqi m;
    public int n;
    public int o;
    public final String p;

    public zpf(mpf mpfVar, fnr fnrVar) {
        this.a = mpfVar;
        this.c = fnrVar;
        long[] jArr = vso.a;
        this.f = new tpi();
        this.g = new tpi();
        this.h = new upf(this);
        this.i = new rpf(this);
        this.j = new tpi();
        this.k = new enr();
        this.l = new tpi();
        this.m = new eqi(new Object[16]);
        this.p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static wr5 i(wr5 wr5Var, mpf mpfVar, boolean z, tr5 tr5Var, wn5 wn5Var) {
        if (wr5Var == null || wr5Var.t) {
            ViewGroup.LayoutParams layoutParams = a6w.a;
            wr5Var = new wr5(tr5Var, new gft(mpfVar));
        }
        if (!z) {
            wr5Var.n(wn5Var);
            return wr5Var;
        }
        oq5 oq5Var = wr5Var.s;
        oq5Var.y = 100;
        oq5Var.x = true;
        wr5Var.n(wn5Var);
        if (oq5Var.E || oq5Var.y != 100) {
            llm.a("Cannot disable reuse from root if it was caused by other groups");
        }
        oq5Var.y = -1;
        oq5Var.x = false;
        return wr5Var;
    }

    @Override // defpackage.op5
    public final void a() {
        f(true);
    }

    @Override // defpackage.op5
    public final void b() {
        f(false);
    }

    public final void c(int i) {
        boolean z;
        boolean z2 = false;
        this.n = 0;
        List p = this.a.p();
        epi epiVar = (epi) p;
        int i2 = (((eqi) epiVar.b).c - this.o) - 1;
        if (i <= i2) {
            this.k.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.f.g((mpf) epiVar.get(i3));
                    g.getClass();
                    ((hpi) this.k.b).a(((spf) g).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.s(this.k);
            b2r G = wyf.G();
            Function1 e = G != null ? G.e() : null;
            b2r Q = wyf.Q(G);
            z = false;
            while (i2 >= i) {
                try {
                    mpf mpfVar = (mpf) ((epi) p).get(i2);
                    Object g2 = this.f.g(mpfVar);
                    g2.getClass();
                    spf spfVar = (spf) g2;
                    Object obj = spfVar.a;
                    if (((hpi) this.k.b).c(obj)) {
                        this.n++;
                        if (((Boolean) spfVar.f.getValue()).booleanValue()) {
                            qpf qpfVar = mpfVar.G;
                            jfh jfhVar = qpfVar.p;
                            kpf kpfVar = kpf.c;
                            jfhVar.l = kpfVar;
                            zwg zwgVar = qpfVar.q;
                            if (zwgVar != null) {
                                zwgVar.j = kpfVar;
                            }
                            spfVar.f.setValue(Boolean.FALSE);
                            z = true;
                        }
                    } else {
                        mpf mpfVar2 = this.a;
                        mpfVar2.q = true;
                        this.f.k(mpfVar);
                        wr5 wr5Var = spfVar.c;
                        if (wr5Var != null) {
                            wr5Var.c();
                        }
                        this.a.Q(i2, 1);
                        mpfVar2.q = false;
                    }
                    this.g.k(obj);
                    i2--;
                } catch (Throwable th) {
                    wyf.b0(G, Q, e);
                    throw th;
                }
            }
            wyf.b0(G, Q, e);
        } else {
            z = false;
        }
        if (z) {
            synchronized (g2r.b) {
                upi upiVar = g2r.i.h;
                if (upiVar != null) {
                    if (upiVar.i()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                g2r.a();
            }
        }
        d();
    }

    public final void d() {
        int i = ((eqi) ((epi) this.a.p()).b).c;
        tpi tpiVar = this.f;
        if (tpiVar.e != i) {
            sme.a("Inconsistency between the count of nodes tracked by the state (" + tpiVar.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.n) - this.o < 0) {
            StringBuilder q = k5r.q(i, "Incorrect state. Total children ", ". Reusable children ");
            q.append(this.n);
            q.append(". Precomposed children ");
            q.append(this.o);
            sme.a(q.toString());
        }
        tpi tpiVar2 = this.j;
        if (tpiVar2.e == this.o) {
            return;
        }
        sme.a("Incorrect state. Precomposed children " + this.o + ". Map size " + tpiVar2.e);
    }

    @Override // defpackage.op5
    public final void e() {
        wr5 wr5Var;
        mpf mpfVar = this.a;
        mpfVar.q = true;
        tpi tpiVar = this.f;
        Object[] objArr = tpiVar.c;
        long[] jArr = tpiVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (wr5Var = ((spf) objArr[(i << 3) + i3]).c) != null) {
                            wr5Var.c();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        mpfVar.P();
        mpfVar.q = false;
        tpiVar.a();
        this.g.a();
        this.o = 0;
        this.n = 0;
        this.j.a();
        d();
    }

    public final void f(boolean z) {
        this.o = 0;
        this.j.a();
        List p = this.a.p();
        int i = ((eqi) ((epi) p).b).c;
        if (this.n != i) {
            this.n = i;
            b2r G = wyf.G();
            Function1 e = G != null ? G.e() : null;
            b2r Q = wyf.Q(G);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    mpf mpfVar = (mpf) ((epi) p).get(i2);
                    spf spfVar = (spf) this.f.g(mpfVar);
                    if (spfVar != null && ((Boolean) spfVar.f.getValue()).booleanValue()) {
                        qpf qpfVar = mpfVar.G;
                        jfh jfhVar = qpfVar.p;
                        kpf kpfVar = kpf.c;
                        jfhVar.l = kpfVar;
                        zwg zwgVar = qpfVar.q;
                        if (zwgVar != null) {
                            zwgVar.j = kpfVar;
                        }
                        if (z) {
                            wr5 wr5Var = spfVar.c;
                            if (wr5Var != null) {
                                wr5Var.o();
                            }
                            spfVar.f = szf.g0(Boolean.FALSE);
                        } else {
                            spfVar.f.setValue(Boolean.FALSE);
                        }
                        spfVar.a = u2x.j;
                    }
                } catch (Throwable th) {
                    wyf.b0(G, Q, e);
                    throw th;
                }
            }
            wyf.b0(G, Q, e);
            this.g.a();
        }
        d();
    }

    public final anr g(Object obj, Function2 function2) {
        mpf mpfVar = this.a;
        if (!mpfVar.G()) {
            return new xpf();
        }
        d();
        if (!this.g.c(obj)) {
            this.l.k(obj);
            tpi tpiVar = this.j;
            Object g = tpiVar.g(obj);
            if (g == null) {
                g = j(obj);
                if (g != null) {
                    int k = ((eqi) ((epi) mpfVar.p()).b).k(g);
                    int i = ((eqi) ((epi) mpfVar.p()).b).c;
                    mpfVar.q = true;
                    mpfVar.K(k, i, 1);
                    mpfVar.q = false;
                    this.o++;
                } else {
                    int i2 = ((eqi) ((epi) mpfVar.p()).b).c;
                    mpf mpfVar2 = new mpf(2);
                    mpfVar.q = true;
                    mpfVar.A(i2, mpfVar2);
                    mpfVar.q = false;
                    this.o++;
                    g = mpfVar2;
                }
                tpiVar.m(obj, g);
            }
            h((mpf) g, obj, function2);
        }
        return new ypf(this, obj);
    }

    public final void h(mpf mpfVar, Object obj, Function2 function2) {
        boolean z;
        tpi tpiVar = this.f;
        Object g = tpiVar.g(mpfVar);
        Object obj2 = g;
        if (g == null) {
            wn5 wn5Var = yo5.a;
            spf spfVar = new spf();
            spfVar.a = obj;
            spfVar.b = wn5Var;
            spfVar.c = null;
            spfVar.f = szf.g0(Boolean.TRUE);
            tpiVar.m(mpfVar, spfVar);
            obj2 = spfVar;
        }
        spf spfVar2 = (spf) obj2;
        wr5 wr5Var = spfVar2.c;
        if (wr5Var != null) {
            synchronized (wr5Var.d) {
                z = wr5Var.n.e > 0;
            }
        } else {
            z = true;
        }
        if (spfVar2.b != function2 || z || spfVar2.d) {
            spfVar2.b = function2;
            b2r G = wyf.G();
            Function1 e = G != null ? G.e() : null;
            b2r Q = wyf.Q(G);
            try {
                mpf mpfVar2 = this.a;
                mpfVar2.q = true;
                Function2 function22 = spfVar2.b;
                wr5 wr5Var2 = spfVar2.c;
                tr5 tr5Var = this.b;
                if (tr5Var == null) {
                    sme.c("parent composition reference not set");
                    throw new fif();
                }
                spfVar2.c = i(wr5Var2, mpfVar, spfVar2.e, tr5Var, new wn5(new s30(spfVar2, function22), -1750409193, true));
                spfVar2.e = false;
                mpfVar2.q = false;
                wyf.b0(G, Q, e);
                spfVar2.d = false;
            } catch (Throwable th) {
                wyf.b0(G, Q, e);
                throw th;
            }
        }
    }

    public final mpf j(Object obj) {
        tpi tpiVar;
        int i;
        if (this.n == 0) {
            return null;
        }
        mpf mpfVar = this.a;
        epi epiVar = (epi) mpfVar.p();
        int i2 = ((eqi) epiVar.b).c - this.o;
        int i3 = i2 - this.n;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            tpiVar = this.f;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object g = tpiVar.g((mpf) epiVar.get(i5));
            g.getClass();
            if (Intrinsics.d(((spf) g).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object g2 = tpiVar.g((mpf) epiVar.get(i4));
                g2.getClass();
                spf spfVar = (spf) g2;
                Object obj2 = spfVar.a;
                if (obj2 == u2x.j || this.c.y(obj, obj2)) {
                    spfVar.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            mpfVar.q = true;
            mpfVar.K(i5, i3, 1);
            mpfVar.q = false;
        }
        this.n--;
        mpf mpfVar2 = (mpf) epiVar.get(i3);
        Object g3 = tpiVar.g(mpfVar2);
        g3.getClass();
        spf spfVar2 = (spf) g3;
        spfVar2.f = szf.g0(Boolean.TRUE);
        spfVar2.e = true;
        spfVar2.d = true;
        return mpfVar2;
    }
}
