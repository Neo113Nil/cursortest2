package ru.yandex.taxi.masstransit.stop.ui.modal;

import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.a7y;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.d0;
import defpackage.dhj0;
import defpackage.did;
import defpackage.f440;
import defpackage.f530;
import defpackage.fid;
import defpackage.g140;
import defpackage.ger;
import defpackage.gya1;
import defpackage.kiu;
import defpackage.ku30;
import defpackage.lg6;
import defpackage.nc0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.q140;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.tls;
import defpackage.up2;
import defpackage.vg0;
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
    public static final void a(f530 f530Var, wg6 wg6Var, f440 f440Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        f440 f440Var2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1660787532);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= btsVar.k(wg6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(f440Var) : btsVar.e(f440Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 16384 : 8192;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            b a = a7y.a(0, 3, btsVar);
            int i4 = (i3 >> 3) & 14;
            int a2 = ger.a(wg6Var, 316.0f, true, btsVar, i4 | 432, 12);
            lg6 i5 = ru.yandex.taxi.masstransit.ui.a.i(wg6Var, a2, new up2(zp2.c), tlsVar, btsVar, i4 | HProv.ALG_CLASS_DATA_ENCRYPT | (i3 & 7168));
            int i6 = i3 & 112;
            int i7 = 57344 & i3;
            boolean c = (i6 == 32) | (i7 == 16384) | btsVar.c(a2);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                Q = new MtStopModalKt$MtStopModal$3$1(a2, wg6Var, tlsVar2, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            boolean z = i7 == 16384;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new kiu(28, tlsVar2);
                btsVar.o0(Q2);
            }
            gya1.d(false, (sls) Q2, btsVar, 0, 1);
            g140 g140Var = f440Var.a;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = f.j(Boolean.FALSE);
                btsVar.o0(Q3);
            }
            oz40 oz40Var = (oz40) Q3;
            boolean z2 = i7 == 16384;
            Object Q4 = btsVar.Q();
            if (z2 || Q4 == o430Var) {
                Q4 = new d0(tlsVar2, oz40Var, 7);
                btsVar.o0(Q4);
            }
            tls tlsVar3 = (tls) Q4;
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
            btsVar = btsVar;
            c.a(null, wg6Var, i5, false, false, null, null, wwg.S(520507844, true, new q140(tlsVar2, f440Var), btsVar), null, null, wwg.S(-1995617082, true, new vg0(f440Var, tlsVar3, a, g140Var, tlsVar2), btsVar), wwg.S(2102745842, true, new dhj0(g140Var, a, tlsVar2, 10), btsVar), btsVar, 12582912 | i6, 54, 889);
            f440Var2 = f440Var;
            ku30 ku30Var = f440Var2.d;
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var) {
                Q5 = new w01(17, oz40Var);
                btsVar.o0(Q5);
            }
            ru.yandex.taxi.masstransit.geopayment.purchase.b.b(ku30Var, booleanValue, tlsVar3, (sls) Q5, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            f440Var2 = f440Var;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(f530Var2, wg6Var, f440Var2, tlsVar, tlsVar2, i);
        }
    }
}
