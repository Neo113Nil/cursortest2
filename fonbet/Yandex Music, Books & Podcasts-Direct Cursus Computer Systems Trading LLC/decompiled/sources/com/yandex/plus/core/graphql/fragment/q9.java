package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.service.airplay.PListParser;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class q9 implements defpackage.pj {
    public static final q9 a = new q9();
    public static final List b = u75.h("type", PListParser.TAG_KEY, "data");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        n9 n9Var = (n9) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        n9Var.getClass();
        r7fVar.Z("type");
        r7fVar.m0(n9Var.a.a);
        r7fVar.Z(PListParser.TAG_KEY);
        defpackage.uj.a.a(r7fVar, fx6Var, n9Var.b);
        r7fVar.Z("data");
        p9 p9Var = p9.a;
        m9 m9Var = n9Var.c;
        r7fVar.j();
        p9Var.a(r7fVar, fx6Var, m9Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.y yVar;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.y yVar2 = null;
        String str = null;
        m9 m9Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            int i = 0;
            if (z0 == 0) {
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.y.b.getClass();
                com.yandex.plus.core.graphql.type.y[] values = com.yandex.plus.core.graphql.type.y.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        yVar = null;
                        break;
                    }
                    yVar = values[i];
                    if (yVar.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                yVar2 = yVar == null ? com.yandex.plus.core.graphql.type.y.UNKNOWN__ : yVar;
            } else if (z0 == 1) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    yVar2.getClass();
                    str.getClass();
                    m9Var.getClass();
                    return new n9(yVar2, str, m9Var);
                }
                p9 p9Var = p9.a;
                defpackage.tj tjVar = defpackage.uj.a;
                m9Var = (m9) new qhj(p9Var, false).b(a7fVar, fx6Var);
            }
        }
    }
}
