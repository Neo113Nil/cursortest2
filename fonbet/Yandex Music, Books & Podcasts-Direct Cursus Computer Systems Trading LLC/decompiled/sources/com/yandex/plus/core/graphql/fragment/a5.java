package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a5 implements defpackage.pj {
    public static final List a = u75.h("metaShortcuts", "viewType");

    public static z4 c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.i0 i0Var;
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        com.yandex.plus.core.graphql.type.i0 i0Var2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            int i = 0;
            if (z0 == 0) {
                b5 b5Var = b5.a;
                defpackage.tj tjVar = defpackage.uj.a;
                j8g j8gVar = new j8g(new qhj(b5Var, true), 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList = null;
                } else {
                    arrayList = j8gVar.c(a7fVar, fx6Var);
                }
            } else {
                if (z0 != 1) {
                    i0Var2.getClass();
                    return new z4(arrayList, i0Var2);
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
