package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class t implements defpackage.pj {
    public static final List a = u75.h("name", "text");

    public static q c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    str2.getClass();
                    return new q(str, str2);
                }
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, q qVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        qVar.getClass();
        r7fVar.Z("name");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, qVar.a);
        r7fVar.Z("text");
        tjVar.a(r7fVar, fx6Var, qVar.b);
    }
}
