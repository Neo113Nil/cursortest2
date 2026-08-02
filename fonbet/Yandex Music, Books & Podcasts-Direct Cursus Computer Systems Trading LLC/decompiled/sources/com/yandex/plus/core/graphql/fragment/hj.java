package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class hj implements defpackage.pj {
    public static final List a = u75.h("text", "lineHeight");

    public static fj c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        ej ejVar = null;
        Integer num = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                ij ijVar = ij.a;
                defpackage.tj tjVar = defpackage.uj.a;
                ejVar = (ej) new qhj(ijVar, false).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    ejVar.getClass();
                    return new fj(ejVar, num);
                }
                num = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
            }
        }
    }
}
