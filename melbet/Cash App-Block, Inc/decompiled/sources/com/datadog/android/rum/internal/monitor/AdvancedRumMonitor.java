package com.datadog.android.rum.internal.monitor;

import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.startup.RumStartupScenario;
import com.datadog.android.rum.internal.startup.RumTTIDInfo;
import com.datadog.android.rum.resource.ResourceId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public interface AdvancedRumMonitor extends RumMonitor {
    void addCrash(String str, Throwable th, ArrayList arrayList);

    void addLongTask(long j, String str);

    void addResourceTiming(Object obj, ResourceTiming resourceTiming);

    void addSessionReplaySkippedFrame();

    void eventDropped(String str, StorageEvent storageEvent);

    void eventSent(String str, StorageEvent storageEvent);

    void notifyInterceptorInstantiated();

    void sendAppStartEvent(RumStartupScenario rumStartupScenario);

    void sendTTIDEvent(RumTTIDInfo rumTTIDInfo);

    void sendTelemetryEvent(InternalTelemetryEvent internalTelemetryEvent);

    void sendWebViewEvent();

    void startResource(ResourceId resourceId, int i, String str, Map map);

    void stopResource(ResourceId resourceId, Integer num, Long l, int i, LinkedHashMap linkedHashMap);

    void stopResourceWithError(ResourceId resourceId, String str, Throwable th, Map map);

    void waitForResourceTiming(Object obj);
}
