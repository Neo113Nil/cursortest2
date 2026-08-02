package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class oh implements defpackage.pj {
    public static final oh a = new oh();
    public static final List b = u75.h("argName", "intValue", "stringValue");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        gh ghVar = (gh) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        ghVar.getClass();
        r7fVar.Z("argName");
        defpackage.uj.a.a(r7fVar, fx6Var, ghVar.a);
        r7fVar.Z("intValue");
        defpackage.uj.k.a(r7fVar, fx6Var, ghVar.b);
        r7fVar.Z("stringValue");
        defpackage.uj.i.a(r7fVar, fx6Var, ghVar.c);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                num = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    return new gh(str, num, str2);
                }
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            }
        }
    }
}
