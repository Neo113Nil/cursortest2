package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class xpv0 {
    public static final void a(zpv0 zpv0Var, m3u0 m3u0Var, tls tlsVar, f530 f530Var, zls zlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        oz40 oz40Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1143073243);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(zpv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(m3u0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i3 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(zlsVar) ? 16384 : 8192;
        }
        int i4 = i3;
        if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.f(0.0f);
                btsVar.o0(Q);
            }
            tx40 tx40Var = (tx40) Q;
            oz40 n = f.n(t1a1.a, btsVar);
            oz40 n2 = f.n(zpv0Var, btsVar);
            int i5 = i4 & 896;
            boolean z = i5 == 256;
            Object Q2 = btsVar.Q();
            if (z || Q2 == obj) {
                Q2 = new uwl0(20, tlsVar);
                btsVar.o0(Q2);
            }
            zpn.a(zy11.a, (tls) Q2, btsVar);
            boolean k = ((i4 & 112) == 32) | btsVar.k(n) | btsVar.k(n2) | (i5 == 256);
            Object Q3 = btsVar.Q();
            if (k || Q3 == obj) {
                oz40Var = n;
                Object vg0Var = new vg0((Object) oz40Var, (Object) n2, (Object) m3u0Var, (Object) tx40Var, tlsVar, 15);
                btsVar.o0(vg0Var);
                Q3 = vg0Var;
            } else {
                oz40Var = n;
            }
            c530 c530Var = c530.a;
            f530 F = kp50.F(c530Var, (zls) Q3);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, F);
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
            Object Q4 = btsVar.Q();
            if (Q4 == obj) {
                Q4 = new nvz0(tx40Var, oz40Var, zpv0Var.c);
                btsVar.o0(Q4);
            }
            zlsVar.invoke((nvz0) Q4, btsVar, Integer.valueOf(((i4 >> 9) & 112) | 6));
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0(zpv0Var, m3u0Var, tlsVar, f530Var2, zlsVar, i, 6);
        }
    }
}
