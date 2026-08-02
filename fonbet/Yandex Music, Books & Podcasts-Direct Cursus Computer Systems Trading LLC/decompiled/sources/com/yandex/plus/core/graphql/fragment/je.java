package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class je implements defpackage.pj {
    public static final List a = u75.h("type", "heightFix");

    public static ie c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.i iVar;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.i iVar2 = null;
        Integer num = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.i.b.getClass();
                com.yandex.plus.core.graphql.type.i[] values = com.yandex.plus.core.graphql.type.i.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        iVar = null;
                        break;
                    }
                    iVar = values[i];
                    if (iVar.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                iVar2 = iVar == null ? com.yandex.plus.core.graphql.type.i.UNKNOWN__ : iVar;
            } else {
                if (z0 != 1) {
                    iVar2.getClass();
                    return new ie(iVar2, num);
                }
                num = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, ie ieVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        ieVar.getClass();
        r7fVar.Z("type");
        r7fVar.m0(ieVar.a.a);
        r7fVar.Z("heightFix");
        defpackage.uj.k.a(r7fVar, fx6Var, ieVar.b);
    }
}
