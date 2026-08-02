package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class qm implements defpackage.pj {
    public static final qm a = new qm();
    public static final List b = u75.h("light", "dark");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        em emVar = (em) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        emVar.getClass();
        r7fVar.Z("light");
        rm rmVar = rm.a;
        defpackage.tj tjVar = defpackage.uj.a;
        fm fmVar = emVar.a;
        r7fVar.j();
        rmVar.a(r7fVar, fx6Var, fmVar);
        r7fVar.p();
        r7fVar.Z("dark");
        om omVar = om.a;
        cm cmVar = emVar.b;
        r7fVar.j();
        omVar.a(r7fVar, fx6Var, cmVar);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        fm fmVar = null;
        cm cmVar = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                rm rmVar = rm.a;
                defpackage.tj tjVar = defpackage.uj.a;
                fmVar = (fm) new qhj(rmVar, false).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    fmVar.getClass();
                    cmVar.getClass();
                    return new em(fmVar, cmVar);
                }
                om omVar = om.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                cmVar = (cm) new qhj(omVar, false).b(a7fVar, fx6Var);
            }
        }
    }
}
