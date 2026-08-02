package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class n3 extends v5 {
    public final g6 c;
    public final List d;
    public final i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(Bundle bundle) {
        super(w5.D0);
        bundle.getClass();
        g6 g6Var = new g6(e6.d, new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid")));
        this.c = g6Var;
        this.d = t75.c(g6Var);
        this.e = i.k;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.e;
    }
}
