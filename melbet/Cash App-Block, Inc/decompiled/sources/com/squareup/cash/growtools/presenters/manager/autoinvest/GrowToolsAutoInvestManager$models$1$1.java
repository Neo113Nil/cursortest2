package com.squareup.cash.growtools.presenters.manager.autoinvest;

import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GrowToolsAutoInvestManager$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GrowToolsManagerState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GrowToolsAutoInvestManager$models$1$1(GrowToolsManagerState growToolsManagerState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state = growToolsManagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new GrowToolsAutoInvestManager$models$1$1(this.$state, continuation, 0);
            case 1:
                return new GrowToolsAutoInvestManager$models$1$1(this.$state, continuation, 1);
            default:
                return new GrowToolsAutoInvestManager$models$1$1(this.$state, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((GrowToolsAutoInvestManager$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        GrowToolsManagerState growToolsManagerState = this.$state;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                growToolsManagerState.setInteractive(true);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                growToolsManagerState.setInteractive(true);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                growToolsManagerState.setInteractive(true);
                break;
        }
        return Unit.INSTANCE;
    }
}
