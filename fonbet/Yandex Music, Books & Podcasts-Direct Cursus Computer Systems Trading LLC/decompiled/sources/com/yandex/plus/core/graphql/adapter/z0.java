package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class z0 implements pj {
    public static final z0 a = new z0();
    public static final List b = u75.h("agreementDefaultStatus", "logic", "text");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.j1 j1Var = (com.yandex.plus.core.graphql.j1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        j1Var.getClass();
        r7fVar.Z("agreementDefaultStatus");
        r7fVar.m0(j1Var.a.a);
        r7fVar.Z("logic");
        r7fVar.m0(j1Var.b.a);
        r7fVar.Z("text");
        d1 d1Var = d1.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.n1 n1Var = j1Var.c;
        r7fVar.j();
        d1Var.a(r7fVar, fx6Var, n1Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.b1 b1Var;
        com.yandex.plus.core.graphql.type.c1 c1Var;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.c1 c1Var2 = null;
        com.yandex.plus.core.graphql.type.b1 b1Var2 = null;
        com.yandex.plus.core.graphql.n1 n1Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            int i = 0;
            if (z0 == 0) {
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.c1.b.getClass();
                com.yandex.plus.core.graphql.type.c1[] values = com.yandex.plus.core.graphql.type.c1.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        c1Var = null;
                        break;
                    }
                    c1Var = values[i];
                    if (c1Var.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                c1Var2 = c1Var == null ? com.yandex.plus.core.graphql.type.c1.UNKNOWN__ : c1Var;
            } else if (z0 == 1) {
                String f02 = a7fVar.f0();
                f02.getClass();
                com.yandex.plus.core.graphql.type.b1.b.getClass();
                com.yandex.plus.core.graphql.type.b1[] values2 = com.yandex.plus.core.graphql.type.b1.values();
                int length2 = values2.length;
                while (true) {
                    if (i >= length2) {
                        b1Var = null;
                        break;
                    }
                    b1Var = values2[i];
                    if (b1Var.a.equals(f02)) {
                        break;
                    }
                    i++;
                }
                b1Var2 = b1Var == null ? com.yandex.plus.core.graphql.type.b1.UNKNOWN__ : b1Var;
            } else {
                if (z0 != 2) {
                    c1Var2.getClass();
                    b1Var2.getClass();
                    n1Var.getClass();
                    return new com.yandex.plus.core.graphql.j1(c1Var2, b1Var2, n1Var);
                }
                d1 d1Var = d1.a;
                tj tjVar = uj.a;
                n1Var = (com.yandex.plus.core.graphql.n1) new qhj(d1Var, false).b(a7fVar, fx6Var);
            }
        }
    }
}
