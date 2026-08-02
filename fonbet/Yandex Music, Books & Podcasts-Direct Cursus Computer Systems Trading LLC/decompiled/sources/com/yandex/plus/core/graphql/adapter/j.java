package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.op;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tj;
import defpackage.uj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class j implements pj {
    public static final j a = new j();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.l lVar = (com.yandex.plus.core.graphql.l) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        lVar.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, lVar.a);
        List list = com.yandex.plus.core.graphql.fragment.j.a;
        com.yandex.plus.core.graphql.fragment.i iVar = lVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        iVar.getClass();
        r7fVar.Z("additionalText");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, iVar.a);
        r7fVar.Z("benefits");
        qhj qhjVar = new qhj(com.yandex.plus.core.graphql.fragment.k.a, false);
        ArrayList arrayList = iVar.b;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                qhjVar.a(r7fVar, fx6Var, obj2);
            }
        }
        r7fVar.l();
        r7fVar.Z("disclaimer");
        uj.i.a(r7fVar, fx6Var, iVar.c);
        r7fVar.Z("iconImages");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.c).a(r7fVar, fx6Var, iVar.d);
        r7fVar.Z("isAvailable");
        tj tjVar2 = uj.f;
        tjVar2.a(r7fVar, fx6Var, Boolean.valueOf(iVar.e));
        r7fVar.Z("isSelected");
        tjVar2.a(r7fVar, fx6Var, Boolean.valueOf(iVar.f));
        r7fVar.Z("offerName");
        op opVar = com.yandex.plus.core.graphql.type.z.d;
        fx6Var.e(opVar).a(r7fVar, fx6Var, iVar.g);
        r7fVar.Z("offersBatchId");
        tjVar.a(r7fVar, fx6Var, iVar.h);
        r7fVar.Z("offersToReplace");
        pj e = fx6Var.e(opVar);
        ArrayList arrayList2 = iVar.i;
        r7fVar.m();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            e.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
        r7fVar.Z("positionId");
        tjVar.a(r7fVar, fx6Var, iVar.j);
        r7fVar.Z("text");
        tjVar.a(r7fVar, fx6Var, iVar.k);
        r7fVar.Z("title");
        tjVar.a(r7fVar, fx6Var, iVar.l);
        r7fVar.Z("upsaleStep");
        r7fVar.m0(iVar.m.a);
        r7fVar.Z("upsaleType");
        r7fVar.m0(iVar.n.a);
        r7fVar.Z("offerSwitchToggle");
        qhj qhjVar2 = new qhj(com.yandex.plus.core.graphql.fragment.l.a, false);
        com.yandex.plus.core.graphql.fragment.h hVar = iVar.o;
        if (hVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, hVar);
        }
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
        com.yandex.plus.core.graphql.fragment.i c = com.yandex.plus.core.graphql.fragment.j.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.l(str, c);
    }
}
