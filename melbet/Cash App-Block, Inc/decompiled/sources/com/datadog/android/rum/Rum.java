package com.datadog.android.rum;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.room.CoroutinesRoom;
import androidx.room.util.DBUtil;
import coil3.request.OneShotDisposable;
import coil3.svg.internal.AndroidSvg;
import com.bugsnag.android.TraceParser$parse$1;
import com.bumptech.glide.GlideBuilder$1;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.datastore.DataStoreHandler;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.telemetry.internal.TelemetryEventHandler;
import com.fillr.n;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class Rum {
    /* JADX WARN: Multi-variable type inference failed */
    public static void enable$default(RumConfiguration rumConfiguration) {
        InternalLogger internalLogger;
        InternalSdkCore datadog = Datadog.getInstance(null);
        boolean z = datadog instanceof InternalSdkCore;
        if (!z) {
            InternalSdkCore internalSdkCore = z ? datadog : null;
            if (internalSdkCore == null || (internalLogger = internalSdkCore.getInternalLogger()) == null) {
                InternalLogger.Companion.getClass();
                internalLogger = InternalLogger.Companion.UNBOUND;
            }
            DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, Rum$enable$1.INSTANCE, null, false, 56);
            return;
        }
        if (StringsKt.isBlank(rumConfiguration.applicationId)) {
            DBUtil.log$default(datadog.getInternalLogger(), 5, InternalLogger.Target.USER, Rum$enable$1.INSTANCE$2, null, false, 56);
            return;
        }
        InternalSdkCore internalSdkCore2 = datadog;
        if (internalSdkCore2.getFeature("rum") != null) {
            DBUtil.log$default(internalSdkCore2.getInternalLogger(), 4, InternalLogger.Target.USER, Rum$enable$1.INSTANCE$3, null, false, 56);
            return;
        }
        RumFeature rumFeature = new RumFeature(internalSdkCore2, rumConfiguration.applicationId, rumConfiguration.featureConfiguration);
        internalSdkCore2.registerFeature(rumFeature);
        SdkFeature feature = internalSdkCore2.getFeature(rumFeature.name);
        if (feature != null) {
            DataStoreHandler dataStoreHandler = feature.dataStore;
            CoroutinesRoom.Companion companion = new CoroutinesRoom.Companion(27);
            rumConfiguration.featureConfiguration.getClass();
            dataStoreHandler.value(new n.b(new TraceParser$parse$1(companion, dataStoreHandler, internalSdkCore2), 10), new GlideBuilder$1());
        }
        SessionEndedMetricDispatcher sessionEndedMetricDispatcher = new SessionEndedMetricDispatcher(internalSdkCore2.getInternalLogger(), rumFeature.configuration.sampleRate);
        rumFeature.configuration.getClass();
        MemorySizeCalculator$Builder memorySizeCalculator$Builder = new MemorySizeCalculator$Builder(rumFeature.batteryInfoProvider, rumFeature.displayInfoProvider, rumFeature.sampleRate, internalSdkCore2.getInternalLogger());
        MediaLoadData mediaLoadData = new MediaLoadData(internalSdkCore2.getInternalLogger(), internalSdkCore2.getAppStartTimeNs(), DdRumContentProvider.createTimeNs, DdRumContentProvider.processImportance);
        String str = rumFeature.applicationId;
        float f = rumFeature.sampleRate;
        DataWriter dataWriter = rumFeature.dataWriter;
        Handler handler = new Handler(Looper.getMainLooper());
        TelemetryEventHandler telemetryEventHandler = new TelemetryEventHandler(internalSdkCore2, new AndroidSvg(rumFeature.telemetrySampleRate), new AndroidSvg(rumFeature.telemetryConfigurationSampleRate), sessionEndedMetricDispatcher);
        OneShotDisposable firstPartyHostResolver = internalSdkCore2.getFirstPartyHostResolver();
        VitalMonitor vitalMonitor = rumFeature.cpuVitalMonitor;
        VitalMonitor vitalMonitor2 = rumFeature.memoryVitalMonitor;
        VitalMonitor vitalMonitor3 = rumFeature.frameRateVitalMonitor;
        boolean z2 = rumFeature.backgroundEventTracking;
        boolean z3 = rumFeature.trackFrustrations;
        RumSessionListener rumSessionListener = rumFeature.sessionListener;
        ExecutorService createSingleThreadExecutorService = internalSdkCore2.createSingleThreadExecutorService("rum-pipeline");
        DatadogRumMonitor datadogRumMonitor = new DatadogRumMonitor(str, internalSdkCore2, f, z2, z3, dataWriter, handler, telemetryEventHandler, sessionEndedMetricDispatcher, firstPartyHostResolver, vitalMonitor, vitalMonitor2, vitalMonitor3, rumSessionListener, createSingleThreadExecutorService, rumFeature.initialResourceIdentifier, rumFeature.lastInteractionIdentifier, rumFeature.slowFramesListener, rumFeature.accessibilitySnapshotManager, rumFeature.batteryInfoProvider, rumFeature.displayInfoProvider, new Rum$createMonitor$1(0 == true ? 1 : 0, memorySizeCalculator$Builder, internalSdkCore2, mediaLoadData), rumFeature.insightsCollector);
        if (Build.VERSION.SDK_INT >= 30) {
            rumFeature.consumeLastFatalAnr$dd_sdk_android_rum_release(createSingleThreadExecutorService);
        }
        LinkedHashMap linkedHashMap = GlobalRumMonitor.registeredMonitors;
        synchronized (linkedHashMap) {
            try {
                if (linkedHashMap.containsKey(datadog)) {
                    DBUtil.log$default(datadog.getInternalLogger(), 4, InternalLogger.Target.USER, Rum$enable$1.INSTANCE$1, null, false, 56);
                } else {
                    linkedHashMap.put(datadog, datadogRumMonitor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        datadogRumMonitor.handleEvent$dd_sdk_android_rum_release(new RumRawEvent.SdkInit(DdRumContentProvider.processImportance == 100));
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewLocalOrderStatus.deepLinkSpecs;
    }
}
