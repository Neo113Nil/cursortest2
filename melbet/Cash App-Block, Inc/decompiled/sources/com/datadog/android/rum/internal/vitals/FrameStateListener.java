package com.datadog.android.rum.internal.vitals;

import androidx.metrics.performance.JankStats;
import com.datadog.android.rum.internal.domain.FrameMetricsData;

/* loaded from: classes4.dex */
public interface FrameStateListener extends JankStats.OnFrameListener {
    void onFrameMetricsData(FrameMetricsData frameMetricsData);
}
