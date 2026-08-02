package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f8j extends twg implements ffh, wof, vzj {
    public static final zco H;
    public static final lof I;
    public static final float[] J;
    public static final h1b K;
    public static final rwd L;
    public xod A;
    public mu3 B;
    public qtf C;
    public boolean E;
    public tzj F;
    public xod G;
    public final mpf l;
    public f8j m;
    public f8j n;
    public boolean o;
    public boolean p;
    public Function1 q;
    public jx7 r;
    public xof s;
    public lfh u;
    public cpi v;
    public float x;
    public spi y;
    public lof z;
    public float t = 0.8f;
    public long w = 0;
    public final c8j D = new c8j(this, 1);

    static {
        zco zcoVar = new zco();
        zcoVar.b = 1.0f;
        zcoVar.c = 1.0f;
        zcoVar.d = 1.0f;
        long j = apd.a;
        zcoVar.h = j;
        zcoVar.i = j;
        zcoVar.k = 8.0f;
        zcoVar.l = a7t.b;
        zcoVar.m = vnj.i;
        zcoVar.o = 0;
        zcoVar.p = 9205357640488583168L;
        zcoVar.q = zsd.l();
        zcoVar.r = xof.a;
        H = zcoVar;
        I = new lof();
        J = feh.a();
        K = new h1b();
        L = new rwd(28);
    }

    public f8j(mpf mpfVar) {
        this.l = mpfVar;
        this.r = mpfVar.y;
        this.s = mpfVar.z;
    }

    public static f8j u1(wof wofVar) {
        f8j f8jVar;
        wwg wwgVar = wofVar instanceof wwg ? (wwg) wofVar : null;
        if (wwgVar != null && (f8jVar = wwgVar.a.l) != null) {
            return f8jVar;
        }
        wofVar.getClass();
        return (f8j) wofVar;
    }

    @Override // defpackage.wof
    public final long A(long j) {
        long S = S(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) ppf.a(this.l);
        androidComposeView.D();
        return feh.b(S, androidComposeView.z0);
    }

    @Override // defpackage.wof
    public final void E(float[] fArr) {
        uzj a = ppf.a(this.l);
        f8j u1 = u1(ltg.D(this));
        w1(u1, fArr);
        if (a instanceof ieh) {
            ((AndroidComposeView) ((ieh) a)).s(fArr);
            return;
        }
        long K2 = u1.K(0L);
        if ((9223372034707292159L & K2) != 9205357640488583168L) {
            feh.f(fArr, Float.intBitsToFloat((int) (K2 >> 32)), Float.intBitsToFloat((int) (K2 & 4294967295L)));
        }
    }

    @Override // defpackage.twg
    public final twg G0() {
        return this.m;
    }

    @Override // defpackage.twg
    public final boolean I0() {
        return this.u != null;
    }

    @Override // defpackage.twg
    public final mpf J0() {
        return this.l;
    }

    @Override // defpackage.wof
    public final long K(long j) {
        if (!b1().n) {
            sme.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((AndroidComposeView) ppf.a(this.l)).t(S(j));
    }

    @Override // defpackage.twg
    public final lfh K0() {
        lfh lfhVar = this.u;
        if (lfhVar != null) {
            return lfhVar;
        }
        xq0.q("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.twg
    public final twg L0() {
        return this.n;
    }

    @Override // defpackage.twg
    public final long M0() {
        return this.w;
    }

    @Override // defpackage.twg
    public final void O0() {
        xod xodVar = this.G;
        long j = this.w;
        if (xodVar != null) {
            p0(j, this.x, xodVar);
        } else {
            r0(j, this.x, this.q);
        }
    }

    public final void P0(f8j f8jVar, spi spiVar, boolean z) {
        if (f8jVar == this) {
            return;
        }
        f8j f8jVar2 = this.n;
        if (f8jVar2 != null) {
            f8jVar2.P0(f8jVar, spiVar, z);
        }
        long j = this.w;
        float f = (int) (j >> 32);
        spiVar.b -= f;
        spiVar.d -= f;
        float f2 = (int) (j & 4294967295L);
        spiVar.c -= f2;
        spiVar.e -= f2;
        tzj tzjVar = this.F;
        if (tzjVar != null) {
            tzjVar.b(spiVar, true);
            if (this.p && z) {
                long j2 = this.c;
                spiVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // defpackage.wof
    public final wof Q() {
        if (!b1().n) {
            sme.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m1();
        return ((f8j) this.l.F.d).n;
    }

    public final long Q0(f8j f8jVar, long j) {
        if (f8jVar == this) {
            return j;
        }
        f8j f8jVar2 = this.n;
        return (f8jVar2 == null || Intrinsics.d(f8jVar, f8jVar2)) ? X0(j) : X0(f8jVar2.Q0(f8jVar, j));
    }

    public final long R0(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - a0();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Z();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    @Override // defpackage.wof
    public final long S(long j) {
        if (!b1().n) {
            sme.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m1();
        for (f8j f8jVar = this; f8jVar != null; f8jVar = f8jVar.n) {
            tzj tzjVar = f8jVar.F;
            if (tzjVar != null) {
                j = tzjVar.d(j, false);
            }
            j = xv.O(j, f8jVar.w);
        }
        return j;
    }

    public final float S0(long j, long j2) {
        if (a0() >= Float.intBitsToFloat((int) (j2 >> 32)) && Z() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long R0 = R0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (R0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (R0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - a0());
        long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - Z())) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i);
                    float intBitsToFloat5 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void T0(mu3 mu3Var, xod xodVar) {
        tzj tzjVar = this.F;
        if (tzjVar != null) {
            tzjVar.g(mu3Var, xodVar);
            return;
        }
        long j = this.w;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        mu3Var.j(f, f2);
        U0(mu3Var, xodVar);
        mu3Var.j(-f, -f2);
    }

    @Override // defpackage.vzj
    public final boolean U() {
        return (this.F == null || this.o || !this.l.G()) ? false : true;
    }

    public final void U0(mu3 mu3Var, xod xodVar) {
        mu3 mu3Var2;
        xod xodVar2;
        xci c1 = c1(4);
        if (c1 == null) {
            q1(mu3Var, xodVar);
            return;
        }
        mpf mpfVar = this.l;
        mpfVar.getClass();
        opf sharedDrawScope = ppf.a(mpfVar).getSharedDrawScope();
        long Q = nt0.Q(this.c);
        sharedDrawScope.getClass();
        eqi eqiVar = null;
        while (c1 != null) {
            if (c1 instanceof ipa) {
                mu3Var2 = mu3Var;
                xodVar2 = xodVar;
                sharedDrawScope.b(mu3Var2, Q, this, (ipa) c1, xodVar2);
            } else {
                mu3Var2 = mu3Var;
                xodVar2 = xodVar;
                if ((c1.c & 4) != 0 && (c1 instanceof cw7)) {
                    int i = 0;
                    for (xci xciVar = ((cw7) c1).p; xciVar != null; xciVar = xciVar.f) {
                        if ((xciVar.c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                c1 = xciVar;
                            } else {
                                if (eqiVar == null) {
                                    eqiVar = new eqi(new xci[16]);
                                }
                                if (c1 != null) {
                                    eqiVar.d(c1);
                                    c1 = null;
                                }
                                eqiVar.d(xciVar);
                            }
                        }
                    }
                    if (i == 1) {
                        mu3Var = mu3Var2;
                        xodVar = xodVar2;
                    }
                }
            }
            c1 = bcx.p(eqiVar);
            mu3Var = mu3Var2;
            xodVar = xodVar2;
        }
    }

    public abstract void V0();

    public final f8j W0(f8j f8jVar) {
        mpf mpfVar = f8jVar.l;
        mpf mpfVar2 = this.l;
        if (mpfVar == mpfVar2) {
            xci b1 = f8jVar.b1();
            xci b12 = b1();
            if (!b12.a.n) {
                sme.b("visitLocalAncestors called on an unattached node");
            }
            for (xci xciVar = b12.a.e; xciVar != null; xciVar = xciVar.e) {
                if ((xciVar.c & 2) != 0 && xciVar == b1) {
                    return f8jVar;
                }
            }
            return this;
        }
        while (mpfVar.p > mpfVar2.p) {
            mpfVar = mpfVar.u();
            mpfVar.getClass();
        }
        mpf mpfVar3 = mpfVar2;
        while (mpfVar3.p > mpfVar.p) {
            mpfVar3 = mpfVar3.u();
            mpfVar3.getClass();
        }
        while (mpfVar != mpfVar3) {
            mpfVar = mpfVar.u();
            mpfVar3 = mpfVar3.u();
            if (mpfVar == null || mpfVar3 == null) {
                xq0.x("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (mpfVar3 != mpfVar2) {
            if (mpfVar != f8jVar.l) {
                return (ane) mpfVar.F.c;
            }
            return f8jVar;
        }
        return this;
    }

    public final long X0(long j) {
        long j2 = this.w;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        tzj tzjVar = this.F;
        return tzjVar != null ? tzjVar.d(floatToRawIntBits, true) : floatToRawIntBits;
    }

    public final Function2 Y0() {
        qtf qtfVar = this.C;
        if (qtfVar != null) {
            return qtfVar;
        }
        qtf qtfVar2 = new qtf(6, this, new c8j(this, 0));
        this.C = qtfVar2;
        return qtfVar2;
    }

    public abstract vwg Z0();

    public final long a1() {
        return this.r.B0(this.l.A.d());
    }

    public abstract xci b1();

    public final xci c1(int i) {
        boolean g = g8j.g(i);
        xci b1 = b1();
        if (!g && (b1 = b1.e) == null) {
            return null;
        }
        for (xci d1 = d1(g); d1 != null && (d1.d & i) != 0; d1 = d1.f) {
            if ((d1.c & i) != 0) {
                return d1;
            }
            if (d1 == b1) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.wof
    public final boolean d() {
        return b1().n;
    }

    public final xci d1(boolean z) {
        xci b1;
        cr crVar = this.l.F;
        if (((f8j) crVar.d) == this) {
            return (xci) crVar.f;
        }
        f8j f8jVar = this.n;
        if (!z) {
            if (f8jVar != null) {
                return f8jVar.b1();
            }
            return null;
        }
        if (f8jVar == null || (b1 = f8jVar.b1()) == null) {
            return null;
        }
        return b1.f;
    }

    public final void e1(xci xciVar, b8j b8jVar, long j, gzd gzdVar, int i, boolean z) {
        if (xciVar == null) {
            h1(b8jVar, j, gzdVar, i, z);
            return;
        }
        int i2 = gzdVar.c;
        gpi gpiVar = gzdVar.a;
        gzdVar.g(i2 + 1, gpiVar.b);
        gzdVar.c++;
        gpiVar.a(xciVar);
        gzdVar.b.a(c3x.n(-1.0f, z, false));
        e1(rzf.s(xciVar, b8jVar.s()), b8jVar, j, gzdVar, i, z);
        gzdVar.c = i2;
    }

    public final void f1(xci xciVar, b8j b8jVar, long j, gzd gzdVar, int i, boolean z, float f) {
        if (xciVar == null) {
            h1(b8jVar, j, gzdVar, i, z);
            return;
        }
        int i2 = gzdVar.c;
        gpi gpiVar = gzdVar.a;
        gzdVar.g(i2 + 1, gpiVar.b);
        gzdVar.c++;
        gpiVar.a(xciVar);
        gzdVar.b.a(c3x.n(f, z, false));
        p1(rzf.s(xciVar, b8jVar.s()), b8jVar, j, gzdVar, i, z, f, true);
        gzdVar.c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (defpackage.quj.E(r18.a(), defpackage.c3x.n(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g1(b8j b8jVar, long j, gzd gzdVar, int i, boolean z) {
        boolean z2;
        boolean z3;
        xci c1 = c1(b8jVar.s());
        if (!z1(j)) {
            if (i == 1) {
                float S0 = S0(j, a1());
                if ((Float.floatToRawIntBits(S0) & Integer.MAX_VALUE) < 2139095040) {
                    if (gzdVar.c != gzdVar.a.b - 1) {
                        if (quj.E(gzdVar.a(), c3x.n(S0, false, false)) <= 0) {
                            return;
                        }
                    }
                    f1(c1, b8jVar, j, gzdVar, i, false, S0);
                    return;
                }
                return;
            }
            return;
        }
        if (c1 == null) {
            h1(b8jVar, j, gzdVar, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < a0() && intBitsToFloat2 < Z()) {
            e1(c1, b8jVar, j, gzdVar, i, z);
            return;
        }
        float S02 = i == 1 ? S0(j, a1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(S02) & Integer.MAX_VALUE) < 2139095040) {
            if (gzdVar.c == gzdVar.a.b - 1) {
                z2 = z;
            } else {
                z2 = z;
            }
            z3 = true;
            p1(c1, b8jVar, j, gzdVar, i, z2, S02, z3);
        }
        z2 = z;
        z3 = false;
        p1(c1, b8jVar, j, gzdVar, i, z2, S02, z3);
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.l.y.getDensity();
    }

    @Override // defpackage.fxe
    public final xof getLayoutDirection() {
        return this.l.z;
    }

    @Override // defpackage.wof
    public final void h(wof wofVar, float[] fArr) {
        f8j u1 = u1(wofVar);
        u1.m1();
        f8j W0 = W0(u1);
        feh.d(fArr);
        u1.w1(W0, fArr);
        v1(W0, fArr);
    }

    public void h1(b8j b8jVar, long j, gzd gzdVar, int i, boolean z) {
        f8j f8jVar = this.m;
        if (f8jVar != null) {
            f8jVar.g1(b8jVar, f8jVar.X0(j), gzdVar, i, z);
        }
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.l.y.i0();
    }

    public final void i1() {
        tzj tzjVar = this.F;
        if (tzjVar != null) {
            tzjVar.invalidate();
            return;
        }
        f8j f8jVar = this.n;
        if (f8jVar != null) {
            f8jVar.i1();
        }
    }

    @Override // defpackage.wof
    public final long j() {
        return this.c;
    }

    public final boolean j1() {
        if (this.F != null && this.t <= 0.0f) {
            return true;
        }
        f8j f8jVar = this.n;
        if (f8jVar != null) {
            return f8jVar.j1();
        }
        return false;
    }

    @Override // defpackage.wof
    public final long k(long j) {
        if (!b1().n) {
            sme.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        wof D = ltg.D(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) ppf.a(this.l);
        androidComposeView.D();
        return k1(D, enj.g(feh.b(j, androidComposeView.A0), D.S(0L)));
    }

    public final long k1(wof wofVar, long j) {
        if (wofVar instanceof wwg) {
            wwg wwgVar = (wwg) wofVar;
            wwgVar.a.l.m1();
            return wwgVar.b(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        f8j u1 = u1(wofVar);
        u1.m1();
        f8j W0 = W0(u1);
        while (u1 != W0) {
            tzj tzjVar = u1.F;
            if (tzjVar != null) {
                j = tzjVar.d(j, false);
            }
            j = xv.O(j, u1.w);
            u1 = u1.n;
            u1.getClass();
        }
        return Q0(W0, j);
    }

    public final void l1() {
        if (this.F != null || this.q == null) {
            return;
        }
        tzj a = uzj.a(ppf.a(this.l), Y0(), this.D, this.G, false, 8);
        a.f(this.c);
        a.j(this.w);
        a.invalidate();
        this.F = a;
    }

    public final void m1() {
        qpf qpfVar = this.l.G;
        ipf ipfVar = qpfVar.a.G.d;
        if (ipfVar == ipf.c || ipfVar == ipf.d) {
            if (qpfVar.p.B) {
                qpfVar.e(true);
            } else {
                qpfVar.d(true);
            }
        }
        if (ipfVar == ipf.d) {
            zwg zwgVar = qpfVar.q;
            if (zwgVar == null || !zwgVar.v) {
                qpfVar.f(true);
            } else {
                qpfVar.g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [xci] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [xci] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.ksk, defpackage.ffh
    public final Object n() {
        mpf mpfVar = this.l;
        if (!mpfVar.F.M(64)) {
            return null;
        }
        b1();
        xqn xqnVar = new xqn();
        for (xci xciVar = (i4s) mpfVar.F.e; xciVar != null; xciVar = xciVar.e) {
            if ((xciVar.c & 64) != 0) {
                ?? r6 = 0;
                cw7 cw7Var = xciVar;
                while (cw7Var != 0) {
                    if (cw7Var instanceof a7k) {
                        xqnVar.a = ((a7k) cw7Var).n(mpfVar.y, xqnVar.a);
                    } else if ((cw7Var.c & 64) != 0 && (cw7Var instanceof cw7)) {
                        xci xciVar2 = cw7Var.p;
                        int i = 0;
                        cw7Var = cw7Var;
                        r6 = r6;
                        while (xciVar2 != null) {
                            if ((xciVar2.c & 64) != 0) {
                                i++;
                                r6 = r6;
                                if (i == 1) {
                                    cw7Var = xciVar2;
                                } else {
                                    if (r6 == 0) {
                                        r6 = new eqi(new xci[16]);
                                    }
                                    if (cw7Var != 0) {
                                        r6.d(cw7Var);
                                        cw7Var = 0;
                                    }
                                    r6.d(xciVar2);
                                }
                            }
                            xciVar2 = xciVar2.f;
                            cw7Var = cw7Var;
                            r6 = r6;
                        }
                        if (i == 1) {
                        }
                    }
                    cw7Var = bcx.p(r6);
                }
            }
        }
        return xqnVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [xci] */
    /* JADX WARN: Type inference failed for: r7v7, types: [xci] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [eqi] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void n1() {
        xci xciVar;
        boolean g = g8j.g(128);
        xci d1 = d1(g);
        if (d1 == null || (d1.a.d & 128) == 0) {
            return;
        }
        b2r G = wyf.G();
        Function1 e = G != null ? G.e() : null;
        b2r Q = wyf.Q(G);
        try {
            if (g) {
                xciVar = b1();
            } else {
                xciVar = b1().e;
                if (xciVar == null) {
                }
            }
            for (xci d12 = d1(g); d12 != null; d12 = d12.f) {
                if ((d12.d & 128) == 0) {
                    break;
                }
                if ((d12.c & 128) != 0) {
                    cw7 cw7Var = d12;
                    ?? r8 = 0;
                    while (cw7Var != 0) {
                        if (cw7Var instanceof qof) {
                            ((qof) cw7Var).j(this.c);
                        } else if ((cw7Var.c & 128) != 0 && (cw7Var instanceof cw7)) {
                            xci xciVar2 = cw7Var.p;
                            int i = 0;
                            cw7Var = cw7Var;
                            r8 = r8;
                            while (xciVar2 != null) {
                                if ((xciVar2.c & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        cw7Var = xciVar2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new eqi(new xci[16]);
                                        }
                                        if (cw7Var != 0) {
                                            r8.d(cw7Var);
                                            cw7Var = 0;
                                        }
                                        r8.d(xciVar2);
                                    }
                                }
                                xciVar2 = xciVar2.f;
                                cw7Var = cw7Var;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        cw7Var = bcx.p(r8);
                    }
                }
                if (d12 == xciVar) {
                    break;
                }
            }
        } finally {
            wyf.b0(G, Q, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void o1() {
        boolean g = g8j.g(128);
        xci b1 = b1();
        if (!g && (b1 = b1.e) == null) {
            return;
        }
        for (xci d1 = d1(g); d1 != null && (d1.d & 128) != 0; d1 = d1.f) {
            if ((d1.c & 128) != 0) {
                cw7 cw7Var = d1;
                ?? r5 = 0;
                while (cw7Var != 0) {
                    if (cw7Var instanceof qof) {
                        ((qof) cw7Var).R(this);
                    } else if ((cw7Var.c & 128) != 0 && (cw7Var instanceof cw7)) {
                        xci xciVar = cw7Var.p;
                        int i = 0;
                        cw7Var = cw7Var;
                        r5 = r5;
                        while (xciVar != null) {
                            if ((xciVar.c & 128) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    cw7Var = xciVar;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new eqi(new xci[16]);
                                    }
                                    if (cw7Var != 0) {
                                        r5.d(cw7Var);
                                        cw7Var = 0;
                                    }
                                    r5.d(xciVar);
                                }
                            }
                            xciVar = xciVar.f;
                            cw7Var = cw7Var;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    cw7Var = bcx.p(r5);
                }
            }
            if (d1 == b1) {
                return;
            }
        }
    }

    @Override // defpackage.ksk
    public abstract void p0(long j, float f, xod xodVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r2v20 */
    public final void p1(xci xciVar, b8j b8jVar, long j, gzd gzdVar, int i, boolean z, float f, boolean z2) {
        xci p;
        int i2;
        if (xciVar == null) {
            h1(b8jVar, j, gzdVar, i, z);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            cw7 cw7Var = xciVar;
            eqi eqiVar = null;
            while (true) {
                if (cw7Var == 0) {
                    break;
                }
                if (cw7Var instanceof ofm) {
                    long S = ((ofm) cw7Var).S();
                    int i4 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i4);
                    mpf mpfVar = this.l;
                    xof xofVar = mpfVar.z;
                    int i5 = vps.b;
                    long j2 = Long.MIN_VALUE & S;
                    if (intBitsToFloat >= (-((j2 == 0 || xofVar == xof.a) ? qcm.c(0, S) : qcm.c(2, S)))) {
                        if (Float.intBitsToFloat(i4) < a0() + ((j2 == 0 || mpfVar.z == xof.a) ? qcm.c(2, S) : qcm.c(0, S))) {
                            int i6 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i6) >= (-qcm.c(1, S))) {
                                if (Float.intBitsToFloat(i6) < qcm.c(3, S) + Z()) {
                                    d8j d8jVar = new d8j(this, xciVar, b8jVar, j, gzdVar, i3, z, f, z2);
                                    xoi xoiVar = gzdVar.b;
                                    gpi gpiVar = gzdVar.a;
                                    int i7 = gzdVar.c;
                                    int i8 = gpiVar.b;
                                    if (i7 == i8 - 1) {
                                        gzdVar.g(i7 + 1, i8);
                                        gzdVar.c++;
                                        gpiVar.a(xciVar);
                                        xoiVar.a(c3x.n(0.0f, z, true));
                                        d8jVar.invoke();
                                        gzdVar.c = i7;
                                        return;
                                    }
                                    long a = gzdVar.a();
                                    int i9 = gzdVar.c;
                                    if (!quj.W(a)) {
                                        if (quj.O(a) > 0.0f) {
                                            int i10 = gzdVar.c;
                                            gzdVar.g(i10 + 1, gpiVar.b);
                                            gzdVar.c++;
                                            gpiVar.a(xciVar);
                                            xoiVar.a(c3x.n(0.0f, z, true));
                                            d8jVar.invoke();
                                            gzdVar.c = i10;
                                            return;
                                        }
                                        return;
                                    }
                                    int i11 = gpiVar.b;
                                    int i12 = i11 - 1;
                                    gzdVar.c = i12;
                                    gzdVar.g(i11, gpiVar.b);
                                    gzdVar.c++;
                                    gpiVar.a(xciVar);
                                    xoiVar.a(c3x.n(0.0f, z, true));
                                    d8jVar.invoke();
                                    gzdVar.c = i12;
                                    if (quj.O(gzdVar.a()) < 0.0f) {
                                        gzdVar.g(i9 + 1, gzdVar.c + 1);
                                    }
                                    gzdVar.c = i9;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((cw7Var.c & 16) != 0 && (cw7Var instanceof cw7)) {
                        xci xciVar2 = cw7Var.p;
                        int i13 = 0;
                        p = cw7Var;
                        eqiVar = eqiVar;
                        while (xciVar2 != null) {
                            if ((xciVar2.c & 16) != 0) {
                                i13++;
                                eqiVar = eqiVar;
                                if (i13 == 1) {
                                    p = xciVar2;
                                } else {
                                    if (eqiVar == null) {
                                        eqiVar = new eqi(new xci[16]);
                                    }
                                    if (p != null) {
                                        eqiVar.d(p);
                                        p = null;
                                    }
                                    eqiVar.d(xciVar2);
                                }
                            }
                            xciVar2 = xciVar2.f;
                            p = p;
                            eqiVar = eqiVar;
                        }
                        if (i13 == 1) {
                            i3 = i;
                            cw7Var = p;
                            eqiVar = eqiVar;
                        }
                    }
                    p = bcx.p(eqiVar);
                    i3 = i;
                    cw7Var = p;
                    eqiVar = eqiVar;
                }
            }
        }
        if (z2) {
            f1(xciVar, b8jVar, j, gzdVar, i, z, f);
            return;
        }
        if (!b8jVar.l(xciVar)) {
            p1(rzf.s(xciVar, b8jVar.s()), b8jVar, j, gzdVar, i, z, f, false);
            return;
        }
        e8j e8jVar = new e8j(this, xciVar, b8jVar, j, gzdVar, i, z, f);
        xoi xoiVar2 = gzdVar.b;
        gpi gpiVar2 = gzdVar.a;
        int i14 = gzdVar.c;
        int i15 = gpiVar2.b;
        if (i14 != i15 - 1) {
            long a2 = gzdVar.a();
            int i16 = gzdVar.c;
            int i17 = gpiVar2.b;
            int i18 = i17 - 1;
            gzdVar.c = i18;
            gzdVar.g(i17, gpiVar2.b);
            gzdVar.c++;
            gpiVar2.a(xciVar);
            xoiVar2.a(c3x.n(f, z, false));
            e8jVar.invoke();
            gzdVar.c = i18;
            long a3 = gzdVar.a();
            if (gzdVar.c + 1 >= gpiVar2.b - 1 || quj.E(a2, a3) <= 0) {
                gzdVar.g(gzdVar.c + 1, gpiVar2.b);
            } else {
                int i19 = i16 + 1;
                boolean W = quj.W(a3);
                int i20 = gzdVar.c;
                gzdVar.g(i19, W ? i20 + 2 : i20 + 1);
            }
            gzdVar.c = i16;
            return;
        }
        int i21 = i14 + 1;
        gzdVar.g(i21, i15);
        gzdVar.c++;
        gpiVar2.a(xciVar);
        xoiVar2.a(c3x.n(f, z, false));
        e8jVar.invoke();
        gzdVar.c = i14;
        if (i21 == gpiVar2.b - 1 || quj.W(gzdVar.a())) {
            int i22 = gzdVar.c;
            int i23 = i22 + 1;
            gpiVar2.i(i23);
            if (i23 < 0 || i23 >= (i2 = xoiVar2.b)) {
                e7o.o("Index must be between 0 and size");
                return;
            }
            long[] jArr = xoiVar2.a;
            long j3 = jArr[i23];
            if (i23 != i2 - 1) {
                uz0.g(jArr, jArr, i23, i22 + 2, i2);
            }
            xoiVar2.b--;
        }
    }

    public abstract void q1(mu3 mu3Var, xod xodVar);

    public final void r1(long j, float f, Function1 function1, xod xodVar) {
        mpf mpfVar = this.l;
        if (xodVar != null) {
            if (function1 != null) {
                sme.a("both ways to create layers shouldn't be used together");
            }
            if (this.G != xodVar) {
                this.G = null;
                x1(false, null);
                this.G = xodVar;
            }
            if (this.F == null) {
                uzj a = ppf.a(mpfVar);
                Function2 Y0 = Y0();
                c8j c8jVar = this.D;
                tzj a2 = uzj.a(a, Y0, c8jVar, xodVar, false, 8);
                a2.f(this.c);
                a2.j(j);
                this.F = a2;
                mpfVar.J = true;
                c8jVar.invoke();
            }
        } else {
            if (this.G != null) {
                this.G = null;
                x1(false, null);
            }
            x1(false, function1);
        }
        if (!wpe.b(this.w, j)) {
            this.w = j;
            mpfVar.G.p.H0();
            tzj tzjVar = this.F;
            if (tzjVar != null) {
                tzjVar.j(j);
            } else {
                f8j f8jVar = this.n;
                if (f8jVar != null) {
                    f8jVar.i1();
                }
            }
            twg.N0(this);
            uzj uzjVar = mpfVar.n;
            if (uzjVar != null) {
                ((AndroidComposeView) uzjVar).z(mpfVar);
            }
        }
        this.x = f;
        if (this.h) {
            return;
        }
        E0(new msk(K0(), this));
    }

    public final void s1(spi spiVar, boolean z, boolean z2) {
        tzj tzjVar = this.F;
        if (tzjVar != null) {
            if (this.p) {
                if (z2) {
                    long a1 = a1();
                    float intBitsToFloat = Float.intBitsToFloat((int) (a1 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (a1 & 4294967295L)) / 2.0f;
                    long j = this.c;
                    spiVar.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j >> 32)) + intBitsToFloat, ((int) (j & 4294967295L)) + intBitsToFloat2);
                } else if (z) {
                    long j2 = this.c;
                    spiVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (spiVar.b()) {
                    return;
                }
            }
            tzjVar.b(spiVar, false);
        }
        long j3 = this.w;
        float f = (int) (j3 >> 32);
        spiVar.b += f;
        spiVar.d += f;
        float f2 = (int) (j3 & 4294967295L);
        spiVar.c += f2;
        spiVar.e += f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [xci] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [eqi] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [eqi] */
    public final void t1(lfh lfhVar) {
        f8j f8jVar;
        lfh lfhVar2 = this.u;
        if (lfhVar != lfhVar2) {
            this.u = lfhVar;
            mpf mpfVar = this.l;
            int i = 0;
            if (lfhVar2 == null || lfhVar.c() != lfhVar2.c() || lfhVar.a() != lfhVar2.a()) {
                int c = lfhVar.c();
                int a = lfhVar.a();
                tzj tzjVar = this.F;
                if (tzjVar != null) {
                    tzjVar.f((c << 32) | (a & 4294967295L));
                } else if (mpfVar.H() && (f8jVar = this.n) != null) {
                    f8jVar.i1();
                }
                t0((a & 4294967295L) | (c << 32));
                if (this.q != null) {
                    y1(false);
                }
                boolean g = g8j.g(4);
                xci b1 = b1();
                if (g || (b1 = b1.e) != null) {
                    for (xci d1 = d1(g); d1 != null && (d1.d & 4) != 0; d1 = d1.f) {
                        if ((d1.c & 4) != 0) {
                            cw7 cw7Var = d1;
                            ?? r9 = 0;
                            while (cw7Var != 0) {
                                if (cw7Var instanceof ipa) {
                                    ((ipa) cw7Var).b0();
                                } else if ((cw7Var.c & 4) != 0 && (cw7Var instanceof cw7)) {
                                    xci xciVar = cw7Var.p;
                                    int i2 = 0;
                                    cw7Var = cw7Var;
                                    r9 = r9;
                                    while (xciVar != null) {
                                        if ((xciVar.c & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                cw7Var = xciVar;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new eqi(new xci[16]);
                                                }
                                                if (cw7Var != 0) {
                                                    r9.d(cw7Var);
                                                    cw7Var = 0;
                                                }
                                                r9.d(xciVar);
                                            }
                                        }
                                        xciVar = xciVar.f;
                                        cw7Var = cw7Var;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cw7Var = bcx.p(r9);
                            }
                        }
                        if (d1 == b1) {
                            break;
                        }
                    }
                }
                uzj uzjVar = mpfVar.n;
                if (uzjVar != null) {
                    ((AndroidComposeView) uzjVar).z(mpfVar);
                }
            }
            cpi cpiVar = this.v;
            if ((cpiVar == null || cpiVar.e == 0) && lfhVar.b().isEmpty()) {
                return;
            }
            cpi cpiVar2 = this.v;
            Map b = lfhVar.b();
            if (cpiVar2 != null && cpiVar2.e == b.size()) {
                Object[] objArr = cpiVar2.b;
                int[] iArr = cpiVar2.c;
                long[] jArr = cpiVar2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) b.get((v2e) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            mpfVar.G.p.y.f();
            cpi cpiVar3 = this.v;
            if (cpiVar3 == null) {
                cpi cpiVar4 = uhj.a;
                cpiVar3 = new cpi();
                this.v = cpiVar3;
            }
            cpiVar3.a();
            for (Map.Entry entry : lfhVar.b().entrySet()) {
                cpiVar3.i(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // defpackage.wof
    public final long v(wof wofVar, long j) {
        return k1(wofVar, j);
    }

    public final void v1(f8j f8jVar, float[] fArr) {
        if (Intrinsics.d(f8jVar, this)) {
            return;
        }
        f8j f8jVar2 = this.n;
        f8jVar2.getClass();
        f8jVar2.v1(f8jVar, fArr);
        if (!wpe.b(this.w, 0L)) {
            float[] fArr2 = J;
            feh.d(fArr2);
            long j = this.w;
            feh.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            feh.e(fArr, fArr2);
        }
        tzj tzjVar = this.F;
        if (tzjVar != null) {
            tzjVar.i(fArr);
        }
    }

    public final void w1(f8j f8jVar, float[] fArr) {
        f8j f8jVar2 = this;
        while (!f8jVar2.equals(f8jVar)) {
            tzj tzjVar = f8jVar2.F;
            if (tzjVar != null) {
                tzjVar.a(fArr);
            }
            if (!wpe.b(f8jVar2.w, 0L)) {
                float[] fArr2 = J;
                feh.d(fArr2);
                feh.f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                feh.e(fArr, fArr2);
            }
            f8jVar2 = f8jVar2.n;
            f8jVar2.getClass();
        }
    }

    @Override // defpackage.wof
    public final long x(long j) {
        if (!b1().n) {
            sme.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return k1(ltg.D(this), ((AndroidComposeView) ppf.a(this.l)).H(j));
    }

    public final void x1(boolean z, Function1 function1) {
        uzj uzjVar;
        if (function1 != null && this.G != null) {
            sme.a("layerBlock can't be provided when explicitLayer is provided");
        }
        mpf mpfVar = this.l;
        boolean z2 = (!z && this.q == function1 && Intrinsics.d(this.r, mpfVar.y) && this.s == mpfVar.z) ? false : true;
        this.r = mpfVar.y;
        this.s = mpfVar.z;
        boolean G = mpfVar.G();
        c8j c8jVar = this.D;
        if (!G || function1 == null) {
            this.q = null;
            tzj tzjVar = this.F;
            if (tzjVar != null) {
                tzjVar.destroy();
                mpfVar.J = true;
                c8jVar.invoke();
                if (b1().n && mpfVar.H() && (uzjVar = mpfVar.n) != null) {
                    ((AndroidComposeView) uzjVar).z(mpfVar);
                }
            }
            this.F = null;
            this.E = false;
            return;
        }
        this.q = function1;
        if (this.F != null) {
            if (z2 && y1(true)) {
                ppf.a(mpfVar).getRectManager().e(mpfVar);
                return;
            }
            return;
        }
        tzj a = uzj.a(ppf.a(mpfVar), Y0(), c8jVar, null, mpfVar.g, 4);
        a.f(this.c);
        a.j(this.w);
        this.F = a;
        y1(true);
        mpfVar.J = true;
        c8jVar.invoke();
    }

    @Override // defpackage.wof
    public final ynn y(wof wofVar, boolean z) {
        if (!b1().n) {
            sme.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!wofVar.d()) {
            sme.b("LayoutCoordinates " + wofVar + " is not attached!");
        }
        f8j u1 = u1(wofVar);
        u1.m1();
        f8j W0 = W0(u1);
        spi spiVar = this.y;
        if (spiVar == null) {
            spiVar = new spi();
            this.y = spiVar;
        }
        spiVar.b = 0.0f;
        spiVar.c = 0.0f;
        spiVar.d = (int) (wofVar.j() >> 32);
        spiVar.e = (int) (wofVar.j() & 4294967295L);
        while (u1 != W0) {
            u1.s1(spiVar, z, false);
            if (spiVar.b()) {
                return ynn.e;
            }
            u1 = u1.n;
            u1.getClass();
        }
        P0(W0, spiVar, z);
        return new ynn(spiVar.b, spiVar.c, spiVar.d, spiVar.e);
    }

    public final boolean y1(boolean z) {
        uzj uzjVar;
        boolean z2 = false;
        if (this.G == null) {
            tzj tzjVar = this.F;
            Function1 function1 = this.q;
            if (tzjVar != null) {
                if (function1 == null) {
                    throw ouj.f("updateLayerParameters requires a non-null layerBlock");
                }
                zco zcoVar = H;
                zcoVar.k(1.0f);
                zcoVar.n(1.0f);
                zcoVar.a(1.0f);
                zcoVar.x(0.0f);
                zcoVar.y(0.0f);
                zcoVar.o(0.0f);
                long j = apd.a;
                zcoVar.b(j);
                zcoVar.t(j);
                zcoVar.j(0.0f);
                if (zcoVar.k != 8.0f) {
                    zcoVar.a |= 2048;
                    zcoVar.k = 8.0f;
                }
                zcoVar.v(a7t.b);
                zcoVar.r(vnj.i);
                zcoVar.c(false);
                zcoVar.h(null);
                zcoVar.d(0);
                zcoVar.p = 9205357640488583168L;
                zcoVar.t = null;
                zcoVar.a = 0;
                mpf mpfVar = this.l;
                zcoVar.q = mpfVar.y;
                zcoVar.r = mpfVar.z;
                zcoVar.p = nt0.Q(this.c);
                ppf.a(mpfVar).getSnapshotObserver().a(this, k9i.L, new ypb(26, function1));
                lof lofVar = this.z;
                if (lofVar == null) {
                    lofVar = new lof();
                    this.z = lofVar;
                }
                lof lofVar2 = I;
                lofVar2.getClass();
                lofVar2.a = lofVar.a;
                lofVar2.b = lofVar.b;
                lofVar2.c = lofVar.c;
                lofVar2.d = lofVar.d;
                lofVar2.e = lofVar.e;
                lofVar2.f = lofVar.f;
                lofVar2.g = lofVar.g;
                lofVar.a = zcoVar.b;
                lofVar.b = zcoVar.c;
                lofVar.c = zcoVar.e;
                lofVar.d = zcoVar.f;
                lofVar.e = zcoVar.j;
                lofVar.f = zcoVar.k;
                lofVar.g = zcoVar.l;
                tzjVar.c(zcoVar);
                boolean z3 = this.p;
                this.p = zcoVar.n;
                this.t = zcoVar.d;
                if (lofVar2.a == lofVar.a && lofVar2.b == lofVar.b && lofVar2.c == lofVar.c && lofVar2.d == lofVar.d && lofVar2.e == lofVar.e && lofVar2.f == lofVar.f && a7t.a(lofVar2.g, lofVar.g)) {
                    z2 = true;
                }
                boolean z4 = !z2;
                if (z && ((!z2 || z3 != this.p) && (uzjVar = mpfVar.n) != null)) {
                    ((AndroidComposeView) uzjVar).z(mpfVar);
                }
                return z4;
            }
            if (function1 != null) {
                sme.b("null layer with a non-null layerBlock");
                return false;
            }
        }
        return false;
    }

    public final boolean z1(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        tzj tzjVar = this.F;
        return tzjVar == null || !this.p || tzjVar.h(j);
    }

    @Override // defpackage.twg
    public final wof H0() {
        return this;
    }
}
