package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.ui;

import defpackage.aii0;
import defpackage.bts;
import defpackage.d360;
import defpackage.did;
import defpackage.fid;
import defpackage.g460;
import defpackage.h460;
import defpackage.i460;
import defpackage.j460;
import defpackage.k460;
import defpackage.rsb1;
import defpackage.s360;
import defpackage.squ;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wls;
import defpackage.wsb1;
import defpackage.ysb1;
import defpackage.zpn;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(s360 s360Var, tls tlsVar, wls wlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        d360 d360Var = s360Var.d;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1243566419);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(s360Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(wlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            String str = d360Var.f;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new NeuroPostcardKt$NeuroPostcard$1$1(tlsVar, s360Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, str);
            k460 k460Var = s360Var.c;
            if (k460Var instanceof i460) {
                btsVar.e0(-1300298874);
                ysb1.c(d360Var, s360Var.e, wlsVar, btsVar, i2 & 896);
                btsVar.t(false);
            } else if (k460Var instanceof h460) {
                btsVar.e0(-1300045945);
                wsb1.b((h460) k460Var, s360Var.d, s360Var.e, wlsVar, btsVar, (i2 << 3) & 7168);
                btsVar.t(false);
            } else {
                int i3 = i2;
                if (k460Var instanceof j460) {
                    btsVar.e0(-1299763225);
                    ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.ui.stage.a.b((j460) k460Var, s360Var.d, wlsVar, tlsVar2, btsVar, i3 & 8064);
                    btsVar.t(false);
                } else {
                    if (!(k460Var instanceof g460)) {
                        throw unr0.y(1066431711, btsVar, false);
                    }
                    btsVar.e0(-1299481001);
                    rsb1.b(d360Var, wlsVar, btsVar, (i3 >> 3) & 112);
                    btsVar.t(false);
                }
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(s360Var, tlsVar, wlsVar, tlsVar2, i, 23);
        }
    }
}
