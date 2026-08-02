package com.yandex.plus.core.graphql.adapter;

import com.connectsdk.device.ConnectableDevice;
import com.yandex.plus.core.graphql.fragment.pl;
import com.yandex.plus.core.graphql.fragment.vl;
import com.yandex.plus.core.graphql.fragment.wl;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tj;
import defpackage.uj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class q1 implements pj {
    public static final q1 a = new q1();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.f2 f2Var = (com.yandex.plus.core.graphql.f2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        f2Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, f2Var.a);
        List list = wl.a;
        pl plVar = f2Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        plVar.getClass();
        r7fVar.Z("name");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, plVar.a);
        r7fVar.Z(ConnectableDevice.KEY_ID);
        tjVar.a(r7fVar, fx6Var, plVar.b);
        r7fVar.Z("popups");
        vl vlVar = vl.a;
        ArrayList arrayList = plVar.c;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            r7fVar.j();
            vlVar.a(r7fVar, fx6Var, obj2);
            r7fVar.p();
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        pl c = wl.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.f2(str, c);
    }
}
