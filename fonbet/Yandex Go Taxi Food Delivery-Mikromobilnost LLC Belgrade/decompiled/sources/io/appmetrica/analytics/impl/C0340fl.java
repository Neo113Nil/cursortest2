package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ReporterYandexExtension;
import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.RtmErrorEvent;

/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0340fl implements ReporterYandexExtension {
    public final Ol a;

    public C0340fl(Ol ol, L1 l1) {
        this.a = ol;
        l1.a(null);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmError(RtmErrorEvent rtmErrorEvent) {
        this.a.reportRtmError(rtmErrorEvent);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmEvent(RtmClientEvent rtmClientEvent) {
        this.a.reportRtmEvent(rtmClientEvent);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmException(String str, Throwable th) {
        this.a.reportRtmException(str, th);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void updateRtmConfig(RtmConfig rtmConfig) {
        this.a.updateRtmConfig(rtmConfig);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmException(String str, String str2) {
        this.a.reportRtmException(str, str2);
    }
}
