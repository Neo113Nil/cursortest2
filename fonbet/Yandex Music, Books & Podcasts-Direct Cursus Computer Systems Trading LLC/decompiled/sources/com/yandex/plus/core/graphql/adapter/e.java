package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.j8g;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class e implements pj {
    public static final e a = new e();
    public static final List b = u75.h("eventSessionId", "offers", "passedUpsaleSteps", "title", "offerSwitchToggle");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.g gVar = (com.yandex.plus.core.graphql.g) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        gVar.getClass();
        r7fVar.Z("eventSessionId");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, gVar.a);
        r7fVar.Z("offers");
        j jVar = j.a;
        ArrayList arrayList = gVar.b;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                jVar.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                jVar.a(fahVar, fx6Var, obj2);
                fahVar.p();
                Object b2 = fahVar.b();
                b2.getClass();
                irf.V(r7fVar, b2);
            }
        }
        r7fVar.l();
        r7fVar.Z("passedUpsaleSteps");
        j8g j8gVar = new j8g(com.yandex.plus.core.graphql.type.adapter.a.C, 0);
        List list = gVar.c;
        if (list == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list);
        }
        r7fVar.Z("title");
        tjVar.a(r7fVar, fx6Var, gVar.d);
        r7fVar.Z("offerSwitchToggle");
        qhj qhjVar = new qhj(k.a, false);
        com.yandex.plus.core.graphql.m mVar = gVar.e;
        if (mVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, mVar);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        com.yandex.plus.core.graphql.m mVar = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                j jVar = j.a;
                tj tjVar = uj.a;
                qhj qhjVar = new qhj(jVar, true);
                a7fVar.m();
                ArrayList arrayList3 = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList3.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
                arrayList = arrayList3;
            } else if (z0 == 2) {
                com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.C;
                tj tjVar2 = uj.a;
                j8g j8gVar = new j8g(aVar, 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList2 = null;
                } else {
                    arrayList2 = j8gVar.c(a7fVar, fx6Var);
                }
            } else if (z0 == 3) {
                str2 = (String) uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 4) {
                    str.getClass();
                    arrayList.getClass();
                    str2.getClass();
                    return new com.yandex.plus.core.graphql.g(str, arrayList, arrayList2, str2, mVar);
                }
                k kVar = k.a;
                tj tjVar3 = uj.a;
                qhj qhjVar2 = new qhj(kVar, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj = null;
                } else {
                    obj = qhjVar2.b(a7fVar, fx6Var);
                }
                mVar = (com.yandex.plus.core.graphql.m) obj;
            }
        }
    }
}
