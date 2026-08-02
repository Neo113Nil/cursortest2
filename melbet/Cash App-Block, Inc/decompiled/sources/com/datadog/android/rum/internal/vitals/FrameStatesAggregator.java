package com.datadog.android.rum.internal.vitals;

import android.app.Activity;
import android.app.Application;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import androidx.camera.core.ImageCapture$$ExternalSyntheticLambda3;
import androidx.metrics.performance.FrameDataApi24;
import androidx.metrics.performance.JankStats;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import com.datadog.android.rum.internal.domain.FrameMetricsData;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class FrameStatesAggregator implements Application.ActivityLifecycleCallbacks, JankStats.OnFrameListener {
    public final WeakHashMap activeActivities;
    public final WeakHashMap activeWindowsListener;
    public final BuildSdkVersionProvider buildSdkVersionProvider;
    public Display display;
    public final FrameMetricsData frameMetricsData;
    public DDFrameMetricsListener frameMetricsListener;
    public final List frameStateListeners;
    public final InternalLogger internalLogger;
    public final NoOpVitalMonitor jankStatsProvider;

    public final class DDFrameMetricsListener implements Window.OnFrameMetricsAvailableListener {
        public DDFrameMetricsListener() {
        }

        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            window.getClass();
            frameMetrics.getClass();
            FrameStatesAggregator frameStatesAggregator = FrameStatesAggregator.this;
            List list = frameStatesAggregator.frameStateListeners;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                FrameStateListener frameStateListener = (FrameStateListener) list.get(i2);
                FrameMetricsData frameMetricsData = frameStatesAggregator.frameMetricsData;
                BuildSdkVersionProvider buildSdkVersionProvider = frameStatesAggregator.buildSdkVersionProvider;
                frameMetricsData.displayRefreshRate = frameStatesAggregator.display != null ? r6.getRefreshRate() : 60.0d;
                BuildSdkVersionProvider$Companion$DEFAULT$1 buildSdkVersionProvider$Companion$DEFAULT$1 = (BuildSdkVersionProvider$Companion$DEFAULT$1) buildSdkVersionProvider;
                if (buildSdkVersionProvider$Companion$DEFAULT$1.isAtLeastN) {
                    frameMetricsData.droppedFrames = i;
                    frameMetricsData.unknownDelayDuration = frameMetrics.getMetric(0);
                    frameMetricsData.inputHandlingDuration = frameMetrics.getMetric(1);
                    frameMetricsData.animationDuration = frameMetrics.getMetric(2);
                    frameMetricsData.layoutMeasureDuration = frameMetrics.getMetric(3);
                    frameMetricsData.drawDuration = frameMetrics.getMetric(4);
                    frameMetricsData.syncDuration = frameMetrics.getMetric(5);
                    frameMetricsData.commandIssueDuration = frameMetrics.getMetric(6);
                    frameMetricsData.swapBuffersDuration = frameMetrics.getMetric(7);
                    frameMetricsData.totalDuration = frameMetrics.getMetric(8);
                    frameMetricsData.firstDrawFrame = frameMetrics.getMetric(9) == 1;
                }
                if (buildSdkVersionProvider$Companion$DEFAULT$1.isAtLeastO) {
                    frameMetricsData.intendedVsyncTimestamp = frameMetrics.getMetric(10);
                    frameMetricsData.vsyncTimestamp = frameMetrics.getMetric(11);
                }
                if (buildSdkVersionProvider$Companion$DEFAULT$1.isAtLeastS) {
                    frameMetricsData.gpuDuration = frameMetrics.getMetric(12);
                    frameMetricsData.deadline = frameMetrics.getMetric(13);
                }
                frameStateListener.onFrameMetricsData(frameMetricsData);
            }
        }
    }

    public FrameStatesAggregator(List list, InternalLogger internalLogger) {
        BuildSdkVersionProvider.Companion.getClass();
        BuildSdkVersionProvider$Companion$DEFAULT$1 buildSdkVersionProvider$Companion$DEFAULT$1 = BuildSdkVersionProvider.Companion.DEFAULT;
        internalLogger.getClass();
        this.frameStateListeners = list;
        this.internalLogger = internalLogger;
        this.jankStatsProvider = JankStatsProvider$Companion.DEFAULT;
        this.buildSdkVersionProvider = buildSdkVersionProvider$Companion$DEFAULT$1;
        this.activeWindowsListener = new WeakHashMap();
        this.activeActivities = new WeakHashMap();
        FrameMetricsData frameMetricsData = new FrameMetricsData();
        frameMetricsData.droppedFrames = 0;
        frameMetricsData.unknownDelayDuration = 0L;
        frameMetricsData.inputHandlingDuration = 0L;
        frameMetricsData.animationDuration = 0L;
        frameMetricsData.layoutMeasureDuration = 0L;
        frameMetricsData.drawDuration = 0L;
        frameMetricsData.syncDuration = 0L;
        frameMetricsData.commandIssueDuration = 0L;
        frameMetricsData.swapBuffersDuration = 0L;
        frameMetricsData.totalDuration = 0L;
        frameMetricsData.firstDrawFrame = false;
        frameMetricsData.intendedVsyncTimestamp = 0L;
        frameMetricsData.vsyncTimestamp = 0L;
        frameMetricsData.gpuDuration = 0L;
        frameMetricsData.deadline = 0L;
        frameMetricsData.displayRefreshRate = 60.0d;
        this.frameMetricsData = frameMetricsData;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        Window window = activity.getWindow();
        WeakHashMap weakHashMap = this.activeActivities;
        Collection collection = (Collection) weakHashMap.get(window);
        if (collection == null || collection.isEmpty()) {
            this.activeWindowsListener.remove(activity.getWindow());
            weakHashMap.remove(activity.getWindow());
            if (((BuildSdkVersionProvider$Companion$DEFAULT$1) this.buildSdkVersionProvider).isAtLeastS) {
                Window window2 = activity.getWindow();
                window2.getClass();
                try {
                    window2.removeOnFrameMetricsAvailableListener(this.frameMetricsListener);
                } catch (IllegalArgumentException e) {
                    DBUtil.log$default(this.internalLogger, 5, InternalLogger.Target.MAINTAINER, FrameStatesAggregator$onActivityStopped$1.INSTANCE$8, e, false, 48);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        JankStats jankStats;
        Object obj;
        activity.getClass();
        Window window = activity.getWindow();
        window.getClass();
        WeakHashMap weakHashMap = this.activeActivities;
        List list = (List) weakHashMap.get(window);
        if (list == null) {
            list = new ArrayList();
        }
        Iterator it = list.iterator();
        while (true) {
            jankStats = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((WeakReference) obj).get(), activity)) {
                    break;
                }
            }
        }
        if (obj == null) {
            list.add(new WeakReference(activity));
            weakHashMap.put(window, list);
        }
        WeakHashMap weakHashMap2 = this.activeWindowsListener;
        boolean containsKey = weakHashMap2.containsKey(window);
        JankStats jankStats2 = (JankStats) weakHashMap2.get(window);
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        InternalLogger internalLogger = this.internalLogger;
        if (jankStats2 != null) {
            DBUtil.log$default(internalLogger, 2, target, new FrameStatesAggregator$onActivityStopped$3(window, 1), null, false, 56);
            jankStats2.setTrackingEnabled(true);
        } else {
            DBUtil.log$default(internalLogger, 2, target, new FrameStatesAggregator$onActivityStopped$3(window, 2), null, false, 56);
            this.jankStatsProvider.getClass();
            InternalLogger internalLogger2 = this.internalLogger;
            internalLogger2.getClass();
            try {
                jankStats = new JankStats(window, this);
            } catch (IllegalStateException e) {
                DBUtil.log$default(internalLogger2, 5, target, FrameStatesAggregator$onActivityStopped$1.INSTANCE$9, e, false, 48);
            }
            if (jankStats == null) {
                DBUtil.log$default(this.internalLogger, 4, target, FrameStatesAggregator$onActivityStopped$1.INSTANCE$7, null, false, 56);
                target = target;
            } else {
                weakHashMap2.put(window, jankStats);
            }
        }
        BuildSdkVersionProvider$Companion$DEFAULT$1 buildSdkVersionProvider$Companion$DEFAULT$1 = (BuildSdkVersionProvider$Companion$DEFAULT$1) this.buildSdkVersionProvider;
        if (!buildSdkVersionProvider$Companion$DEFAULT$1.isAtLeastS || containsKey) {
            if (this.display == null && buildSdkVersionProvider$Companion$DEFAULT$1.version == 30) {
                Object systemService = activity.getSystemService("display");
                systemService.getClass();
                this.display = ((DisplayManager) systemService).getDisplay(0);
                return;
            }
            return;
        }
        if (this.frameMetricsListener == null) {
            this.frameMetricsListener = new DDFrameMetricsListener();
        }
        Handler handler = new Handler(Looper.getMainLooper());
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            peekDecorView.post(new ImageCapture$$ExternalSyntheticLambda3(peekDecorView, this, window, handler, 4));
        } else {
            DBUtil.log$default(this.internalLogger, 4, target, FrameStatesAggregator$onActivityStopped$1.INSTANCE$4, null, false, 56);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        activity.getClass();
        Window window = activity.getWindow();
        WeakHashMap weakHashMap = this.activeActivities;
        boolean containsKey = weakHashMap.containsKey(window);
        InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
        if (!containsKey) {
            DBUtil.log$default(this.internalLogger, 4, target2, FrameStatesAggregator$onActivityStopped$1.INSTANCE, null, false, 56);
        }
        List list = (List) weakHashMap.get(window);
        if (list == null) {
            list = new ArrayList();
        }
        CollectionsKt__MutableCollectionsKt.removeAll(list, new InterceptedRenderContext$send$1(activity, 2));
        weakHashMap.put(window, list);
        if (list.isEmpty()) {
            DBUtil.log$default(this.internalLogger, 2, target2, new FrameStatesAggregator$onActivityStopped$3(window, 0), null, false, 56);
            try {
                JankStats jankStats = (JankStats) this.activeWindowsListener.get(window);
                if (jankStats != null) {
                    if (jankStats.isTrackingEnabled) {
                        jankStats.setTrackingEnabled(false);
                    } else {
                        DBUtil.log$default(this.internalLogger, 5, target, FrameStatesAggregator$onActivityStopped$1.INSTANCE$1, null, false, 56);
                    }
                }
            } catch (IllegalArgumentException e) {
                DBUtil.log$default(this.internalLogger, 5, target, FrameStatesAggregator$onActivityStopped$1.INSTANCE$2, e, false, 48);
            } catch (NullPointerException e2) {
                DBUtil.log$default(this.internalLogger, 5, target, FrameStatesAggregator$onActivityStopped$1.INSTANCE$3, e2, false, 48);
            }
        }
    }

    @Override // androidx.metrics.performance.JankStats.OnFrameListener
    public final void onFrame(FrameDataApi24 frameDataApi24) {
        List list = this.frameStateListeners;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((FrameStateListener) list.get(i)).onFrame(frameDataApi24);
        }
    }
}
