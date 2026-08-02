package defpackage;

import android.graphics.Paint;
import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public interface qam extends fwi {
    static /* synthetic */ void K(qam qamVar, long j, long j2, long j3, jvu0 jvu0Var, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        qamVar.k(j, j2, j3, (i & 16) != 0 ? i3r.a : jvu0Var);
    }

    static /* synthetic */ void M(qam qamVar, zfr0 zfr0Var, float f, float f2, long j, long j2, jvu0 jvu0Var, int i) {
        long j3 = (i & 16) != 0 ? 0L : j;
        qamVar.s(zfr0Var, f, f2, j3, (i & 32) != 0 ? r0(qamVar.c(), j3) : j2, jvu0Var);
    }

    static void S(qam qamVar, l8v l8vVar, long j, long j2, long j3, float f, wec wecVar, int i, int i2) {
        long j4;
        if ((i2 & 4) != 0) {
            u92 u92Var = (u92) l8vVar;
            j4 = (u92Var.c() << 32) | (u92Var.b() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        } else {
            j4 = j;
        }
        qamVar.C(l8vVar, 0L, j4, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? j4 : j3, (i2 & 32) != 0 ? 1.0f : f, (i2 & 128) != 0 ? null : wecVar, (i2 & 256) != 0 ? 3 : 6, (i2 & 512) != 0 ? 1 : i);
    }

    static /* synthetic */ void Y(qam qamVar, rq90 rq90Var, long j, ram ramVar, int i) {
        if ((i & 8) != 0) {
            ramVar = i3r.a;
        }
        qamVar.a0(rq90Var, j, ramVar);
    }

    static /* synthetic */ void g0(qam qamVar, long j, long j2, long j3, long j4, ram ramVar, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        qamVar.L(j, j5, (i & 4) != 0 ? r0(qamVar.c(), j5) : j3, j4, (i & 16) != 0 ? i3r.a : ramVar, (i & 128) != 0 ? 3 : 0);
    }

    static /* synthetic */ void j0(qam qamVar, ml6 ml6Var, long j, long j2, long j3, ram ramVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        qamVar.v0(ml6Var, j4, (i & 4) != 0 ? r0(qamVar.c(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? i3r.a : ramVar);
    }

    static /* synthetic */ void p(qam qamVar, rq90 rq90Var, ml6 ml6Var, float f, jvu0 jvu0Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        ram ramVar = jvu0Var;
        if ((i & 8) != 0) {
            ramVar = i3r.a;
        }
        qamVar.q0(rq90Var, ml6Var, f2, ramVar, (i & 32) != 0 ? 3 : 0);
    }

    static void p0(c1y c1yVar, ml6 ml6Var, long j, long j2, float f, float f2, int i) {
        if ((i & 64) != 0) {
            f2 = 1.0f;
        }
        k28 k28Var = c1yVar.a;
        i28 i28Var = k28Var.a.c;
        eb2 eb2Var = k28Var.w;
        if (eb2Var == null) {
            eb2Var = new eb2();
            eb2Var.n(1);
            k28Var.w = eb2Var;
        }
        Paint paint = eb2Var.a;
        if (ml6Var != null) {
            ml6Var.a(f2, k28Var.c(), eb2Var);
        } else if (paint.getAlpha() / 255.0f != f2) {
            eb2Var.c(f2);
        }
        if (!jl40.l(eb2Var.d, null)) {
            eb2Var.g(null);
        }
        if (eb2Var.b != 3) {
            eb2Var.e(3);
        }
        if (paint.getStrokeWidth() != f) {
            eb2Var.m(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (!xhb1.d(eb2Var.a(), 0)) {
            eb2Var.k(0);
        }
        if (!zhb1.c(eb2Var.b(), 0)) {
            eb2Var.l(0);
        }
        if (!jl40.l(eb2Var.e, null)) {
            eb2Var.i(null);
        }
        if (!paint.isFilterBitmap()) {
            eb2Var.h(1);
        }
        i28Var.d(j, j2, eb2Var);
    }

    static long r0(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    static /* synthetic */ void t(qam qamVar, ml6 ml6Var, long j, long j2, float f, ram ramVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        qamVar.c0(ml6Var, j3, (i2 & 4) != 0 ? r0(qamVar.c(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? i3r.a : ramVar, (i2 & 64) != 0 ? 3 : i);
    }

    static /* synthetic */ void t0(qam qamVar, long j, long j2, long j3, float f, wec wecVar, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        qamVar.B0(j, j4, (i & 4) != 0 ? r0(qamVar.c(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 32) != 0 ? null : wecVar, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void z(qam qamVar, long j, float f, long j2, float f2, jvu0 jvu0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            f = cjs0.c(qamVar.c()) / 2.0f;
        }
        float f3 = f;
        if ((i2 & 4) != 0) {
            j2 = qamVar.P();
        }
        qamVar.J(j, f3, j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? i3r.a : jvu0Var, (i2 & 64) != 0 ? 3 : i);
    }

    void B0(long j, long j2, long j3, float f, wec wecVar, int i);

    void C(l8v l8vVar, long j, long j2, long j3, long j4, float f, wec wecVar, int i, int i2);

    void F(long j, float f, float f2, boolean z, long j2, long j3, ram ramVar, int i);

    void J(long j, float f, long j2, float f2, ram ramVar, int i);

    void L(long j, long j2, long j3, long j4, ram ramVar, int i);

    nfh N();

    default long P() {
        return cma1.Q(N().v());
    }

    void a0(rq90 rq90Var, long j, ram ramVar);

    default long c() {
        return N().v();
    }

    void c0(ml6 ml6Var, long j, long j2, float f, ram ramVar, int i);

    LayoutDirection getLayoutDirection();

    void h(long j, long j2, long j3, float f, int i, kb2 kb2Var);

    void k(long j, long j2, long j3, ram ramVar);

    void q0(rq90 rq90Var, ml6 ml6Var, float f, ram ramVar, int i);

    void r(ml6 ml6Var, long j, float f);

    void s(zfr0 zfr0Var, float f, float f2, long j, long j2, jvu0 jvu0Var);

    void v0(ml6 ml6Var, long j, long j2, long j3, float f, ram ramVar);
}
