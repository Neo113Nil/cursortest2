package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ig implements defpackage.pj {
    public static final List a = u75.h("indentLeft", "indentRight", "indentTop", "indentBottom");

    public static hg c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                num = (Integer) defpackage.uj.b.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                num2 = (Integer) defpackage.uj.b.b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                num3 = (Integer) defpackage.uj.b.b(a7fVar, fx6Var);
            } else {
                if (z0 != 3) {
                    num.getClass();
                    int intValue = num.intValue();
                    num2.getClass();
                    int intValue2 = num2.intValue();
                    num3.getClass();
                    int intValue3 = num3.intValue();
                    num4.getClass();
                    return new hg(intValue, intValue2, intValue3, num4.intValue());
                }
                num4 = (Integer) defpackage.uj.b.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, hg hgVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        hgVar.getClass();
        r7fVar.Z("indentLeft");
        defpackage.tj tjVar = defpackage.uj.b;
        tjVar.a(r7fVar, fx6Var, Integer.valueOf(hgVar.a));
        r7fVar.Z("indentRight");
        tjVar.a(r7fVar, fx6Var, Integer.valueOf(hgVar.b));
        r7fVar.Z("indentTop");
        tjVar.a(r7fVar, fx6Var, Integer.valueOf(hgVar.c));
        r7fVar.Z("indentBottom");
        tjVar.a(r7fVar, fx6Var, Integer.valueOf(hgVar.d));
    }
}
