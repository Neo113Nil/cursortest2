package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;

/* loaded from: classes4.dex */
public final class o6 implements defpackage.pj {
    public static final o6 a = new o6();
    public static final List b = u75.h("textColor", "backgroundColor", Constants.KEY_ACTION);

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        i6 i6Var = (i6) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        i6Var.getClass();
        r7fVar.Z("textColor");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, i6Var.a);
        r7fVar.Z("backgroundColor");
        vgjVar.a(r7fVar, fx6Var, i6Var.b);
        r7fVar.Z(Constants.KEY_ACTION);
        qhj qhjVar = new qhj(m6.a, false);
        g6 g6Var = i6Var.c;
        if (g6Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, g6Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        g6 g6Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    return new i6(str, str2, g6Var);
                }
                m6 m6Var = m6.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(m6Var, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                g6Var = (g6) b2;
            }
        }
    }
}
