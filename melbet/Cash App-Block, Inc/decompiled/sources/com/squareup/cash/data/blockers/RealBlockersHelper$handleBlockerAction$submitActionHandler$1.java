package com.squareup.cash.data.blockers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealBlockersHelper$handleBlockerAction$submitActionHandler$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BlockersScreens $currentScreen;
    public final /* synthetic */ Function2 $onLoadingStateChanged;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealBlockersHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBlockersHelper$handleBlockerAction$submitActionHandler$1(RealBlockersHelper realBlockersHelper, BlockersScreens blockersScreens, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realBlockersHelper;
        this.$currentScreen = blockersScreens;
        this.$onLoadingStateChanged = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealBlockersHelper$handleBlockerAction$submitActionHandler$1 realBlockersHelper$handleBlockerAction$submitActionHandler$1 = new RealBlockersHelper$handleBlockerAction$submitActionHandler$1(this.this$0, this.$currentScreen, this.$onLoadingStateChanged, continuation);
        realBlockersHelper$handleBlockerAction$submitActionHandler$1.L$0 = obj;
        return realBlockersHelper$handleBlockerAction$submitActionHandler$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealBlockersHelper$handleBlockerAction$submitActionHandler$1) create((BlockerAction.SubmitAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BlockerAction.SubmitAction submitAction = (BlockerAction.SubmitAction) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 1;
            if (RealBlockersHelper.access$handleSubmitAction(this.this$0, submitAction, this.$currentScreen, this.$onLoadingStateChanged, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
