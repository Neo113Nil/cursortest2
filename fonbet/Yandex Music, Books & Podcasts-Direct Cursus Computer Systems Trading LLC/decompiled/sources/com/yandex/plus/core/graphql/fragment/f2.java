package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.tlm;
import defpackage.u75;
import defpackage.vgj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class f2 implements defpackage.pj {
    public static final List a = u75.h("tariffOffer", "optionOffers", "legalInfo", "paymentText", "successScreen", "invoices", "silentInvoiceAvailable");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r5.getClass();
        r6.getClass();
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.e2(r2, r3, r4, r5, r6, r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e2 c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object obj2;
        Object b;
        a7fVar.getClass();
        fx6Var.getClass();
        c2 c2Var = null;
        ArrayList arrayList = null;
        x1 x1Var = null;
        a2 a2Var = null;
        b2 b2Var = null;
        ArrayList arrayList2 = null;
        Boolean bool = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    m2 m2Var = m2.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(m2Var, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar.b(a7fVar, fx6Var);
                    }
                    c2Var = (c2) obj;
                    break;
                case 1:
                    j2 j2Var = j2.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    j8g j8gVar = new j8g(new vgj(new qhj(j2Var, true)), 0);
                    if (a7fVar.peek() != 10) {
                        arrayList = j8gVar.c(a7fVar, fx6Var);
                        break;
                    } else {
                        a7fVar.w();
                        arrayList = null;
                        break;
                    }
                case 2:
                    h2 h2Var = h2.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(h2Var, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    x1Var = (x1) obj2;
                    break;
                case 3:
                    k2 k2Var = k2.a;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    a2Var = (a2) new qhj(k2Var, false).b(a7fVar, fx6Var);
                    break;
                case 4:
                    l2 l2Var = l2.a;
                    defpackage.tj tjVar5 = defpackage.uj.a;
                    b2Var = (b2) new qhj(l2Var, false).b(a7fVar, fx6Var);
                    break;
                case 5:
                    g2 g2Var = g2.a;
                    defpackage.tj tjVar6 = defpackage.uj.a;
                    qhj qhjVar3 = new qhj(g2Var, false);
                    ArrayList n = tlm.n(a7fVar);
                    while (a7fVar.hasNext()) {
                        if (a7fVar.peek() == 10) {
                            a7fVar.w();
                            b = null;
                        } else {
                            b = qhjVar3.b(a7fVar, fx6Var);
                        }
                        n.add(b);
                    }
                    a7fVar.l();
                    arrayList2 = n;
                    break;
                case 6:
                    bool = (Boolean) defpackage.uj.l.b(a7fVar, fx6Var);
                    break;
            }
        }
    }
}
