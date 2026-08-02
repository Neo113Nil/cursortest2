package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar;

import defpackage.aii0;
import defpackage.b3z0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.m4m0;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qje;
import defpackage.qke;
import defpackage.qrb1;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zvz0;
import defpackage.zy11;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(zvz0 zvz0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(957404504);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(zvz0Var) ? 4 : 2) | i;
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
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new TopAccentBarKt$TopAccentBar$2$1(tlsVar2, zvz0Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            ldc ldcVar = zvz0Var.b;
            f530 b = m4m0.b(ljs0.c(c530.a, 1.0f), ldcVar != null ? ldcVar.a : ldc.l, qke.q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            qrb1.c(zvz0Var.a, tlsVar, null, false, btsVar, i2 & 112, 12);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(zvz0Var, tlsVar, tlsVar2, i, 4);
        }
    }
}
