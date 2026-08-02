package ru.yandex.taxi.masstransit.trains.schedule;

import com.google.ar.core.ImageMetadata;
import defpackage.a7y;
import defpackage.aii0;
import defpackage.an91;
import defpackage.ays0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.dx2;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnm0;
import defpackage.hex0;
import defpackage.i43;
import defpackage.k3r;
import defpackage.kyh0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m3u0;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.qy20;
import defpackage.r1b0;
import defpackage.rhi0;
import defpackage.s7u0;
import defpackage.sb01;
import defpackage.scx0;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.tb01;
import defpackage.tls;
import defpackage.tse0;
import defpackage.vfc;
import defpackage.vs9;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xm91;
import defpackage.yx40;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class h {
    public static final void a(tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-43886377);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            k3r k3rVar = ljs0.c;
            so5 so5Var = x4c.G;
            sic a = qic.a(lr20.c, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            fnm0.a((i2 << 6) & 896, btsVar, tlsVar, null, ohb1.e(btsVar, kyh0.mt_trains_sorting_icon_description));
            c530 c530Var = c530.a;
            f530 k = an91.k(ljs0.c(c530Var, 1.0f), 12.0f);
            sic a2 = qic.a(new i43(8.0f, true, new quz(11)), so5Var, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(-1370778187);
            int i3 = 0;
            while (i3 < 10) {
                com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 157.0f), cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
                i3++;
                c530Var = c530Var;
            }
            tse0.t(btsVar, false, true, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rhi0(i, 9, tlsVar);
        }
    }

    public static final void b(sb01 sb01Var, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        tls tlsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(596144341);
        int i2 = (btsVar.k(sb01Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = androidx.compose.runtime.f.j(Boolean.TRUE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar);
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = androidx.compose.runtime.f.g(0);
                btsVar.o0(Q2);
            }
            yx40 yx40Var = (yx40) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == obj) {
                Q3 = androidx.compose.runtime.f.d(new vs9(a, 21));
                btsVar.o0(Q3);
            }
            m3u0 m3u0Var = (m3u0) Q3;
            boolean k = btsVar.k(a);
            Object Q4 = btsVar.Q();
            if (k || Q4 == obj) {
                Q4 = new TrainSchedulesModalKt$SuccessStateContent$1$1(a, oz40Var, null);
                btsVar.o0(Q4);
            }
            zpn.e(btsVar, (wls) Q4, zy11.a);
            if (sb01Var.b.isEmpty()) {
                btsVar.e0(46991087);
                ru.yandex.taxi.masstransit.trains.schedule.uicomponents.a.a(btsVar, 0);
                btsVar.t(false);
                tlsVar3 = tlsVar;
            } else {
                btsVar.e0(47030519);
                tlsVar3 = tlsVar;
                ru.yandex.taxi.masstransit.trains.schedule.uicomponents.a.b(sb01Var.b, a, yx40Var.getIntValue(), null, tlsVar3, btsVar, (i2 << 9) & HProv.ALG_CLASS_ALL);
                btsVar.t(false);
            }
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            s7u0 s7u0Var = sb01Var.a;
            List list = sb01Var.c;
            boolean booleanValue2 = ((Boolean) m3u0Var.getValue()).booleanValue();
            Object Q5 = btsVar.Q();
            if (Q5 == obj) {
                Q5 = new dx2(yx40Var, 14);
                btsVar.o0(Q5);
            }
            tls tlsVar4 = tlsVar3;
            fnm0.b(booleanValue, s7u0Var, list, booleanValue2, xm91.b(c530.a, (tls) Q5), tlsVar4, btsVar, ((i2 << 12) & ImageMetadata.JPEG_GPS_COORDINATES) | HProv.ALG_CLASS_DATA_ENCRYPT);
            tlsVar2 = tlsVar4;
            btsVar = btsVar;
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hex0(sb01Var, tlsVar2, i, 19);
        }
    }

    public static final void c(tb01 tb01Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(669026793);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(tb01Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qy20.a(null, null, null, false, wwg.S(1671597195, true, new ays0(14, tb01Var, tlsVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(tb01Var, tlsVar, i, 6);
        }
    }
}
