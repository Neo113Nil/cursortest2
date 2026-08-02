package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Be implements ModuleEventServiceHandlerReporter {
    public final boolean a;
    public final C0630sa b;
    public final H6 c;

    public Be(boolean z, @NotNull C0630sa c0630sa, @NotNull H6 h6) {
        this.a = z;
        this.b = c0630sa;
        this.c = h6;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(@NotNull CounterReportApi counterReportApi) {
        H6 d = H6.d(this.c);
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
        C0630sa c0630sa = this.b;
        c0630sa.a(d, Tn.a(c0630sa.c.b(d), d.i));
    }
}
