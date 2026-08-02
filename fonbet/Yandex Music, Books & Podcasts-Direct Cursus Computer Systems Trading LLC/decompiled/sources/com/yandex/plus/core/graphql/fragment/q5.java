package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class q5 implements defpackage.pj {
    public static final List a = t75.c("backgroundColors");

    public static h5 c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        a7fVar.getClass();
        fx6Var.getClass();
        e5 e5Var = null;
        while (a7fVar.z0(a) == 0) {
            m5 m5Var = m5.a;
            defpackage.tj tjVar = defpackage.uj.a;
            qhj qhjVar = new qhj(m5Var, true);
            if (a7fVar.peek() == 10) {
                a7fVar.w();
                b = null;
            } else {
                b = qhjVar.b(a7fVar, fx6Var);
            }
            e5Var = (e5) b;
        }
        return new h5(e5Var);
    }
}
