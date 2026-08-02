package com.squareup.cash.cashapppay.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GrantPresenter$models$handleAction$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CoroutineScope $$this$launch;
    public final /* synthetic */ MutableState $viewModel$delegate;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ GrantPresenter this$0;

    /* renamed from: com.squareup.cash.cashapppay.presenters.GrantPresenter$models$handleAction$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ BlockerAction.SubmitAction $submitAction;
        public final /* synthetic */ MutableState $viewModel$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BlockerAction.SubmitAction submitAction, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.$submitAction = submitAction;
            this.$viewModel$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$submitAction, this.$viewModel$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            SafeTrace.throwOnFailure(obj);
            this.$viewModel$delegate.setValue(new GrantViewModel.SubmissionInFlight(this.$submitAction.loading_label));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.squareup.cash.cashapppay.presenters.GrantPresenter$models$handleAction$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ BlockerAction.SubmitAction $submitAction;
        public final /* synthetic */ MutableState $viewModel$delegate;
        public int label;
        public final /* synthetic */ GrantPresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(GrantPresenter grantPresenter, BlockerAction.SubmitAction submitAction, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.this$0 = grantPresenter;
            this.$submitAction = submitAction;
            this.$viewModel$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$submitAction, this.$viewModel$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            GrantPresenter grantPresenter = this.this$0;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                String str = this.$submitAction.id;
                str.getClass();
                this.label = 1;
                obj = GrantPresenter.access$submitForm(grantPresenter, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.$viewModel$delegate.setValue(grantPresenter.initialMainViewModel);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrantPresenter$models$handleAction$1$1(CoroutineScope coroutineScope, MutableState mutableState, GrantPresenter grantPresenter, Continuation continuation) {
        super(2, continuation);
        this.$$this$launch = coroutineScope;
        this.$viewModel$delegate = mutableState;
        this.this$0 = grantPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GrantPresenter$models$handleAction$1$1 grantPresenter$models$handleAction$1$1 = new GrantPresenter$models$handleAction$1$1(this.$$this$launch, this.$viewModel$delegate, this.this$0, continuation);
        grantPresenter$models$handleAction$1$1.L$0 = obj;
        return grantPresenter$models$handleAction$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GrantPresenter$models$handleAction$1$1) create((BlockerAction.SubmitAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BlockerAction.SubmitAction submitAction = (BlockerAction.SubmitAction) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CoroutineScope coroutineScope = this.$$this$launch;
        MutableState mutableState = this.$viewModel$delegate;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(submitAction, mutableState, null), 3);
            this.L$0 = submitAction;
            this.label = 1;
            if (launch$default.join(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        JobKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, submitAction, mutableState, null), 3);
        return Unit.INSTANCE;
    }
}
