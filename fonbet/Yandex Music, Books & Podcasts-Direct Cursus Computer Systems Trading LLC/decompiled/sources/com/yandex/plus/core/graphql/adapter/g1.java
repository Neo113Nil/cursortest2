package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class g1 implements pj {
    public static final g1 a = new g1();
    public static final List b = u75.h("batchPositionId", "eventSessionId", "offers");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.r1 r1Var = (com.yandex.plus.core.graphql.r1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        r1Var.getClass();
        r7fVar.Z("batchPositionId");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, r1Var.a);
        r7fVar.Z("eventSessionId");
        tjVar.a(r7fVar, fx6Var, r1Var.b);
        r7fVar.Z("offers");
        h1 h1Var = h1.a;
        ArrayList arrayList = r1Var.c;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                h1Var.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                h1Var.a(fahVar, fx6Var, obj2);
                fahVar.p();
                Object b2 = fahVar.b();
                b2.getClass();
                irf.V(r7fVar, b2);
            }
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    str2.getClass();
                    arrayList.getClass();
                    return new com.yandex.plus.core.graphql.r1(str, str2, arrayList);
                }
                h1 h1Var = h1.a;
                tj tjVar = uj.a;
                qhj qhjVar = new qhj(h1Var, true);
                a7fVar.m();
                arrayList = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            }
        }
    }
}
