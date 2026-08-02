package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class FormBlockerPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Map $elementResults;
    public final /* synthetic */ State $signedOut$delegate;
    public final /* synthetic */ MutableState $submissionState$delegate;
    public final /* synthetic */ MutableState $submitAction$delegate;
    public int label;
    public final /* synthetic */ FormBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormBlockerPresenter$models$2$1(MutableState mutableState, FormBlockerPresenter formBlockerPresenter, State state, MutableState mutableState2, Map map, Continuation continuation) {
        super(2, continuation);
        this.$submitAction$delegate = mutableState;
        this.this$0 = formBlockerPresenter;
        this.$signedOut$delegate = state;
        this.$submissionState$delegate = mutableState2;
        this.$elementResults = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FormBlockerPresenter$models$2$1(this.$submitAction$delegate, this.this$0, this.$signedOut$delegate, this.$submissionState$delegate, this.$elementResults, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FormBlockerPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            BlockerAction.SubmitAction submitAction = (BlockerAction.SubmitAction) ((Versioned) this.$submitAction$delegate.getValue()).value;
            if (submitAction == null) {
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (FormBlockerPresenter.access$models$handleSubmitAction(this.this$0, this.$signedOut$delegate, this.$submissionState$delegate, this.$elementResults, submitAction, this) == coroutineSingletons) {
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
