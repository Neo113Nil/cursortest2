package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class o implements defpackage.pj {
    public static final List a = t75.c("items");

    public static n c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        while (a7fVar.z0(a) == 0) {
            p pVar = p.a;
            defpackage.tj tjVar = defpackage.uj.a;
            qhj qhjVar = new qhj(pVar, true);
            a7fVar.m();
            arrayList = new ArrayList();
            while (a7fVar.hasNext()) {
                arrayList.add(qhjVar.b(a7fVar, fx6Var));
            }
            a7fVar.l();
        }
        arrayList.getClass();
        return new n(arrayList);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, n nVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        nVar.getClass();
        r7fVar.Z("items");
        p pVar = p.a;
        defpackage.tj tjVar = defpackage.uj.a;
        ArrayList arrayList = nVar.a;
        r7fVar.m();
        for (Object obj : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                pVar.a(r7fVar, fx6Var, obj);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                pVar.a(fahVar, fx6Var, obj);
                fahVar.p();
                Object b = fahVar.b();
                b.getClass();
                irf.V(r7fVar, b);
            }
        }
        r7fVar.l();
    }
}
