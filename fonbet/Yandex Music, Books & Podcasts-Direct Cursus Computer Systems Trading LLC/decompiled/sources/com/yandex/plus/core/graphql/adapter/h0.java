package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.v8;
import com.yandex.plus.core.graphql.fragment.w8;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class h0 implements pj {
    public static final h0 a = new h0();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.k0 k0Var = (com.yandex.plus.core.graphql.k0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        k0Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, k0Var.a);
        List list = w8.a;
        w8.d(r7fVar, fx6Var, k0Var.b);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        v8 c = w8.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.k0(str, c);
    }
}
