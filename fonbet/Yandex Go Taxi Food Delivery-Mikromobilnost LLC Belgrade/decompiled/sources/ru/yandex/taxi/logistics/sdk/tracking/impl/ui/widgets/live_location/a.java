package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location;

import defpackage.aii0;
import defpackage.an91;
import defpackage.bgc;
import defpackage.bns;
import defpackage.bts;
import defpackage.c530;
import defpackage.ctq;
import defpackage.d8d;
import defpackage.did;
import defpackage.etm;
import defpackage.fid;
import defpackage.ivy;
import defpackage.ljs0;
import defpackage.o430;
import defpackage.qm51;
import defpackage.s0v;
import defpackage.sls;
import defpackage.svy;
import defpackage.tls;
import defpackage.unr0;
import defpackage.web1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.xg0;
import defpackage.xvy;
import defpackage.yvy;
import defpackage.zpn;
import defpackage.zvy;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(svy svyVar, sls slsVar, tls tlsVar, sls slsVar2, sls slsVar3, fid fidVar, int i, int i2) {
        int i3;
        zvy zvyVar = svyVar.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2056269316);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(svyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(slsVar2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(slsVar3) ? 16384 : 8192;
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            o430 o430Var = did.a;
            if (i4 != 0) {
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = new bgc(12);
                    btsVar.o0(Q);
                }
                slsVar2 = (sls) Q;
            }
            if (i5 != 0) {
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new bgc(12);
                    btsVar.o0(Q2);
                }
                slsVar3 = (sls) Q2;
            }
            if (zvyVar instanceof xvy) {
                btsVar.e0(389866092);
                b((xvy) zvyVar, slsVar, slsVar2, btsVar, ((i3 >> 3) & 896) | (i3 & 112));
                btsVar.t(false);
            } else {
                if (!(zvyVar instanceof yvy)) {
                    throw unr0.y(389863399, btsVar, false);
                }
                btsVar.e0(389873840);
                c((yvy) zvyVar, tlsVar, slsVar3, btsVar, ((i3 >> 6) & 896) | ((i3 >> 3) & 112));
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        sls slsVar4 = slsVar2;
        sls slsVar5 = slsVar3;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xg0(svyVar, slsVar, tlsVar, slsVar4, slsVar5, i, i2);
        }
    }

    public static final void b(xvy xvyVar, sls slsVar, sls slsVar2, fid fidVar, int i) {
        int i2;
        sls slsVar3;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-745640240);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(xvyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            slsVar3 = slsVar;
            i2 |= btsVar2.e(slsVar3) ? 32 : 16;
        } else {
            slsVar3 = slsVar;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(slsVar2) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new LiveLocationKt$LiveLocationButton$1$1(slsVar2, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(slsVar3, ljs0.e(ljs0.c(an91.k(c530.a, 16.0f), 1.0f), 56.0f), ((YandexShapes) btsVar2.m(qm51.a)).b(), 0L, 0L, null, false, null, null, null, wwg.S(1458584313, true, new ctq(19, xvyVar), btsVar2), btsVar, (i2 >> 3) & 14, 4088);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(xvyVar, slsVar, slsVar2, i, 0);
        }
    }

    public static final void c(yvy yvyVar, tls tlsVar, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1126787217);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(yvyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(slsVar) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new LiveLocationKt$LiveLocationToggle$1$1(slsVar, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            d8d.a.getClass();
            btsVar = btsVar2;
            web1.c(null, 0.0f, false, 0.0f, null, d8d.b, wwg.S(-1761774035, true, new bns(19, yvyVar), btsVar2), null, null, wwg.S(510992906, true, new s0v(12, yvyVar, tlsVar), btsVar2), null, null, false, btsVar, 807075840, 0, 7583);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(yvyVar, tlsVar, slsVar, i, 29);
        }
    }
}
