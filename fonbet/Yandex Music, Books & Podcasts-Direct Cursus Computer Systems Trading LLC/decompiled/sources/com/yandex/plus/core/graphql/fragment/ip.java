package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ip implements defpackage.pj {
    public static final List a = u75.h("horizontalContentAlignment", "verticalContentAlignment");

    public static ep c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.d1 d1Var;
        com.yandex.plus.core.graphql.type.u uVar;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.u uVar2 = null;
        com.yandex.plus.core.graphql.type.d1 d1Var2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            int i = 0;
            if (z0 == 0) {
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.u.b.getClass();
                com.yandex.plus.core.graphql.type.u[] values = com.yandex.plus.core.graphql.type.u.values();
                int length = values.length;
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
            } else {
                if (z0 != 1) {
                    uVar2.getClass();
                    d1Var2.getClass();
                    return new ep(uVar2, d1Var2);
                }
                String f02 = a7fVar.f0();
                f02.getClass();
                com.yandex.plus.core.graphql.type.d1.b.getClass();
                com.yandex.plus.core.graphql.type.d1[] values2 = com.yandex.plus.core.graphql.type.d1.values();
                int length2 = values2.length;
                while (true) {
                    if (i >= length2) {
                        d1Var = null;
                        break;
                    }
                    d1Var = values2[i];
                    if (d1Var.a.equals(f02)) {
                        break;
                    }
                    i++;
                }
                d1Var2 = d1Var == null ? com.yandex.plus.core.graphql.type.d1.UNKNOWN__ : d1Var;
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, ep epVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        epVar.getClass();
        r7fVar.Z("horizontalContentAlignment");
        r7fVar.m0(epVar.a.a);
        r7fVar.Z("verticalContentAlignment");
        r7fVar.m0(epVar.b.a);
    }
}
