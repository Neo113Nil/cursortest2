package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import defpackage.xq0;
import java.util.List;

/* loaded from: classes4.dex */
public final class p9 implements defpackage.pj {
    public static final p9 a = new p9();
    public static final List b = u75.h("text", "link");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        m9 m9Var = (m9) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        m9Var.getClass();
        r7fVar.Z("text");
        defpackage.uj.a.a(r7fVar, fx6Var, m9Var.a);
        r7fVar.Z("link");
        defpackage.pj e = fx6Var.e(com.yandex.plus.core.graphql.type.z.g);
        if (e instanceof vgj) {
            xq0.q("The adapter is already nullable");
            return;
        }
        String str = m9Var.b;
        if (str == null) {
            r7fVar.B0();
        } else {
            e.a(r7fVar, fx6Var, str);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
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
                    return new m9(str, str2);
                }
                defpackage.pj e = fx6Var.e(com.yandex.plus.core.graphql.type.z.g);
                defpackage.tj tjVar = defpackage.uj.a;
                if (e instanceof vgj) {
                    xq0.q("The adapter is already nullable");
                    return null;
                }
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = e.b(a7fVar, fx6Var);
                }
                str2 = (String) b2;
            }
        }
    }
}
