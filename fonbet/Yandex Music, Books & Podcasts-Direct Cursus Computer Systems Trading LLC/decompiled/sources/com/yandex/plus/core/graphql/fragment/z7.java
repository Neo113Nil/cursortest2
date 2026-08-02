package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class z7 implements defpackage.pj {
    public static final z7 a = new z7();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        r7 r7Var = (r7) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        r7Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, r7Var.a);
        List list = p8.a;
        p8.d(r7fVar, fx6Var, r7Var.b);
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
        o8 c = p8.c(a7fVar, fx6Var);
        str.getClass();
        return new r7(str, c);
    }
}
