package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class p1 extends ezc implements Function1 {
    public static final p1 a = new p1(1, z.class, "<init>", "<init>(Landroid/os/Bundle;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        com.yandex.passport.api.z1 z1Var = new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid"));
        String c = c.t.c(bundle);
        m mVar = m.c;
        mVar.getClass();
        return new z(z1Var, c, bundle.getString(mVar.b, null));
    }
}
