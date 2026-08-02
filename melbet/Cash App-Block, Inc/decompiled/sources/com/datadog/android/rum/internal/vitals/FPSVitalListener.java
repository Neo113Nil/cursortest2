package com.datadog.android.rum.internal.vitals;

import androidx.metrics.performance.FrameDataApi24;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import com.datadog.android.rum.internal.domain.FrameMetricsData;

/* loaded from: classes4.dex */
public final class FPSVitalListener implements FrameStateListener {
    public final BuildSdkVersionProvider buildSdkVersionProvider;
    public double displayRefreshRate;
    public long frameDeadline;
    public double screenRefreshRate;
    public final AggregatingVitalMonitor vitalObserver;

    public FPSVitalListener(AggregatingVitalMonitor aggregatingVitalMonitor) {
        BuildSdkVersionProvider.Companion.getClass();
        BuildSdkVersionProvider$Companion$DEFAULT$1 buildSdkVersionProvider$Companion$DEFAULT$1 = BuildSdkVersionProvider.Companion.DEFAULT;
        this.vitalObserver = aggregatingVitalMonitor;
        this.buildSdkVersionProvider = buildSdkVersionProvider$Companion$DEFAULT$1;
        this.screenRefreshRate = 60.0d;
        this.frameDeadline = 16666666L;
        this.displayRefreshRate = 60.0d;
    }

    @Override // androidx.metrics.performance.JankStats.OnFrameListener
    public final void onFrame(FrameDataApi24 frameDataApi24) {
        double d = frameDataApi24.frameDurationUiNanos;
        if (d > 0.0d) {
            double d2 = 1.0E9d / d;
            BuildSdkVersionProvider$Companion$DEFAULT$1 buildSdkVersionProvider$Companion$DEFAULT$1 = (BuildSdkVersionProvider$Companion$DEFAULT$1) this.buildSdkVersionProvider;
            if (buildSdkVersionProvider$Companion$DEFAULT$1.isAtLeastS) {
                this.screenRefreshRate = 1.0E9d / this.frameDeadline;
            } else if (buildSdkVersionProvider$Companion$DEFAULT$1.version == 30) {
                this.screenRefreshRate = this.displayRefreshRate;
            }
            double d3 = (60.0d / this.screenRefreshRate) * d2;
            double d4 = d3 <= 60.0d ? d3 : 60.0d;
            if (d4 > 1.0d) {
                this.vitalObserver.onNewSample(d4);
            }
        }
    }

    @Override // com.datadog.android.rum.internal.vitals.FrameStateListener
    public final void onFrameMetricsData(FrameMetricsData frameMetricsData) {
        frameMetricsData.getClass();
        this.displayRefreshRate = frameMetricsData.displayRefreshRate;
        if (((BuildSdkVersionProvider$Companion$DEFAULT$1) this.buildSdkVersionProvider).isAtLeastS) {
            this.frameDeadline = frameMetricsData.deadline;
        }
    }
}
