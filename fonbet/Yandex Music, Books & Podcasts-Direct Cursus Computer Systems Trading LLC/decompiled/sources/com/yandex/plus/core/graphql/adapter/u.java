package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class u implements pj {
    public static final u a = new u();
    public static final List b = u75.h("lightTheme", "darkTheme", "widgetPollingParameters");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.w wVar = (com.yandex.plus.core.graphql.w) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        wVar.getClass();
        r7fVar.Z("lightTheme");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, wVar.a);
        r7fVar.Z("darkTheme");
        tjVar.a(r7fVar, fx6Var, wVar.b);
        r7fVar.Z("widgetPollingParameters");
        qhj qhjVar = new qhj(v.a, false);
        com.yandex.plus.core.graphql.x xVar = wVar.c;
        if (xVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, xVar);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        com.yandex.plus.core.graphql.x xVar = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    str2.getClass();
                    return new com.yandex.plus.core.graphql.w(str, str2, xVar);
                }
                v vVar = v.a;
                tj tjVar = uj.a;
                qhj qhjVar = new qhj(vVar, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                xVar = (com.yandex.plus.core.graphql.x) b2;
            }
        }
    }
}
