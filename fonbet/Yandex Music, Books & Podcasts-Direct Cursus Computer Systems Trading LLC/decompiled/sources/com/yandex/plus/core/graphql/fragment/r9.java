package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class r9 implements defpackage.pj {
    public static final List a = u75.h("text", "items");

    public static o9 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    arrayList.getClass();
                    return new o9(str, arrayList);
                }
                q9 q9Var = q9.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(q9Var, false);
                a7fVar.m();
                arrayList = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, o9 o9Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        o9Var.getClass();
        r7fVar.Z("text");
        defpackage.uj.a.a(r7fVar, fx6Var, o9Var.a);
        r7fVar.Z("items");
        q9 q9Var = q9.a;
        ArrayList arrayList = o9Var.b;
        r7fVar.m();
        for (Object obj : arrayList) {
            r7fVar.j();
            q9Var.a(r7fVar, fx6Var, obj);
            r7fVar.p();
        }
        r7fVar.l();
    }
}
