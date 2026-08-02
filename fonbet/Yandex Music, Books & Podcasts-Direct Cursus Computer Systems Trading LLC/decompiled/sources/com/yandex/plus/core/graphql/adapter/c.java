package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class c implements pj {
    public static final c a = new c();
    public static final List b = u75.h("webViewUrl", "skipText", "alreadyCollected");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.d dVar = (com.yandex.plus.core.graphql.d) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        dVar.getClass();
        r7fVar.Z("webViewUrl");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, dVar.a);
        r7fVar.Z("skipText");
        tjVar.a(r7fVar, fx6Var, dVar.b);
        r7fVar.Z("alreadyCollected");
        uj.f.a(r7fVar, fx6Var, Boolean.valueOf(dVar.c));
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    str2.getClass();
                    bool.getClass();
                    return new com.yandex.plus.core.graphql.d(str, str2, bool.booleanValue());
                }
                bool = (Boolean) uj.f.b(a7fVar, fx6Var);
            }
        }
    }
}
