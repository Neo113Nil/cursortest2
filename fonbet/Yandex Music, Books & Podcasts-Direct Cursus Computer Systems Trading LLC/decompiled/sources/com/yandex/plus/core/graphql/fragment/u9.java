package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class u9 implements defpackage.pj {
    public static final List a = u75.h("period", "price", "repetitionCount");

    public static t9 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Object obj = null;
        s9 s9Var = null;
        Integer num = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                obj = defpackage.uj.g.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                v9 v9Var = v9.a;
                defpackage.tj tjVar = defpackage.uj.a;
                s9Var = (s9) new qhj(v9Var, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    obj.getClass();
                    s9Var.getClass();
                    num.getClass();
                    return new t9(obj, s9Var, num.intValue());
                }
                num = (Integer) defpackage.uj.b.b(a7fVar, fx6Var);
            }
        }
    }
}
