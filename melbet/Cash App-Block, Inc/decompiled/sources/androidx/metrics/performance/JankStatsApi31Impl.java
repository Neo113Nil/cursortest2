package androidx.metrics.performance;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.nimbusds.jose.JWECryptoParts;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class JankStatsApi31Impl extends JankStatsApi26Impl {
    public final FrameDataApi31 frameData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankStatsApi31Impl(JankStats jankStats, View view, Window window) {
        super(jankStats, view, window);
        window.getClass();
        ArrayList arrayList = this.stateInfo;
        arrayList.getClass();
        FrameDataApi31 frameDataApi31 = new FrameDataApi31(arrayList);
        frameDataApi31.frameDurationTotalNanos = 0L;
        frameDataApi31.frameOverrunNanos = 0L;
        this.frameData = frameDataApi31;
    }

    @Override // androidx.metrics.performance.JankStatsApi26Impl
    public final long getExpectedFrameDuration(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(13);
    }

    @Override // androidx.metrics.performance.JankStatsApi26Impl
    public final FrameDataApi24 getFrameData$metrics_performance_release(long j, long j2, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        this.prevEnd = j + metric;
        JWECryptoParts jWECryptoParts = this.metricsStateHolder.state;
        if (jWECryptoParts != null) {
            jWECryptoParts.getIntervalStates$metrics_performance_release(this.stateInfo);
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(8);
        long metric3 = frameMetrics.getMetric(7) + (metric2 - frameMetrics.getMetric(12));
        long metric4 = metric2 - frameMetrics.getMetric(13);
        FrameDataApi31 frameDataApi31 = this.frameData;
        frameDataApi31.frameStartNanos = j;
        frameDataApi31.frameDurationUiNanos = metric;
        frameDataApi31.isJank = z;
        frameDataApi31.frameDurationCpuNanos = metric3;
        frameDataApi31.frameDurationTotalNanos = metric2;
        frameDataApi31.frameOverrunNanos = metric4;
        return frameDataApi31;
    }
}
