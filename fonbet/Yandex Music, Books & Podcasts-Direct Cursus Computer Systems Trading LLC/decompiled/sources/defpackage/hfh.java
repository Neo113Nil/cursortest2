package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hfh {
    public final mpf a;
    public boolean c;
    public boolean d;
    public ga6 i;
    public final pt0 b = new pt0(21);
    public final nnd e = new nnd(14);
    public final eqi f = new eqi(new mpf[16]);
    public final long g = 1;
    public final eqi h = new eqi(new gfh[16]);

    public hfh(mpf mpfVar) {
        this.a = mpfVar;
    }

    public static boolean c(mpf mpfVar, ga6 ga6Var) {
        boolean K0;
        mpf mpfVar2 = mpfVar.h;
        qpf qpfVar = mpfVar.G;
        if (mpfVar2 == null) {
            return false;
        }
        if (ga6Var != null) {
            if (mpfVar2 != null) {
                zwg zwgVar = qpfVar.q;
                zwgVar.getClass();
                K0 = zwgVar.K0(ga6Var.a);
            }
            K0 = false;
        } else {
            zwg zwgVar2 = qpfVar.q;
            ga6 ga6Var2 = zwgVar2 != null ? zwgVar2.n : null;
            if (ga6Var2 != null && mpfVar2 != null) {
                zwgVar2.getClass();
                K0 = zwgVar2.K0(ga6Var2.a);
            }
            K0 = false;
        }
        mpf u = mpfVar.u();
        if (K0 && u != null) {
            if (u.h == null) {
                mpf.W(u, false, 3);
                return K0;
            }
            if (mpfVar.s() == kpf.a) {
                mpf.T(u, false, 3);
                return K0;
            }
            if (mpfVar.s() == kpf.b) {
                u.S(false);
            }
        }
        return K0;
    }

    public static boolean d(mpf mpfVar, ga6 ga6Var) {
        boolean N = ga6Var != null ? mpfVar.N(ga6Var) : mpf.O(mpfVar);
        mpf u = mpfVar.u();
        if (N && u != null) {
            kpf kpfVar = mpfVar.G.p.l;
            if (kpfVar == kpf.a) {
                mpf.W(u, false, 3);
                return N;
            }
            if (kpfVar == kpf.b) {
                u.V(false);
            }
        }
        return N;
    }

    public static boolean i(mpf mpfVar) {
        if (!mpfVar.r()) {
            return false;
        }
        do {
            if (!j(mpfVar)) {
                mpf u = mpfVar.u();
                if ((u != null ? u.G.d : null) != ipf.a) {
                    return false;
                }
            }
            mpfVar = mpfVar.u();
            if (mpfVar == null) {
                return false;
            }
        } while (!mpfVar.H());
        return true;
    }

    public static boolean j(mpf mpfVar) {
        jfh jfhVar = mpfVar.G.p;
        return jfhVar.l == kpf.a || jfhVar.y.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2, types: [xci] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [xci] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final void a() {
        int i;
        xci xciVar;
        eqi eqiVar = this.f;
        Object[] objArr = eqiVar.a;
        int i2 = eqiVar.c;
        while (i < i2) {
            cr crVar = ((mpf) objArr[i]).F;
            ane aneVar = (ane) crVar.c;
            boolean g = g8j.g(128);
            if (g) {
                xciVar = aneVar.X;
            } else {
                xciVar = aneVar.X.e;
                i = xciVar == null ? i + 1 : 0;
            }
            zco zcoVar = f8j.H;
            for (xci d1 = aneVar.d1(g); d1 != null && (d1.d & 128) != 0; d1 = d1.f) {
                if ((d1.c & 128) != 0) {
                    cw7 cw7Var = d1;
                    ?? r12 = 0;
                    while (cw7Var != 0) {
                        if (cw7Var instanceof qof) {
                            ((qof) cw7Var).R((ane) crVar.c);
                        } else if ((cw7Var.c & 128) != 0 && (cw7Var instanceof cw7)) {
                            xci xciVar2 = cw7Var.p;
                            int i3 = 0;
                            cw7Var = cw7Var;
                            r12 = r12;
                            while (xciVar2 != null) {
                                if ((xciVar2.c & 128) != 0) {
                                    i3++;
                                    r12 = r12;
                                    if (i3 == 1) {
                                        cw7Var = xciVar2;
                                    } else {
                                        if (r12 == 0) {
                                            r12 = new eqi(new xci[16]);
                                        }
                                        if (cw7Var != 0) {
                                            r12.d(cw7Var);
                                            cw7Var = 0;
                                        }
                                        r12.d(xciVar2);
                                    }
                                }
                                xciVar2 = xciVar2.f;
                                cw7Var = cw7Var;
                                r12 = r12;
                            }
                            if (i3 == 1) {
                            }
                        }
                        cw7Var = bcx.p(r12);
                    }
                }
                if (d1 != xciVar) {
                }
            }
        }
        eqiVar.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r4 < r2) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        Object[] objArr;
        nnd nndVar = this.e;
        if (z) {
            eqi eqiVar = (eqi) nndVar.b;
            eqiVar.i();
            mpf mpfVar = this.a;
            eqiVar.d(mpfVar);
            mpfVar.Z = true;
        }
        eqi eqiVar2 = (eqi) nndVar.b;
        Arrays.sort(eqiVar2.a, 0, eqiVar2.c, C1318t.l);
        int i = eqiVar2.c;
        mpf[] mpfVarArr = (mpf[]) nndVar.c;
        if (mpfVarArr != null) {
            int length = mpfVarArr.length;
            objArr = mpfVarArr;
        }
        objArr = new mpf[Math.max(16, i)];
        nndVar.c = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = eqiVar2.a[i2];
        }
        eqiVar2.i();
        for (int i3 = i - 1; -1 < i3; i3--) {
            mpf mpfVar2 = objArr[i3];
            mpfVar2.getClass();
            if (mpfVar2.Z) {
                nnd.u(mpfVar2);
            }
        }
        nndVar.c = objArr;
    }

    public final void e() {
        eqi eqiVar = this.h;
        int i = eqiVar.c;
        if (i != 0) {
            Object[] objArr = eqiVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                gfh gfhVar = (gfh) objArr[i2];
                if (gfhVar.a.G()) {
                    boolean z = gfhVar.b;
                    mpf mpfVar = gfhVar.a;
                    boolean z2 = gfhVar.c;
                    if (z) {
                        mpf.T(mpfVar, z2, 2);
                    } else {
                        mpf.W(mpfVar, z2, 2);
                    }
                }
            }
            eqiVar.i();
        }
    }

    public final void f(mpf mpfVar) {
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar2 = (mpf) objArr[i2];
            if (Intrinsics.d(mpfVar2.I(), Boolean.TRUE) && !mpfVar2.v0) {
                if (((y9t) ((znk) this.b.a).b).contains(mpfVar2)) {
                    mpfVar2.J();
                }
                f(mpfVar2);
            }
        }
    }

    public final void g(mpf mpfVar, boolean z) {
        if (!this.c) {
            sme.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? mpfVar.G.e : mpfVar.r()) {
            sme.a("node not yet measured");
        }
        h(mpfVar, z);
    }

    public final void h(mpf mpfVar, boolean z) {
        zwg zwgVar;
        npf npfVar;
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar2 = (mpf) objArr[i2];
            if ((!z && j(mpfVar2)) || (z && (mpfVar2.s() == kpf.a || ((zwgVar = mpfVar2.G.q) != null && (npfVar = zwgVar.s) != null && npfVar.e())))) {
                boolean Y = quj.Y(mpfVar2);
                qpf qpfVar = mpfVar2.G;
                if (Y && !z) {
                    if (qpfVar.e && ((y9t) ((znk) this.b.a).b).contains(mpfVar2)) {
                        n(mpfVar2, true, false);
                    } else {
                        g(mpfVar2, true);
                    }
                }
                if (z ? qpfVar.e : mpfVar2.r()) {
                    n(mpfVar2, z, false);
                }
                if (!(z ? qpfVar.e : mpfVar2.r())) {
                    h(mpfVar2, z);
                }
            }
        }
        if (z ? mpfVar.G.e : mpfVar.r()) {
            n(mpfVar, z, false);
        }
    }

    public final boolean k(pe0 pe0Var) {
        boolean z;
        mpf mpfVar;
        pt0 pt0Var = this.b;
        mpf mpfVar2 = this.a;
        if (!mpfVar2.G()) {
            sme.a("performMeasureAndLayout called with unattached root");
        }
        if (!mpfVar2.H()) {
            sme.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            sme.a("performMeasureAndLayout called during measure layout");
        }
        boolean z2 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                if (pt0Var.v()) {
                    z = false;
                    while (true) {
                        boolean v = pt0Var.v();
                        znk znkVar = (znk) pt0Var.a;
                        if (!v) {
                            break;
                        }
                        boolean isEmpty = ((y9t) znkVar.b).isEmpty();
                        boolean z3 = !isEmpty;
                        if (isEmpty) {
                            znk znkVar2 = (znk) pt0Var.b;
                            mpf mpfVar3 = (mpf) ((y9t) znkVar2.b).first();
                            znkVar2.B(mpfVar3);
                            mpfVar = mpfVar3;
                        } else {
                            mpfVar = (mpf) ((y9t) znkVar.b).first();
                            znkVar.B(mpfVar);
                        }
                        boolean n = n(mpfVar, z3, true);
                        if (mpfVar == mpfVar2 && n) {
                            z = true;
                        }
                    }
                    if (pe0Var != null) {
                        pe0Var.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
                z2 = z;
            } catch (Throwable th) {
                this.c = false;
                this.d = false;
                throw th;
            }
        }
        a();
        return z2;
    }

    public final void l(mpf mpfVar, long j) {
        if (mpfVar.v0) {
            return;
        }
        mpf mpfVar2 = this.a;
        if (mpfVar.equals(mpfVar2)) {
            sme.a("measureAndLayout called on root");
        }
        if (!mpfVar2.G()) {
            sme.a("performMeasureAndLayout called with unattached root");
        }
        if (!mpfVar2.H()) {
            sme.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            sme.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                pt0 pt0Var = this.b;
                ((znk) pt0Var.a).B(mpfVar);
                ((znk) pt0Var.b).B(mpfVar);
                if ((c(mpfVar, new ga6(j)) || mpfVar.G.f) && Intrinsics.d(mpfVar.I(), Boolean.TRUE)) {
                    mpfVar.J();
                }
                f(mpfVar);
                d(mpfVar, new ga6(j));
                if (mpfVar.q() && mpfVar.H()) {
                    mpfVar.R();
                    ((eqi) this.e.b).d(mpfVar);
                    mpfVar.Z = true;
                }
                e();
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                this.c = false;
                this.d = false;
                throw th;
            }
        }
        a();
    }

    public final void m() {
        pt0 pt0Var = this.b;
        if (pt0Var.v()) {
            mpf mpfVar = this.a;
            if (!mpfVar.G()) {
                sme.a("performMeasureAndLayout called with unattached root");
            }
            if (!mpfVar.H()) {
                sme.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                sme.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((y9t) ((znk) pt0Var.a).b).isEmpty()) {
                        if (mpfVar.h != null) {
                            p(mpfVar, true);
                        } else {
                            o(mpfVar);
                        }
                    }
                    p(mpfVar, false);
                    this.c = false;
                    this.d = false;
                } catch (Throwable th) {
                    this.c = false;
                    this.d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean n(mpf mpfVar, boolean z, boolean z2) {
        ga6 ga6Var;
        boolean z3;
        jsk placementScope;
        ane aneVar;
        mpf u;
        zwg zwgVar;
        npf npfVar;
        zwg zwgVar2;
        npf npfVar2;
        boolean z4 = mpfVar.v0;
        qpf qpfVar = mpfVar.G;
        if (z4 || (!mpfVar.H() && !qpfVar.p.u && !i(mpfVar) && !Intrinsics.d(mpfVar.I(), Boolean.TRUE) && ((!qpfVar.e || (mpfVar.s() != kpf.a && ((zwgVar2 = qpfVar.q) == null || (npfVar2 = zwgVar2.s) == null || !npfVar2.e()))) && !qpfVar.p.y.e() && ((zwgVar = qpfVar.q) == null || (npfVar = zwgVar.s) == null || !npfVar.e())))) {
            return false;
        }
        mpf mpfVar2 = this.a;
        if (mpfVar == mpfVar2) {
            ga6Var = this.i;
            ga6Var.getClass();
        } else {
            ga6Var = null;
        }
        if (z) {
            z3 = qpfVar.e ? c(mpfVar, ga6Var) : false;
            if (z2 && ((z3 || qpfVar.f) && Intrinsics.d(mpfVar.I(), Boolean.TRUE))) {
                mpfVar.J();
            }
        } else {
            boolean d = mpfVar.r() ? d(mpfVar, ga6Var) : false;
            if (z2 && mpfVar.q() && (mpfVar == mpfVar2 || ((u = mpfVar.u()) != null && u.H() && qpfVar.p.u))) {
                if (mpfVar == mpfVar2) {
                    if (mpfVar.C == kpf.c) {
                        mpfVar.g();
                    }
                    mpf u2 = mpfVar.u();
                    if (u2 == null || (aneVar = (ane) u2.F.c) == null || (placementScope = aneVar.i) == null) {
                        placementScope = ppf.a(mpfVar).getPlacementScope();
                    }
                    jsk.g(placementScope, qpfVar.p, 0, 0);
                } else {
                    mpfVar.R();
                }
                ((eqi) this.e.b).d(mpfVar);
                mpfVar.Z = true;
                ppf.a(mpfVar).getRectManager().d(mpfVar);
            }
            z3 = d;
        }
        e();
        return z3;
    }

    public final void o(mpf mpfVar) {
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar2 = (mpf) objArr[i2];
            if (j(mpfVar2)) {
                if (quj.Y(mpfVar2)) {
                    p(mpfVar2, true);
                } else {
                    o(mpfVar2);
                }
            }
        }
    }

    public final void p(mpf mpfVar, boolean z) {
        ga6 ga6Var;
        if (mpfVar.v0) {
            return;
        }
        if (mpfVar == this.a) {
            ga6Var = this.i;
            ga6Var.getClass();
        } else {
            ga6Var = null;
        }
        if (z) {
            c(mpfVar, ga6Var);
        } else {
            d(mpfVar, ga6Var);
        }
    }

    public final boolean q(mpf mpfVar, boolean z) {
        int ordinal = mpfVar.G.d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.h.d(new gfh(mpfVar, false, z));
            } else {
                if (ordinal != 4) {
                    b6e.s();
                    return false;
                }
                if (!mpfVar.r() || z) {
                    mpfVar.G.p.v = true;
                    if (!mpfVar.v0 && (mpfVar.H() || i(mpfVar))) {
                        mpf u = mpfVar.u();
                        if (u == null || !u.r()) {
                            this.b.k(mpfVar, false);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void r(long j) {
        ga6 ga6Var = this.i;
        if (ga6Var == null ? false : ga6.c(ga6Var.a, j)) {
            return;
        }
        if (this.c) {
            sme.a("updateRootConstraints called while measuring");
        }
        this.i = new ga6(j);
        mpf mpfVar = this.a;
        mpf mpfVar2 = mpfVar.h;
        qpf qpfVar = mpfVar.G;
        if (mpfVar2 != null) {
            qpfVar.e = true;
        }
        qpfVar.p.v = true;
        this.b.k(mpfVar, mpfVar2 != null);
    }
}
