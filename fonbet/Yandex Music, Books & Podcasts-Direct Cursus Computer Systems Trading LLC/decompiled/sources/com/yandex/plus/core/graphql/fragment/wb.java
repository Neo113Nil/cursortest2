package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class wb implements defpackage.pj {
    public static final wb a = new wb();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        sb sbVar = (sb) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        sbVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, sbVar.a);
        List list = qb.a;
        ob obVar = sbVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        obVar.getClass();
        r7fVar.Z("badgeText");
        pb pbVar = pb.a;
        defpackage.tj tjVar = defpackage.uj.a;
        qhj qhjVar = new qhj(pbVar, true);
        mb mbVar = obVar.a;
        if (mbVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, mbVar);
        }
        r7fVar.Z("subtitleText");
        qhj qhjVar2 = new qhj(rb.a, true);
        nb nbVar = obVar.b;
        if (nbVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, nbVar);
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
        ob c = qb.c(a7fVar, fx6Var);
        str.getClass();
        return new sb(str, c);
    }
}
