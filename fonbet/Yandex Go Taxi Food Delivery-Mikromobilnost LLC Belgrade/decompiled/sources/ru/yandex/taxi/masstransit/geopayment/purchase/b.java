package ru.yandex.taxi.masstransit.geopayment.purchase;

import androidx.compose.runtime.f;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cms;
import defpackage.did;
import defpackage.f530;
import defpackage.ffx;
import defpackage.fid;
import defpackage.hc0;
import defpackage.hu30;
import defpackage.ku30;
import defpackage.lz40;
import defpackage.o430;
import defpackage.oz40;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tls;
import defpackage.tz20;
import defpackage.u01;
import defpackage.v01;
import defpackage.vz20;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wz20;
import defpackage.zpn;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class b {
    public static final void a(Object obj, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1538558897);
        int i2 = (btsVar.k(obj) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(obj);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            if (obj != null) {
                oz40Var.setValue(obj);
            }
            Object Q2 = btsVar.Q();
            Object obj2 = Q2;
            if (Q2 == o430Var) {
                n0 c = ffx.c(1, 0, null, 6);
                c.g(tz20.a);
                btsVar.o0(c);
                obj2 = c;
            }
            lz40 lz40Var = (lz40) obj2;
            boolean e = ((i2 & 14) == 4) | btsVar.e(lz40Var);
            Object Q3 = btsVar.Q();
            if (e || Q3 == o430Var) {
                Q3 = new MtPurchaseOptionsOverlayKt$AnimatedModalVisibility$1$1(lz40Var, oz40Var, obj, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, obj);
            boolean k = btsVar.k(lz40Var);
            Object Q4 = btsVar.Q();
            if (k || Q4 == o430Var) {
                Q4 = new wz20(lz40Var);
                btsVar.o0(Q4);
            }
            wz20 wz20Var = (wz20) Q4;
            Object value = oz40Var.getValue();
            if (value == null) {
                btsVar.e0(-682249488);
                btsVar.t(false);
            } else {
                btsVar.e0(-682249487);
                sb2.b(vz20.a.a(wz20Var), wwg.S(205441090, true, new u01(i2, 1, aVar, value), btsVar), btsVar, 56);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v01(i, 1, aVar, obj);
        }
    }

    public static final void b(ku30 ku30Var, boolean z, tls tlsVar, sls slsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2036610620);
        int i2 = (btsVar.k(ku30Var) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | HProv.ALG_CLASS_DATA_ENCRYPT;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            ku30 ku30Var2 = null;
            if (ku30Var != null && z) {
                ku30Var2 = ku30Var;
            }
            a(ku30Var2, wwg.S(-1241339365, true, new hu30(tlsVar, slsVar, i3), btsVar), btsVar, 48);
            f530Var = c530.a;
        } else {
            btsVar.Y();
        }
        f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(i, 8, (cms) tlsVar, (Object) ku30Var, (Object) slsVar, (Object) f530Var2, z);
        }
    }
}
