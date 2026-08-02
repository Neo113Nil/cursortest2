package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jfh extends ksk implements ffh, n40, vei {
    public boolean B;
    public float F;
    public boolean G;
    public Function1 H;
    public xod I;
    public float K;
    public boolean X;
    public final qpf f;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean m;
    public Function1 o;
    public xod p;
    public float q;
    public Object s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public kpf l = kpf.c;
    public long n = 0;
    public boolean r = true;
    public final npf y = new npf(this, 0);
    public final eqi z = new eqi(new jfh[16]);
    public boolean A = true;
    public long C = ia6.b(0, 0, 15);
    public final ifh D = new ifh(this, 1);
    public final ifh E = new ifh(this, 0);
    public long J = 0;
    public final ifh L = new ifh(this, 2);

    public jfh(qpf qpfVar) {
        this.f = qpfVar;
    }

    public final List C0() {
        qpf qpfVar = this.f;
        qpfVar.a.e0();
        boolean z = this.A;
        eqi eqiVar = this.z;
        if (!z) {
            return eqiVar.h();
        }
        mpf mpfVar = qpfVar.a;
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar2 = (mpf) objArr[i2];
            if (eqiVar.c <= i2) {
                eqiVar.d(mpfVar2.G.p);
            } else {
                jfh jfhVar = mpfVar2.G.p;
                Object[] objArr2 = eqiVar.a;
                Object obj = objArr2[i2];
                objArr2[i2] = jfhVar;
            }
        }
        eqiVar.n(((eqi) ((epi) mpfVar.o()).b).c, eqiVar.c);
        this.A = false;
        return eqiVar.h();
    }

    @Override // defpackage.n40
    public final ane D() {
        return (ane) this.f.a.F.c;
    }

    public final void E0() {
        boolean z = this.t;
        this.t = true;
        mpf mpfVar = this.f.a;
        cr crVar = mpfVar.F;
        if (!z) {
            ((ane) crVar.c).o1();
            if (mpfVar.r()) {
                mpf.W(mpfVar, true, 6);
            } else if (mpfVar.G.e) {
                mpf.T(mpfVar, true, 6);
            }
        }
        f8j f8jVar = ((ane) crVar.c).m;
        for (f8j f8jVar2 = (f8j) crVar.d; !Intrinsics.d(f8jVar2, f8jVar) && f8jVar2 != null; f8jVar2 = f8jVar2.m) {
            if (f8jVar2.E) {
                f8jVar2.i1();
            }
        }
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar2 = (mpf) objArr[i2];
            if (mpfVar2.v() != Integer.MAX_VALUE) {
                mpfVar2.G.p.E0();
                mpf.X(mpfVar2);
            }
        }
    }

    @Override // defpackage.ffh
    public final int G(int i) {
        qpf qpfVar = this.f;
        if (!quj.Y(qpfVar.a)) {
            I0();
            return qpfVar.a().G(i);
        }
        zwg zwgVar = qpfVar.q;
        zwgVar.getClass();
        return zwgVar.G(i);
    }

    public final void G0() {
        if (this.t) {
            this.t = false;
            qpf qpfVar = this.f;
            cr crVar = qpfVar.a.F;
            f8j f8jVar = ((ane) crVar.c).m;
            for (f8j f8jVar2 = (f8j) crVar.d; !Intrinsics.d(f8jVar2, f8jVar) && f8jVar2 != null; f8jVar2 = f8jVar2.m) {
                xci d1 = f8jVar2.d1(g8j.g(1048576));
                if (d1 != null && (d1.a.d & 1048576) != 0) {
                    boolean g = g8j.g(1048576);
                    xci b1 = f8jVar2.b1();
                    if (g || (b1 = b1.e) != null) {
                        for (xci d12 = f8jVar2.d1(g); d12 != null && (d12.d & 1048576) != 0; d12 = d12.f) {
                            if ((d12.c & 1048576) != 0) {
                                xci xciVar = d12;
                                eqi eqiVar = null;
                                while (xciVar != null) {
                                    if ((xciVar.c & 1048576) != 0 && (xciVar instanceof cw7)) {
                                        int i = 0;
                                        for (xci xciVar2 = ((cw7) xciVar).p; xciVar2 != null; xciVar2 = xciVar2.f) {
                                            if ((xciVar2.c & 1048576) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    xciVar = xciVar2;
                                                } else {
                                                    if (eqiVar == null) {
                                                        eqiVar = new eqi(new xci[16]);
                                                    }
                                                    if (xciVar != null) {
                                                        eqiVar.d(xciVar);
                                                        xciVar = null;
                                                    }
                                                    eqiVar.d(xciVar2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    xciVar = bcx.p(eqiVar);
                                }
                            }
                            if (d12 == b1) {
                                break;
                            }
                        }
                    }
                }
                if (f8jVar2.F != null) {
                    if (f8jVar2.G != null) {
                        f8jVar2.G = null;
                    }
                    f8jVar2.x1(false, null);
                    f8jVar2.l.V(false);
                }
            }
            eqi y = qpfVar.a.y();
            Object[] objArr = y.a;
            int i2 = y.c;
            for (int i3 = 0; i3 < i2; i3++) {
                ((mpf) objArr[i3]).G.p.G0();
            }
        }
    }

    public final void H0() {
        qpf qpfVar = this.f;
        if (qpfVar.l > 0) {
            eqi y = qpfVar.a.y();
            Object[] objArr = y.a;
            int i = y.c;
            for (int i2 = 0; i2 < i; i2++) {
                mpf mpfVar = (mpf) objArr[i2];
                qpf qpfVar2 = mpfVar.G;
                boolean z = qpfVar2.j;
                jfh jfhVar = qpfVar2.p;
                if ((z || qpfVar2.k) && !jfhVar.w) {
                    mpfVar.V(false);
                }
                jfhVar.H0();
            }
        }
    }

    public final void I0() {
        qpf qpfVar = this.f;
        mpf.W(qpfVar.a, false, 7);
        mpf mpfVar = qpfVar.a;
        mpf u = mpfVar.u();
        if (u == null || mpfVar.C != kpf.c) {
            return;
        }
        int ordinal = u.G.d.ordinal();
        mpfVar.C = ordinal != 0 ? ordinal != 2 ? u.C : kpf.b : kpf.a;
    }

    @Override // defpackage.ffh
    public final int J(int i) {
        qpf qpfVar = this.f;
        if (!quj.Y(qpfVar.a)) {
            I0();
            return qpfVar.a().J(i);
        }
        zwg zwgVar = qpfVar.q;
        zwgVar.getClass();
        return zwgVar.J(i);
    }

    public final void J0() {
        this.G = true;
        qpf qpfVar = this.f;
        mpf u = qpfVar.a.u();
        float f = D().x;
        mpf mpfVar = qpfVar.a;
        cr crVar = mpfVar.F;
        ane aneVar = (ane) crVar.c;
        for (f8j f8jVar = (f8j) crVar.d; f8jVar != aneVar; f8jVar = f8jVar.m) {
            f8jVar.getClass();
            f += ((gpf) f8jVar).x;
        }
        if (f != this.F) {
            this.F = f;
            if (u != null) {
                u.M();
            }
            if (u != null) {
                u.B();
            }
        }
        if (this.t) {
            ((ane) mpfVar.F.c).o1();
        } else {
            if (u != null) {
                u.B();
            }
            E0();
            if (this.g && u != null) {
                u.V(false);
            }
        }
        if (u != null) {
            qpf qpfVar2 = u.G;
            if (!this.g && qpfVar2.d == ipf.c) {
                if (this.i != Integer.MAX_VALUE) {
                    sme.b("Place was called on a node which was placed already");
                }
                int i = qpfVar2.i;
                this.i = i;
                qpfVar2.i = i + 1;
            }
        } else {
            this.i = 0;
        }
        r();
    }

    public final void K0(long j, float f, Function1 function1, xod xodVar) {
        qpf qpfVar = this.f;
        mpf mpfVar = qpfVar.a;
        mpf mpfVar2 = qpfVar.a;
        if (mpfVar.v0) {
            sme.a("place is called on a deactivated node");
        }
        qpfVar.d = ipf.c;
        boolean z = !this.k;
        this.n = j;
        this.q = f;
        this.o = function1;
        this.p = xodVar;
        this.k = true;
        this.G = false;
        uzj a = ppf.a(mpfVar2);
        a.getRectManager().f(mpfVar2, j, z);
        if (this.w || !this.t) {
            this.y.g = false;
            qpfVar.d(false);
            this.H = function1;
            this.J = j;
            this.K = f;
            this.I = xodVar;
            wzj snapshotObserver = a.getSnapshotObserver();
            snapshotObserver.a(mpfVar2, snapshotObserver.f, this.L);
        } else {
            f8j a2 = qpfVar.a();
            a2.r1(wpe.d(j, a2.e), f, function1, xodVar);
            J0();
        }
        qpfVar.d = ipf.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L0(long j, float f, Function1 function1, xod xodVar) {
        boolean z;
        zwg zwgVar;
        jsk placementScope;
        boolean z2;
        this.u = true;
        boolean b = wpe.b(j, this.n);
        qpf qpfVar = this.f;
        if (!b || this.X) {
            if (qpfVar.k || qpfVar.j || this.X) {
                this.w = true;
                this.X = false;
            }
            H0();
        }
        zwg zwgVar2 = qpfVar.q;
        mpf mpfVar = qpfVar.a;
        if (zwgVar2 != null) {
            qpf qpfVar2 = zwgVar2.f;
            if (quj.Y(qpfVar2.a)) {
                z2 = true;
            } else {
                if (zwgVar2.r == xwg.c && !qpfVar2.b) {
                    qpfVar2.c = true;
                }
                z2 = qpfVar2.c;
            }
            if (z2) {
                z = true;
                if (z) {
                    f8j f8jVar = qpfVar.a().n;
                    if (f8jVar == null || (placementScope = f8jVar.i) == null) {
                        placementScope = ppf.a(mpfVar).getPlacementScope();
                    }
                    zwg zwgVar3 = qpfVar.q;
                    zwgVar3.getClass();
                    mpf u = mpfVar.u();
                    if (u != null) {
                        u.G.h = 0;
                    }
                    zwgVar3.i = Integer.MAX_VALUE;
                    placementScope.d(zwgVar3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
                }
                zwgVar = qpfVar.q;
                if (zwgVar == null && !zwgVar.l) {
                    sme.b("Error: Placement happened before lookahead.");
                }
                K0(j, f, function1, xodVar);
            }
        }
        z = false;
        if (z) {
        }
        zwgVar = qpfVar.q;
        if (zwgVar == null && !zwgVar.l) {
        }
        K0(j, f, function1, xodVar);
    }

    @Override // defpackage.ffh
    public final ksk M(long j) {
        kpf kpfVar;
        qpf qpfVar = this.f;
        mpf mpfVar = qpfVar.a;
        mpf mpfVar2 = qpfVar.a;
        kpf kpfVar2 = mpfVar.C;
        kpf kpfVar3 = kpf.c;
        if (kpfVar2 == kpfVar3) {
            mpfVar.f();
        }
        if (quj.Y(mpfVar2)) {
            zwg zwgVar = qpfVar.q;
            zwgVar.getClass();
            zwgVar.j = kpfVar3;
            zwgVar.M(j);
        }
        mpf u = mpfVar2.u();
        if (u != null) {
            qpf qpfVar2 = u.G;
            if (this.l != kpfVar3 && !mpfVar2.E) {
                sme.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = qpfVar2.d.ordinal();
            if (ordinal == 0) {
                kpfVar = kpf.a;
            } else {
                if (ordinal != 2) {
                    b6e.w(qpfVar2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                kpfVar = kpf.b;
            }
            this.l = kpfVar;
        } else {
            this.l = kpfVar3;
        }
        M0(j);
        return this;
    }

    public final boolean M0(long j) {
        qpf qpfVar = this.f;
        mpf mpfVar = qpfVar.a;
        mpf mpfVar2 = qpfVar.a;
        if (mpfVar.v0) {
            sme.a("measure is called on a deactivated node");
        }
        uzj a = ppf.a(mpfVar2);
        mpf u = mpfVar2.u();
        boolean z = true;
        mpfVar2.E = mpfVar2.E || (u != null && u.E);
        if (!mpfVar2.r() && ga6.c(this.d, j)) {
            ((AndroidComposeView) a).l(mpfVar2, false);
            mpfVar2.Y();
            return false;
        }
        this.y.f = false;
        eqi y = mpfVar2.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((mpf) objArr[i2]).G.p.y.c = false;
        }
        this.j = true;
        long j2 = qpfVar.a().c;
        z0(j);
        ipf ipfVar = qpfVar.d;
        ipf ipfVar2 = ipf.e;
        if (ipfVar != ipfVar2) {
            sme.b("layout state is not idle before measure starts");
        }
        this.C = j;
        ipf ipfVar3 = ipf.a;
        qpfVar.d = ipfVar3;
        this.v = false;
        wzj snapshotObserver = ppf.a(mpfVar2).getSnapshotObserver();
        snapshotObserver.a(mpfVar2, snapshotObserver.c, this.D);
        if (qpfVar.d == ipfVar3) {
            this.w = true;
            this.x = true;
            qpfVar.d = ipfVar2;
        }
        if (hqe.a(qpfVar.a().c, j2) && qpfVar.a().a == this.a && qpfVar.a().b == this.b) {
            z = false;
        }
        t0((qpfVar.a().b & 4294967295L) | (qpfVar.a().a << 32));
        return z;
    }

    @Override // defpackage.n40
    public final void R(m40 m40Var) {
        eqi y = this.f.a.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            m40Var.invoke(((mpf) objArr[i2]).G.p);
        }
    }

    @Override // defpackage.n40
    public final void X() {
        mpf.W(this.f.a, false, 7);
    }

    @Override // defpackage.ksk
    public final int Y(v2e v2eVar) {
        qpf qpfVar = this.f;
        mpf u = qpfVar.a.u();
        ipf ipfVar = u != null ? u.G.d : null;
        ipf ipfVar2 = ipf.a;
        npf npfVar = this.y;
        if (ipfVar == ipfVar2) {
            npfVar.c = true;
        } else {
            mpf u2 = qpfVar.a.u();
            if ((u2 != null ? u2.G.d : null) == ipf.c) {
                npfVar.d = true;
            }
        }
        this.m = true;
        int Y = qpfVar.a().Y(v2eVar);
        this.m = false;
        return Y;
    }

    @Override // defpackage.ksk
    public final int Z() {
        return this.f.a().Z();
    }

    @Override // defpackage.ffh
    public final int a(int i) {
        qpf qpfVar = this.f;
        if (!quj.Y(qpfVar.a)) {
            I0();
            return qpfVar.a().a(i);
        }
        zwg zwgVar = qpfVar.q;
        zwgVar.getClass();
        return zwgVar.a(i);
    }

    @Override // defpackage.ksk
    public final int a0() {
        return this.f.a().a0();
    }

    @Override // defpackage.n40
    public final npf b() {
        return this.y;
    }

    @Override // defpackage.n40
    public final n40 c() {
        qpf qpfVar;
        mpf u = this.f.a.u();
        if (u == null || (qpfVar = u.G) == null) {
            return null;
        }
        return qpfVar.p;
    }

    @Override // defpackage.ksk, defpackage.ffh
    public final Object n() {
        return this.s;
    }

    @Override // defpackage.vei
    public final void o(boolean z) {
        qpf qpfVar = this.f;
        if (z != qpfVar.a().f) {
            qpfVar.a().f = z;
            this.X = true;
        }
    }

    @Override // defpackage.ksk
    public final void p0(long j, float f, xod xodVar) {
        L0(j, f, null, xodVar);
    }

    @Override // defpackage.n40
    public final void r() {
        this.B = true;
        npf npfVar = this.y;
        npfVar.h();
        boolean z = this.w;
        qpf qpfVar = this.f;
        if (z) {
            eqi y = qpfVar.a.y();
            Object[] objArr = y.a;
            int i = y.c;
            for (int i2 = 0; i2 < i; i2++) {
                mpf mpfVar = (mpf) objArr[i2];
                if (mpfVar.r() && mpfVar.G.p.l == kpf.a && mpf.O(mpfVar)) {
                    mpf.W(qpfVar.a, false, 7);
                }
            }
        }
        if (this.x || (!this.m && !D().h && this.w)) {
            this.w = false;
            ipf ipfVar = qpfVar.d;
            qpfVar.d = ipf.c;
            qpfVar.e(false);
            mpf mpfVar2 = qpfVar.a;
            wzj snapshotObserver = ppf.a(mpfVar2).getSnapshotObserver();
            snapshotObserver.a(mpfVar2, snapshotObserver.e, this.E);
            qpfVar.d = ipfVar;
            if (D().h && qpfVar.j) {
                requestLayout();
            }
            this.x = false;
        }
        if (npfVar.d) {
            npfVar.e = true;
        }
        if (npfVar.b && npfVar.e()) {
            npfVar.g();
        }
        this.B = false;
    }

    @Override // defpackage.ksk
    public final void r0(long j, float f, Function1 function1) {
        L0(j, f, function1, null);
    }

    @Override // defpackage.n40
    public final void requestLayout() {
        this.f.a.V(false);
    }

    @Override // defpackage.n40
    public final boolean t() {
        return this.t;
    }

    @Override // defpackage.ffh
    public final int z(int i) {
        qpf qpfVar = this.f;
        if (!quj.Y(qpfVar.a)) {
            I0();
            return qpfVar.a().z(i);
        }
        zwg zwgVar = qpfVar.q;
        zwgVar.getClass();
        return zwgVar.z(i);
    }
}
