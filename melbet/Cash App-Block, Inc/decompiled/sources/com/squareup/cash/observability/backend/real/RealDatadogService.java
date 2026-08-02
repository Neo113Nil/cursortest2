package com.squareup.cash.observability.backend.real;

import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.api.ViewTracking;
import com.squareup.cash.treehouse.datadog.DatadogService;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealDatadogService implements DatadogService {
    public final RealObservabilityManager observabilityManager;
    public final LinkedHashMap openSpans = new LinkedHashMap();
    public final LinkedHashMap openViewSpans = new LinkedHashMap();

    public RealDatadogService(RealObservabilityManager realObservabilityManager) {
        this.observabilityManager = realObservabilityManager;
    }

    @Override // com.squareup.cash.treehouse.datadog.DatadogService
    public final void endSpan(String str, String str2, Map map) {
        Timber.Forest forest = Timber.Forest;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Reporting end span to Datadog, spanId: ", str, ", operationName: ", str2, ", ");
        m.append(map);
        forest.d(m.toString(), new Object[0]);
        SpanTracking spanTracking = (SpanTracking) this.openSpans.get(str);
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, map, 1);
        }
    }

    @Override // com.squareup.cash.treehouse.datadog.DatadogService
    public final void reportError(String str, Throwable th) {
    }

    @Override // com.squareup.cash.treehouse.datadog.DatadogService
    public final void startSpan(String str, String str2, Map map) {
        Timber.Forest forest = Timber.Forest;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Reporting start span to Datadog, spanId: ", str, ", operationName: ", str2, ", ");
        m.append(map);
        forest.d(m.toString(), new Object[0]);
        this.openSpans.put(str, RealObservabilityManager.startTrackingSpan$default(this.observabilityManager, str, str2, map, null, 8));
    }

    @Override // com.squareup.cash.treehouse.datadog.DatadogService
    public final void startTrackingView(String str, String str2, Map map) {
        Timber.Forest forest = Timber.Forest;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Reporting start view tracking to Datadog, key: ", str, ", name: ", str2, ", ");
        m.append(map);
        forest.d(m.toString(), new Object[0]);
        ViewTracking startTrackingView = this.observabilityManager.startTrackingView(str, str2, map);
        if (startTrackingView != null) {
            this.openViewSpans.put(str, startTrackingView);
        }
    }

    @Override // com.squareup.cash.treehouse.datadog.DatadogService
    public final void stopTrackingView(String str, Map map) {
        Timber.Forest.d("Reporting end view tracking to Datadog, key: " + str + ", " + map, new Object[0]);
        ViewTracking viewTracking = (ViewTracking) this.openViewSpans.remove(str);
        if (viewTracking != null) {
            ((RealDatadogViewTracking) viewTracking).viewEnded(map);
        }
    }
}
