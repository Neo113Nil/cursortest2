package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.r2;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class y1 implements pj {
    public static final y1 a = new y1();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        r2 r2Var = (r2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        r2Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, r2Var.a);
        List list = com.yandex.plus.core.graphql.fragment.v.a;
        com.yandex.plus.core.graphql.fragment.v.d(r7fVar, fx6Var, r2Var.b);
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
        com.yandex.plus.core.graphql.fragment.u c = com.yandex.plus.core.graphql.fragment.v.c(a7fVar, fx6Var);
        str.getClass();
        return new r2(str, c);
    }
}
