package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class p6 implements defpackage.pj {
    public static final p6 a = new p6();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        j6 j6Var = (j6) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        j6Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, j6Var.a);
        List list = w4.a;
        w4.d(r7fVar, fx6Var, j6Var.b);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        u4 c = w4.c(a7fVar, fx6Var);
        str.getClass();
        return new j6(str, c);
    }
}
