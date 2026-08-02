package com.squareup.cash.activity.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.inputfieldtext.InputFieldText;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class ActivityTabPresenter$models$10$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $activeSearchQuery$delegate;
    public final /* synthetic */ MutableState $isSearching$delegate;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MutableState $scrollToTopCounter$delegate;
    public int label;
    public final /* synthetic */ ActivityTabPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityTabPresenter$models$10$1(MutableState mutableState, ActivityTabPresenter activityTabPresenter, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$activeSearchQuery$delegate = mutableState;
        this.this$0 = activityTabPresenter;
        this.$isSearching$delegate = mutableState2;
        this.$scrollToTopCounter$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ActivityTabPresenter$models$10$1(this.$activeSearchQuery$delegate, this.this$0, this.$isSearching$delegate, this.$scrollToTopCounter$delegate, continuation);
            default:
                return new ActivityTabPresenter$models$10$1(this.this$0, this.$activeSearchQuery$delegate, this.$isSearching$delegate, this.$scrollToTopCounter$delegate, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ActivityTabPresenter$models$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState = this.$activeSearchQuery$delegate;
                    if (((InputFieldText) mutableState.getValue()).getValue().length() > 0) {
                        InputFieldText inputFieldText = (InputFieldText) mutableState.getValue();
                        this.label = 1;
                        if (ActivityTabPresenter.access$models$applySearchQuery(this.this$0, this.$isSearching$delegate, this.$scrollToTopCounter$delegate, inputFieldText, this) == coroutineSingletons) {
                            break;
                        }
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityTabPresenter activityTabPresenter = this.this$0;
                    ChannelAsFlow channelAsFlow = activityTabPresenter.initialArgumentsSupplier.initialSearchQueries;
                    RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(this.$activeSearchQuery$delegate, activityTabPresenter, this.$isSearching$delegate, this.$scrollToTopCounter$delegate, (Continuation) null, 25);
                    this.label = 1;
                    if (FlowKt.collectLatest(channelAsFlow, realImageLoader$execute$result$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityTabPresenter$models$10$1(ActivityTabPresenter activityTabPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = activityTabPresenter;
        this.$activeSearchQuery$delegate = mutableState;
        this.$isSearching$delegate = mutableState2;
        this.$scrollToTopCounter$delegate = mutableState3;
    }
}
