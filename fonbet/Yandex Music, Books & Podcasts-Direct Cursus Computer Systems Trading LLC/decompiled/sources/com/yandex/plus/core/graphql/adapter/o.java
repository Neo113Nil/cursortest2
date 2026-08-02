package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.vb;
import com.yandex.plus.core.graphql.fragment.zb;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class o implements pj {
    public static final List a = u75.h("__typename", "widgetOpenCardUrls");

    public static com.yandex.plus.core.graphql.q c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        com.yandex.plus.core.graphql.w wVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    a7fVar.k();
                    vb c = zb.c(a7fVar, fx6Var);
                    str.getClass();
                    wVar.getClass();
                    return new com.yandex.plus.core.graphql.q(str, wVar, c);
                }
                u uVar = u.a;
                tj tjVar = uj.a;
                wVar = (com.yandex.plus.core.graphql.w) new qhj(uVar, false).b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, com.yandex.plus.core.graphql.q qVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        qVar.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, qVar.a);
        r7fVar.Z("widgetOpenCardUrls");
        u uVar = u.a;
        com.yandex.plus.core.graphql.w wVar = qVar.b;
        r7fVar.j();
        uVar.a(r7fVar, fx6Var, wVar);
        r7fVar.p();
        List list = zb.a;
        zb.d(r7fVar, fx6Var, qVar.c);
    }
}
