package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class rg implements defpackage.pj {
    public static final List a = u75.h("colors", "startPoint", "endPoint");

    public static og c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        ng ngVar = null;
        mg mgVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                pg pgVar = pg.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(pgVar, true);
                a7fVar.m();
                arrayList = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            } else if (z0 == 1) {
                sg sgVar = sg.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                ngVar = (ng) new qhj(sgVar, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    arrayList.getClass();
                    ngVar.getClass();
                    mgVar.getClass();
                    return new og(arrayList, ngVar, mgVar);
                }
                qg qgVar = qg.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                mgVar = (mg) new qhj(qgVar, true).b(a7fVar, fx6Var);
            }
        }
    }
}
