package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class kg implements defpackage.pj {
    public static final List a = u75.h("widgetId", "widgetGroupId", "type");

    public static jg c(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.q qVar;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        com.yandex.plus.core.graphql.type.q qVar2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    qVar2.getClass();
                    return new jg(str, str2, qVar2);
                }
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.q.b.getClass();
                com.yandex.plus.core.graphql.type.q[] values = com.yandex.plus.core.graphql.type.q.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        qVar = null;
                        break;
                    }
                    qVar = values[i];
                    if (qVar.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                qVar2 = qVar == null ? com.yandex.plus.core.graphql.type.q.UNKNOWN__ : qVar;
            }
        }
    }
}
