package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class InstrumentSelectionBlockerPresenter$models$1$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $blockerSubmissionData$delegate;
    public final /* synthetic */ InstrumentSelectionViewEvent $event;
    public final /* synthetic */ MutableState $preselectedOption$delegate;
    public final /* synthetic */ MutableState $preselectedSecondaryOption$delegate;
    public final /* synthetic */ DisclosurePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSelectionBlockerPresenter$models$1$5$1(DisclosurePresenter disclosurePresenter, InstrumentSelectionViewEvent instrumentSelectionViewEvent, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = disclosurePresenter;
        this.$event = instrumentSelectionViewEvent;
        this.$preselectedOption$delegate = mutableState;
        this.$preselectedSecondaryOption$delegate = mutableState2;
        this.$blockerSubmissionData$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstrumentSelectionBlockerPresenter$models$1$5$1(this.this$0, this.$event, this.$preselectedOption$delegate, this.$preselectedSecondaryOption$delegate, this.$blockerSubmissionData$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstrumentSelectionBlockerPresenter$models$1$5$1) create((BlockerAction.SubmitAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        InstrumentSelectionViewEvent.InstrumentDetailActionRequested instrumentDetailActionRequested = (InstrumentSelectionViewEvent.InstrumentDetailActionRequested) this.$event;
        int i = instrumentDetailActionRequested.id;
        boolean z = instrumentDetailActionRequested.isSecondaryOption;
        DisclosurePresenter disclosurePresenter = this.this$0;
        this.$blockerSubmissionData$delegate.setValue(DisclosurePresenter.access$buildSubmissionData(disclosurePresenter, DisclosurePresenter.access$getInstrumentById(disclosurePresenter, i, z), instrumentDetailActionRequested.isSecondaryOption, (InstrumentSelectionData.InstrumentOption.PreselectableOption) this.$preselectedOption$delegate.getValue(), (InstrumentSelectionData.InstrumentOption.PreselectableOption) this.$preselectedSecondaryOption$delegate.getValue()));
        return Unit.INSTANCE;
    }
}
