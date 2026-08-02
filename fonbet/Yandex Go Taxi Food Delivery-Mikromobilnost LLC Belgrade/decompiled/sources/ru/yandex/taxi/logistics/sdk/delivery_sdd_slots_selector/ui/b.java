package ru.yandex.taxi.logistics.sdk.delivery_sdd_slots_selector.ui;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import defpackage.a7y;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.at5;
import defpackage.bms;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.eja1;
import defpackage.f530;
import defpackage.f89;
import defpackage.fid;
import defpackage.fwi;
import defpackage.ljs0;
import defpackage.oz40;
import defpackage.qws0;
import defpackage.rb0;
import defpackage.tls;
import defpackage.vbu;
import defpackage.wls;
import defpackage.y7m;
import defpackage.yx40;
import defpackage.zpn;
import defpackage.zrb1;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class b {
    public static final void a(vbu vbuVar, qws0 qws0Var, bms bmsVar, wls wlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1402715841);
        int i3 = i | (btsVar.k(qws0Var) ? 32 : 16) | (btsVar.e(bmsVar) ? 256 : 128) | (btsVar.e(wlsVar) ? 2048 : 1024);
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.g(0);
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = f.j(new y7m(0.0f));
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            fwi fwiVar = (fwi) btsVar.m(j.h);
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar);
            f530 k = androidx.compose.ui.input.nestedscroll.b.a(c530.a, zrb1.f(btsVar), null).k(ljs0.c);
            boolean k2 = btsVar.k(fwiVar);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == obj) {
                Q3 = new f89(21, fwiVar, oz40Var, yx40Var);
                btsVar.o0(Q3);
            }
            f530 y = eja1.y(k, (tls) Q3);
            int i4 = i3 & 112;
            boolean k3 = ((i3 & 896) == 256) | btsVar.k(fwiVar) | (i4 == 32);
            Object Q4 = btsVar.Q();
            if (k3 || Q4 == obj) {
                i2 = i4;
                at5 at5Var = new at5(qws0Var, fwiVar, vbuVar, oz40Var, yx40Var, bmsVar, 1);
                btsVar.o0(at5Var);
                Q4 = at5Var;
            } else {
                i2 = i4;
            }
            int i5 = i2;
            adb1.a(y, a, null, null, null, null, false, null, (tls) Q4, btsVar, 0, 508);
            btsVar = btsVar;
            List list = qws0Var.a;
            boolean k4 = btsVar.k(a) | (i5 == 32) | ((i3 & 7168) == 2048);
            Object Q5 = btsVar.Q();
            if (k4 || Q5 == obj) {
                Q5 = new DeliverySddSlotsScreenKt$DeliverySddSlotsScreen$3$1(qws0Var, a, wlsVar, null);
                btsVar.o0(Q5);
            }
            zpn.e(btsVar, (wls) Q5, list);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) vbuVar, (Object) qws0Var, (Object) bmsVar, (Object) wlsVar, i, 23);
        }
    }
}
