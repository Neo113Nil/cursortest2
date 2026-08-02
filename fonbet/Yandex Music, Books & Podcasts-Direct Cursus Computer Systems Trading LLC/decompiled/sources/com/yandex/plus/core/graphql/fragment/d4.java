package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import defpackage.xq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d4 implements defpackage.pj {
    public static final d4 a = new d4();
    public static final List b = u75.h(Constants.KEY_PAGE, "places", "restrictions");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        u3 u3Var = (u3) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        u3Var.getClass();
        r7fVar.Z(Constants.KEY_PAGE);
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, u3Var.a);
        r7fVar.Z("places");
        j8g j8gVar = new j8g(vgjVar, 0);
        List list = u3Var.b;
        if (list == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list);
        }
        r7fVar.Z("restrictions");
        defpackage.pj e = fx6Var.e(com.yandex.plus.core.graphql.type.z.c);
        if (e instanceof vgj) {
            xq0.q("The adapter is already nullable");
            return;
        }
        Map map = u3Var.c;
        if (map == null) {
            r7fVar.B0();
        } else {
            e.a(r7fVar, fx6Var, map);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        Map map = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                j8g a2 = defpackage.uj.a(defpackage.uj.i);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList = null;
                } else {
                    arrayList = a2.c(a7fVar, fx6Var);
                }
            } else {
                if (z0 != 2) {
                    return new u3(str, arrayList, map);
                }
                defpackage.pj e = fx6Var.e(com.yandex.plus.core.graphql.type.z.c);
                defpackage.tj tjVar = defpackage.uj.a;
                if (e instanceof vgj) {
                    xq0.q("The adapter is already nullable");
                    return null;
                }
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = e.b(a7fVar, fx6Var);
                }
                map = (Map) b2;
            }
        }
    }
}
