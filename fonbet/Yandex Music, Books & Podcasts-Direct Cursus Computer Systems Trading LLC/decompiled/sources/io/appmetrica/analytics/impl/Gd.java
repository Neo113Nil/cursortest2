package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;

/* loaded from: classes5.dex */
public final class Gd extends AbstractC0157br {
    public final AppMetricaConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gd(@NonNull InterfaceC0286gc interfaceC0286gc, @NonNull AppMetricaConfig appMetricaConfig) {
        super(interfaceC0286gc);
        String str = appMetricaConfig.apiKey;
        this.b = appMetricaConfig;
    }

    @NonNull
    public final InterfaceC0315hc a() {
        return this.a.a().a(this.b);
    }
}
