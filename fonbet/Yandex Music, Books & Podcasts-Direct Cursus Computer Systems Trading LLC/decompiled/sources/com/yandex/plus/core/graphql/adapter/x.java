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
public final class x implements pj {
    public static final x a = new x();
    public static final List b = u75.h("lightTheme", "darkTheme", "widgetPollingParameters");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.z zVar = (com.yandex.plus.core.graphql.z) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        zVar.getClass();
        r7fVar.Z("lightTheme");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, zVar.a);
        r7fVar.Z("darkTheme");
        tjVar.a(r7fVar, fx6Var, zVar.b);
        r7fVar.Z("widgetPollingParameters");
        qhj qhjVar = new qhj(w.a, false);
        com.yandex.plus.core.graphql.y yVar = zVar.c;
        if (yVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, yVar);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        com.yandex.plus.core.graphql.y yVar = null;
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
                    return new com.yandex.plus.core.graphql.z(str, str2, yVar);
                }
                w wVar = w.a;
                tj tjVar = uj.a;
                qhj qhjVar = new qhj(wVar, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                yVar = (com.yandex.plus.core.graphql.y) b2;
            }
        }
    }
}
