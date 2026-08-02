package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes12.dex */
public abstract class sib1 {
    public static final void a(ola olaVar, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(327591368);
        int i2 = i | (btsVar.k(olaVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | 384;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 u = pw91.u(ljs0.c(c530Var, 1.0f), pw91.o(btsVar), 14);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, u);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i3 = mga.a[olaVar.a.ordinal()];
            if (i3 == 1) {
                btsVar.e0(-1260166531);
                yib1.a(olaVar, null, btsVar, i2 & 14);
                btsVar.t(false);
            } else if (i3 != 2) {
                btsVar.e0(-1841755742);
                btsVar.t(false);
            } else {
                btsVar.e0(-1260049816);
                boolean z = (i2 & 112) == 32;
                Object Q = btsVar.Q();
                if (z || Q == did.a) {
                    Q = new dv9(13, tlsVar);
                    btsVar.o0(Q);
                }
                vib1.a(olaVar, (tls) Q, null, btsVar, i2 & 14);
                btsVar.t(false);
            }
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(olaVar, tlsVar, f530Var2, i, 1);
        }
    }

    public static final String b(oeu oeuVar) {
        if (oeuVar != null) {
            return oeuVar.a("X-YaMasstransitRequestId");
        }
        return null;
    }

    public static final nsv0 c(String str, String str2) {
        h1p r;
        if (str == null || (r = gwk0.r(str)) == null) {
            return null;
        }
        return new nsv0(r, str2);
    }
}
