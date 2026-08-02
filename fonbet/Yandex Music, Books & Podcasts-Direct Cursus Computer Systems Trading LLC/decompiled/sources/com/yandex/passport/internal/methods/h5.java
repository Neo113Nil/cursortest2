package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class h5 extends v5 {
    public final g6 c;
    public final k6 d;
    public final b e;
    public final b f;
    public final List g;
    public final e6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(Bundle bundle) {
        super(w5.B0);
        bundle.getClass();
        com.yandex.passport.api.z1 z1Var = new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid"));
        c cVar = c.r;
        String c = cVar.c(bundle);
        m mVar = m.f;
        mVar.getClass();
        String string = bundle.getString(mVar.b, null);
        m mVar2 = m.g;
        mVar2.getClass();
        String string2 = bundle.getString(mVar2.b, null);
        g6 g6Var = new g6(e6.d, z1Var);
        k6 k6Var = new k6(cVar, c);
        b bVar = new b(mVar, string);
        b bVar2 = new b(mVar2, string2);
        this.c = g6Var;
        this.d = k6Var;
        this.e = bVar;
        this.f = bVar2;
        this.g = u75.h(g6Var, k6Var, bVar, bVar2);
        this.h = e6.i;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.g;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.h;
    }
}
