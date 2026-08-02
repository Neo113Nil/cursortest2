package com.yandex.passport.internal.methods;

import android.net.Uri;
import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class r5 extends v5 {
    public final g6 c;
    public final z6 d;
    public final List e;
    public final e6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(Bundle bundle) {
        super(w5.Z);
        bundle.getClass();
        com.yandex.passport.api.z1 z1Var = new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid"));
        i iVar = i.k;
        Uri uri = (Uri) iVar.e(bundle);
        g6 g6Var = new g6(e6.d, z1Var);
        z6 z6Var = new z6(iVar, uri);
        this.c = g6Var;
        this.d = z6Var;
        this.e = u75.h(g6Var, z6Var);
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
