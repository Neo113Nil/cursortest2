package defpackage;

import androidx.compose.runtime.internal.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes5.dex */
public abstract class wf91 {
    public static final byte[] a = {10, -28, -41, -84, -122, Alerts.alert_certificate_expired, -117, -19};
    public static final byte[] b = {104, -123, -71, -57, -39, 68, -17};

    public static final void a(mej mejVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1142865190);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(mejVar) : btsVar.e(mejVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            wx20.a(null, null, null, null, null, false, false, wwg.S(-1205184054, true, new mjf(17, mejVar, tlsVar), btsVar), btsVar, 12582912, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(mejVar, tlsVar, i, 11);
        }
    }

    public static final void b(jg31 jg31Var, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-996730342);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(jg31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            s3b1.a(jg31Var.d, ymb1.l(an91.j(ljs0.u(ljs0.c(c530.a, 1.0f), null, 3), jg31Var.f), cyk0.c(jg31Var.e)), jg31Var.i, wwg.S(523679983, true, new ays0(22, jg31Var, aVar), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(jg31Var, aVar, i, i3);
        }
    }
}
