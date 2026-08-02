package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class rh implements defpackage.pj {
    public static final List a = u75.h("type", "argCheckingPredicate", "booleanLiteralPredicate", "notPredicate", "unifyingPredicate", "comparisonPredicate", "containsPredicate", "inSetPredicate");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.kh(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kh c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        com.yandex.plus.core.graphql.type.e eVar;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.e eVar2 = null;
        dh dhVar = null;
        eh ehVar = null;
        ih ihVar = null;
        jh jhVar = null;
        fh fhVar = null;
        gh ghVar = null;
        hh hhVar = null;
        while (true) {
            int i = 0;
            switch (a7fVar.z0(a)) {
                case 0:
                    String f0 = a7fVar.f0();
                    f0.getClass();
                    com.yandex.plus.core.graphql.type.e.b.getClass();
                    com.yandex.plus.core.graphql.type.e[] values = com.yandex.plus.core.graphql.type.e.values();
                    int length = values.length;
                    while (true) {
                        if (i < length) {
                            eVar = values[i];
                            if (!eVar.a.equals(f0)) {
                                i++;
                            }
                        } else {
                            eVar = null;
                        }
                    }
                    if (eVar != null) {
                        eVar2 = eVar;
                        break;
                    } else {
                        eVar2 = com.yandex.plus.core.graphql.type.e.UNKNOWN__;
                        break;
                    }
                case 1:
                    lh lhVar = lh.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(lhVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar.b(a7fVar, fx6Var);
                    }
                    dhVar = (dh) obj2;
                    break;
                case 2:
                    mh mhVar = mh.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(mhVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj3 = null;
                    } else {
                        obj3 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    ehVar = (eh) obj3;
                    break;
                case 3:
                    qh qhVar = qh.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar3 = new qhj(qhVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj4 = null;
                    } else {
                        obj4 = qhjVar3.b(a7fVar, fx6Var);
                    }
                    ihVar = (ih) obj4;
                    break;
                case 4:
                    sh shVar = sh.a;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    qhj qhjVar4 = new qhj(shVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj5 = null;
                    } else {
                        obj5 = qhjVar4.b(a7fVar, fx6Var);
                    }
                    jhVar = (jh) obj5;
                    break;
                case 5:
                    nh nhVar = nh.a;
                    defpackage.tj tjVar5 = defpackage.uj.a;
                    qhj qhjVar5 = new qhj(nhVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj6 = null;
                    } else {
                        obj6 = qhjVar5.b(a7fVar, fx6Var);
                    }
                    fhVar = (fh) obj6;
                    break;
                case 6:
                    oh ohVar = oh.a;
                    defpackage.tj tjVar6 = defpackage.uj.a;
                    qhj qhjVar6 = new qhj(ohVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj7 = null;
                    } else {
                        obj7 = qhjVar6.b(a7fVar, fx6Var);
                    }
                    ghVar = (gh) obj7;
                    break;
                case 7:
                    ph phVar = ph.a;
                    defpackage.tj tjVar7 = defpackage.uj.a;
                    qhj qhjVar7 = new qhj(phVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar7.b(a7fVar, fx6Var);
                    }
                    hhVar = (hh) obj;
                    break;
            }
        }
    }
}
