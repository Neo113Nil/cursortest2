package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class hl implements defpackage.pj {
    public static final List a = u75.h("widgetsLevelId", "contentDescription", "elements", "displayRules", "strictAction");

    public static dl c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object obj2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        zk zkVar = null;
        ArrayList arrayList = null;
        al alVar = null;
        cl clVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                el elVar = el.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(elVar, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj2 = null;
                } else {
                    obj2 = qhjVar.b(a7fVar, fx6Var);
                }
                zkVar = (zk) obj2;
            } else if (z0 == 2) {
                gl glVar = gl.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(glVar, true);
                a7fVar.m();
                ArrayList arrayList2 = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList2.add(qhjVar2.b(a7fVar, fx6Var));
                }
                a7fVar.l();
                arrayList = arrayList2;
            } else if (z0 == 3) {
                fl flVar = fl.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                alVar = (al) new qhj(flVar, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 4) {
                    str.getClass();
                    arrayList.getClass();
                    alVar.getClass();
                    return new dl(str, zkVar, arrayList, alVar, clVar);
                }
                il ilVar = il.a;
                defpackage.tj tjVar4 = defpackage.uj.a;
                qhj qhjVar3 = new qhj(ilVar, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    obj = null;
                } else {
                    obj = qhjVar3.b(a7fVar, fx6Var);
                }
                clVar = (cl) obj;
            }
        }
    }
}
