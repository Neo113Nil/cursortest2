package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.yci0;
import io.appmetrica.analytics.AppMetricaConfig;

/* loaded from: classes9.dex */
public final class S2 {
    public final InterfaceC0331fc a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC0677rc interfaceC0677rc) {
        return new C0599ok(new Wd(interfaceC0677rc, appMetricaConfig), new yci0(), appMetricaConfig.crashTransformer, new C0244cb(context));
    }

    public static final boolean a(Throwable th) {
        return true;
    }
}
