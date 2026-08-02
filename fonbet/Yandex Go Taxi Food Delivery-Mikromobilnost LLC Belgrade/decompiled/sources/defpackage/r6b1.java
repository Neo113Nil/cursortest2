package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import java.math.BigInteger;

/* loaded from: classes11.dex */
public abstract class r6b1 {
    public static final void a(aif0 aif0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1227448338);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(aif0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 e = ljs0.e(ljs0.c(c530.a, 1.0f), 6.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, e);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            long f = ((el51) btsVar.m(gl51.a)).f();
            float w0 = ((fwi) btsVar.m(j.h)).w0(10.0f);
            boolean b = btsVar.b(w0) | btsVar.d(f) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (b || Q == did.a) {
                Q = new m8p(w0, f, aif0Var);
                btsVar.o0(Q);
            }
            androidx.compose.ui.viewinterop.b.a((tls) Q, null, null, btsVar, 0, 6);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(aif0Var, i, 6);
        }
    }

    public static f530 b(f530 f530Var, boolean z, txv txvVar, float f, int i) {
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        return !z ? f530Var : bb1.h(f530Var, new uxv(txvVar, f));
    }

    public static final txv c(fid fidVar) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (Q == did.a) {
            Q = new txv();
            btsVar.o0(Q);
        }
        txv txvVar = (txv) Q;
        txvVar.g.f(((ry2) btsVar.m(uy2.a)).b ? rzo.d(218103808) : rzo.d(1291845632));
        return txvVar;
    }

    public static byte[] d(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        ny61.g("n must not be negative");
        return null;
    }
}
