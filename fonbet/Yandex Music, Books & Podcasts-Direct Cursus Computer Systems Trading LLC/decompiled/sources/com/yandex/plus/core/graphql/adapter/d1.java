package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.tlm;
import defpackage.u75;
import defpackage.uj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class d1 implements pj {
    public static final d1 a = new d1();
    public static final List b = u75.h("text", "parts");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.n1 n1Var = (com.yandex.plus.core.graphql.n1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        n1Var.getClass();
        r7fVar.Z("text");
        uj.a.a(r7fVar, fx6Var, n1Var.a);
        r7fVar.Z("parts");
        qhj qhjVar = new qhj(c1.a, true);
        ArrayList arrayList = n1Var.b;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                qhjVar.a(r7fVar, fx6Var, obj2);
            }
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
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
                    return new com.yandex.plus.core.graphql.n1(str, arrayList);
                }
                c1 c1Var = c1.a;
                tj tjVar = uj.a;
                qhj qhjVar = new qhj(c1Var, true);
                arrayList = tlm.n(a7fVar);
                while (a7fVar.hasNext()) {
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        b2 = null;
                    } else {
                        b2 = qhjVar.b(a7fVar, fx6Var);
                    }
                    arrayList.add(b2);
                }
                a7fVar.l();
            }
        }
    }
}
