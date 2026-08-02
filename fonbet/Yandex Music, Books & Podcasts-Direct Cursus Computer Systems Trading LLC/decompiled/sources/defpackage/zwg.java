package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zwg extends ksk implements ffh, n40, vei {
    public final qpf f;
    public boolean g;
    public boolean k;
    public boolean l;
    public boolean m;
    public ga6 n;
    public Function1 p;
    public xod q;
    public boolean v;
    public Object x;
    public boolean y;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public kpf j = kpf.c;
    public long o = 0;
    public xwg r = xwg.c;
    public final npf s = new npf(this, 1);
    public final eqi t = new eqi(new zwg[16]);
    public boolean u = true;
    public boolean w = true;

    public zwg(qpf qpfVar) {
        this.f = qpfVar;
        this.x = qpfVar.p.s;
    }

    public final void C0(boolean z) {
        qpf qpfVar = this.f;
        if (z && qpfVar.c) {
            return;
        }
        if (z || qpfVar.c) {
            this.r = xwg.c;
            eqi y = qpfVar.a.y();
            Object[] objArr = y.a;
            int i = y.c;
            for (int i2 = 0; i2 < i; i2++) {
                zwg zwgVar = ((mpf) objArr[i2]).G.q;
                zwgVar.getClass();
                zwgVar.C0(true);
            }
        }
    }

    @Override // defpackage.n40
    public final ane D() {
        return (ane) this.f.a.F.c;
    }

    public final void E0() {
        xwg xwgVar = this.r;
        qpf qpfVar = this.f;
        boolean z = qpfVar.c;
        mpf mpfVar = qpfVar.a;
        if (z) {
            this.r = xwg.b;
        } else {
            this.r = xwg.a;
        }
        if (xwgVar != xwg.a && qpfVar.e) {
            mpf.T(mpfVar, true, 6);
        }
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar2 = (mpf) objArr[i2];
            zwg zwgVar = mpfVar2.G.q;
            if (zwgVar == null) {
                xq0.x("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (zwgVar.i != Integer.MAX_VALUE) {
                zwgVar.E0();
                mpf.X(mpfVar2);
            }
        }
    }

    @Override // defpackage.ffh
    public final int G(int i) {
        H0();
        vwg Z0 = this.f.a().Z0();
        Z0.getClass();
        return Z0.G(i);
    }

    public final void G0() {
        qpf qpfVar = this.f;
        if (qpfVar.o > 0) {
            eqi y = qpfVar.a.y();
            Object[] objArr = y.a;
            int i = y.c;
            for (int i2 = 0; i2 < i; i2++) {
                mpf mpfVar = (mpf) objArr[i2];
                qpf qpfVar2 = mpfVar.G;
                if ((qpfVar2.m || qpfVar2.n) && !qpfVar2.f) {
                    mpfVar.S(false);
                }
                zwg zwgVar = qpfVar2.q;
                if (zwgVar != null) {
                    zwgVar.G0();
                }
            }
        }
    }

    public final void H0() {
        qpf qpfVar = this.f;
        mpf.T(qpfVar.a, false, 7);
        mpf mpfVar = qpfVar.a;
        mpf u = mpfVar.u();
        if (u == null || mpfVar.C != kpf.c) {
            return;
        }
        int ordinal = u.G.d.ordinal();
        mpfVar.C = ordinal != 0 ? ordinal != 2 ? u.C : kpf.b : kpf.a;
    }

    public final void I0() {
        ipf ipfVar;
        this.y = true;
        qpf qpfVar = this.f;
        mpf u = qpfVar.a.u();
        xwg xwgVar = this.r;
        if ((xwgVar != xwg.a && !qpfVar.c) || (xwgVar != xwg.b && qpfVar.c)) {
            E0();
            if (this.g && u != null) {
                u.S(false);
            }
        }
        if (u != null) {
            qpf qpfVar2 = u.G;
            if (!this.g && ((ipfVar = qpfVar2.d) == ipf.c || ipfVar == ipf.d)) {
                if (this.i != Integer.MAX_VALUE) {
                    sme.b("Place was called on a node which was placed already");
                }
                int i = qpfVar2.h;
                this.i = i;
                qpfVar2.h = i + 1;
            }
        } else {
            this.i = 0;
        }
        r();
    }

    @Override // defpackage.ffh
    public final int J(int i) {
        H0();
        vwg Z0 = this.f.a().Z0();
        Z0.getClass();
        return Z0.J(i);
    }

    public final void J0(long j, xod xodVar, Function1 function1) {
        zwg zwgVar;
        long j2;
        qpf qpfVar = this.f;
        mpf mpfVar = qpfVar.a;
        mpf mpfVar2 = qpfVar.a;
        mpf u = mpfVar.u();
        ipf ipfVar = u != null ? u.G.d : null;
        ipf ipfVar2 = ipf.d;
        if (ipfVar == ipfVar2) {
            qpfVar.c = false;
        }
        if (mpfVar2.v0) {
            sme.a("place is called on a deactivated node");
        }
        qpfVar.d = ipfVar2;
        this.l = true;
        this.y = false;
        if (!wpe.b(j, this.o)) {
            if (qpfVar.n || qpfVar.m) {
                qpfVar.f = true;
            }
            G0();
        }
        uzj a = ppf.a(mpfVar2);
        if (qpfVar.f || !t()) {
            qpfVar.f(false);
            this.s.g = false;
            wzj snapshotObserver = a.getSnapshotObserver();
            zwgVar = this;
            j2 = j;
            ywg ywgVar = new ywg(0, j2, zwgVar, a);
            snapshotObserver.getClass();
            if (mpfVar2.h != null) {
                snapshotObserver.a(mpfVar2, snapshotObserver.g, ywgVar);
            } else {
                snapshotObserver.a(mpfVar2, snapshotObserver.f, ywgVar);
            }
        } else {
            vwg Z0 = qpfVar.a().Z0();
            Z0.getClass();
            Z0.R0(wpe.d(j, Z0.e));
            I0();
            zwgVar = this;
            j2 = j;
        }
        zwgVar.o = j2;
        zwgVar.p = function1;
        zwgVar.q = xodVar;
        qpfVar.d = ipf.e;
    }

    public final boolean K0(long j) {
        long j2;
        long j3;
        qpf qpfVar = this.f;
        mpf mpfVar = qpfVar.a;
        mpf mpfVar2 = qpfVar.a;
        if (mpfVar.v0) {
            sme.a("measure is called on a deactivated node");
        }
        mpf u = mpfVar2.u();
        mpfVar2.E = mpfVar2.E || (u != null && u.E);
        if (!mpfVar2.G.e) {
            ga6 ga6Var = this.n;
            if (ga6Var == null ? false : ga6.c(ga6Var.a, j)) {
                uzj uzjVar = mpfVar2.n;
                if (uzjVar != null) {
                    ((AndroidComposeView) uzjVar).l(mpfVar2, true);
                }
                mpfVar2.Y();
                return false;
            }
        }
        this.n = new ga6(j);
        z0(j);
        this.s.f = false;
        eqi y = mpfVar2.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            zwg zwgVar = ((mpf) objArr[i2]).G.q;
            zwgVar.getClass();
            zwgVar.s.c = false;
        }
        if (this.m) {
            j2 = this.c;
        } else {
            long j4 = Integer.MIN_VALUE;
            j2 = (j4 & 4294967295L) | (j4 << 32);
        }
        this.m = true;
        vwg Z0 = qpfVar.a().Z0();
        if (!(Z0 != null)) {
            sme.b("Lookahead result from lookaheadRemeasure cannot be null");
        }
        zwg zwgVar2 = qpfVar.q;
        if (zwgVar2 != null) {
            ipf ipfVar = ipf.b;
            qpf qpfVar2 = zwgVar2.f;
            qpfVar2.d = ipfVar;
            mpf mpfVar3 = qpfVar2.a;
            qpfVar2.e = false;
            wzj snapshotObserver = ppf.a(mpfVar3).getSnapshotObserver();
            j3 = 4294967295L;
            xi0 xi0Var = new xi0(zwgVar2, j, 1);
            snapshotObserver.getClass();
            if (mpfVar3.h != null) {
                snapshotObserver.a(mpfVar3, snapshotObserver.b, xi0Var);
            } else {
                snapshotObserver.a(mpfVar3, snapshotObserver.c, xi0Var);
            }
            qpfVar2.f = true;
            qpfVar2.g = true;
            boolean Y = quj.Y(mpfVar3);
            jfh jfhVar = qpfVar2.p;
            if (Y) {
                jfhVar.w = true;
                jfhVar.x = true;
            } else {
                jfhVar.v = true;
            }
            qpfVar2.d = ipf.e;
        } else {
            j3 = 4294967295L;
        }
        t0((Z0.b & j3) | (Z0.a << 32));
        return (((int) (j2 >> 32)) == Z0.a && ((int) (j2 & j3)) == Z0.b) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.G.d : null) == defpackage.ipf.d) goto L13;
     */
    @Override // defpackage.ffh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ksk M(long j) {
        kpf kpfVar;
        qpf qpfVar = this.f;
        mpf mpfVar = qpfVar.a;
        mpf mpfVar2 = qpfVar.a;
        mpf u = mpfVar.u();
        if ((u != null ? u.G.d : null) != ipf.b) {
            mpf u2 = mpfVar2.u();
        }
        qpfVar.b = false;
        mpf u3 = mpfVar2.u();
        if (u3 != null) {
            qpf qpfVar2 = u3.G;
            if (this.j != kpf.c && !mpfVar2.E) {
                sme.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = qpfVar2.d.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                kpfVar = kpf.a;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    b6e.w(qpfVar2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                kpfVar = kpf.b;
            }
            this.j = kpfVar;
        } else {
            this.j = kpf.c;
        }
        if (mpfVar2.C == kpf.c) {
            mpfVar2.f();
        }
        K0(j);
        return this;
    }

    @Override // defpackage.n40
    public final void R(m40 m40Var) {
        eqi y = this.f.a.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            zwg zwgVar = ((mpf) objArr[i2]).G.q;
            zwgVar.getClass();
            m40Var.invoke(zwgVar);
        }
    }

    @Override // defpackage.n40
    public final void X() {
        mpf.T(this.f.a, false, 7);
    }

    @Override // defpackage.ksk
    public final int Y(v2e v2eVar) {
        qpf qpfVar = this.f;
        mpf u = qpfVar.a.u();
        ipf ipfVar = u != null ? u.G.d : null;
        ipf ipfVar2 = ipf.b;
        npf npfVar = this.s;
        if (ipfVar == ipfVar2) {
            npfVar.c = true;
        } else {
            mpf u2 = qpfVar.a.u();
            if ((u2 != null ? u2.G.d : null) == ipf.d) {
                npfVar.d = true;
            }
        }
        this.k = true;
        vwg Z0 = qpfVar.a().Z0();
        Z0.getClass();
        int Y = Z0.Y(v2eVar);
        this.k = false;
        return Y;
    }

    @Override // defpackage.ksk
    public final int Z() {
        vwg Z0 = this.f.a().Z0();
        Z0.getClass();
        return Z0.Z();
    }

    @Override // defpackage.ffh
    public final int a(int i) {
        H0();
        vwg Z0 = this.f.a().Z0();
        Z0.getClass();
        return Z0.a(i);
    }

    @Override // defpackage.ksk
    public final int a0() {
        vwg Z0 = this.f.a().Z0();
        Z0.getClass();
        return Z0.a0();
    }

    @Override // defpackage.n40
    public final npf b() {
        return this.s;
    }

    @Override // defpackage.n40
    public final n40 c() {
        qpf qpfVar;
        mpf u = this.f.a.u();
        if (u == null || (qpfVar = u.G) == null) {
            return null;
        }
        return qpfVar.q;
    }

    @Override // defpackage.ksk, defpackage.ffh
    public final Object n() {
        return this.x;
    }

    @Override // defpackage.vei
    public final void o(boolean z) {
        vwg Z0;
        qpf qpfVar = this.f;
        vwg Z02 = qpfVar.a().Z0();
        if (Boolean.valueOf(z).equals(Z02 != null ? Boolean.valueOf(Z02.f) : null) || (Z0 = qpfVar.a().Z0()) == null) {
            return;
        }
        Z0.f = z;
    }

    @Override // defpackage.ksk
    public final void p0(long j, float f, xod xodVar) {
        J0(j, xodVar, null);
    }

    @Override // defpackage.n40
    public final void r() {
        this.v = true;
        npf npfVar = this.s;
        npfVar.h();
        qpf qpfVar = this.f;
        boolean z = qpfVar.f;
        mpf mpfVar = qpfVar.a;
        if (z) {
            eqi y = mpfVar.y();
            Object[] objArr = y.a;
            int i = y.c;
            for (int i2 = 0; i2 < i; i2++) {
                mpf mpfVar2 = (mpf) objArr[i2];
                qpf qpfVar2 = mpfVar2.G;
                if (qpfVar2.e && mpfVar2.s() == kpf.a) {
                    zwg zwgVar = qpfVar2.q;
                    zwgVar.getClass();
                    zwg zwgVar2 = qpfVar2.q;
                    ga6 ga6Var = zwgVar2 != null ? zwgVar2.n : null;
                    ga6Var.getClass();
                    if (zwgVar.K0(ga6Var.a)) {
                        mpf.T(mpfVar, false, 7);
                    }
                }
            }
        }
        zme zmeVar = D().Y;
        zmeVar.getClass();
        if (qpfVar.g || (!this.k && !zmeVar.h && qpfVar.f)) {
            qpfVar.f = false;
            ipf ipfVar = qpfVar.d;
            qpfVar.d = ipf.d;
            uzj a = ppf.a(mpfVar);
            qpfVar.g(false);
            wzj snapshotObserver = a.getSnapshotObserver();
            ssb ssbVar = new ssb(13, this, zmeVar);
            snapshotObserver.getClass();
            if (mpfVar.h != null) {
                snapshotObserver.a(mpfVar, snapshotObserver.h, ssbVar);
            } else {
                snapshotObserver.a(mpfVar, snapshotObserver.e, ssbVar);
            }
            qpfVar.d = ipfVar;
            if (qpfVar.m && zmeVar.h) {
                requestLayout();
            }
            qpfVar.g = false;
        }
        if (npfVar.d) {
            npfVar.e = true;
        }
        if (npfVar.b && npfVar.e()) {
            npfVar.g();
        }
        this.v = false;
    }

    @Override // defpackage.ksk
    public final void r0(long j, float f, Function1 function1) {
        J0(j, null, function1);
    }

    @Override // defpackage.n40
    public final void requestLayout() {
        this.f.a.S(false);
    }

    @Override // defpackage.n40
    public final boolean t() {
        return this.r != xwg.c;
    }

    @Override // defpackage.ffh
    public final int z(int i) {
        H0();
        vwg Z0 = this.f.a().Z0();
        Z0.getClass();
        return Z0.z(i);
    }
}
