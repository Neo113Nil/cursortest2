package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;

/* loaded from: classes4.dex */
public final class tl implements defpackage.pj {
    public static final tl a = new tl();
    public static final List b = u75.h("textColor", "backgroundColor", Constants.KEY_ACTION, "subscriptionProductTarget");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        ml mlVar = (ml) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        mlVar.getClass();
        r7fVar.Z("textColor");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, mlVar.a);
        r7fVar.Z("backgroundColor");
        vgjVar.a(r7fVar, fx6Var, mlVar.b);
        r7fVar.Z(Constants.KEY_ACTION);
        qhj qhjVar = new qhj(rl.a, false);
        kl klVar = mlVar.c;
        if (klVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, klVar);
        }
        r7fVar.Z("subscriptionProductTarget");
        vgjVar.a(r7fVar, fx6Var, mlVar.d);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        kl klVar = null;
        String str3 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                rl rlVar = rl.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(rlVar, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                klVar = (kl) b2;
            } else {
                if (z0 != 3) {
                    return new ml(str, str2, klVar, str3);
                }
                str3 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            }
        }
    }
}
