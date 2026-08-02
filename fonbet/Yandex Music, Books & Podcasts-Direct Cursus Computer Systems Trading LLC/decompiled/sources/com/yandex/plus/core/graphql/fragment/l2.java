package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;

/* loaded from: classes4.dex */
public final class l2 implements defpackage.pj {
    public static final l2 a = new l2();
    public static final List b = u75.h("title", Constants.KEY_MESSAGE);

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        b2 b2Var = (b2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        b2Var.getClass();
        r7fVar.Z("title");
        defpackage.uj.a.a(r7fVar, fx6Var, b2Var.a);
        r7fVar.Z(Constants.KEY_MESSAGE);
        defpackage.uj.i.a(r7fVar, fx6Var, b2Var.b);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    return new b2(str, str2);
                }
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            }
        }
    }
}
