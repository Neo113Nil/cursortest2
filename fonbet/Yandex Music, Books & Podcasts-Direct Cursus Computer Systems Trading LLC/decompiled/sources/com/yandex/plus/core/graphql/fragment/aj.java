package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tlm;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class aj implements defpackage.pj {
    public static final aj a = new aj();
    public static final List b = t75.c("items");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        wi wiVar = (wi) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        wiVar.getClass();
        r7fVar.Z("items");
        yi yiVar = yi.a;
        defpackage.tj tjVar = defpackage.uj.a;
        qhj qhjVar = new qhj(yiVar, true);
        ArrayList arrayList = wiVar.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                qhjVar.a(r7fVar, fx6Var, obj2);
            }
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        while (a7fVar.z0(b) == 0) {
            yi yiVar = yi.a;
            defpackage.tj tjVar = defpackage.uj.a;
            qhj qhjVar = new qhj(yiVar, true);
            arrayList = tlm.n(a7fVar);
            while (a7fVar.hasNext()) {
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                arrayList.add(b2);
            }
            a7fVar.l();
        }
        arrayList.getClass();
        return new wi(arrayList);
    }
}
