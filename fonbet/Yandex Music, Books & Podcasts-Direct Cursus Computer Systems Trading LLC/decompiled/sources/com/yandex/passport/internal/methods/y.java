package com.yandex.passport.internal.methods;

import android.net.Uri;
import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class y extends v5 {
    public final g6 c;
    public final a7 d;
    public final List e;
    public final a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Bundle bundle) {
        super(w5.E0);
        bundle.getClass();
        com.yandex.passport.api.z1 z1Var = new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid"));
        i iVar = i.l;
        Uri uri = (Uri) iVar.e(bundle);
        g6 g6Var = new g6(e6.d, z1Var);
        a7 a7Var = new a7(iVar, uri);
        this.c = g6Var;
        this.d = a7Var;
        this.e = u75.h(g6Var, a7Var);
        this.f = a.c;
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
