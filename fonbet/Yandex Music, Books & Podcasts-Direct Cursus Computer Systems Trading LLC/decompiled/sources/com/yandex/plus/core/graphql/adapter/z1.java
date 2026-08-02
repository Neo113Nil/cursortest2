package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.s2;
import com.yandex.plus.core.graphql.t2;
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
public final class z1 implements pj {
    public static final z1 a = new z1();
    public static final List b = t75.c("user");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        s2 s2Var = (s2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        s2Var.getClass();
        r7fVar.Z("user");
        a2 a2Var = a2.a;
        tj tjVar = uj.a;
        qhj qhjVar = new qhj(a2Var, false);
        t2 t2Var = s2Var.a;
        if (t2Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, t2Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        t2 t2Var = null;
        while (a7fVar.z0(b) == 0) {
            a2 a2Var = a2.a;
            tj tjVar = uj.a;
            qhj qhjVar = new qhj(a2Var, false);
            if (a7fVar.peek() == 10) {
                a7fVar.w();
                b2 = null;
            } else {
                b2 = qhjVar.b(a7fVar, fx6Var);
            }
            t2Var = (t2) b2;
        }
        return new s2(t2Var);
    }
}
