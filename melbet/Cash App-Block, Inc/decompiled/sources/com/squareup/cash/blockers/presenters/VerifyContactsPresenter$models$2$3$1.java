package com.squareup.cash.blockers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class VerifyContactsPresenter$models$2$3$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ VerifyContactsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyContactsPresenter$models$2$3$1(VerifyContactsPresenter verifyContactsPresenter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = verifyContactsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerifyContactsPresenter$models$2$3$1 verifyContactsPresenter$models$2$3$1 = new VerifyContactsPresenter$models$2$3$1(this.this$0, continuation);
        verifyContactsPresenter$models$2$3$1.L$0 = obj;
        return verifyContactsPresenter$models$2$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((VerifyContactsPresenter$models$2$3$1) create((BlockerAction.SubmitAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
            if (VerifyContactsPresenter.access$submitBlockerAction(this.this$0, submitAction, this) == coroutineSingletons) {
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
