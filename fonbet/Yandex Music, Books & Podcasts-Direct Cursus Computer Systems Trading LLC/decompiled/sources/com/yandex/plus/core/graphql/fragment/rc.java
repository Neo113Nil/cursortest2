package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class rc implements defpackage.pj {
    public static final List a = u75.h("benefitTitle", "additionalTitle", "iconImage", "backgroundColor", "paymentMethodId");

    public static ic c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object obj2;
        a7fVar.getClass();
        fx6Var.getClass();
        cc ccVar = null;
        ac acVar = null;
        fc fcVar = null;
        bc bcVar = null;
        String str = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                lc lcVar = lc.a;
                defpackage.tj tjVar = defpackage.uj.a;
                ccVar = (cc) new qhj(lcVar, true).b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                jc jcVar = jc.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar = new qhj(jcVar, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj2 = null;
                } else {
                    obj2 = qhjVar.b(a7fVar, fx6Var);
                }
                acVar = (ac) obj2;
            } else if (z0 == 2) {
                oc ocVar = oc.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(ocVar, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj = null;
                } else {
                    obj = qhjVar2.b(a7fVar, fx6Var);
                }
                fcVar = (fc) obj;
            } else if (z0 == 3) {
                kc kcVar = kc.a;
                defpackage.tj tjVar4 = defpackage.uj.a;
                bcVar = (bc) new qhj(kcVar, false).b(a7fVar, fx6Var);
            } else {
                if (z0 != 4) {
                    ccVar.getClass();
                    bcVar.getClass();
                    return new ic(ccVar, acVar, fcVar, bcVar, str);
                }
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            }
        }
    }
}
