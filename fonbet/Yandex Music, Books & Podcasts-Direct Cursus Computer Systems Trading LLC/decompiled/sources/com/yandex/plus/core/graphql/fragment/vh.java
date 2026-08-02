package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class vh implements defpackage.pj {
    public static final vh a = new vh();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        th thVar = (th) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        thVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, thVar.a);
        List list = rh.a;
        kh khVar = thVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        khVar.getClass();
        r7fVar.Z("type");
        r7fVar.m0(khVar.a.a);
        r7fVar.Z("argCheckingPredicate");
        lh lhVar = lh.a;
        defpackage.tj tjVar = defpackage.uj.a;
        qhj qhjVar = new qhj(lhVar, false);
        dh dhVar = khVar.b;
        if (dhVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, dhVar);
        }
        r7fVar.Z("booleanLiteralPredicate");
        qhj qhjVar2 = new qhj(mh.a, false);
        eh ehVar = khVar.c;
        if (ehVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, ehVar);
        }
        r7fVar.Z("notPredicate");
        qhj qhjVar3 = new qhj(qh.a, false);
        ih ihVar = khVar.d;
        if (ihVar == null) {
            r7fVar.B0();
        } else {
            qhjVar3.a(r7fVar, fx6Var, ihVar);
        }
        r7fVar.Z("unifyingPredicate");
        qhj qhjVar4 = new qhj(sh.a, false);
        jh jhVar = khVar.e;
        if (jhVar == null) {
            r7fVar.B0();
        } else {
            qhjVar4.a(r7fVar, fx6Var, jhVar);
        }
        r7fVar.Z("comparisonPredicate");
        qhj qhjVar5 = new qhj(nh.a, false);
        fh fhVar = khVar.f;
        if (fhVar == null) {
            r7fVar.B0();
        } else {
            qhjVar5.a(r7fVar, fx6Var, fhVar);
        }
        r7fVar.Z("containsPredicate");
        qhj qhjVar6 = new qhj(oh.a, false);
        gh ghVar = khVar.g;
        if (ghVar == null) {
            r7fVar.B0();
        } else {
            qhjVar6.a(r7fVar, fx6Var, ghVar);
        }
        r7fVar.Z("inSetPredicate");
        qhj qhjVar7 = new qhj(ph.a, false);
        hh hhVar = khVar.h;
        if (hhVar == null) {
            r7fVar.B0();
        } else {
            qhjVar7.a(r7fVar, fx6Var, hhVar);
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
        kh c = rh.c(a7fVar, fx6Var);
        str.getClass();
        return new th(str, c);
    }
}
