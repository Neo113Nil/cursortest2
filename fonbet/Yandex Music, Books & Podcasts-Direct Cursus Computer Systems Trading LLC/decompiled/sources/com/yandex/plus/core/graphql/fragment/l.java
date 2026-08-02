package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class l implements defpackage.pj {
    public static final l a = new l();
    public static final List b = u75.h("text", "badgeText");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        h hVar = (h) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        hVar.getClass();
        r7fVar.Z("text");
        defpackage.uj.a.a(r7fVar, fx6Var, hVar.a);
        r7fVar.Z("badgeText");
        defpackage.uj.i.a(r7fVar, fx6Var, hVar.b);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    return new h(str, str2);
                }
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            }
        }
    }
}
