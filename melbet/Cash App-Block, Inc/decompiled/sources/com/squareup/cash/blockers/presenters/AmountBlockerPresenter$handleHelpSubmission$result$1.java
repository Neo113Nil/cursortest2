package com.squareup.cash.blockers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class AmountBlockerPresenter$handleHelpSubmission$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ BlockerAction.SubmitAction $this_handleHelpSubmission;
    public int label;
    public final /* synthetic */ AmountBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountBlockerPresenter$handleHelpSubmission$result$1(AmountBlockerPresenter amountBlockerPresenter, BlockerAction.SubmitAction submitAction, Continuation continuation) {
        super(1, continuation);
        this.this$0 = amountBlockerPresenter;
        this.$this_handleHelpSubmission = submitAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AmountBlockerPresenter$handleHelpSubmission$result$1(this.this$0, this.$this_handleHelpSubmission, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((AmountBlockerPresenter$handleHelpSubmission$result$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AmountBlockerPresenter amountBlockerPresenter = this.this$0;
        BlockersScreens.AmountScreen amountScreen = amountBlockerPresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        AppService appService = amountBlockerPresenter.appService;
        ClientScenario clientScenario = amountScreen.blockersData.clientScenario;
        clientScenario.getClass();
        BlockersData blockersData = amountScreen.blockersData;
        String str = blockersData.flowToken;
        SubmitFormRequest submitFormRequest = new SubmitFormRequest(blockersData.requestContext, this.$this_handleHelpSubmission.id, EmptyList.INSTANCE, 8);
        this.label = 1;
        Object submitForm = appService.submitForm(clientScenario, str, submitFormRequest, this);
        return submitForm == coroutineSingletons ? coroutineSingletons : submitForm;
    }
}
