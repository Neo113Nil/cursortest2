package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.jc3;
import defpackage.pj;
import defpackage.r0o;
import defpackage.r7f;
import defpackage.t75;
import defpackage.uj;
import defpackage.xq0;
import defpackage.y2x;
import java.util.List;

/* loaded from: classes4.dex */
public final class q implements pj {
    public static final q a = new q();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.s sVar = (com.yandex.plus.core.graphql.s) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        sVar.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, sVar.a);
        com.yandex.plus.core.graphql.o oVar = sVar.b;
        if (oVar != null) {
            m.d(r7fVar, fx6Var, oVar);
        }
        com.yandex.plus.core.graphql.p pVar = sVar.c;
        if (pVar != null) {
            n.d(r7fVar, fx6Var, pVar);
        }
        com.yandex.plus.core.graphql.n nVar = sVar.d;
        if (nVar != null) {
            l.d(r7fVar, fx6Var, nVar);
        }
        com.yandex.plus.core.graphql.r rVar = sVar.e;
        if (rVar != null) {
            p.d(r7fVar, fx6Var, rVar);
        }
        com.yandex.plus.core.graphql.q qVar = sVar.f;
        if (qVar != null) {
            o.d(r7fVar, fx6Var, qVar);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.o oVar;
        com.yandex.plus.core.graphql.p pVar;
        com.yandex.plus.core.graphql.n nVar;
        com.yandex.plus.core.graphql.r rVar;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.q qVar = null;
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) uj.a.b(a7fVar, fx6Var);
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        jc3 E = y2x.E("NewCardPaymentButton");
        r0o r0oVar = fx6Var.a;
        if (y2x.r(E, r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            oVar = m.c(a7fVar, fx6Var);
        } else {
            oVar = null;
        }
        if (y2x.r(y2x.E("NewSbpPaymentButton"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            pVar = n.c(a7fVar, fx6Var);
        } else {
            pVar = null;
        }
        if (y2x.r(y2x.E("CardPaymentButton"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            nVar = l.c(a7fVar, fx6Var);
        } else {
            nVar = null;
        }
        if (y2x.r(y2x.E("SbpPaymentButton"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            rVar = p.c(a7fVar, fx6Var);
        } else {
            rVar = null;
        }
        if (y2x.r(y2x.E("NewYBPaymentButton"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            qVar = o.c(a7fVar, fx6Var);
        }
        return new com.yandex.plus.core.graphql.s(str, oVar, pVar, nVar, rVar, qVar);
    }
}
