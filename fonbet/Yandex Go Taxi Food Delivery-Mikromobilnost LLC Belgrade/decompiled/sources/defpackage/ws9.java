package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes12.dex */
public abstract class ws9 {
    public static final byk0 a = cyk0.c(24.0f);

    public static final void a(fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2001523172);
        boolean z2 = false;
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            float f = 16.0f;
            f530 k = an91.k(ljs0.c(c530Var, 1.0f), 16.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(-2084125586);
            int i2 = 1;
            while (i2 < 10) {
                oeb1.c(btsVar, ljs0.e(c530Var, 20.0f));
                int i3 = i2;
                com.yandex.go.design.compose.loading.b.a(ljs0.c(ljs0.e(c530Var, f), 0.9f), a, false, null, null, null, false, btsVar, 54, 252);
                oeb1.c(btsVar, ljs0.e(c530Var, 20.0f));
                if (i3 == 1 || i3 == 9) {
                    z = false;
                    btsVar.e0(-183062936);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-183093688);
                    z = false;
                    yrl.b(0, 7, btsVar, null);
                    btsVar.t(false);
                }
                i2 = i3 + 1;
                z2 = z;
                f = 16.0f;
            }
            btsVar.t(z2);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mq5(i, 17);
        }
    }
}
