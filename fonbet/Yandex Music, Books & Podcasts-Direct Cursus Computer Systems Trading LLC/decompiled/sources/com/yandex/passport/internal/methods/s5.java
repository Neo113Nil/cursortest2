package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class s5 extends v5 {
    public final g6 c;
    public final b d;
    public final List e;
    public final e6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(Bundle bundle) {
        super(w5.X);
        bundle.getClass();
        com.yandex.passport.api.z1 z1Var = new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid"));
        h6 h6Var = h6.d;
        com.yandex.passport.internal.entities.r rVar = (com.yandex.passport.internal.entities.r) h6Var.e(bundle);
        g6 g6Var = new g6(e6.d, z1Var);
        b bVar = new b(h6Var, rVar);
        this.c = g6Var;
        this.d = bVar;
        this.e = u75.h(g6Var, bVar);
        this.f = e6.i;
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
