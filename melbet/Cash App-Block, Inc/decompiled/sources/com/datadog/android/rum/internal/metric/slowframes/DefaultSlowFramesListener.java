package com.datadog.android.rum.internal.metric.slowframes;

import androidx.metrics.performance.FrameDataApi24;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.internal.collections.EvictingQueue;
import com.datadog.android.rum.internal.domain.FrameMetricsData;
import com.datadog.android.rum.internal.domain.state.SlowFrameRecord;
import com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport;
import com.datadog.android.rum.internal.vitals.FrameStateListener;
import com.google.android.filament.Box;
import com.squareup.util.Strings;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class DefaultSlowFramesListener implements FrameStateListener {
    public volatile String currentViewId;
    public volatile long currentViewStartedTimestampNs;
    public final HurlStack insightsCollector;
    public final Box metricDispatcher;
    public final ConcurrentHashMap slowFramesRecords;

    public DefaultSlowFramesListener(Box box, HurlStack hurlStack, Strings strings) {
        hurlStack.getClass();
        strings.getClass();
        this.metricDispatcher = box;
        this.insightsCollector = hurlStack;
        this.currentViewStartedTimestampNs = System.nanoTime();
        this.slowFramesRecords = new ConcurrentHashMap();
    }

    public final ViewUIPerformanceReport getViewPerformanceReport(String str) {
        ConcurrentHashMap concurrentHashMap = this.slowFramesRecords;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            ViewUIPerformanceReport viewUIPerformanceReport = new ViewUIPerformanceReport(this.currentViewStartedTimestampNs, new EvictingQueue(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO), 0L, 0L, 0L, 1000000000L);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str, viewUIPerformanceReport);
            obj = putIfAbsent == null ? viewUIPerformanceReport : putIfAbsent;
        }
        return (ViewUIPerformanceReport) obj;
    }

    @Override // androidx.metrics.performance.JankStats.OnFrameListener
    public final void onFrame(FrameDataApi24 frameDataApi24) {
        DefaultUISlownessMetricDispatcher$SlowFramesTelemetry defaultUISlownessMetricDispatcher$SlowFramesTelemetry;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        AtomicInteger atomicInteger3;
        String str = this.currentViewId;
        if (str == null || frameDataApi24.frameStartNanos < this.currentViewStartedTimestampNs) {
            if (str == null || (defaultUISlownessMetricDispatcher$SlowFramesTelemetry = (DefaultUISlownessMetricDispatcher$SlowFramesTelemetry) ((ConcurrentHashMap) this.metricDispatcher.mHalfExtent).get(str)) == null || (atomicInteger = defaultUISlownessMetricDispatcher$SlowFramesTelemetry.missedFrameCount) == null) {
                return;
            }
            atomicInteger.incrementAndGet();
            return;
        }
        long j = frameDataApi24.frameDurationUiNanos;
        long j2 = frameDataApi24.frameStartNanos;
        ViewUIPerformanceReport viewPerformanceReport = getViewPerformanceReport(str);
        synchronized (viewPerformanceReport) {
            try {
                viewPerformanceReport.totalFramesDurationNs += j;
                if (j <= 700000000 && frameDataApi24.isJank) {
                    viewPerformanceReport.slowFramesDurationNs += j;
                    DefaultUISlownessMetricDispatcher$SlowFramesTelemetry defaultUISlownessMetricDispatcher$SlowFramesTelemetry2 = (DefaultUISlownessMetricDispatcher$SlowFramesTelemetry) ((ConcurrentHashMap) this.metricDispatcher.mHalfExtent).get(str);
                    if (defaultUISlownessMetricDispatcher$SlowFramesTelemetry2 != null && (atomicInteger3 = defaultUISlownessMetricDispatcher$SlowFramesTelemetry2.slowFramesCount) != null) {
                        atomicInteger3.incrementAndGet();
                    }
                    SlowFrameRecord slowFrameRecord = (SlowFrameRecord) CollectionsKt.lastOrNull(viewPerformanceReport.slowFramesRecords);
                    long j3 = j2 - (slowFrameRecord != null ? slowFrameRecord.startTimestampNs : j2);
                    if (slowFrameRecord != null && j3 <= 16666666) {
                        slowFrameRecord.durationNs = Math.min(slowFrameRecord.durationNs + j, 699999999L);
                        this.insightsCollector.getClass();
                        return;
                    }
                    if (j > 0) {
                        viewPerformanceReport.slowFramesRecords.add(new SlowFrameRecord(j2, j));
                        this.insightsCollector.getClass();
                    }
                    return;
                }
                DefaultUISlownessMetricDispatcher$SlowFramesTelemetry defaultUISlownessMetricDispatcher$SlowFramesTelemetry3 = (DefaultUISlownessMetricDispatcher$SlowFramesTelemetry) ((ConcurrentHashMap) this.metricDispatcher.mHalfExtent).get(str);
                if (defaultUISlownessMetricDispatcher$SlowFramesTelemetry3 != null && (atomicInteger2 = defaultUISlownessMetricDispatcher$SlowFramesTelemetry3.ignoredFramesCount) != null) {
                    atomicInteger2.incrementAndGet();
                }
            } finally {
            }
        }
    }

    @Override // com.datadog.android.rum.internal.vitals.FrameStateListener
    public final void onFrameMetricsData(FrameMetricsData frameMetricsData) {
        frameMetricsData.getClass();
    }
}
