package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class mk implements defpackage.pj {
    public static final mk a = new mk();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        tj tjVar = (tj) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        tjVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, tjVar.a);
        List list = ld.a;
        gd gdVar = tjVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        gdVar.getClass();
        r7fVar.Z("title");
        nd ndVar = nd.a;
        defpackage.tj tjVar2 = defpackage.uj.a;
        qhj qhjVar = new qhj(ndVar, false);
        fd fdVar = gdVar.a;
        if (fdVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, fdVar);
        }
        r7fVar.Z("subtitle");
        qhj qhjVar2 = new qhj(md.a, false);
        ed edVar = gdVar.b;
        if (edVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, edVar);
        }
        r7fVar.Z("balance");
        hd hdVar = hd.a;
        ad adVar = gdVar.c;
        r7fVar.j();
        hdVar.a(r7fVar, fx6Var, adVar);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        gd c = ld.c(a7fVar, fx6Var);
        str.getClass();
        return new tj(str, c);
    }
}
