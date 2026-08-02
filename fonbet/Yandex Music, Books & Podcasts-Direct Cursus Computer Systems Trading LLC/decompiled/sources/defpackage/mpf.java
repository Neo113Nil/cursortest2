package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mpf implements op5, vzj, xp5 {
    public static final dfo w0 = new dfo("Undefined intrinsics block and it is required", 1);
    public static final hpf x0 = new hpf();
    public static final mj y0 = new mj(19);
    public aeu A;
    public as5 B;
    public kpf C;
    public kpf D;
    public boolean E;
    public final cr F;
    public final qpf G;
    public zpf H;
    public f8j I;
    public boolean J;
    public yci K;
    public yci L;
    public ij0 X;
    public jj0 Y;
    public boolean Z;
    public final boolean a;
    public int b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public mpf h;
    public int i;
    public final nnd j;
    public eqi k;
    public boolean l;
    public mpf m;
    public uzj n;
    public oj0 o;
    public int p;
    public boolean q;
    public boolean r;
    public jfp s;
    public boolean t;
    public final eqi u;
    public boolean v;
    public boolean v0;
    public kfh w;
    public aqd x;
    public jx7 y;
    public xof z;

    public mpf(int i, boolean z) {
        this.a = z;
        this.b = i;
        this.c = 9223372034707292159L;
        this.d = 0L;
        this.e = 9223372034707292159L;
        this.f = true;
        int i2 = 11;
        this.j = new nnd(i2, new eqi(new mpf[16]), new ypb(i2, this));
        this.u = new eqi(new mpf[16]);
        this.v = true;
        this.w = w0;
        this.y = ppf.a;
        this.z = xof.a;
        this.A = x0;
        as5.U.getClass();
        this.B = zr5.b;
        kpf kpfVar = kpf.c;
        this.C = kpfVar;
        this.D = kpfVar;
        this.F = new cr(this);
        this.G = new qpf(this);
        this.J = true;
        this.K = vci.a;
    }

    public static boolean O(mpf mpfVar) {
        jfh jfhVar = mpfVar.G.p;
        return mpfVar.N(jfhVar.j ? new ga6(jfhVar.d) : null);
    }

    public static void T(mpf mpfVar, boolean z, int i) {
        mpf u;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (mpfVar.h == null) {
            sme.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        uzj uzjVar = mpfVar.n;
        if (uzjVar == null || mpfVar.q || mpfVar.a) {
            return;
        }
        ((AndroidComposeView) uzjVar).A(mpfVar, true, z, z2);
        if (z3) {
            zwg zwgVar = mpfVar.G.q;
            zwgVar.getClass();
            qpf qpfVar = zwgVar.f;
            mpf u2 = qpfVar.a.u();
            kpf kpfVar = qpfVar.a.C;
            if (u2 == null || kpfVar == kpf.c) {
                return;
            }
            while (u2.C == kpfVar && (u = u2.u()) != null) {
                u2 = u;
            }
            int ordinal = kpfVar.ordinal();
            if (ordinal == 0) {
                if (u2.h != null) {
                    T(u2, z, 6);
                    return;
                } else {
                    W(u2, z, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                xq0.q("Intrinsics isn't used by the parent");
            } else if (u2.h != null) {
                u2.S(z);
            } else {
                u2.V(z);
            }
        }
    }

    public static void W(mpf mpfVar, boolean z, int i) {
        uzj uzjVar;
        mpf u;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (mpfVar.q || mpfVar.a || (uzjVar = mpfVar.n) == null) {
            return;
        }
        ((AndroidComposeView) uzjVar).A(mpfVar, false, z, z2);
        if (z3) {
            qpf qpfVar = mpfVar.G.p.f;
            mpf u2 = qpfVar.a.u();
            kpf kpfVar = qpfVar.a.C;
            if (u2 == null || kpfVar == kpf.c) {
                return;
            }
            while (u2.C == kpfVar && (u = u2.u()) != null) {
                u2 = u;
            }
            int ordinal = kpfVar.ordinal();
            if (ordinal == 0) {
                W(u2, z, 6);
            } else if (ordinal == 1) {
                u2.V(z);
            } else {
                xq0.q("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void X(mpf mpfVar) {
        qpf qpfVar = mpfVar.G;
        if (lpf.a[qpfVar.d.ordinal()] != 1) {
            b6e.w(qpfVar.d, "Unexpected state ");
            return;
        }
        if (qpfVar.e) {
            T(mpfVar, true, 6);
            return;
        }
        if (qpfVar.f) {
            mpfVar.S(true);
        }
        if (mpfVar.r()) {
            W(mpfVar, true, 6);
        } else if (mpfVar.q()) {
            mpfVar.V(true);
        }
    }

    private final String k(mpf mpfVar) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(mpfVar);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(h(0));
        sb.append(" Other tree: ");
        mpf mpfVar2 = mpfVar.m;
        sb.append(mpfVar2 != null ? mpfVar2.h(0) : null);
        return sb.toString();
    }

    public final void A(int i, mpf mpfVar) {
        if (mpfVar.m != null && mpfVar.n != null) {
            sme.b(k(mpfVar));
        }
        mpfVar.m = this;
        nnd nndVar = this.j;
        ((eqi) nndVar.b).a(i, mpfVar);
        ((ypb) nndVar.c).invoke();
        M();
        if (mpfVar.a) {
            this.i++;
        }
        F();
        uzj uzjVar = this.n;
        if (uzjVar != null) {
            mpfVar.d(uzjVar);
        }
        if (mpfVar.G.l > 0) {
            qpf qpfVar = this.G;
            qpfVar.b(qpfVar.l + 1);
        }
    }

    public final void B() {
        if (this.J) {
            cr crVar = this.F;
            f8j f8jVar = (ane) crVar.c;
            f8j f8jVar2 = ((f8j) crVar.d).n;
            this.I = null;
            while (true) {
                if (Intrinsics.d(f8jVar, f8jVar2)) {
                    break;
                }
                if ((f8jVar != null ? f8jVar.F : null) != null) {
                    this.I = f8jVar;
                    break;
                }
                f8jVar = f8jVar != null ? f8jVar.n : null;
            }
        }
        f8j f8jVar3 = this.I;
        if (f8jVar3 != null && f8jVar3.F == null) {
            throw ouj.f("layer was not set");
        }
        if (f8jVar3 != null) {
            f8jVar3.i1();
            return;
        }
        mpf u = u();
        if (u != null) {
            u.B();
        }
    }

    public final void C() {
        cr crVar = this.F;
        ane aneVar = (ane) crVar.c;
        for (f8j f8jVar = (f8j) crVar.d; f8jVar != aneVar; f8jVar = f8jVar.m) {
            f8jVar.getClass();
            tzj tzjVar = ((gpf) f8jVar).F;
            if (tzjVar != null) {
                tzjVar.invalidate();
            }
        }
        tzj tzjVar2 = ((ane) crVar.c).F;
        if (tzjVar2 != null) {
            tzjVar2.invalidate();
        }
    }

    public final void D() {
        this.f = true;
        if (this.h != null) {
            T(this, false, 7);
        } else {
            W(this, false, 7);
        }
    }

    public final void E() {
        if (this.t) {
            return;
        }
        this.F.getClass();
        if (a8j.a.f != null || this.L != null) {
            this.r = true;
            return;
        }
        jfp jfpVar = this.s;
        this.t = true;
        xqn xqnVar = new xqn();
        xqnVar.a = new jfp();
        wzj snapshotObserver = ppf.a(this).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.d, new ssb(8, this, xqnVar));
        this.t = false;
        this.s = (jfp) xqnVar.a;
        this.r = false;
        uzj a = ppf.a(this);
        a.getSemanticsOwner().b(this, jfpVar);
        ((AndroidComposeView) a).C();
    }

    public final void F() {
        mpf mpfVar;
        if (this.i > 0) {
            this.l = true;
        }
        if (!this.a || (mpfVar = this.m) == null) {
            return;
        }
        mpfVar.F();
    }

    public final boolean G() {
        return this.n != null;
    }

    public final boolean H() {
        return this.G.p.t;
    }

    public final Boolean I() {
        zwg zwgVar = this.G.q;
        if (zwgVar != null) {
            return Boolean.valueOf(zwgVar.t());
        }
        return null;
    }

    public final void J() {
        mpf u;
        if (this.C == kpf.c) {
            g();
        }
        zwg zwgVar = this.G.q;
        zwgVar.getClass();
        try {
            zwgVar.g = true;
            if (!zwgVar.l) {
                sme.b("replace() called on item that was not placed");
            }
            zwgVar.y = false;
            boolean t = zwgVar.t();
            zwgVar.J0(zwgVar.o, zwgVar.q, zwgVar.p);
            if (t && !zwgVar.y && (u = zwgVar.f.a.u()) != null) {
                u.S(false);
            }
            zwgVar.g = false;
        } catch (Throwable th) {
            zwgVar.g = false;
            throw th;
        }
    }

    public final void K(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            nnd nndVar = this.j;
            eqi eqiVar = (eqi) nndVar.b;
            ypb ypbVar = (ypb) nndVar.c;
            Object m = eqiVar.m(i5);
            ypbVar.invoke();
            ((eqi) nndVar.b).a(i6, (mpf) m);
            ypbVar.invoke();
        }
        M();
        F();
        D();
    }

    public final void L(mpf mpfVar) {
        if (mpfVar.G.l > 0) {
            this.G.b(r0.l - 1);
        }
        if (this.n != null) {
            mpfVar.i();
        }
        mpfVar.m = null;
        ((f8j) mpfVar.F.d).n = null;
        if (mpfVar.a) {
            this.i--;
            eqi eqiVar = (eqi) mpfVar.j.b;
            Object[] objArr = eqiVar.a;
            int i = eqiVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((f8j) ((mpf) objArr[i2]).F.d).n = null;
            }
        }
        F();
        M();
    }

    public final void M() {
        if (!this.a) {
            this.v = true;
            return;
        }
        mpf u = u();
        if (u != null) {
            u.M();
        }
    }

    public final boolean N(ga6 ga6Var) {
        if (ga6Var == null) {
            return false;
        }
        if (this.C == kpf.c) {
            f();
        }
        return this.G.p.M0(ga6Var.a);
    }

    public final void P() {
        nnd nndVar = this.j;
        int i = ((eqi) nndVar.b).c;
        while (true) {
            i--;
            eqi eqiVar = (eqi) nndVar.b;
            if (-1 >= i) {
                eqiVar.i();
                ((ypb) nndVar.c).invoke();
                return;
            }
            L((mpf) eqiVar.a[i]);
        }
    }

    public final void Q(int i, int i2) {
        if (i2 < 0) {
            sme.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            nnd nndVar = this.j;
            L((mpf) ((eqi) nndVar.b).a[i3]);
            Object m = ((eqi) nndVar.b).m(i3);
            ((ypb) nndVar.c).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void R() {
        mpf u;
        if (this.C == kpf.c) {
            g();
        }
        jfh jfhVar = this.G.p;
        jfhVar.getClass();
        try {
            jfhVar.g = true;
            if (!jfhVar.k) {
                sme.b("replace called on unplaced item");
            }
            boolean z = jfhVar.t;
            jfhVar.K0(jfhVar.n, jfhVar.q, jfhVar.o, jfhVar.p);
            if (z && !jfhVar.G && (u = jfhVar.f.a.u()) != null) {
                u.V(false);
            }
            jfhVar.g = false;
        } catch (Throwable th) {
            jfhVar.g = false;
            throw th;
        }
    }

    public final void S(boolean z) {
        uzj uzjVar;
        if (this.a || (uzjVar = this.n) == null) {
            return;
        }
        ((AndroidComposeView) uzjVar).B(this, true, z);
    }

    @Override // defpackage.vzj
    public final boolean U() {
        return G();
    }

    public final void V(boolean z) {
        uzj uzjVar;
        this.f = true;
        if (this.a || (uzjVar = this.n) == null) {
            return;
        }
        ((AndroidComposeView) uzjVar).B(this, false, z);
    }

    public final void Y() {
        eqi y = y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar = (mpf) objArr[i2];
            kpf kpfVar = mpfVar.D;
            mpfVar.C = kpfVar;
            if (kpfVar != kpf.c) {
                mpfVar.Y();
            }
        }
    }

    public final void Z(jx7 jx7Var) {
        if (Intrinsics.d(this.y, jx7Var)) {
            return;
        }
        this.y = jx7Var;
        D();
        mpf u = u();
        if (u != null) {
            u.B();
        }
        C();
        for (xci xciVar = (xci) this.F.f; xciVar != null; xciVar = xciVar.f) {
            xciVar.a();
        }
    }

    @Override // defpackage.op5
    public final void a() {
        sd0 sd0Var;
        oj0 oj0Var = this.o;
        if (oj0Var != null) {
            oj0Var.a();
        }
        zpf zpfVar = this.H;
        if (zpfVar != null) {
            zpfVar.f(true);
        }
        this.v0 = true;
        cr crVar = this.F;
        for (xci xciVar = (i4s) crVar.e; xciVar != null; xciVar = xciVar.e) {
            if (xciVar.n) {
                xciVar.N0();
            }
        }
        crVar.j0();
        for (xci xciVar2 = (i4s) crVar.e; xciVar2 != null; xciVar2 = xciVar2.e) {
            if (xciVar2.n) {
                xciVar2.J0();
            }
        }
        if (G()) {
            this.s = null;
            this.r = false;
        }
        uzj uzjVar = this.n;
        if (uzjVar != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) uzjVar;
            androidComposeView.getRectManager().h(this);
            if (AndroidComposeView.h() && (sd0Var = androidComposeView.C) != null && sd0Var.h.e(this.b)) {
                sd0Var.a.j(sd0Var.c, this.b, false);
            }
        }
    }

    public final void a0(mpf mpfVar) {
        if (Intrinsics.d(mpfVar, this.h)) {
            return;
        }
        this.h = mpfVar;
        qpf qpfVar = this.G;
        if (mpfVar != null) {
            if (qpfVar.q == null) {
                qpfVar.q = new zwg(qpfVar);
            }
            cr crVar = this.F;
            f8j f8jVar = ((ane) crVar.c).m;
            for (f8j f8jVar2 = (f8j) crVar.d; !Intrinsics.d(f8jVar2, f8jVar) && f8jVar2 != null; f8jVar2 = f8jVar2.m) {
                f8jVar2.V0();
            }
        } else {
            qpfVar.q = null;
        }
        D();
    }

    @Override // defpackage.op5
    public final void b() {
        sd0 sd0Var;
        if (!G()) {
            sme.a("onReuse is only expected on attached node");
        }
        oj0 oj0Var = this.o;
        if (oj0Var != null) {
            oj0Var.b();
        }
        zpf zpfVar = this.H;
        if (zpfVar != null) {
            zpfVar.f(false);
        }
        this.t = false;
        boolean z = this.v0;
        cr crVar = this.F;
        if (z) {
            this.v0 = false;
        } else {
            for (xci xciVar = (i4s) crVar.e; xciVar != null; xciVar = xciVar.e) {
                if (xciVar.n) {
                    xciVar.N0();
                }
            }
            crVar.j0();
            for (xci xciVar2 = (i4s) crVar.e; xciVar2 != null; xciVar2 = xciVar2.e) {
                if (xciVar2.n) {
                    xciVar2.J0();
                }
            }
        }
        int i = this.b;
        this.b = nfp.a.addAndGet(1);
        uzj uzjVar = this.n;
        if (uzjVar != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) uzjVar;
            androidComposeView.m0getLayoutNodes().g(i);
            androidComposeView.m0getLayoutNodes().h(this.b, this);
        }
        for (xci xciVar3 = (xci) crVar.f; xciVar3 != null; xciVar3 = xciVar3.f) {
            xciVar3.I0();
        }
        crVar.i0();
        if (crVar.M(8)) {
            E();
        }
        X(this);
        uzj uzjVar2 = this.n;
        if (uzjVar2 != null) {
            AndroidComposeView androidComposeView2 = (AndroidComposeView) uzjVar2;
            if (AndroidComposeView.h() && (sd0Var = androidComposeView2.C) != null) {
                AndroidComposeView androidComposeView3 = sd0Var.c;
                ke2 ke2Var = sd0Var.a;
                toi toiVar = sd0Var.h;
                if (toiVar.e(i)) {
                    ke2Var.j(androidComposeView3, i, false);
                }
                jfp w = w();
                if (w != null && w.a.b(ufp.p)) {
                    toiVar.a(this.b);
                    ke2Var.j(androidComposeView3, this.b, true);
                }
            }
            androidComposeView2.getRectManager().f(this, this.G.p.n, true);
        }
    }

    public final void b0(kfh kfhVar) {
        if (Intrinsics.d(this.w, kfhVar)) {
            return;
        }
        this.w = kfhVar;
        aqd aqdVar = this.x;
        if (aqdVar != null) {
            ((x6k) aqdVar.c).setValue(kfhVar);
        }
        D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0178  */
    /* JADX WARN: Type inference failed for: r3v9, types: [xci] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(yci yciVar) {
        eqi eqiVar;
        cr crVar;
        eqi eqiVar2;
        boolean z;
        z7j z7jVar;
        ?? r3;
        this.K = yciVar;
        cr crVar2 = this.F;
        ane aneVar = (ane) crVar2.c;
        i4s i4sVar = (i4s) crVar2.e;
        mpf mpfVar = (mpf) crVar2.b;
        xci xciVar = (xci) crVar2.f;
        xci xciVar2 = a8j.a;
        if (xciVar == xciVar2) {
            sme.b("padChain called on already padded chain");
        }
        xci xciVar3 = (xci) crVar2.f;
        xciVar3.e = xciVar2;
        xciVar2.f = xciVar3;
        eqi eqiVar3 = (eqi) crVar2.g;
        int i = eqiVar3 != null ? eqiVar3.c : 0;
        eqi eqiVar4 = (eqi) crVar2.h;
        if (eqiVar4 == null) {
            eqiVar4 = new eqi(new wci[16]);
        }
        int i2 = eqiVar4.c;
        if (i2 < 16) {
            i2 = 16;
        }
        eqi eqiVar5 = new eqi(new yci[i2]);
        eqiVar5.d(yciVar);
        pmc pmcVar = null;
        while (true) {
            int i3 = eqiVar5.c;
            if (i3 == 0) {
                break;
            }
            yci yciVar2 = (yci) eqiVar5.m(i3 - 1);
            if (yciVar2 instanceof nb5) {
                nb5 nb5Var = (nb5) yciVar2;
                eqiVar5.d(nb5Var.b);
                eqiVar5.d(nb5Var.a);
            } else if (yciVar2 instanceof wci) {
                eqiVar4.d(yciVar2);
            } else {
                if (pmcVar == null) {
                    pmcVar = new pmc(1, eqiVar4);
                }
                yciVar2.b(pmcVar);
                pmcVar = pmcVar;
            }
        }
        int i4 = eqiVar4.c;
        if (i4 == i) {
            xci xciVar4 = xciVar2.f;
            int i5 = 0;
            while (true) {
                if (xciVar4 == null || i5 >= i) {
                    break;
                }
                if (eqiVar3 == null) {
                    throw ouj.f("expected prior modifier list to be non-empty");
                }
                wci wciVar = (wci) eqiVar3.a[i5];
                wci wciVar2 = (wci) eqiVar4.a[i5];
                char c = Intrinsics.d(wciVar, wciVar2) ? (char) 2 : wciVar.getClass() == wciVar2.getClass() ? (char) 1 : (char) 0;
                if (c == 0) {
                    xciVar4 = xciVar4.e;
                    break;
                }
                if (c == 1) {
                    cr.w0(wciVar, wciVar2, xciVar4);
                }
                xciVar4 = xciVar4.f;
                i5++;
            }
            if (i5 >= i) {
                crVar2 = crVar2;
                crVar = crVar2;
                eqiVar2 = eqiVar4;
                z = false;
                crVar.g = eqiVar2;
                if (eqiVar3 != null) {
                }
                crVar.h = eqiVar3;
                z7jVar = a8j.a;
                r3 = z7jVar.f;
                if (r3 != 0) {
                }
                i4sVar.e = null;
                z7jVar.f = null;
                z7jVar.d = -1;
                z7jVar.h = null;
                if (i4sVar == z7jVar) {
                }
                crVar.f = i4sVar;
                if (z) {
                }
                this.G.h();
                if (this.h == null) {
                    return;
                } else {
                    return;
                }
            }
            if (eqiVar3 == null) {
                throw ouj.f("expected prior modifier list to be non-empty");
            }
            if (xciVar4 == null) {
                throw ouj.f("structuralUpdate requires a non-null tail");
            }
            boolean z2 = mpfVar.L != null;
            xci xciVar5 = xciVar4;
            crVar = crVar2;
            eqiVar = eqiVar3;
            eqiVar2 = eqiVar4;
            crVar.n0(i5, eqiVar, eqiVar2, xciVar5, !z2);
            eqiVar3 = eqiVar;
            z = true;
            crVar.g = eqiVar2;
            if (eqiVar3 != null) {
                eqiVar3.i();
            } else {
                eqiVar3 = null;
            }
            crVar.h = eqiVar3;
            z7jVar = a8j.a;
            r3 = z7jVar.f;
            if (r3 != 0) {
                i4sVar = r3;
            }
            i4sVar.e = null;
            z7jVar.f = null;
            z7jVar.d = -1;
            z7jVar.h = null;
            if (i4sVar == z7jVar) {
                sme.b("trimChain did not update the head");
            }
            crVar.f = i4sVar;
            if (z) {
                crVar.q0();
            }
            this.G.h();
            if (this.h == null && crVar.M(RemoteCameraConfig.Mic.BUFFER_SIZE)) {
                a0(this);
                return;
            }
            return;
        }
        yci yciVar3 = mpfVar.L;
        if (yciVar3 != null && i == 0) {
            for (int i6 = 0; i6 < eqiVar4.c; i6++) {
                xciVar2 = cr.t((wci) eqiVar4.a[i6], xciVar2);
            }
            int i7 = 0;
            for (xci xciVar6 = i4sVar.e; xciVar6 != null && xciVar6 != a8j.a; xciVar6 = xciVar6.e) {
                i7 |= xciVar6.c;
                xciVar6.d = i7;
            }
            crVar = crVar2;
            eqiVar2 = eqiVar4;
            z = true;
            crVar.g = eqiVar2;
            if (eqiVar3 != null) {
            }
            crVar.h = eqiVar3;
            z7jVar = a8j.a;
            r3 = z7jVar.f;
            if (r3 != 0) {
            }
            i4sVar.e = null;
            z7jVar.f = null;
            z7jVar.d = -1;
            z7jVar.h = null;
            if (i4sVar == z7jVar) {
            }
            crVar.f = i4sVar;
            if (z) {
            }
            this.G.h();
            if (this.h == null) {
            }
        } else if (i4 != 0) {
            if (eqiVar3 == null) {
                eqiVar3 = new eqi(new wci[16]);
            }
            eqiVar = eqiVar3;
            crVar = crVar2;
            eqiVar2 = eqiVar4;
            crVar.n0(0, eqiVar, eqiVar2, xciVar2, !(yciVar3 != null));
            eqiVar3 = eqiVar;
            z = true;
            crVar.g = eqiVar2;
            if (eqiVar3 != null) {
            }
            crVar.h = eqiVar3;
            z7jVar = a8j.a;
            r3 = z7jVar.f;
            if (r3 != 0) {
            }
            i4sVar.e = null;
            z7jVar.f = null;
            z7jVar.d = -1;
            z7jVar.h = null;
            if (i4sVar == z7jVar) {
            }
            crVar.f = i4sVar;
            if (z) {
            }
            this.G.h();
            if (this.h == null) {
            }
        } else {
            if (eqiVar3 == null) {
                throw ouj.f("expected prior modifier list to be non-empty");
            }
            xci xciVar7 = xciVar2.f;
            for (int i8 = 0; xciVar7 != null && i8 < eqiVar3.c; i8++) {
                xciVar7 = cr.x(xciVar7).f;
            }
            mpf u = mpfVar.u();
            aneVar.n = u != null ? (ane) u.F.c : null;
            crVar2.d = aneVar;
            crVar = crVar2;
            eqiVar2 = eqiVar4;
            z = false;
            crVar.g = eqiVar2;
            if (eqiVar3 != null) {
            }
            crVar.h = eqiVar3;
            z7jVar = a8j.a;
            r3 = z7jVar.f;
            if (r3 != 0) {
            }
            i4sVar.e = null;
            z7jVar.f = null;
            z7jVar.d = -1;
            z7jVar.h = null;
            if (i4sVar == z7jVar) {
            }
            crVar.f = i4sVar;
            if (z) {
            }
            this.G.h();
            if (this.h == null) {
            }
        }
    }

    public final void c0(yci yciVar) {
        if (this.a && this.K != vci.a) {
            sme.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.v0) {
            sme.a("modifier is updated when deactivated");
        }
        if (!G()) {
            this.L = yciVar;
            return;
        }
        c(yciVar);
        if (this.r) {
            E();
        }
    }

    public final void d(uzj uzjVar) {
        mpf mpfVar;
        sd0 sd0Var;
        jfp w;
        if (this.n != null) {
            sme.b("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
        }
        mpf mpfVar2 = this.m;
        if (mpfVar2 != null && !Intrinsics.d(mpfVar2.n, uzjVar)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(uzjVar);
            sb.append(") than the parent's owner(");
            mpf u = u();
            sb.append(u != null ? u.n : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            mpf mpfVar3 = this.m;
            sb.append(mpfVar3 != null ? mpfVar3.h(0) : null);
            sme.b(sb.toString());
        }
        mpf u2 = u();
        qpf qpfVar = this.G;
        if (u2 == null) {
            qpfVar.p.t = true;
            zwg zwgVar = qpfVar.q;
            if (zwgVar != null) {
                zwgVar.r = xwg.a;
            }
        }
        cr crVar = this.F;
        ((f8j) crVar.d).n = u2 != null ? (ane) u2.F.c : null;
        this.n = uzjVar;
        this.p = (u2 != null ? u2.p : -1) + 1;
        yci yciVar = this.L;
        if (yciVar != null) {
            c(yciVar);
        }
        this.L = null;
        AndroidComposeView androidComposeView = (AndroidComposeView) uzjVar;
        androidComposeView.m0getLayoutNodes().h(this.b, this);
        mpf mpfVar4 = this.m;
        if (mpfVar4 == null || (mpfVar = mpfVar4.h) == null) {
            mpfVar = this.h;
        }
        a0(mpfVar);
        if (this.h == null && crVar.M(RemoteCameraConfig.Mic.BUFFER_SIZE)) {
            a0(this);
        }
        if (!this.v0) {
            for (xci xciVar = (xci) crVar.f; xciVar != null; xciVar = xciVar.f) {
                xciVar.I0();
            }
        }
        eqi eqiVar = (eqi) this.j.b;
        Object[] objArr = eqiVar.a;
        int i = eqiVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((mpf) objArr[i2]).d(uzjVar);
        }
        if (!this.v0) {
            crVar.i0();
        }
        D();
        if (u2 != null) {
            u2.D();
        }
        f8j f8jVar = ((ane) crVar.c).m;
        for (f8j f8jVar2 = (f8j) crVar.d; !Intrinsics.d(f8jVar2, f8jVar) && f8jVar2 != null; f8jVar2 = f8jVar2.m) {
            f8jVar2.x1(true, f8jVar2.q);
            tzj tzjVar = f8jVar2.F;
            if (tzjVar != null) {
                tzjVar.invalidate();
            }
        }
        ij0 ij0Var = this.X;
        if (ij0Var != null) {
            ij0Var.invoke(uzjVar);
        }
        qpfVar.h();
        if (!this.v0 && crVar.M(8)) {
            E();
        }
        androidComposeView.getClass();
        if (!AndroidComposeView.h() || (sd0Var = androidComposeView.C) == null || (w = w()) == null || !w.a.b(ufp.p)) {
            return;
        }
        sd0Var.h.a(this.b);
        sd0Var.a.j(sd0Var.c, this.b, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [xci] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void d0(aeu aeuVar) {
        if (Intrinsics.d(this.A, aeuVar)) {
            return;
        }
        this.A = aeuVar;
        xci xciVar = (xci) this.F.f;
        if ((xciVar.d & 16) != 0) {
            while (xciVar != null) {
                if ((xciVar.c & 16) != 0) {
                    cw7 cw7Var = xciVar;
                    ?? r3 = 0;
                    while (cw7Var != 0) {
                        if (cw7Var instanceof ofm) {
                            ((ofm) cw7Var).C0();
                        } else if ((cw7Var.c & 16) != 0 && (cw7Var instanceof cw7)) {
                            xci xciVar2 = cw7Var.p;
                            int i = 0;
                            cw7Var = cw7Var;
                            r3 = r3;
                            while (xciVar2 != null) {
                                if ((xciVar2.c & 16) != 0) {
                                    i++;
                                    r3 = r3;
                                    if (i == 1) {
                                        cw7Var = xciVar2;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new eqi(new xci[16]);
                                        }
                                        if (cw7Var != 0) {
                                            r3.d(cw7Var);
                                            cw7Var = 0;
                                        }
                                        r3.d(xciVar2);
                                    }
                                }
                                xciVar2 = xciVar2.f;
                                cw7Var = cw7Var;
                                r3 = r3;
                            }
                            if (i == 1) {
                            }
                        }
                        cw7Var = bcx.p(r3);
                    }
                }
                if ((xciVar.d & 16) == 0) {
                    return;
                } else {
                    xciVar = xciVar.f;
                }
            }
        }
    }

    @Override // defpackage.op5
    public final void e() {
        oj0 oj0Var = this.o;
        if (oj0Var != null) {
            oj0Var.e();
        }
        zpf zpfVar = this.H;
        if (zpfVar != null) {
            zpfVar.e();
        }
        cr crVar = this.F;
        f8j f8jVar = ((ane) crVar.c).m;
        for (f8j f8jVar2 = (f8j) crVar.d; !Intrinsics.d(f8jVar2, f8jVar) && f8jVar2 != null; f8jVar2 = f8jVar2.m) {
            f8jVar2.o = true;
            f8jVar2.D.invoke();
            if (f8jVar2.F != null) {
                if (f8jVar2.G != null) {
                    f8jVar2.G = null;
                }
                f8jVar2.x1(false, null);
                f8jVar2.l.V(false);
            }
        }
    }

    public final void e0() {
        if (this.i <= 0 || !this.l) {
            return;
        }
        this.l = false;
        eqi eqiVar = this.k;
        if (eqiVar == null) {
            eqiVar = new eqi(new mpf[16]);
            this.k = eqiVar;
        }
        eqiVar.i();
        eqi eqiVar2 = (eqi) this.j.b;
        Object[] objArr = eqiVar2.a;
        int i = eqiVar2.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar = (mpf) objArr[i2];
            if (mpfVar.a) {
                eqiVar.e(eqiVar.c, mpfVar.y());
            } else {
                eqiVar.d(mpfVar);
            }
        }
        qpf qpfVar = this.G;
        qpfVar.p.A = true;
        zwg zwgVar = qpfVar.q;
        if (zwgVar != null) {
            zwgVar.u = true;
        }
    }

    public final void f() {
        this.D = this.C;
        this.C = kpf.c;
        eqi y = y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar = (mpf) objArr[i2];
            if (mpfVar.C != kpf.c) {
                mpfVar.f();
            }
        }
    }

    public final void g() {
        this.D = this.C;
        this.C = kpf.c;
        eqi y = y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar = (mpf) objArr[i2];
            if (mpfVar.C == kpf.b) {
                mpfVar.g();
            }
        }
    }

    public final String h(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        eqi y = y();
        Object[] objArr = y.a;
        int i3 = y.c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((mpf) objArr[i4]).h(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? f1d.d(1, 0, sb2) : sb2;
    }

    public final void i() {
        sd0 sd0Var;
        npf npfVar;
        uzj uzjVar = this.n;
        if (uzjVar == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            mpf u = u();
            sb.append(u != null ? u.h(0) : null);
            sme.c(sb.toString());
            rj7.f();
            return;
        }
        mpf u2 = u();
        qpf qpfVar = this.G;
        if (u2 != null) {
            u2.B();
            u2.D();
            jfh jfhVar = qpfVar.p;
            kpf kpfVar = kpf.c;
            jfhVar.l = kpfVar;
            zwg zwgVar = qpfVar.q;
            if (zwgVar != null) {
                zwgVar.j = kpfVar;
            }
        }
        npf npfVar2 = qpfVar.p.y;
        npfVar2.b = true;
        npfVar2.c = false;
        npfVar2.e = false;
        npfVar2.d = false;
        npfVar2.f = false;
        npfVar2.g = false;
        npfVar2.h = null;
        zwg zwgVar2 = qpfVar.q;
        if (zwgVar2 != null && (npfVar = zwgVar2.s) != null) {
            npfVar.b = true;
            npfVar.c = false;
            npfVar.e = false;
            npfVar.d = false;
            npfVar.f = false;
            npfVar.g = false;
            npfVar.h = null;
        }
        jj0 jj0Var = this.Y;
        if (jj0Var != null) {
            jj0Var.invoke(uzjVar);
        }
        cr crVar = this.F;
        crVar.j0();
        this.q = true;
        eqi eqiVar = (eqi) this.j.b;
        Object[] objArr = eqiVar.a;
        int i = eqiVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((mpf) objArr[i2]).i();
        }
        this.q = false;
        for (xci xciVar = (i4s) crVar.e; xciVar != null; xciVar = xciVar.e) {
            if (xciVar.n) {
                xciVar.J0();
            }
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) uzjVar;
        androidComposeView.m0getLayoutNodes().g(this.b);
        hfh hfhVar = androidComposeView.v0;
        pt0 pt0Var = hfhVar.b;
        ((znk) pt0Var.a).B(this);
        ((znk) pt0Var.b).B(this);
        ((eqi) hfhVar.e.b).l(this);
        androidComposeView.D = true;
        androidComposeView.getRectManager().h(this);
        if (AndroidComposeView.h() && (sd0Var = androidComposeView.C) != null && sd0Var.h.e(this.b)) {
            sd0Var.a.j(sd0Var.c, this.b, false);
        }
        this.n = null;
        a0(null);
        this.p = 0;
        jfh jfhVar2 = qpfVar.p;
        jfhVar2.i = Integer.MAX_VALUE;
        jfhVar2.h = Integer.MAX_VALUE;
        jfhVar2.t = false;
        zwg zwgVar3 = qpfVar.q;
        if (zwgVar3 != null) {
            zwgVar3.i = Integer.MAX_VALUE;
            zwgVar3.h = Integer.MAX_VALUE;
            zwgVar3.r = xwg.c;
        }
        if (crVar.M(8)) {
            jfp jfpVar = this.s;
            this.s = null;
            this.r = false;
            uzjVar.getSemanticsOwner().b(this, jfpVar);
            androidComposeView.C();
        }
    }

    public final void j(mu3 mu3Var, xod xodVar) {
        ((f8j) this.F.d).T0(mu3Var, xodVar);
    }

    public final void l() {
        if (this.h != null) {
            T(this, false, 5);
        } else {
            W(this, false, 5);
        }
        jfh jfhVar = this.G.p;
        ga6 ga6Var = jfhVar.j ? new ga6(jfhVar.d) : null;
        uzj uzjVar = this.n;
        if (ga6Var != null) {
            if (uzjVar != null) {
                ((AndroidComposeView) uzjVar).v(this, ga6Var.a);
            }
        } else if (uzjVar != null) {
            ((AndroidComposeView) uzjVar).u(true);
        }
    }

    public final List m() {
        zwg zwgVar = this.G.q;
        zwgVar.getClass();
        eqi eqiVar = zwgVar.t;
        qpf qpfVar = zwgVar.f;
        qpfVar.a.o();
        if (!zwgVar.u) {
            return eqiVar.h();
        }
        mpf mpfVar = qpfVar.a;
        eqi y = mpfVar.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            mpf mpfVar2 = (mpf) objArr[i2];
            if (eqiVar.c <= i2) {
                zwg zwgVar2 = mpfVar2.G.q;
                zwgVar2.getClass();
                eqiVar.d(zwgVar2);
            } else {
                zwg zwgVar3 = mpfVar2.G.q;
                zwgVar3.getClass();
                Object[] objArr2 = eqiVar.a;
                Object obj = objArr2[i2];
                objArr2[i2] = zwgVar3;
            }
        }
        eqiVar.n(((eqi) ((epi) mpfVar.o()).b).c, eqiVar.c);
        zwgVar.u = false;
        return eqiVar.h();
    }

    public final List n() {
        return this.G.p.C0();
    }

    public final List o() {
        return y().h();
    }

    public final List p() {
        return ((eqi) this.j.b).h();
    }

    public final boolean q() {
        return this.G.p.w;
    }

    public final boolean r() {
        return this.G.p.v;
    }

    public final kpf s() {
        kpf kpfVar;
        zwg zwgVar = this.G.q;
        return (zwgVar == null || (kpfVar = zwgVar.j) == null) ? kpf.c : kpfVar;
    }

    public final aqd t() {
        aqd aqdVar = this.x;
        if (aqdVar != null) {
            return aqdVar;
        }
        aqd aqdVar2 = new aqd(this, this.w);
        this.x = aqdVar2;
        return aqdVar2;
    }

    public final String toString() {
        return vut.R(this) + " children: " + ((eqi) ((epi) o()).b).c + " measurePolicy: " + this.w;
    }

    public final mpf u() {
        mpf mpfVar = this.m;
        while (mpfVar != null && mpfVar.a) {
            mpfVar = mpfVar.m;
        }
        return mpfVar;
    }

    public final int v() {
        return this.G.p.i;
    }

    public final jfp w() {
        if (G() && !this.v0 && this.F.M(8)) {
            return this.s;
        }
        return null;
    }

    public final eqi x() {
        boolean z = this.v;
        eqi eqiVar = this.u;
        if (z) {
            eqiVar.i();
            eqiVar.e(eqiVar.c, y());
            Arrays.sort(eqiVar.a, 0, eqiVar.c, y0);
            this.v = false;
        }
        return eqiVar;
    }

    public final eqi y() {
        e0();
        if (this.i == 0) {
            return (eqi) this.j.b;
        }
        eqi eqiVar = this.k;
        eqiVar.getClass();
        return eqiVar;
    }

    public final void z(long j, gzd gzdVar, int i, boolean z) {
        cr crVar = this.F;
        f8j f8jVar = (f8j) crVar.d;
        zco zcoVar = f8j.H;
        ((f8j) crVar.d).g1(f8j.K, f8jVar.X0(j), gzdVar, i, z);
    }

    public mpf(int i) {
        this(nfp.a.addAndGet(1), (i & 1) == 0);
    }
}
