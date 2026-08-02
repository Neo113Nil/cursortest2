package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class b3 extends ezc implements Function1 {
    public static final b3 a = new b3(1, k5.class, "<init>", "<init>(Landroid/os/Bundle;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.yandex.passport.api.z1 z1Var;
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        if (bundle.containsKey("environment") && bundle.containsKey("passport-uid")) {
            int i = bundle.getInt("environment");
            long j = bundle.getLong("passport-uid");
            com.yandex.passport.api.impl.b a2 = com.yandex.passport.api.impl.b.a(i);
            a2.getClass();
            z1Var = new com.yandex.passport.api.z1(a2, j);
        } else {
            z1Var = null;
        }
        return new k5(z1Var);
    }
}
