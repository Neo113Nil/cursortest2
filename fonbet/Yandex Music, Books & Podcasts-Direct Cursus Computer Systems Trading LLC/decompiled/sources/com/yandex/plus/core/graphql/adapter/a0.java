package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class a0 implements pj {
    public static final a0 a = new a0();
    public static final List b = t75.c("text");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.c0 c0Var = (com.yandex.plus.core.graphql.c0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        c0Var.getClass();
        r7fVar.Z("text");
        uj.a.a(r7fVar, fx6Var, c0Var.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) uj.a.b(a7fVar, fx6Var);
        }
        str.getClass();
        return new com.yandex.plus.core.graphql.c0(str);
    }
}
