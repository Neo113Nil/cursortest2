package com.datadog.android.rum.internal.monitor;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum._RumInternalProxy;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.startup.RumStartupScenario;
import com.datadog.android.rum.internal.startup.RumTTIDInfo;
import com.datadog.android.rum.resource.ResourceId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyMap;

/* loaded from: classes.dex */
public final class NoOpAdvancedRumMonitor implements AdvancedRumMonitor {
    @Override // com.datadog.android.rum.RumMonitor
    /* renamed from: _getInternal */
    public final _RumInternalProxy getInternalProxy() {
        return null;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addAction(RumActionType rumActionType, String str, Map map) {
        str.getClass();
        map.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addAttribute(Object obj, String str) {
        str.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addCrash(String str, Throwable th, ArrayList arrayList) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(2);
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addError(String str, int i, Throwable th, Map map) {
        str.getClass();
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
        map.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addErrorWithStacktrace(String str, String str2, Map map) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(4);
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addFeatureFlagEvaluation(String str, String str2) {
        str2.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addLongTask(long j, String str) {
        str.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addResourceTiming(Object obj, ResourceTiming resourceTiming) {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addSessionReplaySkippedFrame() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addTiming(String str) {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addViewAttributes(Map map) {
        map.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addViewLoadingTime() {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void eventDropped(String str, StorageEvent storageEvent) {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void eventSent(String str, StorageEvent storageEvent) {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final Map getAttributes() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void notifyInterceptorInstantiated() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void removeAttribute(String str) {
        str.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void reportAppFullyDisplayed() {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendAppStartEvent(RumStartupScenario rumStartupScenario) {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendTTIDEvent(RumTTIDInfo rumTTIDInfo) {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendTelemetryEvent(InternalTelemetryEvent internalTelemetryEvent) {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendWebViewEvent() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startAction(LinkedHashMap linkedHashMap) {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startResource(String str, String str2, Map map) {
        str.getClass();
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(1);
        map.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startView(String str, Object obj, Map map) {
        obj.getClass();
        map.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopAction(RumActionType rumActionType, LinkedHashMap linkedHashMap) {
        rumActionType.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopResource(String str, Integer num, EmptyMap emptyMap) {
        str.getClass();
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(5);
        emptyMap.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopResourceWithError(String str, String str2, Throwable th, Map map) {
        str.getClass();
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(1);
        map.getClass();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopView(Map map, Object obj) {
        map.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void waitForResourceTiming(Object obj) {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void startResource(ResourceId resourceId, int i, String str, Map map) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
        map.getClass();
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void stopResource(ResourceId resourceId, Integer num, Long l, int i, LinkedHashMap linkedHashMap) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void stopResourceWithError(ResourceId resourceId, String str, Throwable th, Map map) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(1);
        map.getClass();
    }
}
