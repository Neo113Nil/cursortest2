package com.squareup.cash.data.blockers;

import com.squareup.cash.appforeground.AppForegroundState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealBlockersHelper$openExternalUrlAndSubmit$3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;

    public RealBlockersHelper$openExternalUrlAndSubmit$3() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealBlockersHelper$openExternalUrlAndSubmit$3 realBlockersHelper$openExternalUrlAndSubmit$3 = new RealBlockersHelper$openExternalUrlAndSubmit$3(2, continuation);
        realBlockersHelper$openExternalUrlAndSubmit$3.L$0 = obj;
        return realBlockersHelper$openExternalUrlAndSubmit$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealBlockersHelper$openExternalUrlAndSubmit$3) create((AppForegroundState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppForegroundState appForegroundState = (AppForegroundState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return Boolean.valueOf(appForegroundState == AppForegroundState.FOREGROUND);
    }
}
