package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class i2 extends ezc implements Function1 {
    public static final i2 a = new i2(1, n4.class, "<init>", "<init>(Landroid/os/Bundle;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        return new n4((com.yandex.passport.api.impl.b) i.j.e(bundle), c.r.c(bundle), c.e.c(bundle));
    }
}
