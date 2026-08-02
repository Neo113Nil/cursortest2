package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e4 implements defpackage.pj {
    public static final e4 a = new e4();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        v3 v3Var = (v3) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        v3Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, v3Var.a);
        List list = k4.a;
        a4 a4Var = v3Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        a4Var.getClass();
        r7fVar.Z("backgroundColors");
        g4 g4Var = g4.a;
        defpackage.tj tjVar = defpackage.uj.a;
        qhj qhjVar = new qhj(g4Var, true);
        x3 x3Var = a4Var.a;
        if (x3Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, x3Var);
        }
        r7fVar.Z("silent");
        defpackage.uj.f.a(r7fVar, fx6Var, Boolean.valueOf(a4Var.b));
        r7fVar.Z("subscriptionButtonType");
        com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.v;
        com.yandex.plus.core.graphql.type.m0 m0Var = a4Var.c;
        if (m0Var == null) {
            r7fVar.B0();
        } else {
            aVar.a(r7fVar, fx6Var, m0Var);
        }
        r7fVar.Z("subscriptionProductFeatures");
        defpackage.tj tjVar2 = defpackage.uj.a;
        ArrayList arrayList = a4Var.d;
        r7fVar.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tjVar2.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
        r7fVar.Z("subscriptionProductTarget");
        defpackage.uj.i.a(r7fVar, fx6Var, a4Var.e);
        r7fVar.Z("subscriptionPaymentMethod");
        com.yandex.plus.core.graphql.type.adapter.a aVar2 = com.yandex.plus.core.graphql.type.adapter.a.w;
        com.yandex.plus.core.graphql.type.n0 n0Var = a4Var.f;
        if (n0Var == null) {
            r7fVar.B0();
        } else {
            aVar2.a(r7fVar, fx6Var, n0Var);
        }
        r7fVar.Z("subscriptionWidgetType");
        com.yandex.plus.core.graphql.type.adapter.a aVar3 = com.yandex.plus.core.graphql.type.adapter.a.x;
        com.yandex.plus.core.graphql.type.o0 o0Var = a4Var.g;
        if (o0Var == null) {
            r7fVar.B0();
        } else {
            aVar3.a(r7fVar, fx6Var, o0Var);
        }
        r7fVar.Z("acquisitionPlatformSubscriptionProperties");
        qhj qhjVar2 = new qhj(d4.a, false);
        u3 u3Var = a4Var.h;
        if (u3Var == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, u3Var);
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
        a4 c = k4.c(a7fVar, fx6Var);
        str.getClass();
        return new v3(str, c);
    }
}
