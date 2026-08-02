package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class qb implements defpackage.pj {
    public static final List a = u75.h("badgeText", "subtitleText");

    public static ob c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        mb mbVar = null;
        nb nbVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                pb pbVar = pb.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(pbVar, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                mbVar = (mb) b2;
            } else {
                if (z0 != 1) {
                    return new ob(mbVar, nbVar);
                }
                rb rbVar = rb.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(rbVar, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b = null;
                } else {
                    b = qhjVar2.b(a7fVar, fx6Var);
                }
                nbVar = (nb) b;
            }
        }
    }
}
