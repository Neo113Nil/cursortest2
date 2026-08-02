package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.tlm;
import defpackage.u75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class sh implements defpackage.pj {
    public static final sh a = new sh();
    public static final List b = u75.h("type", "nodeIds");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        jh jhVar = (jh) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        jhVar.getClass();
        r7fVar.Z("type");
        r7fVar.m0(jhVar.a.a);
        r7fVar.Z("nodeIds");
        defpackage.tj tjVar = defpackage.uj.b;
        ArrayList arrayList = jhVar.b;
        r7fVar.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tjVar.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.u0 u0Var;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.u0 u0Var2 = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.u0.b.getClass();
                com.yandex.plus.core.graphql.type.u0[] values = com.yandex.plus.core.graphql.type.u0.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        u0Var = null;
                        break;
                    }
                    u0Var = values[i];
                    if (u0Var.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                u0Var2 = u0Var == null ? com.yandex.plus.core.graphql.type.u0.UNKNOWN__ : u0Var;
            } else {
                if (z0 != 1) {
                    u0Var2.getClass();
                    arrayList.getClass();
                    return new jh(u0Var2, arrayList);
                }
                defpackage.tj tjVar = defpackage.uj.b;
                ArrayList n = tlm.n(a7fVar);
                while (a7fVar.hasNext()) {
                    n.add(tjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
                arrayList = n;
            }
        }
    }
}
