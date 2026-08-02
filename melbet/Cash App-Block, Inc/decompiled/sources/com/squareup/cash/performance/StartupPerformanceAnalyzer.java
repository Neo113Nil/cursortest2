package com.squareup.cash.performance;

import com.squareup.cash.cdf.performance.PerformanceMeasureLaunchDuration;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction$AppPerformance$FrozenFrameOnTouch;
import com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$AppPerformance$FrozenFrameOnRepeatedTaps;
import com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$AppPerformance$FrozenFrameOnTouchAnr;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.worker.ApplicationWorker;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Closeable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import papa.PapaEvent;
import papa.PapaEventListener;
import papa.PapaEventLogger;
import papa.internal.Perfs$$ExternalSyntheticLambda4;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class StartupPerformanceAnalyzer implements ApplicationWorker {
    public final Analytics analytics;
    public final CoroutineScope scope;
    public final UserJourneyTracker userJourneyTracker;

    public StartupPerformanceAnalyzer(Analytics analytics, CoroutineScope coroutineScope, PapaEventListener.Companion companion, UserJourneyTracker userJourneyTracker) {
        this.analytics = analytics;
        this.scope = coroutineScope;
        this.userJourneyTracker = userJourneyTracker;
    }

    @Override // com.squareup.cash.worker.ApplicationWorker
    public final Object work(Continuation continuation) {
        final PapaEventLogger papaEventLogger = new PapaEventLogger();
        CopyOnWriteArrayList copyOnWriteArrayList = PapaEventListener.Companion.listeners;
        copyOnWriteArrayList.add(papaEventLogger);
        Closeable closeable = new Closeable() { // from class: papa.PapaEventListener$Companion$$ExternalSyntheticLambda0
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                PapaEventListener.Companion.listeners.remove(PapaEventListener.this);
            }
        };
        Perfs$$ExternalSyntheticLambda4 perfs$$ExternalSyntheticLambda4 = new Perfs$$ExternalSyntheticLambda4(16);
        CoroutineScope coroutineScope = this.scope;
        StateFlowKt.closeWith(closeable, coroutineScope, perfs$$ExternalSyntheticLambda4);
        final PapaEventListener papaEventListener = new PapaEventListener() { // from class: com.squareup.cash.performance.StartupPerformanceAnalyzer$$ExternalSyntheticLambda0
            @Override // papa.PapaEventListener
            public final void onEvent(PapaEvent papaEvent) {
                PerformanceMeasureLaunchDuration.AppLaunchType appLaunchType;
                boolean z = papaEvent instanceof PapaEvent.AppLaunch;
                StartupPerformanceAnalyzer startupPerformanceAnalyzer = StartupPerformanceAnalyzer.this;
                if (z) {
                    PapaEvent.AppLaunch appLaunch = (PapaEvent.AppLaunch) papaEvent;
                    switch (appLaunch.preLaunchState.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            appLaunchType = PerformanceMeasureLaunchDuration.AppLaunchType.COLD;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            appLaunchType = PerformanceMeasureLaunchDuration.AppLaunchType.WARM;
                            break;
                        case 7:
                            appLaunchType = PerformanceMeasureLaunchDuration.AppLaunchType.HOT;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                    }
                    startupPerformanceAnalyzer.analytics.track(new PerformanceMeasureLaunchDuration(Long.valueOf(appLaunch.durationUptimeMillis), appLaunchType), null);
                    return;
                }
                if (!(papaEvent instanceof PapaEvent.FrozenFrameOnTouch)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                PapaEvent.FrozenFrameOnTouch frozenFrameOnTouch = (PapaEvent.FrozenFrameOnTouch) papaEvent;
                UserJourneyTracker userJourneyTracker = startupPerformanceAnalyzer.userJourneyTracker;
                Timber.Forest.i("Frozen frame detected: " + frozenFrameOnTouch, new Object[0]);
                if (frozenFrameOnTouch.getDeliverDurationUptimeMillis() >= 5000) {
                    UserJourneyTracker.Companion companion = UserJourneyTracker.Companion;
                    ((RealUserJourneyTracker) userJourneyTracker).addFrustrationSignal(null, UserJourney$Frustration$AppPerformance$FrozenFrameOnTouchAnr.INSTANCE);
                }
                if (frozenFrameOnTouch.getRepeatTouchDownCount() >= 5) {
                    UserJourneyTracker.Companion companion2 = UserJourneyTracker.Companion;
                    ((RealUserJourneyTracker) userJourneyTracker).addFrustrationSignal(null, UserJourney$Frustration$AppPerformance$FrozenFrameOnRepeatedTaps.INSTANCE);
                }
                UserJourneyTracker.Companion companion3 = UserJourneyTracker.Companion;
                ((RealUserJourneyTracker) userJourneyTracker).addFrictionSignal(null, UserJourney$Friction$AppPerformance$FrozenFrameOnTouch.INSTANCE);
            }
        };
        copyOnWriteArrayList.add(papaEventListener);
        StateFlowKt.closeWith(new Closeable() { // from class: papa.PapaEventListener$Companion$$ExternalSyntheticLambda0
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                PapaEventListener.Companion.listeners.remove(PapaEventListener.this);
            }
        }, coroutineScope, new Perfs$$ExternalSyntheticLambda4(16));
        return Unit.INSTANCE;
    }
}
