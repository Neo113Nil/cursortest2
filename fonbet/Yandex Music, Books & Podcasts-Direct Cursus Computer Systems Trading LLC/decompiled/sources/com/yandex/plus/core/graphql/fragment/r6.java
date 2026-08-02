package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tlm;
import defpackage.u75;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class r6 implements defpackage.pj {
    public static final r6 a = new r6();
    public static final List b = u75.h("textColor", C0479n3.g, "commonOverlays", "buttons");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        k6 k6Var = (k6) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        k6Var.getClass();
        r7fVar.Z("textColor");
        defpackage.uj.i.a(r7fVar, fx6Var, k6Var.a);
        r7fVar.Z(C0479n3.g);
        qhj qhjVar = new qhj(n6.a, false);
        h6 h6Var = k6Var.b;
        if (h6Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, h6Var);
        }
        r7fVar.Z("commonOverlays");
        j8g j8gVar = new j8g(new qhj(p6.a, true), 0);
        List list = k6Var.c;
        if (list == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list);
        }
        r7fVar.Z("buttons");
        qhj qhjVar2 = new qhj(o6.a, false);
        ArrayList arrayList = k6Var.d;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                qhjVar2.a(r7fVar, fx6Var, obj2);
            }
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        Object b3;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        h6 h6Var = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                n6 n6Var = n6.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(n6Var, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b3 = null;
                } else {
                    b3 = qhjVar.b(a7fVar, fx6Var);
                }
                h6Var = (h6) b3;
            } else if (z0 == 2) {
                p6 p6Var = p6.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                j8g j8gVar = new j8g(new qhj(p6Var, true), 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList = null;
                } else {
                    arrayList = j8gVar.c(a7fVar, fx6Var);
                }
            } else {
                if (z0 != 3) {
                    arrayList2.getClass();
                    return new k6(str, h6Var, arrayList, arrayList2);
                }
                o6 o6Var = o6.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(o6Var, false);
                arrayList2 = tlm.n(a7fVar);
                while (a7fVar.hasNext()) {
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        b2 = null;
                    } else {
                        b2 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    arrayList2.add(b2);
                }
                a7fVar.l();
            }
        }
    }
}
