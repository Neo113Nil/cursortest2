package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395f2 {
    public static final boolean a(Throwable th) {
        return true;
    }

    public final Fa a(Context context, AppMetricaConfig appMetricaConfig, Ta ta) {
        return new Bh(new C0405fc(ta, appMetricaConfig), new H0.b(15), appMetricaConfig.crashTransformer, new M9(context));
    }
}
