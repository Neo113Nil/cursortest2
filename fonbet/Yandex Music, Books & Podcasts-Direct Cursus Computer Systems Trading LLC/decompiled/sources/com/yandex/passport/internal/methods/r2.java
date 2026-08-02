package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class r2 extends ezc implements Function1 {
    public static final r2 a = new r2(1, o5.class, "<init>", "<init>(Landroid/os/Bundle;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        return new o5(new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid")), c.p.c(bundle), c.d.c(bundle));
    }
}
