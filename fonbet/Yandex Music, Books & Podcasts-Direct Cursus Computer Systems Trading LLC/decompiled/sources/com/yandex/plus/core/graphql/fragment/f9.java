package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.math.BigDecimal;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class f9 implements defpackage.pj {
    public static final List a = u75.h("currency", "amount");

    public static e9 c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.k kVar;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.k kVar2 = null;
        BigDecimal bigDecimal = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.k.b.getClass();
                com.yandex.plus.core.graphql.type.k[] values = com.yandex.plus.core.graphql.type.k.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        kVar = null;
                        break;
                    }
                    kVar = values[i];
                    if (kVar.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                kVar2 = kVar == null ? com.yandex.plus.core.graphql.type.k.UNKNOWN__ : kVar;
            } else {
                if (z0 != 1) {
                    kVar2.getClass();
                    bigDecimal.getClass();
                    return new e9(kVar2, bigDecimal);
                }
                String f02 = a7fVar.f0();
                f02.getClass();
                bigDecimal = new BigDecimal(f02);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, e9 e9Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        e9Var.getClass();
        r7fVar.Z("currency");
        r7fVar.m0(e9Var.a.a);
        r7fVar.Z("amount");
        String bigDecimal = e9Var.b.toString();
        bigDecimal.getClass();
        r7fVar.m0(bigDecimal);
    }
}
