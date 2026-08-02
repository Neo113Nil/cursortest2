package com.squareup.cash.qrcodes;

import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.worker.ApplicationWorker;
import com.squareup.preferences.KeyValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class QrShortcutsOnboardingAppStartWorker implements ApplicationWorker {
    public final AppForegroundStateProvider appForegroundStateProvider;
    public final KeyValue appStarts;
    public final CoroutineContext ioContext;

    public QrShortcutsOnboardingAppStartWorker(AppForegroundStateProvider appForegroundStateProvider, KeyValue keyValue, CoroutineContext coroutineContext) {
        appForegroundStateProvider.getClass();
        keyValue.getClass();
        coroutineContext.getClass();
        this.appForegroundStateProvider = appForegroundStateProvider;
        this.appStarts = keyValue;
        this.ioContext = coroutineContext;
    }

    @Override // com.squareup.cash.worker.ApplicationWorker
    public final Object work(Continuation continuation) {
        Object withContext = JobKt.withContext(this.ioContext, new RealBoostSelector.AnonymousClass1(this, (Continuation) null, 27), continuation);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }
}
