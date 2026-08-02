package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class x3 extends v5 {
    public final g6 c;
    public final b d;
    public final List e;
    public final n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(Bundle bundle) {
        super(w5.t);
        bundle.getClass();
        com.yandex.passport.api.z1 z1Var = new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid"));
        o oVar = o.d;
        com.yandex.passport.internal.credentials.e eVar = (com.yandex.passport.internal.credentials.e) oVar.e(bundle);
        g6 g6Var = new g6(e6.d, z1Var);
        b bVar = new b(oVar, eVar);
        this.c = g6Var;
        this.d = bVar;
        this.e = u75.h(g6Var, bVar);
        this.f = n.d;
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
