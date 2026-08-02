package defpackage;

import android.view.View;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes6.dex */
public abstract class w791 {
    public static final void a(gbe gbeVar, ibe ibeVar, List list, fbe fbeVar, yur yurVar, sls slsVar, tls tlsVar, tls tlsVar2, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1276910694);
        int i2 = (btsVar.e(slsVar2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | i | (btsVar.k(gbeVar) ? 4 : 2) | (btsVar.k(ibeVar) ? 32 : 16) | (btsVar.k(list != null ? new hbe(list) : null) ? 256 : 128) | (btsVar.k(fbeVar) ? 2048 : 1024) | (btsVar.e(slsVar) ? 131072 : 65536) | (btsVar.e(tlsVar) ? 1048576 : 524288) | (btsVar.e(tlsVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar.V(i2 & 1, (38347923 & i2) != 38347922)) {
            f530 b = m4m0.b(ljs0.c, ((el51) btsVar.m(gl51.a)).c(), qke.q);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            if (gbeVar != null) {
                btsVar.e0(-1978889989);
                k0b1.c(gbeVar, btsVar, i2 & 14);
                btsVar.t(false);
            } else {
                btsVar.e0(-1978848666);
                btsVar.t(false);
            }
            if (ibeVar != null) {
                btsVar.e0(-1978796028);
                int i3 = i2 >> 15;
                si91.c(ibeVar, yurVar, tlsVar2, slsVar2, btsVar, ((i2 >> 3) & 14) | 48 | (i3 & 896) | (i3 & 7168));
                btsVar.t(false);
            } else {
                btsVar.e0(-1978517338);
                btsVar.t(false);
            }
            if (list != null) {
                btsVar.e0(-1978478278);
                if (1.0f <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                z9b1.c(((i2 >> 3) & 112) | ((i2 >> 12) & 896), btsVar, tlsVar, new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), list);
                btsVar.t(false);
            } else {
                btsVar.e0(-1978305112);
                if (1.0f <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                oeb1.c(btsVar, new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                btsVar.t(false);
            }
            if (fbeVar != null) {
                btsVar.e0(-1978199464);
                wpb1.b(fbeVar, slsVar, btsVar, ((i2 >> 9) & 14) | ((i2 >> 12) & 112));
                btsVar.t(false);
            } else {
                btsVar.e0(-1978063002);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new es8(gbeVar, ibeVar, list, fbeVar, yurVar, slsVar, tlsVar, tlsVar2, slsVar2, i);
        }
    }

    public static final int c(View view, View view2) {
        int i = 0;
        while (!jl40.l(view2, view) && view2 != null) {
            i += view2.getTop();
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        return i;
    }

    public static final String d(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).toString();
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (jl40.l(obj, Boolean.TRUE)) {
            return "yes";
        }
        if (jl40.l(obj, Boolean.FALSE)) {
            return "no";
        }
        if (obj == null) {
            return "null";
        }
        return null;
    }

    public abstract String b();
}
