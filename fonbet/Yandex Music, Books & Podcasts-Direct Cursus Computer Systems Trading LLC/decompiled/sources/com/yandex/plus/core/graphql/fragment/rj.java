package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class rj implements defpackage.pj {
    public static final List a = t75.c("__typename");

    public static mj c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(a) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        bj c = cj.c(a7fVar, fx6Var);
        str.getClass();
        return new mj(str, c);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, mj mjVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        mjVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, mjVar.a);
        List list = cj.a;
        cj.d(r7fVar, fx6Var, mjVar.b);
    }
}
