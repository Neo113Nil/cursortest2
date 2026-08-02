package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class o2 implements defpackage.pj {
    public static final o2 a = new o2();
    public static final List b = u75.h("buttonText", "buttonTextWithDetails", "subscriptionName");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        o1 o1Var = (o1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        o1Var.getClass();
        r7fVar.Z("buttonText");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, o1Var.a);
        r7fVar.Z("buttonTextWithDetails");
        tjVar.a(r7fVar, fx6Var, o1Var.b);
        r7fVar.Z("subscriptionName");
        tjVar.a(r7fVar, fx6Var, o1Var.c);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    return new o1(str, str2, str3);
                }
                str3 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }
}
