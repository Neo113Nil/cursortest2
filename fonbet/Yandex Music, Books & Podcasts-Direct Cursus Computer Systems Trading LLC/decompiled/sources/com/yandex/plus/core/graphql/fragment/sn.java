package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class sn implements defpackage.pj {
    public static final List a = t75.c("googleOfferReplaceParams");

    public static qn c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        a7fVar.getClass();
        fx6Var.getClass();
        pn pnVar = null;
        while (a7fVar.z0(a) == 0) {
            rn rnVar = rn.a;
            defpackage.tj tjVar = defpackage.uj.a;
            qhj qhjVar = new qhj(rnVar, false);
            if (a7fVar.peek() == 10) {
                a7fVar.w();
                b = null;
            } else {
                b = qhjVar.b(a7fVar, fx6Var);
            }
            pnVar = (pn) b;
        }
        return new qn(pnVar);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, qn qnVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        qnVar.getClass();
        r7fVar.Z("googleOfferReplaceParams");
        rn rnVar = rn.a;
        defpackage.tj tjVar = defpackage.uj.a;
        qhj qhjVar = new qhj(rnVar, false);
        pn pnVar = qnVar.a;
        if (pnVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, pnVar);
        }
    }
}
