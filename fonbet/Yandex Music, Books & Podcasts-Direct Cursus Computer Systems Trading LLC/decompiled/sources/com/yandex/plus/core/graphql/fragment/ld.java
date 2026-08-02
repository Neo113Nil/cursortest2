package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ld implements defpackage.pj {
    public static final List a = u75.h("title", "subtitle", "balance");

    public static gd c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        fd fdVar = null;
        ed edVar = null;
        ad adVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                nd ndVar = nd.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(ndVar, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                fdVar = (fd) b2;
            } else if (z0 == 1) {
                md mdVar = md.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(mdVar, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b = null;
                } else {
                    b = qhjVar2.b(a7fVar, fx6Var);
                }
                edVar = (ed) b;
            } else {
                if (z0 != 2) {
                    adVar.getClass();
                    return new gd(fdVar, edVar, adVar);
                }
                hd hdVar = hd.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                adVar = (ad) new qhj(hdVar, false).b(a7fVar, fx6Var);
            }
        }
    }
}
