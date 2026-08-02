package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tlm;
import defpackage.u75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class rl implements defpackage.pj {
    public static final rl a = new rl();
    public static final List b = u75.h("actionType", "silent", "subscriptionButtonType", "subscriptionPaymentMethod", "subscriptionProductFeatures", "subscriptionWidgetType", "acquisitionPlatformSubscriptionProperties");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        kl klVar = (kl) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        klVar.getClass();
        r7fVar.Z("actionType");
        r7fVar.m0(klVar.a.a);
        r7fVar.Z("silent");
        defpackage.uj.f.a(r7fVar, fx6Var, Boolean.valueOf(klVar.b));
        r7fVar.Z("subscriptionButtonType");
        com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.v;
        com.yandex.plus.core.graphql.type.m0 m0Var = klVar.c;
        if (m0Var == null) {
            r7fVar.B0();
        } else {
            aVar.a(r7fVar, fx6Var, m0Var);
        }
        r7fVar.Z("subscriptionPaymentMethod");
        com.yandex.plus.core.graphql.type.adapter.a aVar2 = com.yandex.plus.core.graphql.type.adapter.a.w;
        com.yandex.plus.core.graphql.type.n0 n0Var = klVar.d;
        if (n0Var == null) {
            r7fVar.B0();
        } else {
            aVar2.a(r7fVar, fx6Var, n0Var);
        }
        r7fVar.Z("subscriptionProductFeatures");
        defpackage.tj tjVar = defpackage.uj.a;
        ArrayList arrayList = klVar.e;
        r7fVar.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tjVar.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
        r7fVar.Z("subscriptionWidgetType");
        com.yandex.plus.core.graphql.type.adapter.a aVar3 = com.yandex.plus.core.graphql.type.adapter.a.x;
        com.yandex.plus.core.graphql.type.o0 o0Var = klVar.f;
        if (o0Var == null) {
            r7fVar.B0();
        } else {
            aVar3.a(r7fVar, fx6Var, o0Var);
        }
        r7fVar.Z("acquisitionPlatformSubscriptionProperties");
        qhj qhjVar = new qhj(ql.a, false);
        jl jlVar = klVar.g;
        if (jlVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, jlVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r3 = r1;
        r2.getClass();
        r3.getClass();
        r3 = r3.booleanValue();
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.kl(r2, r3, r4, r5, r6, r7, r8);
     */
    @Override // defpackage.pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Boolean bool;
        com.yandex.plus.core.graphql.type.b bVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        a7fVar.getClass();
        fx6Var.getClass();
        Boolean bool2 = null;
        com.yandex.plus.core.graphql.type.b bVar2 = null;
        com.yandex.plus.core.graphql.type.m0 m0Var = null;
        com.yandex.plus.core.graphql.type.n0 n0Var = null;
        ArrayList arrayList = null;
        com.yandex.plus.core.graphql.type.o0 o0Var = null;
        jl jlVar = null;
        while (true) {
            int i = 0;
            switch (a7fVar.z0(b)) {
                case 0:
                    bool = bool2;
                    String f0 = a7fVar.f0();
                    f0.getClass();
                    com.yandex.plus.core.graphql.type.b.b.getClass();
                    com.yandex.plus.core.graphql.type.b[] values = com.yandex.plus.core.graphql.type.b.values();
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            bVar = values[i];
                            if (!bVar.a.equals(f0)) {
                                i++;
                            }
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar != null) {
                        bVar2 = bVar;
                        break;
                    } else {
                        bVar2 = com.yandex.plus.core.graphql.type.b.UNKNOWN__;
                        break;
                    }
                case 1:
                    bool2 = (Boolean) defpackage.uj.f.b(a7fVar, fx6Var);
                    continue;
                case 2:
                    bool = bool2;
                    com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.v;
                    defpackage.tj tjVar = defpackage.uj.a;
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = aVar.b(a7fVar, fx6Var);
                    }
                    m0Var = (com.yandex.plus.core.graphql.type.m0) obj;
                    break;
                case 3:
                    bool = bool2;
                    com.yandex.plus.core.graphql.type.adapter.a aVar2 = com.yandex.plus.core.graphql.type.adapter.a.w;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = aVar2.b(a7fVar, fx6Var);
                    }
                    n0Var = (com.yandex.plus.core.graphql.type.n0) obj2;
                    break;
                case 4:
                    bool = bool2;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    arrayList = tlm.n(a7fVar);
                    while (a7fVar.hasNext()) {
                        arrayList.add(tjVar3.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    break;
                case 5:
                    bool = bool2;
                    com.yandex.plus.core.graphql.type.adapter.a aVar3 = com.yandex.plus.core.graphql.type.adapter.a.x;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj3 = null;
                    } else {
                        obj3 = aVar3.b(a7fVar, fx6Var);
                    }
                    o0Var = (com.yandex.plus.core.graphql.type.o0) obj3;
                    break;
                case 6:
                    bool = bool2;
                    ql qlVar = ql.a;
                    defpackage.tj tjVar5 = defpackage.uj.a;
                    qhj qhjVar = new qhj(qlVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj4 = null;
                    } else {
                        obj4 = qhjVar.b(a7fVar, fx6Var);
                    }
                    jlVar = (jl) obj4;
                    break;
            }
            bool2 = bool;
        }
    }
}
