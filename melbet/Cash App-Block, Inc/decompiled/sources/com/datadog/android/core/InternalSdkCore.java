package com.datadog.android.core;

import coil3.request.OneShotDisposable;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.TimeInfo;
import com.datadog.android.api.feature.Feature;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.vitals.VitalReaderRunnable;
import com.google.gson.JsonObject;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface InternalSdkCore {
    ScheduledExecutorService createScheduledExecutorService(String str);

    ExecutorService createSingleThreadExecutorService(String str);

    List getAllFeatures();

    long getAppStartTimeNs();

    long getAppUptimeNs();

    DatadogContext getDatadogContext(Set set);

    SdkFeature getFeature(String str);

    OneShotDisposable getFirstPartyHostResolver();

    InternalLogger getInternalLogger();

    Long getLastFatalAnrSent();

    JsonObject getLastViewEvent();

    String getName();

    NetworkInfo getNetworkInfo();

    String getService();

    TimeInfo getTime();

    Strings getTimeProvider();

    boolean isDeveloperModeEnabled();

    void registerFeature(Feature feature);

    void removeContextUpdateReceiver(VitalReaderRunnable vitalReaderRunnable);

    void removeEventReceiver(String str);

    void setAnonymousId(UUID uuid);

    void setContextUpdateReceiver(VitalReaderRunnable vitalReaderRunnable);

    void setEventReceiver(String str, RumFeature rumFeature);

    void setUserInfo(String str, Map map);

    void updateFeatureContext(String str, Function1 function1, boolean z);

    void writeLastFatalAnrSent(long j);

    void writeLastViewEvent(byte[] bArr);
}
