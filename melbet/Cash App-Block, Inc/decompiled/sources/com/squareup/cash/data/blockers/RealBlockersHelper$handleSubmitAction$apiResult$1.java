package com.squareup.cash.data.blockers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
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

/* loaded from: classes6.dex */
public final class RealBlockersHelper$handleSubmitAction$apiResult$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ BlockersData $blockersData;
    public final /* synthetic */ BlockerAction.SubmitAction $submitAction;
    public int label;
    public final /* synthetic */ RealBlockersHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBlockersHelper$handleSubmitAction$apiResult$1(RealBlockersHelper realBlockersHelper, BlockerAction.SubmitAction submitAction, BlockersData blockersData, Continuation continuation) {
        super(1, continuation);
        this.this$0 = realBlockersHelper;
        this.$submitAction = submitAction;
        this.$blockersData = blockersData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RealBlockersHelper$handleSubmitAction$apiResult$1(this.this$0, this.$submitAction, this.$blockersData, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RealBlockersHelper$handleSubmitAction$apiResult$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        AppService appService = this.this$0.appService;
        String str = this.$submitAction.id;
        EmptyList emptyList = EmptyList.INSTANCE;
        BlockersData blockersData = this.$blockersData;
        SubmitFormRequest submitFormRequest = new SubmitFormRequest(blockersData.requestContext, str, emptyList, 8);
        ClientScenario clientScenario = blockersData.clientScenario;
        clientScenario.getClass();
        String str2 = blockersData.flowToken;
        this.label = 1;
        Object submitForm = appService.submitForm(clientScenario, str2, submitFormRequest, this);
        return submitForm == coroutineSingletons ? coroutineSingletons : submitForm;
    }
}
