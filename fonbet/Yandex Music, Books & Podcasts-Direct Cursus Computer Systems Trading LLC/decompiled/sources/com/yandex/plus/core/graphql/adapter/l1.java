package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.t6;
import com.yandex.plus.core.graphql.fragment.u6;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class l1 implements pj {
    public static final l1 a = new l1();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.y1 y1Var = (com.yandex.plus.core.graphql.y1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        y1Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, y1Var.a);
        List list = u6.a;
        u6.d(r7fVar, fx6Var, y1Var.b);
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
        t6 c = u6.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.y1(str, c);
    }
}
