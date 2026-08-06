package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405fc extends Wn {

    /* renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f5976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0405fc(Ta ta, AppMetricaConfig appMetricaConfig) {
        super(ta);
        String str = appMetricaConfig.apiKey;
        this.f5976b = appMetricaConfig;
    }

    public final Ua a() {
        return this.f5337a.a().a(this.f5976b);
    }
}
