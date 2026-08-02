package com.yandex.plus.home.graphql.analytics;

import com.yandex.plus.experiments.impl.cache.b;
import defpackage.c11;
import defpackage.clc;
import defpackage.f1d;
import defpackage.gp0;
import defpackage.kkp;
import defpackage.pjc;
import defpackage.ub7;
import defpackage.v42;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class a implements gp0 {
    public static String b(String str, String str2, String str3) {
        StringBuilder m = f1d.m("error while fetching operation = ", str, ", error message = ", str2, ", requestId=");
        m.append(str3);
        return m.toString();
    }

    @Override // defpackage.gp0
    public final pjc a(kkp kkpVar, c11 c11Var) {
        return new clc(new ub7(12, c11Var.c(kkpVar), new b(this, kkpVar, null, 8)), new v42(this, kkpVar, (Continuation) null, 25));
    }
}
