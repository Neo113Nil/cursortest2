package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class k9 implements defpackage.pj {
    public static final k9 a = new k9();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        g9 g9Var = (g9) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        g9Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, g9Var.a);
        List list = bn.a;
        bn.d(r7fVar, fx6Var, g9Var.b);
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
        an c = bn.c(a7fVar, fx6Var);
        str.getClass();
        return new g9(str, c);
    }
}
