package com.datadog.android.internal.thread;

import com.datadog.android.rum.internal.monitor.DatadogRumMonitor$handleEvent$2$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class NamedCallable implements Callable {
    public final DatadogRumMonitor$handleEvent$2$$ExternalSyntheticLambda0 callable;
    public final String name;

    public NamedCallable(String str, DatadogRumMonitor$handleEvent$2$$ExternalSyntheticLambda0 datadogRumMonitor$handleEvent$2$$ExternalSyntheticLambda0) {
        this.callable = datadogRumMonitor$handleEvent$2$$ExternalSyntheticLambda0;
        String replace = NamedExecutionUnitKt.SanitizedRegex.replace(str, "_");
        Locale locale = Locale.US;
        this.name = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, replace, locale);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.callable.call();
    }
}
