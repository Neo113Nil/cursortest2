package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class i0 extends ezc implements Function1 {
    public static final i0 a = new i0(1, g3.class, "<init>", "<init>(Landroid/os/Bundle;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        return new g3(new com.yandex.passport.api.z1(com.appsflyer.internal.k.i(bundle, "environment"), bundle.getLong("passport-uid")));
    }
}
