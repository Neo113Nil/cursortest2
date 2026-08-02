package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.u75;
import defpackage.uj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class h implements pj {
    public static final h a = new h();
    public static final List b = u75.h("groupTitle", "groupButtons");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.j jVar = (com.yandex.plus.core.graphql.j) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        jVar.getClass();
        r7fVar.Z("groupTitle");
        uj.a.a(r7fVar, fx6Var, jVar.a);
        r7fVar.Z("groupButtons");
        uj.a(uj.i).e(r7fVar, fx6Var, jVar.b);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    arrayList.getClass();
                    return new com.yandex.plus.core.graphql.j(str, arrayList);
                }
                arrayList = uj.a(uj.i).c(a7fVar, fx6Var);
            }
        }
    }
}
