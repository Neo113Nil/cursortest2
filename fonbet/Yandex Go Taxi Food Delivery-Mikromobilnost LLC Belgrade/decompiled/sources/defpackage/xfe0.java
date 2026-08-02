package defpackage;

import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.icon.b;

/* loaded from: classes5.dex */
public abstract class xfe0 {
    public static final long a = rzo.d(436207616);

    public static final void a(String str, fid fidVar, int i) {
        aii0 v;
        fzv fzvVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-97374806);
        int i2 = (btsVar.k(str) ? 4 : 2) | i;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (str == null) {
                v = btsVar.v();
                if (v != null) {
                    fzvVar = new fzv(str, i, 18);
                    v.d = fzvVar;
                }
                return;
            }
            b b = ua3.b(str, null, null, btsVar, 14);
            f530 l = ymb1.l(ljs0.m(c530.a, 40.0f), cyk0.c(12.0f));
            if (b.k() instanceof sa3) {
                xa6 a2 = eab1.a(0.5f, a);
                l = aab1.b(l, a2.a, a2.b, cyk0.c(12.0f));
            }
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, l);
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
            o4b1.b(b, null, null, null, null, 0.0f, null, btsVar, 48, HProv.PP_SAME_MEDIA);
            if (b.k() instanceof ra3) {
                btsVar.e0(-456316618);
                ocb1.c(ljs0.c, 0.0f, 0L, 0L, null, 0, null, btsVar, 6, HProv.PP_DELETE_SAVED_PASSWD);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(-456247426);
                btsVar.t(false);
            }
            btsVar.t(true);
        }
        v = btsVar.v();
        if (v != null) {
            fzvVar = new fzv(str, i, 19);
            v.d = fzvVar;
        }
    }
}
