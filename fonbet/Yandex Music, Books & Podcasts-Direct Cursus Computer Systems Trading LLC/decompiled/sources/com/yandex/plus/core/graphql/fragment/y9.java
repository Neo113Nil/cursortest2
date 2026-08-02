package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class y9 implements defpackage.pj {
    public static final List a = u75.h("price", "until");

    public static x9 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        w9 w9Var = null;
        Object obj = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                z9 z9Var = z9.a;
                defpackage.tj tjVar = defpackage.uj.a;
                w9Var = (w9) new qhj(z9Var, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    w9Var.getClass();
                    obj.getClass();
                    return new x9(w9Var, obj);
                }
                obj = defpackage.uj.g.b(a7fVar, fx6Var);
            }
        }
    }
}
