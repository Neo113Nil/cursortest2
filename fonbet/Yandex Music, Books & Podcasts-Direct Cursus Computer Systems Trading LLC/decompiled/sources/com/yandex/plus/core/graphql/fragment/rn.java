package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class rn implements defpackage.pj {
    public static final rn a = new rn();
    public static final List b = u75.h("purchaseToken", "strategy");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        pn pnVar = (pn) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        pnVar.getClass();
        r7fVar.Z("purchaseToken");
        defpackage.uj.a.a(r7fVar, fx6Var, pnVar.a);
        r7fVar.Z("strategy");
        r7fVar.m0(pnVar.b.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.r rVar;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        com.yandex.plus.core.graphql.type.r rVar2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    rVar2.getClass();
                    return new pn(str, rVar2);
                }
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.r.b.getClass();
                com.yandex.plus.core.graphql.type.r[] values = com.yandex.plus.core.graphql.type.r.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        rVar = null;
                        break;
                    }
                    rVar = values[i];
                    if (rVar.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                rVar2 = rVar == null ? com.yandex.plus.core.graphql.type.r.UNKNOWN__ : rVar;
            }
        }
    }
}
