package com.squareup.cash.lifecycle.util;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.SharingCommand;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class WhileActivityStartedAndSubscribed$command$1 extends SuspendLambda implements Function3 {
    public /* synthetic */ int I$0;
    public /* synthetic */ Lifecycle.State L$0;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        WhileActivityStartedAndSubscribed$command$1 whileActivityStartedAndSubscribed$command$1 = new WhileActivityStartedAndSubscribed$command$1(3, (Continuation) obj3);
        whileActivityStartedAndSubscribed$command$1.I$0 = intValue;
        whileActivityStartedAndSubscribed$command$1.L$0 = (Lifecycle.State) obj2;
        return whileActivityStartedAndSubscribed$command$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        Lifecycle.State state = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return (!state.isAtLeast(Lifecycle.State.STARTED) || i <= 0) ? SharingCommand.STOP : SharingCommand.START;
    }
}
