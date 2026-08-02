package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.tlm;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class k4 implements defpackage.pj {
    public static final List a = u75.h("backgroundColors", "silent", "subscriptionButtonType", "subscriptionProductFeatures", "subscriptionProductTarget", "subscriptionPaymentMethod", "subscriptionWidgetType", "acquisitionPlatformSubscriptionProperties");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r3 = r1;
        r3.getClass();
        r3 = r3.booleanValue();
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.a4(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a4 c(a7f a7fVar, fx6 fx6Var) {
        Boolean bool;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        a7fVar.getClass();
        fx6Var.getClass();
        Boolean bool2 = null;
        x3 x3Var = null;
        com.yandex.plus.core.graphql.type.m0 m0Var = null;
        ArrayList arrayList = null;
        String str = null;
        com.yandex.plus.core.graphql.type.n0 n0Var = null;
        com.yandex.plus.core.graphql.type.o0 o0Var = null;
        u3 u3Var = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    bool = bool2;
                    g4 g4Var = g4.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(g4Var, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar.b(a7fVar, fx6Var);
                    }
                    x3Var = (x3) obj;
                    break;
                case 1:
                    bool2 = (Boolean) defpackage.uj.f.b(a7fVar, fx6Var);
                    continue;
                case 2:
                    bool = bool2;
                    com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.v;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = aVar.b(a7fVar, fx6Var);
                    }
                    m0Var = (com.yandex.plus.core.graphql.type.m0) obj2;
                    break;
                case 3:
                    bool = bool2;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    arrayList = tlm.n(a7fVar);
                    while (a7fVar.hasNext()) {
                        arrayList.add(tjVar3.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    break;
                case 4:
                    bool = bool2;
                    str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 5:
                    bool = bool2;
                    com.yandex.plus.core.graphql.type.adapter.a aVar2 = com.yandex.plus.core.graphql.type.adapter.a.w;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj3 = null;
                    } else {
                        obj3 = aVar2.b(a7fVar, fx6Var);
                    }
                    n0Var = (com.yandex.plus.core.graphql.type.n0) obj3;
                    break;
                case 6:
                    bool = bool2;
                    com.yandex.plus.core.graphql.type.adapter.a aVar3 = com.yandex.plus.core.graphql.type.adapter.a.x;
                    defpackage.tj tjVar5 = defpackage.uj.a;
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj4 = null;
                    } else {
                        obj4 = aVar3.b(a7fVar, fx6Var);
                    }
                    o0Var = (com.yandex.plus.core.graphql.type.o0) obj4;
                    break;
                case 7:
                    bool = bool2;
                    d4 d4Var = d4.a;
                    defpackage.tj tjVar6 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(d4Var, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj5 = null;
                    } else {
                        obj5 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    u3Var = (u3) obj5;
                    break;
            }
            bool2 = bool;
        }
    }
}
