package com.squareup.cash;

import com.squareup.cash.session.backend.SetupTeardownRunner$run$2;
import com.squareup.cash.worker.ApplicationWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobKt;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class SandboxedSetupTeardowns extends InteractionResult implements ApplicationWorker {
    @Override // com.squareup.cash.worker.ApplicationWorker
    public final Object work(Continuation continuation) {
        Unit unit = Unit.INSTANCE;
        Object coroutineScope = JobKt.coroutineScope(new SetupTeardownRunner$run$2(this, unit, (Continuation) null), (SuspendLambda) continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (coroutineScope != coroutineSingletons) {
            coroutineScope = unit;
        }
        return coroutineScope == coroutineSingletons ? coroutineScope : unit;
    }
}
