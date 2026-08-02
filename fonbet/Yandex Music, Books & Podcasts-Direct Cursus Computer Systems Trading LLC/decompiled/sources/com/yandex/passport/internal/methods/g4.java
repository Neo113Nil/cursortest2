package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class g4 extends v5 {
    public final g6 c;
    public final k6 d;
    public final List e;
    public final com.yandex.passport.internal.flags.experiments.d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(Bundle bundle) {
        super(w5.e1);
        bundle.getClass();
        com.yandex.passport.api.z1 z1Var = new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid"));
        s6 s6Var = s6.d;
        com.yandex.passport.internal.entities.t tVar = (com.yandex.passport.internal.entities.t) s6Var.e(bundle);
        g6 g6Var = new g6(e6.d, z1Var);
        k6 k6Var = new k6(s6Var, tVar);
        this.c = g6Var;
        this.d = k6Var;
        this.e = u75.h(g6Var, k6Var);
        this.f = new com.yandex.passport.internal.flags.experiments.d("otp", 2, false);
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.f;
    }
}
