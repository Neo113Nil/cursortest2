package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class kp implements defpackage.pj {
    public static final List a = t75.c("verticalContentAlignment");

    public static gp c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.d1 d1Var;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.d1 d1Var2 = null;
        while (a7fVar.z0(a) == 0) {
            String f0 = a7fVar.f0();
            f0.getClass();
            com.yandex.plus.core.graphql.type.d1.b.getClass();
            com.yandex.plus.core.graphql.type.d1[] values = com.yandex.plus.core.graphql.type.d1.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d1Var = null;
                    break;
                }
                d1Var = values[i];
                if (d1Var.a.equals(f0)) {
                    break;
                }
                i++;
            }
            d1Var2 = d1Var == null ? com.yandex.plus.core.graphql.type.d1.UNKNOWN__ : d1Var;
        }
        d1Var2.getClass();
        return new gp(d1Var2);
    }
}
