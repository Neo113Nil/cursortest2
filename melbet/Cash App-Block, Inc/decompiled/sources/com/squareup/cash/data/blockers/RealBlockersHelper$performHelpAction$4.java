package com.squareup.cash.data.blockers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealBlockersHelper$performHelpAction$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BlockersData $blockersData;
    public final /* synthetic */ ClientScenario $clientScenario;
    public final /* synthetic */ BlockersScreens $currentScreen;
    public final /* synthetic */ Function2 $handleError;
    public final /* synthetic */ Function2 $onLoadingStateChanged;
    public int label;
    public final /* synthetic */ RealBlockersHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBlockersHelper$performHelpAction$4(RealBlockersHelper realBlockersHelper, BlockersScreens blockersScreens, BlockersData blockersData, ClientScenario clientScenario, Function2 function2, Function2 function22, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realBlockersHelper;
        this.$currentScreen = blockersScreens;
        this.$blockersData = blockersData;
        this.$clientScenario = clientScenario;
        this.$handleError = function2;
        this.$onLoadingStateChanged = function22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealBlockersHelper$performHelpAction$4(this.this$0, this.$currentScreen, this.$blockersData, this.$clientScenario, this.$handleError, this.$onLoadingStateChanged, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealBlockersHelper$performHelpAction$4) create((BlockerAction.SkipBlockerAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            BlockersData blockersData = this.$blockersData;
            ClientScenario clientScenario = this.$clientScenario;
            RealBlockersHelper realBlockersHelper = this.this$0;
            SafeFlow skipBlocker = realBlockersHelper.skipBlocker(this.$currentScreen, blockersData, clientScenario);
            this.label = 1;
            if (realBlockersHelper.collectBlockersActions(skipBlocker, this.$handleError, this.$onLoadingStateChanged, this) == coroutineSingletons) {
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
