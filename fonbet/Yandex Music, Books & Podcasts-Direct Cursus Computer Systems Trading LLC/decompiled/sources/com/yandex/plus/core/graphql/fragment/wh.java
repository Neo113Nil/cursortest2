package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class wh implements defpackage.pj {
    public static final List a = u75.h("rootNodeId", "nodes");

    public static uh c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Integer num = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                num = (Integer) defpackage.uj.b.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    num.getClass();
                    int intValue = num.intValue();
                    arrayList.getClass();
                    return new uh(arrayList, intValue);
                }
                vh vhVar = vh.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(vhVar, true);
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
