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
public final class m1 implements pj {
    public static final m1 a = new m1();
    public static final List b = u75.h("sections", "darkSections");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.z1 z1Var = (com.yandex.plus.core.graphql.z1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        z1Var.getClass();
        r7fVar.Z("sections");
        n1 n1Var = n1.a;
        tj tjVar = uj.a;
        ArrayList arrayList = z1Var.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                n1Var.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                n1Var.a(fahVar, fx6Var, obj2);
                fahVar.p();
                Object b2 = fahVar.b();
                b2.getClass();
                irf.V(r7fVar, b2);
            }
        }
        r7fVar.l();
        r7fVar.Z("darkSections");
        l1 l1Var = l1.a;
        ArrayList arrayList2 = z1Var.b;
        r7fVar.m();
        for (Object obj3 : arrayList2) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                l1Var.a(r7fVar, fx6Var, obj3);
                r7fVar.p();
            } else {
                fah fahVar2 = new fah();
                fahVar2.j();
                l1Var.a(fahVar2, fx6Var, obj3);
                fahVar2.p();
                Object b3 = fahVar2.b();
                b3.getClass();
                irf.V(r7fVar, b3);
            }
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                n1 n1Var = n1.a;
                tj tjVar = uj.a;
                qhj qhjVar = new qhj(n1Var, true);
                a7fVar.m();
                arrayList = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            } else {
                if (z0 != 1) {
                    arrayList.getClass();
                    arrayList2.getClass();
                    return new com.yandex.plus.core.graphql.z1(arrayList, arrayList2);
                }
                l1 l1Var = l1.a;
                tj tjVar2 = uj.a;
                qhj qhjVar2 = new qhj(l1Var, true);
                a7fVar.m();
                arrayList2 = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList2.add(qhjVar2.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            }
        }
    }
}
