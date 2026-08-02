package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.tlm;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class jk implements defpackage.pj {
    public static final List a = u75.h("widgetGroupId", "widgets", "groupDisplayRules", "typedProperties", "strictAction", "contentDescription");

    public static gk c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object obj2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        dk dkVar = null;
        fk fkVar = null;
        ek ekVar = null;
        ck ckVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                defpackage.tj tjVar = defpackage.uj.a;
                arrayList = tlm.n(a7fVar);
                while (a7fVar.hasNext()) {
                    arrayList.add(tjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            } else if (z0 == 2) {
                ik ikVar = ik.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                dkVar = (dk) new qhj(ikVar, true).b(a7fVar, fx6Var);
            } else if (z0 == 3) {
                lk lkVar = lk.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                fkVar = (fk) new qhj(lkVar, true).b(a7fVar, fx6Var);
            } else if (z0 == 4) {
                kk kkVar = kk.a;
                defpackage.tj tjVar4 = defpackage.uj.a;
                qhj qhjVar = new qhj(kkVar, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj2 = null;
                } else {
                    obj2 = qhjVar.b(a7fVar, fx6Var);
                }
                ekVar = (ek) obj2;
            } else {
                if (z0 != 5) {
                    str.getClass();
                    arrayList.getClass();
                    dkVar.getClass();
                    fkVar.getClass();
                    return new gk(str, arrayList, dkVar, fkVar, ekVar, ckVar);
                }
                hk hkVar = hk.a;
                defpackage.tj tjVar5 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(hkVar, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj = null;
                } else {
                    obj = qhjVar2.b(a7fVar, fx6Var);
                }
                ckVar = (ck) obj;
            }
        }
    }
}
