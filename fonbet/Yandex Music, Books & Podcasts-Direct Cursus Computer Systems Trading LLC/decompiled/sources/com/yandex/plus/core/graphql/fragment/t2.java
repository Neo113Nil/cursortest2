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
public final class t2 implements defpackage.pj {
    public static final t2 a = new t2();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        s1 s1Var = (s1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        s1Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, s1Var.a);
        List list = cb.a;
        ta taVar = s1Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        taVar.getClass();
        r7fVar.Z("name");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.d).a(r7fVar, fx6Var, taVar.a);
        r7fVar.Z("title");
        defpackage.uj.a.a(r7fVar, fx6Var, taVar.b);
        r7fVar.Z("option");
        bb bbVar = bb.a;
        ra raVar = taVar.c;
        r7fVar.j();
        bbVar.a(r7fVar, fx6Var, raVar);
        r7fVar.p();
        r7fVar.Z(DeviceService.KEY_DESC);
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, taVar.d);
        r7fVar.Z("text");
        vgjVar.a(r7fVar, fx6Var, taVar.e);
        r7fVar.Z("additionText");
        vgjVar.a(r7fVar, fx6Var, taVar.f);
        r7fVar.Z("commonPrice");
        ab abVar = ab.a;
        qa qaVar = taVar.g;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            abVar.a(r7fVar, fx6Var, qaVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            abVar.a(fahVar, fx6Var, qaVar);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("commonPeriod");
        defpackage.uj.g.a(r7fVar, fx6Var, taVar.h);
        r7fVar.Z("plans");
        db dbVar = db.a;
        ArrayList arrayList = taVar.i;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (z) {
                r7fVar.j();
                dbVar.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar2 = new fah();
                fahVar2.j();
                dbVar.a(fahVar2, fx6Var, obj2);
                fahVar2.p();
                Object b3 = fahVar2.b();
                b3.getClass();
                irf.V(r7fVar, b3);
            }
        }
        r7fVar.l();
        r7fVar.Z("offerVendorType");
        r7fVar.m0(taVar.j.a);
        r7fVar.Z("payload");
        defpackage.pj e = fx6Var.e(com.yandex.plus.core.graphql.type.z.c);
        if (e instanceof vgj) {
            xq0.q("The adapter is already nullable");
            return;
        }
        Map map = taVar.k;
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
        ta c = cb.c(a7fVar, fx6Var);
        str.getClass();
        return new s1(str, c);
    }
}
