package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.t75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class p4 implements defpackage.pj {
    public static final List a = t75.c("sectionGroups");

    public static o4 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        while (a7fVar.z0(a) == 0) {
            r4 r4Var = r4.a;
            defpackage.tj tjVar = defpackage.uj.a;
            qhj qhjVar = new qhj(r4Var, false);
            a7fVar.m();
            arrayList = new ArrayList();
            while (a7fVar.hasNext()) {
                arrayList.add(qhjVar.b(a7fVar, fx6Var));
            }
            a7fVar.l();
        }
        arrayList.getClass();
        return new o4(arrayList);
    }
}
