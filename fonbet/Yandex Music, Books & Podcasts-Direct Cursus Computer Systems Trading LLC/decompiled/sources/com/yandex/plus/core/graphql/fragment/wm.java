package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class wm implements defpackage.pj {
    public static final List a = u75.h("text", "url");

    public static km c(a7f a7fVar, fx6 fx6Var) {
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
                    return new km(str, str2);
                }
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, km kmVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        kmVar.getClass();
        r7fVar.Z("text");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, kmVar.a);
        r7fVar.Z("url");
        tjVar.a(r7fVar, fx6Var, kmVar.b);
    }
}
