package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class h7 implements defpackage.pj {
    public static final h7 a = new h7();
    public static final List b = t75.c("color");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        a7 a7Var = (a7) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        a7Var.getClass();
        r7fVar.Z("color");
        defpackage.uj.a.a(r7fVar, fx6Var, a7Var.a);
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
        return new a7(str);
    }
}
