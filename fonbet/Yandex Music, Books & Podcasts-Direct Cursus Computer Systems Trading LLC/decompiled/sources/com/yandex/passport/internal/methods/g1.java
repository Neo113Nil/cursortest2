package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class g1 extends ezc implements Function1 {
    public static final g1 a = new g1(1, y4.class, "<init>", "<init>(Landroid/os/Bundle;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        com.yandex.passport.api.v2 v2Var = (com.yandex.passport.api.v2) l6.d.f(bundle);
        m mVar = m.m;
        mVar.getClass();
        return new y4(v2Var, bundle.getString(mVar.b, null));
    }
}
