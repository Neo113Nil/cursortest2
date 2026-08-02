package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class q2 extends ezc implements Function1 {
    public static final q2 a = new q2(1, e3.class, "<init>", "<init>(Landroid/os/Bundle;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        m mVar = m.j;
        mVar.getClass();
        return new e3(bundle.getString(mVar.b, null));
    }
}
