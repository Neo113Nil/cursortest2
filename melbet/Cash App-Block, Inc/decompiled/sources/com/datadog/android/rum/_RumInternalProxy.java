package com.datadog.android.rum;

import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;

/* loaded from: classes4.dex */
public final class _RumInternalProxy {
    public volatile boolean handledSyntheticsAttribute;
    public final DatadogRumMonitor rumMonitor;

    public _RumInternalProxy(DatadogRumMonitor datadogRumMonitor) {
        this.rumMonitor = datadogRumMonitor;
    }
}
