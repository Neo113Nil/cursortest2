package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.AppMetricaService;

/* loaded from: classes9.dex */
public final class E8 implements InterfaceC0891yn {
    public static final D8 a = new D8();
    public static final String b = "appmetrica";

    @Override // io.appmetrica.analytics.impl.InterfaceC0891yn
    public final C0862xn a(Context context) {
        return new C0862xn(context.getPackageName(), AppMetricaService.class);
    }
}
