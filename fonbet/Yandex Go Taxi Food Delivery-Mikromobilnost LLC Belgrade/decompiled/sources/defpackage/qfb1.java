package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes11.dex */
public abstract class qfb1 {
    public static final void a(v0z v0zVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1949028161);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(v0zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            osv d = z5b1.d(z5b1.g(null, btsVar2, 1), 0.0f, 360.0f, sb2.w(sb2.K(800, 0, ubn.d, 2), null, 0L, 6), null, btsVar2, 4536, 8);
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, d2);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d3);
            int i3 = pzg0.ic_loading_spinner;
            ldc ldcVar = v0zVar.c;
            s3b1.f(new cuj0(i3, null, null, ldcVar != null ? new zez0(ldcVar.a) : null, 22), ira1.i(cj6.a.a(c530Var, x4c.y), ((Number) d.w.getValue()).floatValue()), null, btsVar2, 0, 4);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(v0zVar, i, 23);
        }
    }

    public static final String b(hau0 hau0Var) {
        if (hau0Var instanceof x9u0) {
            return "submitted";
        }
        if (hau0Var.equals(z9u0.a)) {
            return "cvv_input";
        }
        if (hau0Var.equals(bau0.a)) {
            return "date_input";
        }
        if (hau0Var.equals(dau0.a)) {
            return "card_number_input";
        }
        w511.b();
        return null;
    }
}
