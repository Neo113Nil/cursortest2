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
public abstract class bn implements defpackage.pj {
    public static final List a = u75.h(ConnectableDevice.KEY_ID, "name", "viewType", "shortcuts", "hasHeavyShortcuts");

    public static an c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.i0 i0Var;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        com.yandex.plus.core.graphql.type.i0 i0Var2 = null;
        ArrayList arrayList = null;
        Boolean bool = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 != 1) {
                int i = 0;
                if (z0 == 2) {
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
                } else if (z0 == 3) {
                    cn cnVar = cn.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    j8g j8gVar = new j8g(new qhj(cnVar, true), 0);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        arrayList = null;
                    } else {
                        arrayList = j8gVar.c(a7fVar, fx6Var);
                    }
                } else {
                    if (z0 != 4) {
                        str.getClass();
                        str2.getClass();
                        i0Var2.getClass();
                        return new an(str, str2, i0Var2, arrayList, bool);
                    }
                    bool = (Boolean) defpackage.uj.l.b(a7fVar, fx6Var);
                }
            } else {
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, an anVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        anVar.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, anVar.a);
        r7fVar.Z("name");
        tjVar.a(r7fVar, fx6Var, anVar.b);
        r7fVar.Z("viewType");
        r7fVar.m0(anVar.c.a);
        r7fVar.Z("shortcuts");
        j8g j8gVar = new j8g(new qhj(cn.a, true), 0);
        List list = anVar.d;
        if (list == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list);
        }
        r7fVar.Z("hasHeavyShortcuts");
        defpackage.uj.l.a(r7fVar, fx6Var, anVar.e);
    }
}
