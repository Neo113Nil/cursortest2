package com.squareup.cash.performance;

import android.app.Activity;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.braze.ui.inappmessage.BrazeInAppMessageManager$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class ScrollPerformanceAnalyzer {
    public final Analytics analytics;
    public final PerformanceMeasureScrollPerformance.Element element;
    public long lastFrameTimeNanos;
    public int numFramesExpected;
    public int numFramesRendered;
    public final Lazy refreshRating$delegate;
    public boolean running;
    public long scrollStartMs;
    public final ScrollPerformanceAnalyzer$frameCountCallback$1 frameCountCallback = new Choreographer.FrameCallback() { // from class: com.squareup.cash.performance.ScrollPerformanceAnalyzer$frameCountCallback$1
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            ScrollPerformanceAnalyzer scrollPerformanceAnalyzer = ScrollPerformanceAnalyzer.this;
            scrollPerformanceAnalyzer.numFramesRendered++;
            int roundToInt = MathKt__MathJVMKt.roundToInt(((j - scrollPerformanceAnalyzer.lastFrameTimeNanos) / 1000000.0d) / ((Number) scrollPerformanceAnalyzer.msPerFrame$delegate.getValue()).floatValue());
            scrollPerformanceAnalyzer.lastFrameTimeNanos = j;
            scrollPerformanceAnalyzer.numFramesExpected += roundToInt >= 1 ? roundToInt : 1;
            int i = scrollPerformanceAnalyzer.renderedFramesCountdown;
            if (i > 0) {
                int i2 = i - 1;
                scrollPerformanceAnalyzer.renderedFramesCountdown = i2;
                if (i2 == 0) {
                    scrollPerformanceAnalyzer.stop();
                }
            }
            if (scrollPerformanceAnalyzer.running) {
                scrollPerformanceAnalyzer.choreographer.postFrameCallback(this);
            }
        }
    };
    public final Choreographer choreographer = Choreographer.getInstance();
    public final Lazy msPerFrame$delegate = LazyKt.lazy(new BottomSheet$$ExternalSyntheticLambda2(this, 2));
    public int renderedFramesCountdown = -1;

    public static int $r8$lambda$9ZtFuX6HjY1g9bXjuDzIoJucWOU(Activity activity) {
        Display defaultDisplay;
        if (Build.VERSION.SDK_INT >= 30) {
            defaultDisplay = activity.getDisplay();
        } else {
            WindowManager windowManager = (WindowManager) activity.getSystemService("window");
            defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        }
        return (defaultDisplay != null ? Float.valueOf(defaultDisplay.getRefreshRate()) : 30).intValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.squareup.cash.performance.ScrollPerformanceAnalyzer$frameCountCallback$1] */
    public ScrollPerformanceAnalyzer(PerformanceMeasureScrollPerformance.Element element, Activity activity, Analytics analytics) {
        this.element = element;
        this.analytics = analytics;
        this.refreshRating$delegate = LazyKt.lazy(new BrazeInAppMessageManager$$ExternalSyntheticLambda0(3, activity));
    }

    public final void start() {
        if (this.running) {
            return;
        }
        Choreographer choreographer = this.choreographer;
        ScrollPerformanceAnalyzer$frameCountCallback$1 scrollPerformanceAnalyzer$frameCountCallback$1 = this.frameCountCallback;
        choreographer.removeFrameCallback(scrollPerformanceAnalyzer$frameCountCallback$1);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.scrollStartMs = uptimeMillis;
        this.lastFrameTimeNanos = uptimeMillis * 1000000;
        this.numFramesExpected = 0;
        this.numFramesRendered = 0;
        this.renderedFramesCountdown = -1;
        this.running = true;
        choreographer.postFrameCallback(scrollPerformanceAnalyzer$frameCountCallback$1);
    }

    public final void stop() {
        if (this.running) {
            this.running = false;
            this.choreographer.removeFrameCallback(this.frameCountCallback);
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.scrollStartMs;
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        long duration = DurationKt.toDuration(uptimeMillis, durationUnit);
        int i = this.numFramesRendered;
        int i2 = this.numFramesExpected;
        if (i == 5) {
            Timber.Forest.w("Ignore this event. It's most likely a fluke that happens when the view is first loaded.", new Object[0]);
            return;
        }
        this.analytics.track(new PerformanceMeasureScrollPerformance(this.element, Long.valueOf(Duration.m4176toLongimpl(duration, durationUnit)), Integer.valueOf((int) (((i2 - i) * ((Number) this.msPerFrame$delegate.getValue()).floatValue()) / Duration.m4175toDoubleimpl(duration, DurationUnit.SECONDS)))), null);
    }
}
