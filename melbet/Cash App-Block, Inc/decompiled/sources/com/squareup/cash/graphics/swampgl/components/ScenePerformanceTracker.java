package com.squareup.cash.graphics.swampgl.components;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.swampgl.PerformanceMetrics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class ScenePerformanceTracker {
    public final StateFlowImpl _metrics;
    public long averageFrameTimeMs;
    public float engineFps;
    public long engineFrameCount;
    public long lastFrameTime;
    public int lastRenderedEntityCount;
    public final ReadonlyStateFlow metrics;
    public final RealGooglePayer$$ExternalSyntheticLambda0 shaderCompileTimeProvider;
    public long timeToFirstFrame;
    public long lastEngineFpsTime = System.currentTimeMillis();
    public final long startTime = System.currentTimeMillis();
    public long lastPerformanceUpdate = System.currentTimeMillis();

    public ScenePerformanceTracker(RealGooglePayer$$ExternalSyntheticLambda0 realGooglePayer$$ExternalSyntheticLambda0) {
        this.shaderCompileTimeProvider = realGooglePayer$$ExternalSyntheticLambda0;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(new PerformanceMetrics(RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, 0, 0, 0, 0));
        this._metrics = MutableStateFlow;
        this.metrics = FlowKt.asStateFlow(MutableStateFlow);
    }
}
