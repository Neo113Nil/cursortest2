package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class am implements defpackage.pj {
    public static final List a = u75.h("text", "items");

    public static yl c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    arrayList.getClass();
                    return new yl(str, arrayList);
                }
                zl zlVar = zl.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(zlVar, true);
                a7fVar.m();
                arrayList = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, yl ylVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        ylVar.getClass();
        r7fVar.Z("text");
        defpackage.uj.a.a(r7fVar, fx6Var, ylVar.a);
        r7fVar.Z("items");
        zl zlVar = zl.a;
        ArrayList arrayList = ylVar.b;
        r7fVar.m();
        for (Object obj : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                zlVar.a(r7fVar, fx6Var, obj);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                zlVar.a(fahVar, fx6Var, obj);
                fahVar.p();
                Object b = fahVar.b();
                b.getClass();
                irf.V(r7fVar, b);
            }
        }
        r7fVar.l();
    }
}
