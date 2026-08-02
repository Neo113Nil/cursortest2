package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.am;
import com.yandex.plus.core.graphql.fragment.yl;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class i implements pj {
    public static final i a = new i();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.k kVar = (com.yandex.plus.core.graphql.k) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        kVar.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, kVar.a);
        List list = am.a;
        am.d(r7fVar, fx6Var, kVar.b);
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
        yl c = am.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.k(str, c);
    }
}
