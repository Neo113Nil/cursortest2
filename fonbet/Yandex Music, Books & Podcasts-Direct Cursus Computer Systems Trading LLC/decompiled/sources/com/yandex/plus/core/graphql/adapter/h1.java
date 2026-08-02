package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.p2;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class h1 implements pj {
    public static final h1 a = new h1();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.s1 s1Var = (com.yandex.plus.core.graphql.s1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        s1Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, s1Var.a);
        List list = p2.a;
        p2.d(r7fVar, fx6Var, s1Var.b);
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
        com.yandex.plus.core.graphql.fragment.v1 c = p2.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.s1(str, c);
    }
}
