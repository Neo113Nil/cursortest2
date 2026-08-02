package com.squareup.cash.performance;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.Window;
import android.widget.Toast;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.metrics.performance.JankStats;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.ui.MainActivity;
import com.squareup.preferences.SharedPreferencesKeyValue;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class JankStatsAggregator {
    public final MainActivity activity;
    public boolean alreadyRejectedOverlayPermission;
    public final JankStatsAggregator$connection$1 connection;
    public int consecutiveJankyFrames;
    public int currentScreenId;
    public String currentScreenName;
    public boolean fpsCounterOverlayEnabled;
    public final FrameMetricsBuffer frameMetricsBuffer;
    public JankStats jankStats;
    public long lastScreenTransitionTime;
    public final OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 listener;
    public StandaloneCoroutine monitor;
    public final RealObservabilityManager observabilityManager;
    public String previousScreenName;
    public final CoroutineScope scope;
    public final LinkedHashMap screenLastAlertTime;
    public final boolean shouldMonitorProduction;
    public boolean started;

    /* renamed from: com.squareup.cash.performance.JankStatsAggregator$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ Flow $activityResults;
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ JankStatsAggregator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Flow flow, JankStatsAggregator jankStatsAggregator, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$activityResults = flow;
            this.this$0 = jankStatsAggregator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            JankStatsAggregator jankStatsAggregator = this.this$0;
            Flow flow = this.$activityResults;
            switch (i) {
                case 0:
                    return new AnonymousClass2(flow, jankStatsAggregator, continuation, 0);
                default:
                    return new AnonymousClass2(flow, jankStatsAggregator, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            JankStatsAggregator jankStatsAggregator = this.this$0;
            Flow flow = this.$activityResults;
            int i2 = 1;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        JankStatsAggregator$1$1 jankStatsAggregator$1$1 = new JankStatsAggregator$1$1(jankStatsAggregator, i2);
                        this.label = 1;
                        Object collect = flow.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(jankStatsAggregator$1$1, 28), this);
                        if (collect != coroutineSingletons) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        JankStatsAggregator$1$1 jankStatsAggregator$1$12 = new JankStatsAggregator$1$1(jankStatsAggregator, 2);
                        this.label = 1;
                        if (flow.collect(jankStatsAggregator$1$12, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public final class FrameMetricsBuffer {
        public int size;
        public int writeIndex;
        public final long[] timestamps = new long[144];
        public final boolean[] jankFlags = new boolean[144];
    }

    /* loaded from: classes6.dex */
    public final class JankMetrics {
        public final int consecutiveJankyFrames;
        public final boolean hasSignificantJank;
        public final double jankPercentage;
        public final int jankyFrameCount;
        public final int totalFrames;

        public JankMetrics(int i, int i2, double d, int i3, boolean z) {
            this.totalFrames = i;
            this.jankyFrameCount = i2;
            this.jankPercentage = d;
            this.consecutiveJankyFrames = i3;
            this.hasSignificantJank = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JankMetrics)) {
                return false;
            }
            JankMetrics jankMetrics = (JankMetrics) obj;
            return this.totalFrames == jankMetrics.totalFrames && this.jankyFrameCount == jankMetrics.jankyFrameCount && Double.compare(this.jankPercentage, jankMetrics.jankPercentage) == 0 && this.consecutiveJankyFrames == jankMetrics.consecutiveJankyFrames && this.hasSignificantJank == jankMetrics.hasSignificantJank;
        }

        public final int getConsecutiveJankyFrames() {
            return this.consecutiveJankyFrames;
        }

        public final boolean getHasSignificantJank() {
            return this.hasSignificantJank;
        }

        public final double getJankPercentage() {
            return this.jankPercentage;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasSignificantJank) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.consecutiveJankyFrames, Fragment$5$$ExternalSyntheticOutline0.m(this.jankPercentage, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.jankyFrameCount, Integer.hashCode(this.totalFrames) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.totalFrames, this.jankyFrameCount, "JankMetrics(totalFrames=", ", jankyFrameCount=", ", jankPercentage=");
            m107m.append(this.jankPercentage);
            m107m.append(", consecutiveJankyFrames=");
            m107m.append(this.consecutiveJankyFrames);
            m107m.append(", hasSignificantJank=");
            m107m.append(this.hasSignificantJank);
            m107m.append(")");
            return m107m.toString();
        }
    }

    public JankStatsAggregator(MainActivity mainActivity, ContextScope contextScope, RealObservabilityManager realObservabilityManager, boolean z, SharedPreferencesKeyValue sharedPreferencesKeyValue, SharedFlowImpl sharedFlowImpl, SharedFlowImpl sharedFlowImpl2, StateFlow stateFlow) {
        contextScope.getClass();
        realObservabilityManager.getClass();
        sharedPreferencesKeyValue.getClass();
        sharedFlowImpl.getClass();
        sharedFlowImpl2.getClass();
        stateFlow.getClass();
        this.activity = mainActivity;
        this.scope = contextScope;
        this.observabilityManager = realObservabilityManager;
        this.shouldMonitorProduction = z;
        this.screenLastAlertTime = new LinkedHashMap();
        this.currentScreenName = "";
        this.previousScreenName = "";
        this.frameMetricsBuffer = new FrameMetricsBuffer();
        this.listener = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(this, 11);
        this.connection = new JankStatsAggregator$connection$1();
        Continuation continuation = null;
        JobKt.launch$default(contextScope, null, null, new RealBoostSelector.AnonymousClass1(stateFlow, this, continuation, 25), 3);
        JobKt.launch$default(contextScope, null, null, new AnonymousClass2(sharedFlowImpl, this, continuation, 0), 3);
        JobKt.launch$default(contextScope, null, null, new AnonymousClass2(sharedFlowImpl2, this, continuation, 1), 3);
        JobKt.launch$default(contextScope, null, null, new RealBoostSelector.AnonymousClass1(sharedPreferencesKeyValue, this, continuation, 26), 3);
    }

    public static final void access$startOrStopJankStatsMonitoring(JankStatsAggregator jankStatsAggregator, MainActivity mainActivity, boolean z) {
        if (z) {
            jankStatsAggregator.startMonitoring(mainActivity);
            return;
        }
        if (jankStatsAggregator.started) {
            JankStats jankStats = jankStatsAggregator.jankStats;
            if (jankStats == null) {
                Intrinsics.throwUninitializedPropertyAccessException("jankStats");
                throw null;
            }
            jankStats.setTrackingEnabled(false);
            jankStatsAggregator.started = false;
            try {
                mainActivity.unbindService(jankStatsAggregator.connection);
            } catch (IllegalArgumentException unused) {
            }
            StandaloneCoroutine standaloneCoroutine = jankStatsAggregator.monitor;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(null);
            }
            jankStatsAggregator.monitor = null;
        }
    }

    public final void startMonitoring(MainActivity mainActivity) {
        if (this.shouldMonitorProduction || this.fpsCounterOverlayEnabled) {
            if (!this.started) {
                JankStats jankStats = this.jankStats;
                if (jankStats == null) {
                    Window window = mainActivity.getWindow();
                    window.getClass();
                    this.jankStats = JankStats.Companion.createAndTrack(window, this.listener);
                } else {
                    jankStats.setTrackingEnabled(true);
                }
                this.started = true;
            }
            if (this.fpsCounterOverlayEnabled) {
                startOverlay(mainActivity);
            }
        }
    }

    public final void startOverlay(MainActivity mainActivity) {
        if (this.monitor != null) {
            return;
        }
        if (Settings.canDrawOverlays(mainActivity)) {
            mainActivity.bindService(new Intent(mainActivity, (Class<?>) FpsCounterService.class), this.connection, 1);
            this.monitor = JobKt.launch$default(this.scope, new CoroutineName("JankStats"), null, new MusicPresenter$models$3$1(this, null, 22), 2);
            return;
        }
        if (!this.alreadyRejectedOverlayPermission) {
            mainActivity.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + mainActivity.getPackageName())), 100);
        }
        if (this.alreadyRejectedOverlayPermission) {
            Toast.makeText(mainActivity, "FPS Counter Overlay won't work!", 1).show();
        }
    }
}
