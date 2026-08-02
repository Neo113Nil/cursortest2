package com.squareup.cash.history.analytics;

import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.util.clock.AndroidClock;
import dev.zacsweers.metro.Provider;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes.dex */
public final class LoadTimeClock {
    public final AndroidClock clock;
    public Long endTimeMs;
    public boolean ended;
    public final boolean isTreehouse;
    public final RealObservabilityManager observabilityManager;
    public SpanTracking span;
    public Long startTimeMs;
    public boolean started;

    public final class MetroFactory {
        public final Provider clock;
        public final Provider observabilityManager;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2) {
            this.clock = provider;
            this.observabilityManager = provider2;
        }
    }

    public LoadTimeClock(AndroidClock androidClock, RealObservabilityManager realObservabilityManager, boolean z) {
        this.clock = androidClock;
        this.observabilityManager = realObservabilityManager;
        this.isTreehouse = z;
    }

    public final Long duration() {
        if (!this.started || !this.ended) {
            return null;
        }
        this.started = false;
        this.ended = false;
        Long l = this.endTimeMs;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.startTimeMs;
            r1 = longValue - (l2 != null ? l2.longValue() : 0L);
        }
        return Long.valueOf(r1);
    }

    public final void start() {
        this.startTimeMs = Long.valueOf(this.clock.millis());
        this.started = true;
        this.span = RealObservabilityManager.startTrackingRootSpan$default(this.observabilityManager, "activity_tab_load", MapsKt__MapsJVMKt.mapOf(new Pair("is_treehouse", String.valueOf(this.isTreehouse))), 8);
    }

    public final void stop() {
        this.endTimeMs = Long.valueOf(this.clock.millis());
        this.ended = true;
        SpanTracking spanTracking = this.span;
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, MapsKt__MapsJVMKt.mapOf(new Pair("is_treehouse", String.valueOf(this.isTreehouse))), 1);
        }
    }
}
