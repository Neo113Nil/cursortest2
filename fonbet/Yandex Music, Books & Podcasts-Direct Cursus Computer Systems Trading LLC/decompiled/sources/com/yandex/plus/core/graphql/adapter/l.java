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
public abstract class l implements pj {
    public static final List a = u75.h("__typename", "bankName", "widgetUrls");

    public static com.yandex.plus.core.graphql.n c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        com.yandex.plus.core.graphql.z zVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) uj.i.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    a7fVar.k();
                    vb c = zb.c(a7fVar, fx6Var);
                    str.getClass();
                    return new com.yandex.plus.core.graphql.n(str, str2, zVar, c);
                }
                x xVar = x.a;
                tj tjVar = uj.a;
                qhj qhjVar = new qhj(xVar, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b = null;
                } else {
                    b = qhjVar.b(a7fVar, fx6Var);
                }
                zVar = (com.yandex.plus.core.graphql.z) b;
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, com.yandex.plus.core.graphql.n nVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        nVar.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, nVar.a);
        r7fVar.Z("bankName");
        uj.i.a(r7fVar, fx6Var, nVar.b);
        r7fVar.Z("widgetUrls");
        qhj qhjVar = new qhj(x.a, false);
        com.yandex.plus.core.graphql.z zVar = nVar.c;
        if (zVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, zVar);
        }
        List list = zb.a;
        zb.d(r7fVar, fx6Var, nVar.d);
    }
}
