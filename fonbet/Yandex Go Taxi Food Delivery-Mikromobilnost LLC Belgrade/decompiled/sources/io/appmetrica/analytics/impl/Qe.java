package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* loaded from: classes9.dex */
public final class Qe implements ModuleEventServiceHandlerReporter {
    public final String a;
    public final boolean b;
    public final C0907za c;
    public final K6 d;

    public Qe(String str, boolean z, C0907za c0907za, K6 k6) {
        this.a = str;
        this.b = z;
        this.c = c0907za;
        this.d = k6;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final String getApiKey() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        K6 d = K6.d(this.d);
        d.d = counterReportApi.getType();
        d.e = counterReportApi.getCustomType();
        d.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            d.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            d.setValueBytes(valueBytes);
        }
        d.g = counterReportApi.getBytesTruncated();
        C0907za c0907za = this.c;
        c0907za.a(d, C0574no.a(c0907za.c.b(d), d.i));
    }
}
