package com.squareup.cash.formview.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FormCashtag$isRequirementFulfilled$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FormCashtag this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormCashtag$isRequirementFulfilled$1(FormCashtag formCashtag, Continuation continuation) {
        super(2, continuation);
        this.this$0 = formCashtag;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FormCashtag$isRequirementFulfilled$1 formCashtag$isRequirementFulfilled$1 = new FormCashtag$isRequirementFulfilled$1(this.this$0, continuation);
        formCashtag$isRequirementFulfilled$1.L$0 = obj;
        return formCashtag$isRequirementFulfilled$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FormCashtag$isRequirementFulfilled$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String str = this.this$0.cashtagElement.prefill_text;
            Boolean valueOf = Boolean.valueOf(!(str == null || str.length() == 0));
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(valueOf, this) == coroutineSingletons) {
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
