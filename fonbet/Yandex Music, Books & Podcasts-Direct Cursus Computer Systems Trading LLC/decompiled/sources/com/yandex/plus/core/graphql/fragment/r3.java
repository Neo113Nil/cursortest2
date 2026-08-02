package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class r3 implements defpackage.pj {
    public static final List a = u75.h("metaShortcuts", "shortcuts", "viewType");

    public static q3 c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.i0 i0Var;
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        com.yandex.plus.core.graphql.type.i0 i0Var2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            int i = 0;
            if (z0 == 0) {
                s3 s3Var = s3.a;
                defpackage.tj tjVar = defpackage.uj.a;
                j8g j8gVar = new j8g(new qhj(s3Var, true), 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList = null;
                } else {
                    arrayList = j8gVar.c(a7fVar, fx6Var);
                }
            } else if (z0 == 1) {
                t3 t3Var = t3.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                j8g j8gVar2 = new j8g(new qhj(t3Var, true), 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList2 = null;
                } else {
                    arrayList2 = j8gVar2.c(a7fVar, fx6Var);
                }
            } else {
                if (z0 != 2) {
                    i0Var2.getClass();
                    return new q3(arrayList, arrayList2, i0Var2);
                }
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.i0.b.getClass();
                com.yandex.plus.core.graphql.type.i0[] values = com.yandex.plus.core.graphql.type.i0.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        i0Var = null;
                        break;
                    }
                    i0Var = values[i];
                    if (i0Var.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                i0Var2 = i0Var == null ? com.yandex.plus.core.graphql.type.i0.UNKNOWN__ : i0Var;
            }
        }
    }
}
