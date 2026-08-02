package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.tlm;
import defpackage.u75;
import defpackage.uj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class f0 implements pj {
    public static final f0 a = new f0();
    public static final List b = u75.h("offersBatchIdUpsale", "eventSessionId", "upsales");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.h0 h0Var = (com.yandex.plus.core.graphql.h0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        h0Var.getClass();
        r7fVar.Z("offersBatchIdUpsale");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, h0Var.a);
        r7fVar.Z("eventSessionId");
        tjVar.a(r7fVar, fx6Var, h0Var.b);
        r7fVar.Z("upsales");
        qhj qhjVar = new qhj(e0.a, false);
        ArrayList arrayList = h0Var.c;
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
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    str2.getClass();
                    arrayList.getClass();
                    return new com.yandex.plus.core.graphql.h0(str, str2, arrayList);
                }
                e0 e0Var = e0.a;
                tj tjVar = uj.a;
                qhj qhjVar = new qhj(e0Var, false);
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
        }
    }
}
