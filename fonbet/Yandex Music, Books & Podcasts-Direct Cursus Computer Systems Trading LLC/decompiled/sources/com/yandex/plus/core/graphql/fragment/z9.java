package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class z9 implements defpackage.pj {
    public static final z9 a = new z9();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        w9 w9Var = (w9) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        w9Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, w9Var.a);
        List list = la.a;
        la.d(r7fVar, fx6Var, w9Var.b);
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
        ka c = la.c(a7fVar, fx6Var);
        str.getClass();
        return new w9(str, c);
    }
}
