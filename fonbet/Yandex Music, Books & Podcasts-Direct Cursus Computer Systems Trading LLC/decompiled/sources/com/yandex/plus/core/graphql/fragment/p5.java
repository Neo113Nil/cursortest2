package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.u75;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class p5 implements defpackage.pj {
    public static final List a = u75.h("textStyle", C0479n3.g, "commonOverlays", "actions");

    public static j5 c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        i5 i5Var = null;
        d5 d5Var = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                r5 r5Var = r5.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(r5Var, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                i5Var = (i5) b2;
            } else if (z0 == 1) {
                l5 l5Var = l5.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(l5Var, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b = null;
                } else {
                    b = qhjVar2.b(a7fVar, fx6Var);
                }
                d5Var = (d5) b;
            } else if (z0 == 2) {
                o5 o5Var = o5.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                j8g j8gVar = new j8g(new qhj(o5Var, true), 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList = null;
                } else {
                    arrayList = j8gVar.c(a7fVar, fx6Var);
                }
            } else {
                if (z0 != 3) {
                    arrayList2.getClass();
                    return new j5(i5Var, d5Var, arrayList, arrayList2);
                }
                k5 k5Var = k5.a;
                defpackage.tj tjVar4 = defpackage.uj.a;
                qhj qhjVar3 = new qhj(k5Var, true);
                a7fVar.m();
                arrayList2 = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList2.add(qhjVar3.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            }
        }
    }
}
