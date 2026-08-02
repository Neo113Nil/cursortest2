package com.squareup.cash.appforeground;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.worker.ApplicationWorker;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealAppForegroundStateProvider implements AppForegroundStateProvider, ApplicationWorker {
    public final AppForegroundObserver appForegroundObserver;
    public final ReadonlyStateFlow appForegroundState;
    public final StateFlowImpl events;
    public final LifecycleOwner lifecycleOwner;

    public final class AppForegroundObserver implements DefaultLifecycleObserver {
        public AppForegroundObserver() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            StateFlowImpl stateFlowImpl = RealAppForegroundStateProvider.this.events;
            AppForegroundState appForegroundState = AppForegroundState.BACKGROUND;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, appForegroundState);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            StateFlowImpl stateFlowImpl = RealAppForegroundStateProvider.this.events;
            AppForegroundState appForegroundState = AppForegroundState.FOREGROUND;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, appForegroundState);
        }
    }

    public RealAppForegroundStateProvider(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
        this.lifecycleOwner = lifecycleOwner;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(AppForegroundState.BACKGROUND);
        this.events = MutableStateFlow;
        this.appForegroundObserver = new AppForegroundObserver();
        this.appForegroundState = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.squareup.cash.worker.ApplicationWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object work(Continuation continuation) {
        RealAppForegroundStateProvider$work$1 realAppForegroundStateProvider$work$1;
        int i;
        Throwable th;
        Lifecycle lifecycle;
        if (continuation instanceof RealAppForegroundStateProvider$work$1) {
            realAppForegroundStateProvider$work$1 = (RealAppForegroundStateProvider$work$1) continuation;
            int i2 = realAppForegroundStateProvider$work$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAppForegroundStateProvider$work$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAppForegroundStateProvider$work$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAppForegroundStateProvider$work$1.label;
                AppForegroundObserver appForegroundObserver = this.appForegroundObserver;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Lifecycle lifecycle2 = this.lifecycleOwner.getLifecycle();
                    lifecycle2.addObserver(appForegroundObserver);
                    AppForegroundState appForegroundState = lifecycle2.getCurrentState().isAtLeast(Lifecycle.State.RESUMED) ? AppForegroundState.FOREGROUND : AppForegroundState.BACKGROUND;
                    StateFlowImpl stateFlowImpl = this.events;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, appForegroundState);
                    try {
                        realAppForegroundStateProvider$work$1.L$0 = lifecycle2;
                        realAppForegroundStateProvider$work$1.label = 1;
                        JobKt.awaitCancellation(realAppForegroundStateProvider$work$1);
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        lifecycle = lifecycle2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lifecycle = realAppForegroundStateProvider$work$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                lifecycle.removeObserver(appForegroundObserver);
                throw th;
            }
        }
        realAppForegroundStateProvider$work$1 = new RealAppForegroundStateProvider$work$1(this, (ContinuationImpl) continuation);
        Object obj2 = realAppForegroundStateProvider$work$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAppForegroundStateProvider$work$1.label;
        AppForegroundObserver appForegroundObserver2 = this.appForegroundObserver;
        if (i != 0) {
        }
        lifecycle.removeObserver(appForegroundObserver2);
        throw th;
    }
}
