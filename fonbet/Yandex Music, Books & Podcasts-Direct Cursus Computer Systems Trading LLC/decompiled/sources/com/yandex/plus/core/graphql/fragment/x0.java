package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class x0 implements defpackage.pj {
    public static final x0 a = new x0();
    public static final List b = t75.c("rgba");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        k0 k0Var = (k0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        k0Var.getClass();
        r7fVar.Z("rgba");
        defpackage.uj.a.a(r7fVar, fx6Var, k0Var.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        str.getClass();
        return new k0(str);
    }
}
