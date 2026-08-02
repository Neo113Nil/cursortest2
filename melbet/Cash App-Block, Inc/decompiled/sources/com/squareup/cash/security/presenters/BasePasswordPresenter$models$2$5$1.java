package com.squareup.cash.security.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class BasePasswordPresenter$models$2$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $state;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ BasePasswordPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePasswordPresenter$models$2$5$1(BasePasswordPresenter basePasswordPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = basePasswordPresenter;
        this.$state = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasePasswordPresenter$models$2$5$1 basePasswordPresenter$models$2$5$1 = new BasePasswordPresenter$models$2$5$1(this.this$0, this.$state, continuation);
        basePasswordPresenter$models$2$5$1.L$0 = obj;
        return basePasswordPresenter$models$2$5$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePasswordPresenter$models$2$5$1) create((BlockerAction.SubmitAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BlockerAction.SubmitAction submitAction = (BlockerAction.SubmitAction) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String str = submitAction.id;
            this.L$0 = null;
            this.label = 1;
            if (BasePasswordPresenter.access$submitForm(this.this$0, str, this.$state, this) == coroutineSingletons) {
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
