package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class o4 extends v5 {
    public final g6 c;
    public final b d;
    public final List e;
    public final t6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Bundle bundle) {
        super(w5.P0);
        bundle.getClass();
        com.yandex.passport.api.z1 z1Var = new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid"));
        c cVar = c.n;
        String c = cVar.c(bundle);
        g6 g6Var = new g6(e6.d, z1Var);
        b bVar = new b(cVar, c);
        this.c = g6Var;
        this.d = bVar;
        this.e = u75.h(g6Var, bVar);
        this.f = t6.d;
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
