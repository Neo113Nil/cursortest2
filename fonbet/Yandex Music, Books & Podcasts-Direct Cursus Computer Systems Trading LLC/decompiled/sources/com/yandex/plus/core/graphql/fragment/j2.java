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
public final class j2 implements defpackage.pj {
    public static final j2 a = new j2();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        z1 z1Var = (z1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        z1Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, z1Var.a);
        List list = za.a;
        wa waVar = z1Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        waVar.getClass();
        r7fVar.Z("title");
        defpackage.uj.a.a(r7fVar, fx6Var, waVar.a);
        r7fVar.Z("text");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, waVar.b);
        r7fVar.Z(DeviceService.KEY_DESC);
        vgjVar.a(r7fVar, fx6Var, waVar.c);
        r7fVar.Z("additionText");
        vgjVar.a(r7fVar, fx6Var, waVar.d);
        r7fVar.Z("payload");
        defpackage.op opVar = com.yandex.plus.core.graphql.type.z.c;
        defpackage.pj e = fx6Var.e(opVar);
        if (e instanceof vgj) {
            xq0.q("The adapter is already nullable");
            return;
        }
        Map map = waVar.e;
        if (map == null) {
            r7fVar.B0();
        } else {
            e.a(r7fVar, fx6Var, map);
        }
        r7fVar.Z("image");
        fx6Var.e(opVar).a(r7fVar, fx6Var, waVar.f);
        r7fVar.Z("offerName");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.d).a(r7fVar, fx6Var, waVar.g);
        r7fVar.Z("option");
        ya yaVar = ya.a;
        va vaVar = waVar.h;
        r7fVar.j();
        yaVar.a(r7fVar, fx6Var, vaVar);
        r7fVar.p();
        r7fVar.Z("backgroundTv");
        qhj qhjVar = new qhj(xa.a, true);
        ua uaVar = waVar.i;
        if (uaVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, uaVar);
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
        wa c = za.c(a7fVar, fx6Var);
        str.getClass();
        return new z1(str, c);
    }
}
