package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class d6 implements defpackage.pj {
    public static final d6 a = new d6();
    public static final List b = t75.c("color");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        z5 z5Var = (z5) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        z5Var.getClass();
        r7fVar.Z("color");
        defpackage.uj.i.a(r7fVar, fx6Var, z5Var.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
        }
        return new z5(str);
    }
}
