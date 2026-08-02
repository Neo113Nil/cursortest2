package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class bf implements defpackage.pj {
    public static final List a = u75.h("widgets", "widgetGroups", "widgetsLevels", "plaques", "prefetchPlaqueList", "defaultPlaqueList", "fallbackPlaqueList");

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        r2.getClass();
        r4.getClass();
        r5.getClass();
        r6.getClass();
        r7.getClass();
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        return new com.yandex.plus.core.graphql.fragment.xe(r2, r3, r4, r5, r6, r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xe c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        ArrayList arrayList7 = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    df dfVar = df.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(dfVar, true);
                    a7fVar.m();
                    ArrayList arrayList8 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList8.add(qhjVar.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList = arrayList8;
                    break;
                case 1:
                    ef efVar = ef.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    j8g j8gVar = new j8g(new qhj(efVar, true), 0);
                    if (a7fVar.peek() != 10) {
                        arrayList2 = j8gVar.c(a7fVar, fx6Var);
                        break;
                    } else {
                        a7fVar.w();
                        arrayList2 = null;
                        break;
                    }
                case 2:
                    ff ffVar = ff.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(ffVar, true);
                    a7fVar.m();
                    ArrayList arrayList9 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList9.add(qhjVar2.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList3 = arrayList9;
                    break;
                case 3:
                    af afVar = af.a;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    qhj qhjVar3 = new qhj(afVar, true);
                    a7fVar.m();
                    ArrayList arrayList10 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList10.add(qhjVar3.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList4 = arrayList10;
                    break;
                case 4:
                    cf cfVar = cf.a;
                    defpackage.tj tjVar5 = defpackage.uj.a;
                    qhj qhjVar4 = new qhj(cfVar, true);
                    a7fVar.m();
                    ArrayList arrayList11 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList11.add(qhjVar4.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList5 = arrayList11;
                    break;
                case 5:
                    ye yeVar = ye.a;
                    defpackage.tj tjVar6 = defpackage.uj.a;
                    qhj qhjVar5 = new qhj(yeVar, true);
                    a7fVar.m();
                    ArrayList arrayList12 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList12.add(qhjVar5.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList6 = arrayList12;
                    break;
                case 6:
                    ze zeVar = ze.a;
                    defpackage.tj tjVar7 = defpackage.uj.a;
                    qhj qhjVar6 = new qhj(zeVar, true);
                    a7fVar.m();
                    ArrayList arrayList13 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList13.add(qhjVar6.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList7 = arrayList13;
                    break;
            }
        }
    }
}
