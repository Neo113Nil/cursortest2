package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tlm;
import defpackage.u75;
import defpackage.vgj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ao implements defpackage.pj {
    public static final List a = u75.h("type", "params");

    public static vn c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    arrayList.getClass();
                    return new vn(str, arrayList);
                }
                bo boVar = bo.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(boVar, false);
                arrayList = tlm.n(a7fVar);
                while (a7fVar.hasNext()) {
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        b = null;
                    } else {
                        b = qhjVar.b(a7fVar, fx6Var);
                    }
                    arrayList.add(b);
                }
                a7fVar.l();
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, vn vnVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        vnVar.getClass();
        r7fVar.Z("type");
        defpackage.uj.a.a(r7fVar, fx6Var, vnVar.a);
        r7fVar.Z("params");
        vgj vgjVar = new vgj(new qhj(bo.a, false));
        ArrayList arrayList = vnVar.b;
        r7fVar.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vgjVar.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
    }
}
