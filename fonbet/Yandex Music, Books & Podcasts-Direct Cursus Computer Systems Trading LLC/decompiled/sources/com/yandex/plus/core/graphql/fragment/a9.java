package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class a9 implements defpackage.pj {
    public static final a9 a = new a9();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        t8 t8Var = (t8) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        t8Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, t8Var.a);
        List list = f9.a;
        f9.d(r7fVar, fx6Var, t8Var.b);
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
        e9 c = f9.c(a7fVar, fx6Var);
        str.getClass();
        return new t8(str, c);
    }
}
