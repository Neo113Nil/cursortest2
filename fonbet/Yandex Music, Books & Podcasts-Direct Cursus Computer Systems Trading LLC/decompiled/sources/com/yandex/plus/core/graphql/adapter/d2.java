package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.x2;
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
public final class d2 implements pj {
    public static final d2 a = new d2();
    public static final List b = u75.h("capacity", "invitations", "members");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        x2 x2Var = (x2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        x2Var.getClass();
        r7fVar.Z("capacity");
        uj.b.a(r7fVar, fx6Var, Integer.valueOf(x2Var.a));
        r7fVar.Z("invitations");
        e2 e2Var = e2.a;
        ArrayList arrayList = x2Var.b;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                e2Var.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                e2Var.a(fahVar, fx6Var, obj2);
                fahVar.p();
                Object b2 = fahVar.b();
                b2.getClass();
                irf.V(r7fVar, b2);
            }
        }
        r7fVar.l();
        r7fVar.Z("members");
        f2 f2Var = f2.a;
        ArrayList arrayList2 = x2Var.c;
        r7fVar.m();
        for (Object obj3 : arrayList2) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                f2Var.a(r7fVar, fx6Var, obj3);
                r7fVar.p();
            } else {
                fah fahVar2 = new fah();
                fahVar2.j();
                f2Var.a(fahVar2, fx6Var, obj3);
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
        Integer num = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                num = (Integer) uj.b.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                e2 e2Var = e2.a;
                tj tjVar = uj.a;
                qhj qhjVar = new qhj(e2Var, true);
                a7fVar.m();
                arrayList = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            } else {
                if (z0 != 2) {
                    num.getClass();
                    int intValue = num.intValue();
                    arrayList.getClass();
                    arrayList2.getClass();
                    return new x2(arrayList, arrayList2, intValue);
                }
                f2 f2Var = f2.a;
                tj tjVar2 = uj.a;
                qhj qhjVar2 = new qhj(f2Var, true);
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
