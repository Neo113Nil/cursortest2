package defpackage;

import androidx.compose.ui.graphics.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class q4v {
    public static final f530 a = ljs0.m(c530.a, 24.0f);

    public static final void a(mgv mgvVar, String str, f530 f530Var, long j, fid fidVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            f530Var = c530.a;
        }
        b(ba91.c(mgvVar, fidVar), str, f530Var, j, fidVar, 8 | (i & 112), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x012b, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r7 & ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues.maxDWORD))) != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(pa90 pa90Var, String str, f530 f530Var, long j, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        f530 f530Var3;
        aii0 v;
        f530 f530Var4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1142959010);
        if ((i & 6) == 0) {
            i3 = (btsVar.e(pa90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.d(j) ? 2048 : 1024;
            }
            if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
                btsVar.Y();
                f530Var3 = f530Var2;
            } else {
                btsVar.a0();
                int i5 = i & 1;
                f530 f530Var5 = c530.a;
                if (i5 != 0 && !btsVar.C()) {
                    btsVar.Y();
                } else if (i4 != 0) {
                    f530Var2 = f530Var5;
                }
                f530Var3 = f530Var2;
                btsVar.u();
                boolean z = (((i3 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar.d(j)) || (i3 & HProv.ALG_TYPE_SECURECHANNEL) == 2048;
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (z || Q == o430Var) {
                    Q = ldc.c(j, ldc.m) ? null : new c36(j, 5);
                    btsVar.o0(Q);
                }
                wec wecVar = (wec) Q;
                if (str != null) {
                    btsVar.e0(609219782);
                    boolean z2 = (i3 & 112) == 32;
                    Object Q2 = btsVar.Q();
                    if (z2 || Q2 == o430Var) {
                        Q2 = new vsq(str, 11);
                        btsVar.o0(Q2);
                    }
                    f530Var4 = fnq0.b(f530Var5, false, (tls) Q2);
                    btsVar.t(false);
                } else {
                    btsVar.e0(609378564);
                    btsVar.t(false);
                    f530Var4 = f530Var5;
                }
                f530 d = d.d(f530Var3);
                if (!cjs0.a(pa90Var.i(), 9205357640488583168L)) {
                    long i6 = pa90Var.i();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (i6 >> 32)))) {
                    }
                    pi6.a(cma1.j0(d.k(f530Var5), pa90Var, null, mhe.b, 0.0f, wecVar, 22).k(f530Var4), btsVar, 0);
                }
                f530Var5 = a;
                pi6.a(cma1.j0(d.k(f530Var5), pa90Var, null, mhe.b, 0.0f, wecVar, 22).k(f530Var4), btsVar, 0);
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new o4v(pa90Var, str, f530Var3, j, i, i2, 1);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
