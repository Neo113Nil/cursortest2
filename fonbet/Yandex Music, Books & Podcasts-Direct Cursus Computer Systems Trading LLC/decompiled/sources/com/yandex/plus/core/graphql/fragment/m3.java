package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class m3 implements defpackage.pj {
    public static final List a = u75.h("name", "text");

    public static f3 c(a7f a7fVar, fx6 fx6Var) {
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
                    return new f3(str, str2);
                }
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, f3 f3Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        f3Var.getClass();
        r7fVar.Z("name");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, f3Var.a);
        r7fVar.Z("text");
        tjVar.a(r7fVar, fx6Var, f3Var.b);
    }
}
