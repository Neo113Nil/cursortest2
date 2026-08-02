package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class u6 implements defpackage.pj {
    public static final List a = u75.h("shortcuts", ConnectableDevice.KEY_ID, "viewType");

    public static t6 c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.i0 i0Var;
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        String str = null;
        com.yandex.plus.core.graphql.type.i0 i0Var2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            int i = 0;
            if (z0 == 0) {
                v6 v6Var = v6.a;
                defpackage.tj tjVar = defpackage.uj.a;
                j8g j8gVar = new j8g(new qhj(v6Var, true), 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList = null;
                } else {
                    arrayList = j8gVar.c(a7fVar, fx6Var);
                }
            } else if (z0 == 1) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    i0Var2.getClass();
                    return new t6(arrayList, str, i0Var2);
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

    public static void d(r7f r7fVar, fx6 fx6Var, t6 t6Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        t6Var.getClass();
        r7fVar.Z("shortcuts");
        v6 v6Var = v6.a;
        defpackage.tj tjVar = defpackage.uj.a;
        j8g j8gVar = new j8g(new qhj(v6Var, true), 0);
        List list = t6Var.a;
        if (list == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list);
        }
        r7fVar.Z(ConnectableDevice.KEY_ID);
        defpackage.uj.a.a(r7fVar, fx6Var, t6Var.b);
        r7fVar.Z("viewType");
        r7fVar.m0(t6Var.c.a);
    }
}
