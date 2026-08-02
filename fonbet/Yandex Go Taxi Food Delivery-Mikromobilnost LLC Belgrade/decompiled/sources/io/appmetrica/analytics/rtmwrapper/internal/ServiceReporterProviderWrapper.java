package io.appmetrica.analytics.rtmwrapper.internal;

import android.os.Bundle;
import io.appmetrica.analytics.rtm.internal.client.IServiceReporter;

/* loaded from: classes9.dex */
public class ServiceReporterProviderWrapper implements IServiceReporter {
    private final RtmServiceReporter a;

    public ServiceReporterProviderWrapper(RtmServiceReporter rtmServiceReporter) {
        this.a = rtmServiceReporter;
    }

    @Override // io.appmetrica.analytics.rtm.internal.client.IServiceReporter
    public void reportToService(int i, Bundle bundle) {
        this.a.reportData(i, bundle);
    }
}
