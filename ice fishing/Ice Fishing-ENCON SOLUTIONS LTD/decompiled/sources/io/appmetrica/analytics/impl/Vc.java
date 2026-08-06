package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* loaded from: classes.dex */
public final class Vc implements ModuleEventServiceHandlerReporter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5228a;

    /* renamed from: b, reason: collision with root package name */
    public final C0531k9 f5229b;

    /* renamed from: c, reason: collision with root package name */
    public final P5 f5230c;

    public Vc(boolean z2, C0531k9 c0531k9, P5 p5) {
        this.f5228a = z2;
        this.f5229b = c0531k9;
        this.f5230c = p5;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f5228a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        P5 d2 = P5.d(this.f5230c);
        d2.f4907d = counterReportApi.getType();
        d2.f4908e = counterReportApi.getCustomType();
        d2.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            d2.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            d2.setValueBytes(valueBytes);
        }
        d2.f4910g = counterReportApi.getBytesTruncated();
        C0531k9 c0531k9 = this.f5229b;
        c0531k9.a(d2, Rk.a(c0531k9.f6357c.b(d2), d2.f4912i));
    }
}
