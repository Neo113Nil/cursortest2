package com.datadog.android.rum.internal.startup;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.emoji2.text.MetadataRepo;
import coil3.request.OneShotDisposable;
import coil3.svg.internal.AndroidSvg;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.internal.startup.RumStartupScenario;
import com.datadog.android.rum.internal.utils.window.RumWindowCallback;
import com.datadog.android.trace.internal.DatadogTracerAdapter;
import com.fillr.m1;
import com.google.android.filament.Box;
import com.squareup.workflow1.ui.modal.ModalContainer$update$2$1$2;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes4.dex */
public final class RumAppStartupDetectorImpl implements Application.ActivityLifecycleCallbacks {
    public static final long START_GAP_THRESHOLD_NS;
    public final DatadogTracerAdapter.AnonymousClass1 appStartupTimeProvider;
    public final Application application;
    public boolean isChangingConfigurations;
    public boolean isFirstActivityForProcess;
    public final AndroidSvg listener;
    public int numberOfActivities;

    static {
        Duration.Companion companion = Duration.Companion;
        START_GAP_THRESHOLD_NS = Duration.m4168getInWholeNanosecondsimpl(DurationKt.toDuration(10, DurationUnit.SECONDS));
    }

    public RumAppStartupDetectorImpl(Application application, DatadogTracerAdapter.AnonymousClass1 anonymousClass1, AndroidSvg androidSvg) {
        BuildSdkVersionProvider.Companion companion = BuildSdkVersionProvider.Companion.$$INSTANCE;
        this.application = application;
        this.appStartupTimeProvider = anonymousClass1;
        this.listener = androidSvg;
        this.isFirstActivityForProcess = true;
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (BuildSdkVersionProvider.Companion.DEFAULT.isAtLeastQ) {
            return;
        }
        onBeforeActivityCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        int i = this.numberOfActivities - 1;
        this.numberOfActivities = i;
        if (i == 0) {
            this.isChangingConfigurations = activity.isChangingConfigurations();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (BuildSdkVersionProvider.Companion.DEFAULT.isAtLeastQ) {
            onBeforeActivityCreated(activity, bundle);
        }
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
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    public final void onBeforeActivityCreated(Activity activity, Bundle bundle) {
        int i = 1;
        this.numberOfActivities++;
        Time time = new Time();
        if (this.numberOfActivities == 1 && !this.isChangingConfigurations) {
            Time time2 = (Time) this.appStartupTimeProvider.invoke();
            long j = time.nanoTime - time2.nanoTime;
            boolean z = bundle != null;
            WeakReference weakReference = new WeakReference(activity);
            RumStartupScenario warmFirstActivity = this.isFirstActivityForProcess ? j > START_GAP_THRESHOLD_NS ? new RumStartupScenario.WarmFirstActivity(z, weakReference, j, time) : new RumStartupScenario.Cold(z, weakReference, j, time2) : new RumStartupScenario.WarmAfterActivityDestroyed(z, weakReference, time);
            Activity activity2 = (Activity) warmFirstActivity.getActivity().get();
            if (activity2 != null) {
                AndroidSvg androidSvg = this.listener;
                RumMonitor rumMonitor = GlobalRumMonitor.get(((RumFeature) androidSvg.renderOptions).sdkCore);
                AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
                if (advancedRumMonitor != null) {
                    advancedRumMonitor.sendAppStartEvent(warmFirstActivity);
                    Box box = new Box(3, warmFirstActivity, advancedRumMonitor);
                    MetadataRepo metadataRepo = (MetadataRepo) androidSvg.svg;
                    metadataRepo.getClass();
                    if (activity2.getWindow().peekDecorView() == null) {
                        RumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1 rumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1 = new RumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1(metadataRepo, activity2, box);
                        WeakHashMap weakHashMap = (WeakHashMap) ((m1) metadataRepo.mRootNode).a;
                        Object obj = weakHashMap.get(activity2);
                        if (obj == null) {
                            Window window = activity2.getWindow();
                            window.getClass();
                            Window.Callback callback = window.getCallback();
                            callback.getClass();
                            RumWindowCallback rumWindowCallback = new RumWindowCallback(callback);
                            window.setCallback(rumWindowCallback);
                            weakHashMap.put(activity2, rumWindowCallback);
                            obj = rumWindowCallback;
                        }
                        OneShotDisposable oneShotDisposable = ((RumWindowCallback) obj).subscription;
                        oneShotDisposable.getClass();
                        ((CopyOnWriteArraySet) oneShotDisposable.job).add(rumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1);
                    } else {
                        View decorView = activity2.getWindow().getDecorView();
                        decorView.getClass();
                        if (decorView.isAttachedToWindow()) {
                            metadataRepo.registerOnDrawListener(decorView, box);
                        } else {
                            decorView.addOnAttachStateChangeListener(new ModalContainer$update$2$1$2(i, metadataRepo, decorView, box));
                        }
                    }
                }
            }
        }
        this.isFirstActivityForProcess = false;
    }
}
