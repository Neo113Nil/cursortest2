package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.vb;
import com.yandex.plus.core.graphql.fragment.zb;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class n implements pj {
    public static final List a = t75.c("__typename");

    public static com.yandex.plus.core.graphql.p c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(a) == 0) {
            str = (String) uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        vb c = zb.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.p(str, c);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, com.yandex.plus.core.graphql.p pVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        pVar.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, pVar.a);
        List list = zb.a;
        zb.d(r7fVar, fx6Var, pVar.b);
    }
}
