package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class r5 implements defpackage.pj {
    public static final r5 a = new r5();
    public static final List b = t75.c("color");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        i5 i5Var = (i5) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        i5Var.getClass();
        r7fVar.Z("color");
        defpackage.uj.a.a(r7fVar, fx6Var, i5Var.a);
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
        return new i5(str);
    }
}
