package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class k2 implements defpackage.pj {
    public static final k2 a = new k2();
    public static final List b = u75.h("firstPaymentText", "nextPaymentsText");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        a2 a2Var = (a2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        a2Var.getClass();
        r7fVar.Z("firstPaymentText");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, a2Var.a);
        r7fVar.Z("nextPaymentsText");
        tjVar.a(r7fVar, fx6Var, a2Var.b);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    str2.getClass();
                    return new a2(str, str2);
                }
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }
}
