package com.datadog.android.internal.telemetry;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class InternalTelemetryEvent$ApiUsage$AddViewLoadingTime extends InternalTelemetryEvent {
    public final Map additionalProperties = new LinkedHashMap();
    public final boolean noActiveView;
    public final boolean noView;
    public final boolean overwrite;

    public InternalTelemetryEvent$ApiUsage$AddViewLoadingTime(boolean z, boolean z2, boolean z3) {
        this.overwrite = z;
        this.noView = z2;
        this.noActiveView = z3;
    }

    public final Map getAdditionalProperties() {
        return this.additionalProperties;
    }
}
