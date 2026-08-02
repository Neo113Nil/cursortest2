package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.data.network.m8;
import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class f2 extends ezc implements Function1 {
    public static final f2 a = new f2(1, b0.class, "<init>", "<init>(Landroid/os/Bundle;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        return new b0((com.yandex.passport.api.impl.b) i.j.e(bundle), c.r.c(bundle), (m8) r6.d.e(bundle));
    }
}
