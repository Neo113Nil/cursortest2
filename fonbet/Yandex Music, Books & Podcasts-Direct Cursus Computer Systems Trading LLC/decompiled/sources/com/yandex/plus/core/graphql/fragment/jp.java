package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class jp implements defpackage.pj {
    public static final List a = t75.c("horizontalContentAlignment");

    public static fp c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.u uVar;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.u uVar2 = null;
        while (a7fVar.z0(a) == 0) {
            String f0 = a7fVar.f0();
            f0.getClass();
            com.yandex.plus.core.graphql.type.u.b.getClass();
            com.yandex.plus.core.graphql.type.u[] values = com.yandex.plus.core.graphql.type.u.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    uVar = null;
                    break;
                }
                uVar = values[i];
                if (uVar.a.equals(f0)) {
                    break;
                }
                i++;
            }
            uVar2 = uVar == null ? com.yandex.plus.core.graphql.type.u.UNKNOWN__ : uVar;
        }
        uVar2.getClass();
        return new fp(uVar2);
    }
}
