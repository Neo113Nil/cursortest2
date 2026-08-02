package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class nh implements defpackage.pj {
    public static final nh a = new nh();
    public static final List b = u75.h("type", "argName", "intValue", "doubleValue", "stringValue");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        fh fhVar = (fh) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        fhVar.getClass();
        r7fVar.Z("type");
        r7fVar.m0(fhVar.a.a);
        r7fVar.Z("argName");
        defpackage.uj.a.a(r7fVar, fx6Var, fhVar.b);
        r7fVar.Z("intValue");
        defpackage.uj.k.a(r7fVar, fx6Var, fhVar.c);
        r7fVar.Z("doubleValue");
        defpackage.uj.j.a(r7fVar, fx6Var, fhVar.d);
        r7fVar.Z("stringValue");
        defpackage.uj.i.a(r7fVar, fx6Var, fhVar.e);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.f fVar;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.f fVar2 = null;
        String str = null;
        Integer num = null;
        Double d = null;
        String str2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.f.b.getClass();
                com.yandex.plus.core.graphql.type.f[] values = com.yandex.plus.core.graphql.type.f.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        fVar = null;
                        break;
                    }
                    fVar = values[i];
                    if (fVar.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                fVar2 = fVar == null ? com.yandex.plus.core.graphql.type.f.UNKNOWN__ : fVar;
            } else if (z0 == 1) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                num = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
            } else if (z0 == 3) {
                d = (Double) defpackage.uj.j.b(a7fVar, fx6Var);
            } else {
                if (z0 != 4) {
                    fVar2.getClass();
                    str.getClass();
                    return new fh(fVar2, str, num, d, str2);
                }
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            }
        }
    }
}
