package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.notification;

import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.ivy;
import defpackage.jl40;
import defpackage.ldc;
import defpackage.m4m0;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qje;
import defpackage.qm51;
import defpackage.r1b0;
import defpackage.sk60;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xdb1;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(sk60 sk60Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2014223130);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(sk60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new NotificationKt$NotificationWidget$1$1(tlsVar, sk60Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            f530 m = an91.m(c530.a, 16.0f, 0.0f, 2);
            ldc ldcVar = sk60Var.d;
            f530 b = m4m0.b(m, ldcVar != null ? ldcVar.a : ldc.l, ((YandexShapes) btsVar.m(qm51.a)).b());
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, b);
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
            xdb1.a(null, sk60Var.c, tlsVar, tlsVar2, false, null, btsVar, (i2 << 3) & 8064, 49);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(sk60Var, tlsVar, tlsVar2, i, 19);
        }
    }
}
