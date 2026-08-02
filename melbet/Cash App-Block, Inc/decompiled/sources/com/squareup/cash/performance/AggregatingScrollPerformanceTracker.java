package com.squareup.cash.performance;

import android.view.Choreographer;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.performance.FrameCallbackScheduler;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.clock.Clock$Companion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class AggregatingScrollPerformanceTracker {
    public final AndroidClock clock;
    public long currentScrollStartMs;
    public final PerformanceMeasureScrollPerformance.Element element;
    public final AggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0 frameCallback;
    public final FrameCallbackScheduler frameCallbackScheduler;
    public final ArrayList frameTimestamps;
    public boolean isScrolling;
    public final Lazy msPerFrame$delegate;
    public final ArrayList pendingScrollEvents;
    public final float refreshRate;
    public int totalFramesRendered;
    public long totalScrollDurationMs;
    public double totalScrollHitchTimeMs;

    /* JADX WARN: Type inference failed for: r2v6, types: [com.squareup.cash.performance.AggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0] */
    public AggregatingScrollPerformanceTracker(PerformanceMeasureScrollPerformance.Element element, float f) {
        FrameCallbackScheduler.Companion.getClass();
        ToolbarTuckTargets toolbarTuckTargets = FrameCallbackScheduler.Companion.REAL;
        toolbarTuckTargets.getClass();
        this.element = element;
        this.refreshRate = f;
        this.clock = Clock$Companion.REAL;
        this.frameCallbackScheduler = toolbarTuckTargets;
        final int i = 0;
        this.msPerFrame$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.performance.AggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0
            public final /* synthetic */ AggregatingScrollPerformanceTracker f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AggregatingScrollPerformanceTracker aggregatingScrollPerformanceTracker = this.f$0;
                switch (i2) {
                    case 0:
                        return Float.valueOf(1000.0f / aggregatingScrollPerformanceTracker.refreshRate);
                    default:
                        aggregatingScrollPerformanceTracker.clock.getClass();
                        long currentTimeMillis = System.currentTimeMillis() * 1000000;
                        if (aggregatingScrollPerformanceTracker.isScrolling) {
                            aggregatingScrollPerformanceTracker.frameTimestamps.add(Long.valueOf(currentTimeMillis));
                            if (aggregatingScrollPerformanceTracker.isScrolling) {
                                ((ToolbarTuckTargets) aggregatingScrollPerformanceTracker.frameCallbackScheduler).postFrameCallback(aggregatingScrollPerformanceTracker.frameCallback);
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        this.frameTimestamps = new ArrayList();
        this.pendingScrollEvents = new ArrayList();
        final int i2 = 1;
        this.frameCallback = new Function0(this) { // from class: com.squareup.cash.performance.AggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0
            public final /* synthetic */ AggregatingScrollPerformanceTracker f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AggregatingScrollPerformanceTracker aggregatingScrollPerformanceTracker = this.f$0;
                switch (i22) {
                    case 0:
                        return Float.valueOf(1000.0f / aggregatingScrollPerformanceTracker.refreshRate);
                    default:
                        aggregatingScrollPerformanceTracker.clock.getClass();
                        long currentTimeMillis = System.currentTimeMillis() * 1000000;
                        if (aggregatingScrollPerformanceTracker.isScrolling) {
                            aggregatingScrollPerformanceTracker.frameTimestamps.add(Long.valueOf(currentTimeMillis));
                            if (aggregatingScrollPerformanceTracker.isScrolling) {
                                ((ToolbarTuckTargets) aggregatingScrollPerformanceTracker.frameCallbackScheduler).postFrameCallback(aggregatingScrollPerformanceTracker.frameCallback);
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        };
    }

    public final void stopScrollEvent() {
        if (this.isScrolling) {
            this.isScrolling = false;
            ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) this.frameCallbackScheduler;
            toolbarTuckTargets.getClass();
            AggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0 aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0 = this.frameCallback;
            aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0.getClass();
            Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) ((LinkedHashMap) toolbarTuckTargets.endCornerCenterX$delegate).get(aggregatingScrollPerformanceTracker$$ExternalSyntheticLambda0);
            if (frameCallback != null) {
                ((Choreographer) toolbarTuckTargets.startCornerCenterX$delegate).removeFrameCallback(frameCallback);
            }
            ArrayList arrayList = this.frameTimestamps;
            if (arrayList.size() >= 2) {
                this.pendingScrollEvents.add(new ScrollEventData(CollectionsKt.toList(arrayList)));
            }
            arrayList.clear();
        }
    }
}
