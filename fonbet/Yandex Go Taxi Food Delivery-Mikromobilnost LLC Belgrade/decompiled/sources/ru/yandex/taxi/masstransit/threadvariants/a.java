package ru.yandex.taxi.masstransit.threadvariants;

import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.a7y;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c3z;
import defpackage.c530;
import defpackage.cma1;
import defpackage.czy0;
import defpackage.d0;
import defpackage.dhj0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.ger;
import defpackage.ku30;
import defpackage.lg6;
import defpackage.nc0;
import defpackage.nfj;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qab1;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.r5y;
import defpackage.s140;
import defpackage.sls;
import defpackage.tls;
import defpackage.up2;
import defpackage.w01;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zp2;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.threads.ThreadsCardMode;

/* loaded from: classes6.dex */
public abstract class a {
    public static final void a(czy0 czy0Var, ThreadsCardMode threadsCardMode, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        sls slsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1454721859);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(czy0Var) : btsVar.e(czy0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.c(threadsCardMode.ordinal()) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(tlsVar2) ? 16384 : 8192;
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (z || Q == obj) {
                Q = new s140(6, tlsVar);
                btsVar.o0(Q);
            }
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, (sls) Q, null, null, null, btsVar, 48, 0, 7677);
            ThreadsCardMode threadsCardMode2 = ThreadsCardMode.FULL_HEIGHT;
            wp2 up2Var = threadsCardMode == threadsCardMode2 ? AppColor$Palette.Fog : new up2(zp2.d);
            if (threadsCardMode == threadsCardMode2) {
                btsVar.e0(-2123316892);
                slsVar = (sls) btsVar.m(c3z.a);
                btsVar.t(false);
            } else {
                btsVar.e0(-1398301408);
                btsVar.t(false);
                slsVar = null;
            }
            lg6 c = qab1.c(a, up2Var, slsVar, btsVar, 0, 0);
            androidx.compose.foundation.lazy.b a2 = a7y.a(0, 3, btsVar);
            fwi fwiVar = (fwi) btsVar.m(j.h);
            ger.a(a, 316.0f, threadsCardMode == ThreadsCardMode.COLLAPSED, btsVar, 48, 12);
            boolean k = ((i3 & HProv.ALG_CLASS_ALL) == 16384) | btsVar.k(fwiVar);
            Object Q2 = btsVar.Q();
            if (k || Q2 == obj) {
                Q2 = new MtThreadVariantsModalKt$MtThreadVariantsModal$3$1(fwiVar, tlsVar2, 316.0f, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, zy11.a);
            Object Q3 = btsVar.Q();
            if (Q3 == obj) {
                Q3 = f.j(Boolean.FALSE);
                btsVar.o0(Q3);
            }
            oz40 oz40Var = (oz40) Q3;
            boolean z2 = i4 == 2048;
            Object Q4 = btsVar.Q();
            if (z2 || Q4 == obj) {
                Q4 = new d0(tlsVar, oz40Var, 10);
                btsVar.o0(Q4);
            }
            tls tlsVar3 = (tls) Q4;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            c.a(null, a, c, false, false, null, null, wwg.S(-1288075467, true, new nfj(tlsVar, 29, czy0Var), btsVar), null, null, wwg.S(535415607, true, new r5y(czy0Var, a2, tlsVar3, tlsVar, 6), btsVar), wwg.S(-798220445, true, new dhj0(czy0Var, a2, tlsVar, 11), btsVar), btsVar, 12582912, 54, 889);
            ku30 ku30Var = czy0Var.d;
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            Object Q5 = btsVar.Q();
            if (Q5 == obj) {
                Q5 = new w01(20, oz40Var);
                btsVar.o0(Q5);
            }
            ru.yandex.taxi.masstransit.geopayment.purchase.b.b(ku30Var, booleanValue, tlsVar3, (sls) Q5, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
            btsVar = btsVar;
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(czy0Var, threadsCardMode, f530Var2, tlsVar, tlsVar2, i);
        }
    }
}
