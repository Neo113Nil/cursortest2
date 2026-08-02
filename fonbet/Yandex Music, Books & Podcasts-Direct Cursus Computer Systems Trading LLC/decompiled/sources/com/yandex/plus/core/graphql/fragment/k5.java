package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class k5 implements defpackage.pj {
    public static final k5 a = new k5();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        c5 c5Var = (c5) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        c5Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, c5Var.a);
        List list = q5.a;
        h5 h5Var = c5Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        h5Var.getClass();
        r7fVar.Z("backgroundColors");
        m5 m5Var = m5.a;
        defpackage.tj tjVar = defpackage.uj.a;
        qhj qhjVar = new qhj(m5Var, true);
        e5 e5Var = h5Var.a;
        if (e5Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, e5Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        h5 c = q5.c(a7fVar, fx6Var);
        str.getClass();
        return new c5(str, c);
    }
}
