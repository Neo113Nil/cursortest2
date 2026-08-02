package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.wheel_picker;

import defpackage.a7b;
import defpackage.aii0;
import defpackage.ay41;
import defpackage.bts;
import defpackage.by41;
import defpackage.c530;
import defpackage.cms;
import defpackage.cy41;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g0;
import defpackage.gxv;
import defpackage.ljs0;
import defpackage.m1y;
import defpackage.n1y;
import defpackage.o1y;
import defpackage.p1y;
import defpackage.sp5;
import defpackage.tcc;
import defpackage.tls;
import defpackage.vx41;
import defpackage.w511;
import defpackage.wls;
import defpackage.wq1;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.xab1;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(by41 by41Var, tls tlsVar, tls tlsVar2, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-17499804);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(by41Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        int i3 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new CompositeWheelPickerKt$CompositeWheelPicker$1$1(tlsVar, by41Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            xab1.a(null, null, wwg.S(-1656488370, true, new sp5(by41Var, tlsVar2), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 7);
            f530Var = c530.a;
        } else {
            btsVar.Y();
        }
        f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0((Object) by41Var, tlsVar, (cms) tlsVar2, (Object) f530Var2, i, 15);
        }
    }

    public static final void b(vx41 vx41Var, float f, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        f530 q;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-965854008);
        int i2 = i | (btsVar2.k(vx41Var) ? 32 : 16) | (btsVar2.b(f) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            p1y p1yVar = vx41Var.c;
            if (p1yVar instanceof n1y) {
                if (1.0f <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                q = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            } else {
                boolean z = p1yVar instanceof m1y;
                c530 c530Var = c530.a;
                if (z) {
                    q = ljs0.q(c530Var, ((m1y) p1yVar).a);
                } else {
                    if (!(p1yVar instanceof o1y)) {
                        w511.b();
                        return;
                    }
                    q = ljs0.q(c530Var, ((o1y) p1yVar).a * f);
                }
            }
            int i3 = vx41Var.a;
            ArrayList arrayList = vx41Var.b;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((cy41) it.next()).a);
            }
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object Q = btsVar2.Q();
            if (z2 || Q == did.a) {
                Q = new a7b(27, tlsVar, vx41Var);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            ay41.b(q, arrayList2, i3, (tls) Q, 3, 0L, 0L, 0L, 0L, null, btsVar, 0, 992);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wq1(vx41Var, f, tlsVar, i, 1);
        }
    }
}
