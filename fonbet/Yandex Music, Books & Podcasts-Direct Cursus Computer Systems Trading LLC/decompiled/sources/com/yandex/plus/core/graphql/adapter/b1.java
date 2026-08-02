package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class b1 implements pj {
    public static final List a = u75.h("name", "text", "url");

    public static com.yandex.plus.core.graphql.l1 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    return new com.yandex.plus.core.graphql.l1(str, str2, str3);
                }
                str3 = (String) uj.a.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, com.yandex.plus.core.graphql.l1 l1Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        l1Var.getClass();
        r7fVar.Z("name");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, l1Var.a);
        r7fVar.Z("text");
        tjVar.a(r7fVar, fx6Var, l1Var.b);
        r7fVar.Z("url");
        tjVar.a(r7fVar, fx6Var, l1Var.c);
    }
}
