package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.e7o;
import io.appmetrica.analytics.AppMetricaConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class S2 {
    @NotNull
    public final Qb a(@NotNull Context context, @NotNull AppMetricaConfig appMetricaConfig, @NotNull InterfaceC0286gc interfaceC0286gc) {
        return new C0236ek(new Gd(interfaceC0286gc, appMetricaConfig), new e7o(4), appMetricaConfig.crashTransformer, new Ua(context));
    }

    public static final boolean a(Throwable th) {
        return true;
    }
}
