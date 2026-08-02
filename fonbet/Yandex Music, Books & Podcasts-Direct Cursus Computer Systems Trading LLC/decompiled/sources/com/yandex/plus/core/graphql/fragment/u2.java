package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.service.DeviceService;
import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.r7f;
import defpackage.t75;
import defpackage.vgj;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class u2 implements defpackage.pj {
    public static final u2 a = new u2();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        t1 t1Var = (t1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        t1Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, t1Var.a);
        List list = zo.a;
        no noVar = t1Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        noVar.getClass();
        r7fVar.Z("name");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.d).a(r7fVar, fx6Var, noVar.a);
        r7fVar.Z("title");
        defpackage.uj.a.a(r7fVar, fx6Var, noVar.b);
        r7fVar.Z("tariff");
        yo yoVar = yo.a;
        mo moVar = noVar.c;
        r7fVar.j();
        yoVar.a(r7fVar, fx6Var, moVar);
        r7fVar.p();
        r7fVar.Z(DeviceService.KEY_DESC);
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, noVar.d);
        r7fVar.Z("text");
        vgjVar.a(r7fVar, fx6Var, noVar.e);
        r7fVar.Z("additionText");
        vgjVar.a(r7fVar, fx6Var, noVar.f);
        r7fVar.Z("commonPrice");
        wo woVar = wo.a;
        ko koVar = noVar.g;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            woVar.a(r7fVar, fx6Var, koVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            woVar.a(fahVar, fx6Var, koVar);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("commonPeriod");
        defpackage.uj.g.a(r7fVar, fx6Var, noVar.h);
        r7fVar.Z("plans");
        xo xoVar = xo.a;
        ArrayList arrayList = noVar.i;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (z) {
                r7fVar.j();
                xoVar.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar2 = new fah();
                fahVar2.j();
                xoVar.a(fahVar2, fx6Var, obj2);
                fahVar2.p();
                Object b3 = fahVar2.b();
                b3.getClass();
                irf.V(r7fVar, b3);
            }
        }
        r7fVar.l();
        r7fVar.Z("offerVendorType");
        r7fVar.m0(noVar.j.a);
        r7fVar.Z("payload");
        defpackage.pj e = fx6Var.e(com.yandex.plus.core.graphql.type.z.c);
        if (e instanceof vgj) {
            xq0.q("The adapter is already nullable");
            return;
        }
        Map map = noVar.k;
        if (map == null) {
            r7fVar.B0();
        } else {
            e.a(r7fVar, fx6Var, map);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        no c = zo.c(a7fVar, fx6Var);
        str.getClass();
        return new t1(str, c);
    }
}
