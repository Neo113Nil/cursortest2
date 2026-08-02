package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.service.DeviceService;
import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class wg implements defpackage.pj {
    public static final List a = u75.h(DeviceService.KEY_DESC, "link");

    public static ug c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        tg tgVar = null;
        String str = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                vg vgVar = vg.a;
                defpackage.tj tjVar = defpackage.uj.a;
                tgVar = (tg) new qhj(vgVar, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    tgVar.getClass();
                    str.getClass();
                    return new ug(tgVar, str);
                }
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, ug ugVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        ugVar.getClass();
        r7fVar.Z(DeviceService.KEY_DESC);
        vg vgVar = vg.a;
        defpackage.tj tjVar = defpackage.uj.a;
        tg tgVar = ugVar.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            vgVar.a(r7fVar, fx6Var, tgVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            vgVar.a(fahVar, fx6Var, tgVar);
            fahVar.p();
            Object b = fahVar.b();
            b.getClass();
            irf.V(r7fVar, b);
        }
        r7fVar.Z("link");
        defpackage.uj.a.a(r7fVar, fx6Var, ugVar.b);
    }
}
