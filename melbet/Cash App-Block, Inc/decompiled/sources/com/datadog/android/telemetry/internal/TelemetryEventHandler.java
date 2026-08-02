package com.datadog.android.telemetry.internal;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import coil3.svg.internal.AndroidSvg;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.sampling.Sampler;
import com.datadog.android.rum.RumSessionListener;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzhw;
import com.google.mlkit.vision.text.zzb;
import com.squareup.workflow1.Workflows__WorkflowActionKt$action$1;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyMap;

/* loaded from: classes4.dex */
public final class TelemetryEventHandler implements RumSessionListener {
    public final Sampler configurationExtraSampler;
    public final AndroidSvg eventSampler;
    public final InternalSdkCore sdkCore;
    public final SessionEndedMetricDispatcher sessionEndedMetricDispatcher;
    public int totalEventsSeenInCurrentSession;
    public boolean trackNetworkRequests;
    public final int maxEventCountPerSession = 100;
    public final LinkedHashSet eventIDsSeenInCurrentSession = new LinkedHashSet();

    public TelemetryEventHandler(InternalSdkCore internalSdkCore, AndroidSvg androidSvg, AndroidSvg androidSvg2, SessionEndedMetricDispatcher sessionEndedMetricDispatcher) {
        this.sdkCore = internalSdkCore;
        this.eventSampler = androidSvg;
        this.configurationExtraSampler = androidSvg2;
        this.sessionEndedMetricDispatcher = sessionEndedMetricDispatcher;
    }

    public static final TelemetryDebugEvent access$createDebugEvent(TelemetryEventHandler telemetryEventHandler, DatadogContext datadogContext, long j, String str, Map map, float f) {
        Map map2;
        int i;
        InternalSdkCore internalSdkCore = telemetryEventHandler.sdkCore;
        RumContext rumContext = rumContext(datadogContext);
        if (map == null) {
            map2 = EmptyMap.INSTANCE;
            map2.getClass();
        } else {
            map2 = map;
        }
        LinkedHashMap cleanUpInternalAttributes = cleanUpInternalAttributes(new LinkedHashMap(map2));
        cleanUpInternalAttributes.put("process_uptime", Long.valueOf(internalSdkCore.getAppUptimeNs() / 1000000));
        zzb zzbVar = new zzb(1);
        String str2 = datadogContext.source;
        InternalLogger internalLogger = internalSdkCore.getInternalLogger();
        str2.getClass();
        internalLogger.getClass();
        int i2 = 0;
        try {
        } catch (NoSuchElementException e) {
            DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new Workflows__WorkflowActionKt$action$1(str2, 5), e, false, 48);
        }
        for (int i3 : CameraSelector$$ExternalSyntheticOutline0.values(7)) {
            if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$20(i3).equals(str2)) {
                i2 = i3;
                int i4 = i2 == 0 ? 1 : i2;
                String str3 = datadogContext.sdkVersion;
                TelemetryDebugEvent.Application application = new TelemetryDebugEvent.Application(rumContext.applicationId);
                TelemetryDebugEvent.Session session = new TelemetryDebugEvent.Session(rumContext.sessionId);
                String str4 = rumContext.viewId;
                TelemetryDebugEvent.View view = str4 != null ? new TelemetryDebugEvent.View(str4) : null;
                String str5 = rumContext.actionId;
                TelemetryDebugEvent.Action action = str5 != null ? new TelemetryDebugEvent.Action(str5) : null;
                DeviceInfo deviceInfo = datadogContext.deviceInfo;
                return new TelemetryDebugEvent(zzbVar, j, "dd-sdk-android", i4, str3, application, session, view, action, Float.valueOf(f), null, new TelemetryDebugEvent.Telemetry(new TelemetryDebugEvent.Device(deviceInfo.architecture, deviceInfo.deviceBrand, deviceInfo.deviceModel), new TelemetryDebugEvent.Os(deviceInfo.deviceBuildId, deviceInfo.osName, deviceInfo.osVersion), str, cleanUpInternalAttributes));
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static LinkedHashMap cleanUpInternalAttributes(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (int i : CameraSelector$$ExternalSyntheticOutline0.values(3)) {
            linkedHashMap.remove(Thread$State$EnumUnboxingLocalUtility.getString(i));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float computeEffectiveSampleRate$default(TelemetryEventHandler telemetryEventHandler, Map map, Float f, int i) {
        double d;
        double d2;
        if ((i & 1) != 0) {
            map = null;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        if (telemetryEventHandler.getRumConfig() == null) {
            return RecyclerView.DECELERATION_RATE;
        }
        double d3 = r10.telemetrySampleRate / 100.0d;
        if (map != null) {
            Object obj = map.get(Thread$State$EnumUnboxingLocalUtility.getString(1));
            if ((obj instanceof Float ? (Float) obj : null) != null) {
                d = r10.floatValue() / 100.0d;
                if (map != null) {
                    Object obj2 = map.get(Thread$State$EnumUnboxingLocalUtility.getString(2));
                    if ((obj2 instanceof Float ? (Float) obj2 : null) != null) {
                        d2 = r1.floatValue() / 100.0d;
                        return (float) (d3 * d * d2 * (f != null ? f.floatValue() / 100.0d : 1.0d) * 100.0d);
                    }
                }
                d2 = 1.0d;
                return (float) (d3 * d * d2 * (f != null ? f.floatValue() / 100.0d : 1.0d) * 100.0d);
            }
        }
        d = 1.0d;
        if (map != null) {
        }
        d2 = 1.0d;
        return (float) (d3 * d * d2 * (f != null ? f.floatValue() / 100.0d : 1.0d) * 100.0d);
    }

    public static RumContext rumContext(DatadogContext datadogContext) {
        Map map = (Map) datadogContext.featuresContext.get("rum");
        if (map == null) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        String str = RumContext.NULL_UUID;
        return zzhw.fromFeatureContext(map);
    }

    public final RumFeature.Configuration getRumConfig() {
        SdkFeature feature = this.sdkCore.getFeature("rum");
        if (feature != null) {
            return ((RumFeature) feature.wrappedFeature).configuration;
        }
        return null;
    }

    @Override // com.datadog.android.rum.RumSessionListener
    public final void onSessionStarted(String str, boolean z) {
        str.getClass();
        this.eventIDsSeenInCurrentSession.clear();
        this.totalEventsSeenInCurrentSession = 0;
    }
}
