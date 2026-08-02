package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class yk implements defpackage.pj {
    public static final List a = u75.h("displayRules", "opacity", "horizontalRule", "verticalRule", "widthFix", "widthType");

    public static wk c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.f1 f1Var;
        Object obj;
        Object obj2;
        a7fVar.getClass();
        fx6Var.getClass();
        vk vkVar = null;
        Integer num = null;
        com.yandex.plus.core.graphql.type.t tVar = null;
        com.yandex.plus.core.graphql.type.z0 z0Var = null;
        Integer num2 = null;
        com.yandex.plus.core.graphql.type.f1 f1Var2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                xk xkVar = xk.a;
                defpackage.tj tjVar = defpackage.uj.a;
                vkVar = (vk) new qhj(xkVar, true).b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                num = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.i;
                defpackage.tj tjVar2 = defpackage.uj.a;
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj2 = null;
                } else {
                    obj2 = aVar.b(a7fVar, fx6Var);
                }
                tVar = (com.yandex.plus.core.graphql.type.t) obj2;
            } else if (z0 == 3) {
                com.yandex.plus.core.graphql.type.adapter.a aVar2 = com.yandex.plus.core.graphql.type.adapter.a.D;
                defpackage.tj tjVar3 = defpackage.uj.a;
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj = null;
                } else {
                    obj = aVar2.b(a7fVar, fx6Var);
                }
                z0Var = (com.yandex.plus.core.graphql.type.z0) obj;
            } else if (z0 == 4) {
                num2 = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
            } else {
                if (z0 != 5) {
                    vkVar.getClass();
                    f1Var2.getClass();
                    return new wk(vkVar, num, tVar, z0Var, num2, f1Var2);
                }
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.f1.b.getClass();
                com.yandex.plus.core.graphql.type.f1[] values = com.yandex.plus.core.graphql.type.f1.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        f1Var = null;
                        break;
                    }
                    f1Var = values[i];
                    if (f1Var.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                f1Var2 = f1Var == null ? com.yandex.plus.core.graphql.type.f1.UNKNOWN__ : f1Var;
            }
        }
    }
}
