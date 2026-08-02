package ru.yandex.taxi.masstransit.ui.schedule;

import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.a7y;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cms;
import defpackage.d0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.ger;
import defpackage.ku30;
import defpackage.l0;
import defpackage.lg6;
import defpackage.nfj;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qab1;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.r5y;
import defpackage.sls;
import defpackage.squ;
import defpackage.tls;
import defpackage.u540;
import defpackage.up2;
import defpackage.w01;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zp2;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class a {
    public static final void a(u540 u540Var, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(385331727);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(u540Var) : btsVar.e(u540Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            wg6 a = b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 432, 0, 8185);
            lg6 c = qab1.c(a, new up2(zp2.d), null, btsVar, 384, 0);
            androidx.compose.foundation.lazy.b a2 = a7y.a(0, 3, btsVar);
            fwi fwiVar = (fwi) btsVar.m(j.h);
            ger.a(a, 316.0f, true, btsVar, 432, 12);
            boolean k = ((i3 & 7168) == 2048) | btsVar.k(fwiVar);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (k || Q == obj) {
                Q = new MtThreadScheduleModalKt$MtThreadScheduleModal$3$1(fwiVar, tlsVar2, 316.0f, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = f.j(Boolean.FALSE);
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            boolean z = (i3 & 896) == 256;
            Object Q3 = btsVar.Q();
            if (z || Q3 == obj) {
                Q3 = new d0(tlsVar, oz40Var, 9);
                btsVar.o0(Q3);
            }
            tls tlsVar3 = (tls) Q3;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
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
            c.a(null, a, c, false, false, null, null, wwg.S(1450473607, true, new nfj(tlsVar, 28, u540Var), btsVar), null, null, wwg.S(578367369, true, new r5y(u540Var, a2, tlsVar3, tlsVar, 5), btsVar), wwg.S(-1374198347, true, new l0(21, u540Var, a2), btsVar), btsVar, 12582912, 54, 889);
            ku30 ku30Var = u540Var.d;
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            Object Q4 = btsVar.Q();
            if (Q4 == obj) {
                Q4 = new w01(19, oz40Var);
                btsVar.o0(Q4);
            }
            ru.yandex.taxi.masstransit.geopayment.purchase.b.b(ku30Var, booleanValue, tlsVar3, (sls) Q4, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
            btsVar = btsVar;
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ((Object) u540Var, f530Var2, (Object) tlsVar, (cms) tlsVar2, i, 15);
        }
    }
}
