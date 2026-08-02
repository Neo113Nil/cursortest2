package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.service.DeviceService;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.vgj;
import defpackage.xq0;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m2 implements defpackage.pj {
    public static final m2 a = new m2();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        c2 c2Var = (c2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        c2Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, c2Var.a);
        List list = vo.a;
        ro roVar = c2Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        roVar.getClass();
        r7fVar.Z("title");
        defpackage.uj.a.a(r7fVar, fx6Var, roVar.a);
        r7fVar.Z("text");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, roVar.b);
        r7fVar.Z(DeviceService.KEY_DESC);
        vgjVar.a(r7fVar, fx6Var, roVar.c);
        r7fVar.Z("additionText");
        vgjVar.a(r7fVar, fx6Var, roVar.d);
        r7fVar.Z("payload");
        defpackage.op opVar = com.yandex.plus.core.graphql.type.z.c;
        defpackage.pj e = fx6Var.e(opVar);
        if (e instanceof vgj) {
            xq0.q("The adapter is already nullable");
            return;
        }
        Map map = roVar.e;
        if (map == null) {
            r7fVar.B0();
        } else {
            e.a(r7fVar, fx6Var, map);
        }
        r7fVar.Z("image");
        fx6Var.e(opVar).a(r7fVar, fx6Var, roVar.f);
        r7fVar.Z("offerName");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.d).a(r7fVar, fx6Var, roVar.g);
        r7fVar.Z("tariff");
        uo uoVar = uo.a;
        qo qoVar = roVar.h;
        r7fVar.j();
        uoVar.a(r7fVar, fx6Var, qoVar);
        r7fVar.p();
        r7fVar.Z("backgroundTv");
        qhj qhjVar = new qhj(so.a, true);
        oo ooVar = roVar.i;
        if (ooVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, ooVar);
        }
        r7fVar.Z("storePurchaseInfo");
        qhj qhjVar2 = new qhj(to.a, true);
        po poVar = roVar.j;
        if (poVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, poVar);
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
        ro c = vo.c(a7fVar, fx6Var);
        str.getClass();
        return new c2(str, c);
    }
}
