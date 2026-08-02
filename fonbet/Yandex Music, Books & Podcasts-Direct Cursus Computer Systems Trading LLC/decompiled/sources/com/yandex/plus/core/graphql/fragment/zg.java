package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;

/* loaded from: classes4.dex */
public final class zg implements defpackage.pj {
    public static final zg a = new zg();
    public static final List b = u75.h("name", Constants.KEY_VALUE);

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        xg xgVar = (xg) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        xgVar.getClass();
        r7fVar.Z("name");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, xgVar.a);
        r7fVar.Z(Constants.KEY_VALUE);
        tjVar.a(r7fVar, fx6Var, xgVar.b);
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
                    str2.getClass();
                    return new xg(str, str2);
                }
                str2 = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }
}
