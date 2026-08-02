package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class lh implements defpackage.pj {
    public static final lh a = new lh();
    public static final List b = u75.h("type", "argName");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        dh dhVar = (dh) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        dhVar.getClass();
        r7fVar.Z("type");
        r7fVar.m0(dhVar.a.a);
        r7fVar.Z("argName");
        defpackage.uj.a.a(r7fVar, fx6Var, dhVar.b);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.a aVar;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.a aVar2 = null;
        String str = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.a.b.getClass();
                com.yandex.plus.core.graphql.type.a[] values = com.yandex.plus.core.graphql.type.a.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i];
                    if (aVar.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                aVar2 = aVar == null ? com.yandex.plus.core.graphql.type.a.UNKNOWN__ : aVar;
            } else {
                if (z0 != 1) {
                    aVar2.getClass();
                    str.getClass();
                    return new dh(aVar2, str);
                }
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }
}
