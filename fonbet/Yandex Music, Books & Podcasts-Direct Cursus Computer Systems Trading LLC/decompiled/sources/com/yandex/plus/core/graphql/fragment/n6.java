package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class n6 implements defpackage.pj {
    public static final n6 a = new n6();
    public static final List b = t75.c("color");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        h6 h6Var = (h6) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        h6Var.getClass();
        r7fVar.Z("color");
        defpackage.uj.i.a(r7fVar, fx6Var, h6Var.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
        }
        return new h6(str);
    }
}
