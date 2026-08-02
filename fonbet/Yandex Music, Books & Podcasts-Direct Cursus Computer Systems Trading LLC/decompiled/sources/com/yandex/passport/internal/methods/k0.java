package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class k0 extends ezc implements Function1 {
    public static final k0 a = new k0(1, m5.class, "<init>", "<init>(Landroid/os/Bundle;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        return new m5(bundle);
    }
}
