package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ki implements defpackage.pj {
    public static final List a = u75.h("colors", "centralPoint");

    public static hi c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        fi fiVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                ji jiVar = ji.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(jiVar, true);
                a7fVar.m();
                arrayList = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            } else {
                if (z0 != 1) {
                    arrayList.getClass();
                    fiVar.getClass();
                    return new hi(arrayList, fiVar);
                }
                ii iiVar = ii.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                fiVar = (fi) new qhj(iiVar, true).b(a7fVar, fx6Var);
            }
        }
    }
}
