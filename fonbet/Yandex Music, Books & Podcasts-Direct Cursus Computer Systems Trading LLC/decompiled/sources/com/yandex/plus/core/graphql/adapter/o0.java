package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.tlm;
import defpackage.u75;
import defpackage.uj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class o0 implements pj {
    public static final o0 a = new o0();
    public static final List b = u75.h("flags", "testId");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.t0 t0Var = (com.yandex.plus.core.graphql.t0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        t0Var.getClass();
        r7fVar.Z("flags");
        tj tjVar = uj.a;
        ArrayList arrayList = t0Var.a;
        r7fVar.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tjVar.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
        r7fVar.Z("testId");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.a).a(r7fVar, fx6Var, Long.valueOf(t0Var.b));
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        Long l = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                tj tjVar = uj.a;
                ArrayList n = tlm.n(a7fVar);
                while (a7fVar.hasNext()) {
                    n.add(tjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
                arrayList = n;
            } else {
                if (z0 != 1) {
                    arrayList.getClass();
                    l.getClass();
                    return new com.yandex.plus.core.graphql.t0(arrayList, l.longValue());
                }
                l = (Long) fx6Var.e(com.yandex.plus.core.graphql.type.z.a).b(a7fVar, fx6Var);
            }
        }
    }
}
