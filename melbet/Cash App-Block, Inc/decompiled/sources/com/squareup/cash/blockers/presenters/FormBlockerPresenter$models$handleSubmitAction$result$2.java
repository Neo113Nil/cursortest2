package com.squareup.cash.blockers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class FormBlockerPresenter$models$handleSubmitAction$result$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Map $elementResults;
    public final /* synthetic */ String $submitId;
    public int label;
    public final /* synthetic */ FormBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormBlockerPresenter$models$handleSubmitAction$result$2(FormBlockerPresenter formBlockerPresenter, Map map, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = formBlockerPresenter;
        this.$elementResults = map;
        this.$submitId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FormBlockerPresenter$models$handleSubmitAction$result$2(this.this$0, this.$elementResults, this.$submitId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((FormBlockerPresenter$models$handleSubmitAction$result$2) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
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
        FormBlockerPresenter formBlockerPresenter = this.this$0;
        MultiBlockerFacilitator$Resolver multiBlockerFacilitator$Resolver = formBlockerPresenter.blockerResolver;
        SubmitFormRequest submitFormRequest = new SubmitFormRequest(formBlockerPresenter.args.blockersData.requestContext, this.$submitId, CollectionsKt.toList(this.$elementResults.values()), 8);
        this.label = 1;
        Object resolve = multiBlockerFacilitator$Resolver.resolve(submitFormRequest, this);
        return resolve == coroutineSingletons ? coroutineSingletons : resolve;
    }
}
