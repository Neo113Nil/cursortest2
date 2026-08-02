package com.datadog.android.rum.internal.metric;

import com.datadog.android.api.InternalLogger;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class SessionEndedMetricDispatcher {
    public final InternalLogger internalLogger;
    public final ConcurrentHashMap metricsBySessionId;
    public final float sessionSamplingRate;

    public SessionEndedMetricDispatcher(InternalLogger internalLogger, float f) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
        this.sessionSamplingRate = f;
        this.metricsBySessionId = new ConcurrentHashMap();
    }
}
