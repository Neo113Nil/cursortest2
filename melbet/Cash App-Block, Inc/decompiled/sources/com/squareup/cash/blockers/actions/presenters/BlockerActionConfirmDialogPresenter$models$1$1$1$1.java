package com.squareup.cash.blockers.actions.presenters;

import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BlockerActionConfirmDialogPresenter$models$1$1$1$1 extends SuspendLambda implements Function2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BlockerActionConfirmDialogPresenter$models$1$1$1$1(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BlockerActionConfirmDialogPresenter$models$1$1$1$1) create((BlockerAction.SubmitAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
