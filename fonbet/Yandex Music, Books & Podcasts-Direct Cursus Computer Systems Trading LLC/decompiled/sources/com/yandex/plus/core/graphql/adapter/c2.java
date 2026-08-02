package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.a3;
import com.yandex.plus.core.graphql.w2;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tj;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class c2 implements pj {
    public static final c2 a = new c2();
    public static final List b = t75.c("user");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        w2 w2Var = (w2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        w2Var.getClass();
        r7fVar.Z("user");
        g2 g2Var = g2.a;
        tj tjVar = uj.a;
        qhj qhjVar = new qhj(g2Var, false);
        a3 a3Var = w2Var.a;
        if (a3Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, a3Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        a3 a3Var = null;
        while (a7fVar.z0(b) == 0) {
            g2 g2Var = g2.a;
            tj tjVar = uj.a;
            qhj qhjVar = new qhj(g2Var, false);
            if (a7fVar.peek() == 10) {
                a7fVar.w();
                b2 = null;
            } else {
                b2 = qhjVar.b(a7fVar, fx6Var);
            }
            a3Var = (a3) b2;
        }
        return new w2(a3Var);
    }
}
