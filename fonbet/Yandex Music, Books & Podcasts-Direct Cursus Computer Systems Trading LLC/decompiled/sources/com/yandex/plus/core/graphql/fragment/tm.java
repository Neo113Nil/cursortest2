package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class tm implements defpackage.pj {
    public static final List a = u75.h("text", "color");

    public static hm c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        bm bmVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    bmVar.getClass();
                    return new hm(str, bmVar);
                }
                nm nmVar = nm.a;
                defpackage.tj tjVar = defpackage.uj.a;
                bmVar = (bm) new qhj(nmVar, false).b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, hm hmVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        hmVar.getClass();
        r7fVar.Z("text");
        defpackage.uj.a.a(r7fVar, fx6Var, hmVar.a);
        r7fVar.Z("color");
        nm nmVar = nm.a;
        bm bmVar = hmVar.b;
        r7fVar.j();
        nmVar.a(r7fVar, fx6Var, bmVar);
        r7fVar.p();
    }
}
