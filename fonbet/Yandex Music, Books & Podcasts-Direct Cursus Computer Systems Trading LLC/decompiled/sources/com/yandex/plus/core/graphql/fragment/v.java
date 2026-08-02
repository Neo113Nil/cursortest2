package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class v implements defpackage.pj {
    public static final List a = u75.h("empty", "passportAvatarId");

    public static u c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Boolean bool = null;
        String str = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                bool = (Boolean) defpackage.uj.f.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    bool.getClass();
                    boolean booleanValue = bool.booleanValue();
                    str.getClass();
                    return new u(booleanValue, str);
                }
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, u uVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        uVar.getClass();
        r7fVar.Z("empty");
        defpackage.uj.f.a(r7fVar, fx6Var, Boolean.valueOf(uVar.a));
        r7fVar.Z("passportAvatarId");
        defpackage.uj.a.a(r7fVar, fx6Var, uVar.b);
    }
}
