package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class v0 implements pj {
    public static final v0 a = new v0();
    public static final List b = u75.h("webViewInvite", "inviteCancellationReason");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.d1 d1Var = (com.yandex.plus.core.graphql.d1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        d1Var.getClass();
        r7fVar.Z("webViewInvite");
        w0 w0Var = w0.a;
        tj tjVar = uj.a;
        qhj qhjVar = new qhj(w0Var, false);
        com.yandex.plus.core.graphql.e1 e1Var = d1Var.a;
        if (e1Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, e1Var);
        }
        r7fVar.Z("inviteCancellationReason");
        r7fVar.m0(d1Var.b.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.v vVar;
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.e1 e1Var = null;
        com.yandex.plus.core.graphql.type.v vVar2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            int i = 0;
            if (z0 == 0) {
                w0 w0Var = w0.a;
                tj tjVar = uj.a;
                qhj qhjVar = new qhj(w0Var, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                e1Var = (com.yandex.plus.core.graphql.e1) b2;
            } else {
                if (z0 != 1) {
                    vVar2.getClass();
                    return new com.yandex.plus.core.graphql.d1(e1Var, vVar2);
                }
                String f0 = a7fVar.f0();
                f0.getClass();
                com.yandex.plus.core.graphql.type.v.b.getClass();
                com.yandex.plus.core.graphql.type.v[] values = com.yandex.plus.core.graphql.type.v.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        vVar = null;
                        break;
                    }
                    vVar = values[i];
                    if (vVar.a.equals(f0)) {
                        break;
                    }
                    i++;
                }
                vVar2 = vVar == null ? com.yandex.plus.core.graphql.type.v.UNKNOWN__ : vVar;
            }
        }
    }
}
