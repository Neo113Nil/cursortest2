package androidx.metrics.performance;

import android.app.Activity;
import android.content.Context;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class JankStatsApi26Impl {
    public static long frameDuration = -1;
    public final WeakReference decorViewRef;
    public final FrameDataApi24 frameData;
    public final JankStatsApi24Impl$$ExternalSyntheticLambda1 frameMetricsAvailableListenerDelegate;
    public long listenerAddedTime;
    public final PerformanceMetricsState$Holder metricsStateHolder;
    public long prevEnd;
    public long prevStart;
    public final ArrayList stateInfo;
    public final Window window;

    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.metrics.performance.JankStatsApi24Impl$$ExternalSyntheticLambda1] */
    public JankStatsApi26Impl(final JankStats jankStats, View view, Window window) {
        window.getClass();
        this.decorViewRef = new WeakReference(view);
        Choreographer.getInstance().getClass();
        View rootView = view.getRootView();
        Object tag = rootView.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new PerformanceMetricsState$Holder();
            rootView.setTag(R.id.metricsStateHolder, tag);
        }
        this.metricsStateHolder = (PerformanceMetricsState$Holder) tag;
        this.stateInfo = new ArrayList();
        this.window = window;
        this.frameData = new FrameDataApi24(this.stateInfo);
        this.frameMetricsAvailableListenerDelegate = new Window.OnFrameMetricsAvailableListener() { // from class: androidx.metrics.performance.JankStatsApi24Impl$$ExternalSyntheticLambda1
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                frameMetrics.getClass();
                long metric = frameMetrics.getMetric(10);
                JankStatsApi26Impl jankStatsApi26Impl = JankStatsApi26Impl.this;
                long max = Math.max(metric, jankStatsApi26Impl.prevEnd);
                if (max < jankStatsApi26Impl.listenerAddedTime || max == jankStatsApi26Impl.prevStart) {
                    return;
                }
                float expectedFrameDuration = jankStatsApi26Impl.getExpectedFrameDuration(frameMetrics);
                JankStats jankStats2 = jankStats;
                FrameDataApi24 frameData$metrics_performance_release = jankStatsApi26Impl.getFrameData$metrics_performance_release(max, (long) (expectedFrameDuration * jankStats2.jankHeuristicMultiplier), frameMetrics);
                frameData$metrics_performance_release.getClass();
                jankStats2.frameListener.onFrame(frameData$metrics_performance_release);
                jankStatsApi26Impl.prevStart = max;
            }
        };
    }

    public long getExpectedFrameDuration(FrameMetrics frameMetrics) {
        View view = (View) this.decorViewRef.get();
        int i = DelegatingOnPreDrawListener.$r8$clinit;
        if (frameDuration < 0) {
            Window window = null;
            if ((view != null ? view.getContext() : null) instanceof Activity) {
                Context context = view.getContext();
                context.getClass();
                window = ((Activity) context).getWindow();
            }
            float f = 60.0f;
            float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
            if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                f = refreshRate;
            }
            frameDuration = (long) ((1000.0f / f) * 1000000.0f);
        }
        return frameDuration;
    }

    public FrameDataApi24 getFrameData$metrics_performance_release(long j, long j2, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        this.prevEnd = j + metric;
        JWECryptoParts jWECryptoParts = this.metricsStateHolder.state;
        if (jWECryptoParts != null) {
            jWECryptoParts.getIntervalStates$metrics_performance_release(this.stateInfo);
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(8);
        FrameDataApi24 frameDataApi24 = this.frameData;
        frameDataApi24.frameStartNanos = j;
        frameDataApi24.frameDurationUiNanos = metric;
        frameDataApi24.isJank = z;
        frameDataApi24.frameDurationCpuNanos = metric2;
        return frameDataApi24;
    }
}
