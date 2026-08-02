package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;

/* loaded from: classes4.dex */
public final class mh implements defpackage.pj {
    public static final mh a = new mh();
    public static final List b = t75.c(Constants.KEY_VALUE);

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        eh ehVar = (eh) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        ehVar.getClass();
        r7fVar.Z(Constants.KEY_VALUE);
        defpackage.uj.f.a(r7fVar, fx6Var, Boolean.valueOf(ehVar.a));
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Boolean bool = null;
        while (a7fVar.z0(b) == 0) {
            bool = (Boolean) defpackage.uj.f.b(a7fVar, fx6Var);
        }
        bool.getClass();
        return new eh(bool.booleanValue());
    }
}
