package com.squareup.cash.interaction;

import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.api.ViewTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.moshi.Moshi;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class InteractionScreenViewLogger {
    public final Analytics analytics;
    public final AppForegroundStateProvider foregroundProvider;
    public final CoroutineContext ioDispatcher;
    public LastScreenView lastScreenInteraction;
    public final Moshi moshi;
    public final RealObservabilityManager observabilityManager;
    public final CoroutineScope scope;
    public final UserJourneyTracker userJourneyTracker;

    public final class LastScreenView {
        public final ViewTracking lastScreenInteraction;
        public final String name;
        public final String viewKey;

        public LastScreenView(String str, String str2, ViewTracking viewTracking) {
            this.viewKey = str;
            this.name = str2;
            this.lastScreenInteraction = viewTracking;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LastScreenView)) {
                return false;
            }
            LastScreenView lastScreenView = (LastScreenView) obj;
            return this.viewKey.equals(lastScreenView.viewKey) && this.name.equals(lastScreenView.name) && Intrinsics.areEqual(this.lastScreenInteraction, lastScreenView.lastScreenInteraction);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.viewKey.hashCode() * 31, 31, this.name);
            ViewTracking viewTracking = this.lastScreenInteraction;
            return m + (viewTracking == null ? 0 : viewTracking.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LastScreenView(viewKey=", this.viewKey, ", name=", this.name, ", lastScreenInteraction=");
            m.append(this.lastScreenInteraction);
            m.append(")");
            return m.toString();
        }
    }

    public InteractionScreenViewLogger(RealObservabilityManager realObservabilityManager, AppForegroundStateProvider appForegroundStateProvider, Analytics analytics, Moshi moshi, UserJourneyTracker userJourneyTracker, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.observabilityManager = realObservabilityManager;
        this.foregroundProvider = appForegroundStateProvider;
        this.analytics = analytics;
        this.moshi = moshi;
        this.userJourneyTracker = userJourneyTracker;
        this.scope = coroutineScope;
        this.ioDispatcher = coroutineContext;
        JobKt.launch$default(coroutineScope, coroutineContext, null, new CashApp$onCreate$4$1$1(this, null, 24), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00df, code lost:
    
        if (r3 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startTracking(String str, String str2, InteractionInfo interactionInfo) {
        Map map;
        if (interactionInfo != null) {
            UserInteractionLatencyEvent userInteractionLatencyEvent = interactionInfo.analyticEvent;
            Map mapOf = MapsKt__MapsKt.mapOf(new Pair("ui_latency_description", userInteractionLatencyEvent.ui_latency_description), new Pair("ui_latency_total_ms", Long.valueOf(userInteractionLatencyEvent.ui_latency_total_ms)), new Pair("ui_latency_raw_ms", Long.valueOf(userInteractionLatencyEvent.ui_latency_raw_ms)), new Pair("ui_latency_trigger_ms", Long.valueOf(userInteractionLatencyEvent.ui_latency_trigger_ms)), new Pair("ui_latency_start_uptime_ms", Long.valueOf(userInteractionLatencyEvent.ui_latency_start_uptime_ms)), new Pair("ui_latency_interaction_type", "unknown"), new Pair("ui_latency_events", userInteractionLatencyEvent.ui_latency_events), new Pair("ui_latency_presenter_init_ms", Long.valueOf(userInteractionLatencyEvent.presenter_init_ms)), new Pair("ui_latency_presenter_start_ms", Long.valueOf(userInteractionLatencyEvent.presenter_start_ms)), new Pair("mem_jvm_heap", Long.valueOf(userInteractionLatencyEvent.mem_jvm_heap)), new Pair("mem_native_heap", Long.valueOf(userInteractionLatencyEvent.mem_native_heap)), new Pair("ui_latency_active_user_journeys", interactionInfo.activeUserJourneyNames));
            Long l = interactionInfo.navigationLatencyMs;
            map = BalanceFeedKt$$ExternalSyntheticOutline0.m("interaction-data", MapsKt__MapsKt.plus(mapOf, CollectionsKt__CollectionsKt.listOfNotNull(l != null ? new Pair("ui_latency_navigation_ms", Long.valueOf(l.longValue())) : null)));
        }
        map = EmptyMap.INSTANCE;
        map.getClass();
        this.lastScreenInteraction = new LastScreenView(str, str2, this.observabilityManager.startTrackingView(str, str2, map));
    }
}
