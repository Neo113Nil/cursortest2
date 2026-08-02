package com.squareup.cash.money.applets.sections;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientsync.pipeline.MutableClientSyncCompletionTracker;
import com.squareup.cash.money.analytics.MoneyAnalyticsService$Companion$Version;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes6.dex */
public final class RealMoneyContentSpanTrackingService {
    public final MutableClientSyncCompletionTracker clientSyncCompletionTracker;
    public String initialLoadingStateSpanId;
    public FullSyncState initialSyncState;
    public String moneyTabLoadSpanId;
    public final RealObservabilityManager observabilityManager;
    public final String version;
    public final LinkedHashMap totalLoadSpanMap = new LinkedHashMap();
    public final LinkedHashMap availabilitySpanMap = new LinkedHashMap();
    public final LinkedHashMap installationSpanMap = new LinkedHashMap();
    public final LinkedHashMap sectionProviderContentLoadSpanMap = new LinkedHashMap();
    public final LinkedHashMap openSpans = new LinkedHashMap();

    public enum AppletTileOperation {
        AVAILABILITY_LOAD("applet_tile_availability_load"),
        INSTALLATION_LOAD("applet_tile_installation_load"),
        TOTAL_LOAD("applet_tile_load");

        public final String operationName;

        AppletTileOperation(String str) {
            this.operationName = str;
        }
    }

    public enum FullSyncState {
        PENDING("pending"),
        COMPLETED_ON_START("completed_on_start"),
        COMPLETED_AFTER_START("completed_after_start");

        public final String analyticsKey;

        FullSyncState(String str) {
            this.analyticsKey = str;
        }
    }

    public RealMoneyContentSpanTrackingService(RealObservabilityManager realObservabilityManager, MutableClientSyncCompletionTracker mutableClientSyncCompletionTracker) {
        this.observabilityManager = realObservabilityManager;
        this.clientSyncCompletionTracker = mutableClientSyncCompletionTracker;
        MoneyAnalyticsService$Companion$Version[] moneyAnalyticsService$Companion$VersionArr = MoneyAnalyticsService$Companion$Version.$VALUES;
        this.version = "v5";
    }

    public final void endInitialLoadingStateSpan() {
        SpanTracking spanTracking = (SpanTracking) this.openSpans.get(this.initialLoadingStateSpanId);
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, MapsKt__MapsJVMKt.mapOf(new Pair("terminator", "content")), 1);
        }
        this.initialLoadingStateSpanId = null;
        this.initialSyncState = null;
    }

    public final void endSpan(AppletId appletId, AppletTileOperation appletTileOperation) {
        LinkedHashMap linkedHashMap;
        int ordinal = appletTileOperation.ordinal();
        if (ordinal == 0) {
            linkedHashMap = this.availabilitySpanMap;
        } else if (ordinal == 1) {
            linkedHashMap = this.installationSpanMap;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            linkedHashMap = this.totalLoadSpanMap;
        }
        String str = (String) linkedHashMap.get(appletId);
        if (str != null) {
            SpanTracking spanTracking = (SpanTracking) this.openSpans.get(str);
            if (spanTracking != null) {
                SpanTracking.spanEnded$default(spanTracking, null, 3);
            }
            linkedHashMap.remove(appletId);
        }
    }

    public final void startSpan(AppletId appletId, AppletTileOperation appletTileOperation) {
        LinkedHashMap linkedHashMap;
        int ordinal = appletTileOperation.ordinal();
        if (ordinal == 0) {
            linkedHashMap = this.availabilitySpanMap;
        } else if (ordinal == 1) {
            linkedHashMap = this.installationSpanMap;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            linkedHashMap = this.totalLoadSpanMap;
        }
        if (linkedHashMap.containsKey(appletId)) {
            return;
        }
        String m = Boxes$$ExternalSyntheticOutline1.m();
        this.openSpans.put(m, RealObservabilityManager.startTrackingSpan$default(this.observabilityManager, m, appletTileOperation.operationName, MapsKt__MapsKt.mapOf(new Pair("applet.id", appletId.name()), new Pair("home_version", this.version)), null, 8));
        linkedHashMap.put(appletId, m);
    }
}
