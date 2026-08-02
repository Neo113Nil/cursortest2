package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class x8 implements defpackage.pj {
    public static final x8 a = new x8();
    public static final List b = u75.h("retryDelayMillis", "timeoutMillis");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        q8 q8Var = (q8) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        q8Var.getClass();
        r7fVar.Z("retryDelayMillis");
        defpackage.tj tjVar = defpackage.uj.b;
        tjVar.a(r7fVar, fx6Var, Integer.valueOf(q8Var.a));
        r7fVar.Z("timeoutMillis");
        tjVar.a(r7fVar, fx6Var, Integer.valueOf(q8Var.b));
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                num = (Integer) defpackage.uj.b.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    num.getClass();
                    int intValue = num.intValue();
                    num2.getClass();
                    return new q8(intValue, num2.intValue());
                }
                num2 = (Integer) defpackage.uj.b.b(a7fVar, fx6Var);
            }
        }
    }
}
