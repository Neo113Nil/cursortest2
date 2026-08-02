package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class lk implements defpackage.pj {
    public static final lk a = new lk();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        fk fkVar = (fk) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        fkVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, fkVar.a);
        List list = lp.a;
        hp hpVar = fkVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        hpVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, hpVar.a);
        gp gpVar = hpVar.b;
        if (gpVar != null) {
            List list2 = kp.a;
            r7fVar.Z("verticalContentAlignment");
            r7fVar.m0(gpVar.a.a);
        }
        fp fpVar = hpVar.c;
        if (fpVar != null) {
            List list3 = jp.a;
            r7fVar.Z("horizontalContentAlignment");
            r7fVar.m0(fpVar.a.a);
        }
        ep epVar = hpVar.d;
        if (epVar != null) {
            ip.d(r7fVar, fx6Var, epVar);
        }
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
        hp c = lp.c(a7fVar, fx6Var);
        str.getClass();
        return new fk(str, c);
    }
}
