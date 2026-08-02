package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class x4 implements defpackage.pj {
    public static final x4 a = new x4();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        t4 t4Var = (t4) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        t4Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, t4Var.a);
        List list = j1.a;
        j1.d(r7fVar, fx6Var, t4Var.b);
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
        i1 c = j1.c(a7fVar, fx6Var);
        str.getClass();
        return new t4(str, c);
    }
}
