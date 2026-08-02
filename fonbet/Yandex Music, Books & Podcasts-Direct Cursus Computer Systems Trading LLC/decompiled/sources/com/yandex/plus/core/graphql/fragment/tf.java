package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class tf implements defpackage.pj {
    public static final List a = t75.c("position");

    public static qf c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.c0 c0Var;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.c0 c0Var2 = null;
        while (a7fVar.z0(a) == 0) {
            String f0 = a7fVar.f0();
            f0.getClass();
            com.yandex.plus.core.graphql.type.c0.b.getClass();
            com.yandex.plus.core.graphql.type.c0[] values = com.yandex.plus.core.graphql.type.c0.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    c0Var = null;
                    break;
                }
                c0Var = values[i];
                if (c0Var.a.equals(f0)) {
                    break;
                }
                i++;
            }
            c0Var2 = c0Var == null ? com.yandex.plus.core.graphql.type.c0.UNKNOWN__ : c0Var;
        }
        c0Var2.getClass();
        return new qf(c0Var2);
    }
}
