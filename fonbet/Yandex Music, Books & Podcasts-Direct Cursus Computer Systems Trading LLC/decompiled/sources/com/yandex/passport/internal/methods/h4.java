package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class h4 extends v5 {
    public final g6 c;
    public final x5 d;
    public final List e;
    public final h6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Bundle bundle) {
        super(w5.Y);
        bundle.getClass();
        com.yandex.passport.api.z1 z1Var = new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid"));
        a aVar = a.k;
        Boolean a = aVar.a(bundle);
        g6 g6Var = new g6(e6.d, z1Var);
        x5 x5Var = new x5(aVar, a);
        this.c = g6Var;
        this.d = x5Var;
        this.e = u75.h(g6Var, x5Var);
        this.f = h6.d;
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
