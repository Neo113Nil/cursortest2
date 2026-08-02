package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ae implements defpackage.pj {
    public static final List a = u75.h("type", "linear", "radial");

    public static yd c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        Object b2;
        com.yandex.plus.core.graphql.type.s sVar;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.s sVar2 = null;
        wd wdVar = null;
        xd xdVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.s.b.getClass();
                com.yandex.plus.core.graphql.type.s[] values = com.yandex.plus.core.graphql.type.s.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        sVar = null;
                        break;
                    }
                    sVar = values[i];
                    if (sVar.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                sVar2 = sVar == null ? com.yandex.plus.core.graphql.type.s.UNKNOWN__ : sVar;
            } else if (z0 == 1) {
                zd zdVar = zd.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(zdVar, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                wdVar = (wd) b2;
            } else {
                if (z0 != 2) {
                    sVar2.getClass();
                    return new yd(sVar2, wdVar, xdVar);
                }
                be beVar = be.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(beVar, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b = null;
                } else {
                    b = qhjVar2.b(a7fVar, fx6Var);
                }
                xdVar = (xd) b;
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, yd ydVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        ydVar.getClass();
        r7fVar.Z("type");
        r7fVar.m0(ydVar.a.a);
        r7fVar.Z("linear");
        zd zdVar = zd.a;
        defpackage.tj tjVar = defpackage.uj.a;
        qhj qhjVar = new qhj(zdVar, true);
        wd wdVar = ydVar.b;
        if (wdVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, wdVar);
        }
        r7fVar.Z("radial");
        qhj qhjVar2 = new qhj(be.a, true);
        xd xdVar = ydVar.c;
        if (xdVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, xdVar);
        }
    }
}
