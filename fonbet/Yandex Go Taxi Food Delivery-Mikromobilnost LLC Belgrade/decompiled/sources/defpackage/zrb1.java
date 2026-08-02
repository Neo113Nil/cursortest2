package defpackage;

import android.view.View;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.Iterator;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class zrb1 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ibp0 ibp0Var, au2 au2Var, f530 f530Var, wp2 wp2Var, fid fidVar, int i, int i2) {
        ibp0 ibp0Var2;
        int i3;
        f530 f530Var2;
        int i4;
        int i5;
        wp2 wp2Var2;
        f530 f530Var3;
        wp2 wp2Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-708727602);
        if ((i & 6) == 0) {
            ibp0Var2 = ibp0Var;
            i3 = (btsVar.k(ibp0Var2) ? 4 : 2) | i;
        } else {
            ibp0Var2 = ibp0Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(au2Var) ? 32 : 16;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            i4 = i3 | HProv.ALG_TYPE_SECURECHANNEL;
            i5 = i2 & 8;
            if (i5 == 0) {
                i4 = i3 | 27648;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                wp2Var2 = wp2Var;
                i4 |= btsVar.k(wp2Var2) ? 16384 : 8192;
                if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
                    c530 c530Var = c530.a;
                    if (i6 != 0) {
                        f530Var2 = c530Var;
                    }
                    if (i5 != 0) {
                        wp2Var2 = tp2.a;
                    }
                    wp2 wp2Var4 = wp2Var2;
                    int i7 = i4 >> 3;
                    SlotSize c = ibp0Var2.c();
                    f530 k = an91.k(ljs0.a(f530Var2, c == SlotSize.XS ? 44.0f : 56.0f, c.getSize()), 2.0f);
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, k);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d2);
                    sya1.a(au2Var, ma01.a[c.ordinal()] == 1 ? an91.o(c530Var, 10.0f, 0.0f, 2.0f, 0.0f, 10) : an91.m(c530Var, 10.0f, 0.0f, 2), null, wp2Var4, btsVar, i7 & 8078, 0);
                    btsVar.t(true);
                    f530Var3 = f530Var2;
                    wp2Var3 = wp2Var4;
                } else {
                    btsVar.Y();
                    f530Var3 = f530Var2;
                    wp2Var3 = wp2Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new q8y(ibp0Var, au2Var, f530Var3, wp2Var3, i, i2, 1);
                    return;
                }
                return;
            }
            wp2Var2 = wp2Var;
            if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i3 | HProv.ALG_TYPE_SECURECHANNEL;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        wp2Var2 = wp2Var;
        if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final int b(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) >= 0.5f ? i | 2 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r0 > r11) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (r10 > r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r10 < r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r0 < r11) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long c(int i, int i2, long j, int[] iArr) {
        float f;
        float intBitsToFloat;
        float f2;
        float intBitsToFloat2;
        float intBitsToFloat3 = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j >> 32)) - (i * (-1.0f));
        float intBitsToFloat4 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - (i2 * (-1.0f));
        int i3 = (int) (j >> 32);
        if (Float.intBitsToFloat(i3) >= 0.0f) {
            f = (iArr[0] * (-1.0f)) + intBitsToFloat3;
            intBitsToFloat = Float.intBitsToFloat(i3);
        } else {
            f = (iArr[0] * (-1.0f)) + intBitsToFloat3;
            intBitsToFloat = Float.intBitsToFloat(i3);
        }
        int i4 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (Float.intBitsToFloat(i4) >= 0.0f) {
            f2 = (iArr[1] * (-1.0f)) + intBitsToFloat4;
            intBitsToFloat2 = Float.intBitsToFloat(i4);
        } else {
            f2 = (iArr[1] * (-1.0f)) + intBitsToFloat4;
            intBitsToFloat2 = Float.intBitsToFloat(i4);
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public static final int d(float f) {
        return m810.b(f) * (-1);
    }

    public static final void e(fse fseVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = nse.a.iterator();
        while (it.hasNext()) {
            try {
                ((mse) it.next()).handleException(fseVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    ljo.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                try {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
                } catch (Throwable unused) {
                }
            }
        }
        try {
            ljo.a(th, new DiagnosticCoroutineContextException(fseVar));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    public static final kn50 f(fid fidVar) {
        View view = (View) ((bts) fidVar).m(AndroidCompositionLocals_androidKt.f);
        bts btsVar = (bts) fidVar;
        xp31 xp31Var = (xp31) btsVar.m(j.t);
        boolean k = btsVar.k(view) | btsVar.k(xp31Var);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            xp31Var.g();
            Q = new kn50(view);
            btsVar.o0(Q);
        }
        return (kn50) Q;
    }
}
