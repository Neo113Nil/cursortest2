package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class p2 implements defpackage.pj {
    public static final List a = u75.h("positionId", "structureType", "forActiveTariff", "tariffOffer", "optionOffers", "legalInfo", "invoices", "asset", "silentInvoiceAvailable");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r12 = r3;
        r4.getClass();
        r5.getClass();
        r8.getClass();
        r10.getClass();
        r11.getClass();
        r12.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003c, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.v1(r4, r5, r6, r7, r8, r9, r10, r11, r12.booleanValue());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v1 c(a7f a7fVar, fx6 fx6Var) {
        Boolean bool;
        com.yandex.plus.core.graphql.type.g gVar;
        Object obj;
        Object obj2;
        Object obj3;
        a7fVar.getClass();
        fx6Var.getClass();
        Boolean bool2 = null;
        String str = null;
        com.yandex.plus.core.graphql.type.g gVar2 = null;
        p1 p1Var = null;
        t1 t1Var = null;
        ArrayList arrayList = null;
        r1 r1Var = null;
        ArrayList arrayList2 = null;
        o1 o1Var = null;
        while (true) {
            int i = 0;
            switch (a7fVar.z0(a)) {
                case 0:
                    str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    continue;
                case 1:
                    bool = bool2;
                    String f0 = a7fVar.f0();
                    f0.getClass();
                    com.yandex.plus.core.graphql.type.g.b.getClass();
                    com.yandex.plus.core.graphql.type.g[] values = com.yandex.plus.core.graphql.type.g.values();
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            gVar = values[i];
                            if (!gVar.a.equals(f0)) {
                                i++;
                            }
                        } else {
                            gVar = null;
                        }
                    }
                    if (gVar != null) {
                        gVar2 = gVar;
                        break;
                    } else {
                        gVar2 = com.yandex.plus.core.graphql.type.g.UNKNOWN__;
                        break;
                    }
                case 2:
                    bool = bool2;
                    q2 q2Var = q2.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(q2Var, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar.b(a7fVar, fx6Var);
                    }
                    p1Var = (p1) obj;
                    break;
                case 3:
                    bool = bool2;
                    u2 u2Var = u2.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(u2Var, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    t1Var = (t1) obj2;
                    break;
                case 4:
                    bool = bool2;
                    t2 t2Var = t2.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar3 = new qhj(t2Var, true);
                    a7fVar.m();
                    ArrayList arrayList3 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList3.add(qhjVar3.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList = arrayList3;
                    break;
                case 5:
                    bool = bool2;
                    s2 s2Var = s2.a;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    qhj qhjVar4 = new qhj(s2Var, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj3 = null;
                    } else {
                        obj3 = qhjVar4.b(a7fVar, fx6Var);
                    }
                    r1Var = (r1) obj3;
                    break;
                case 6:
                    bool = bool2;
                    r2 r2Var = r2.a;
                    defpackage.tj tjVar5 = defpackage.uj.a;
                    qhj qhjVar5 = new qhj(r2Var, false);
                    a7fVar.m();
                    ArrayList arrayList4 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList4.add(qhjVar5.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList2 = arrayList4;
                    break;
                case 7:
                    bool = bool2;
                    o2 o2Var = o2.a;
                    defpackage.tj tjVar6 = defpackage.uj.a;
                    o1Var = (o1) new qhj(o2Var, false).b(a7fVar, fx6Var);
                    break;
                case 8:
                    bool2 = (Boolean) defpackage.uj.f.b(a7fVar, fx6Var);
                    continue;
            }
            bool2 = bool;
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, v1 v1Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        v1Var.getClass();
        r7fVar.Z("positionId");
        defpackage.uj.a.a(r7fVar, fx6Var, v1Var.a);
        r7fVar.Z("structureType");
        r7fVar.m0(v1Var.b.a);
        r7fVar.Z("forActiveTariff");
        qhj qhjVar = new qhj(q2.a, false);
        p1 p1Var = v1Var.c;
        if (p1Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, p1Var);
        }
        r7fVar.Z("tariffOffer");
        qhj qhjVar2 = new qhj(u2.a, true);
        t1 t1Var = v1Var.d;
        if (t1Var == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, t1Var);
        }
        r7fVar.Z("optionOffers");
        t2 t2Var = t2.a;
        ArrayList arrayList = v1Var.e;
        r7fVar.m();
        for (Object obj : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                t2Var.a(r7fVar, fx6Var, obj);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                t2Var.a(fahVar, fx6Var, obj);
                fahVar.p();
                Object b = fahVar.b();
                b.getClass();
                irf.V(r7fVar, b);
            }
        }
        r7fVar.l();
        r7fVar.Z("legalInfo");
        qhj qhjVar3 = new qhj(s2.a, true);
        r1 r1Var = v1Var.f;
        if (r1Var == null) {
            r7fVar.B0();
        } else {
            qhjVar3.a(r7fVar, fx6Var, r1Var);
        }
        r7fVar.Z("invoices");
        r2 r2Var = r2.a;
        ArrayList arrayList2 = v1Var.g;
        r7fVar.m();
        for (Object obj2 : arrayList2) {
            r7fVar.j();
            r2Var.a(r7fVar, fx6Var, obj2);
            r7fVar.p();
        }
        r7fVar.l();
        r7fVar.Z("asset");
        o2 o2Var = o2.a;
        o1 o1Var = v1Var.h;
        r7fVar.j();
        o2Var.a(r7fVar, fx6Var, o1Var);
        r7fVar.p();
        r7fVar.Z("silentInvoiceAvailable");
        defpackage.uj.f.a(r7fVar, fx6Var, Boolean.valueOf(v1Var.i));
    }
}
