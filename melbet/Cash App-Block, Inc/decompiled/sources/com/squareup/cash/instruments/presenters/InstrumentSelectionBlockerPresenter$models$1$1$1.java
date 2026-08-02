package com.squareup.cash.instruments.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.transfers.screens.InstrumentLinkingOption;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InstrumentSelectionBlockerPresenter$models$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ InstrumentLinkingOption $answer;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $submitting$delegate;
    public int label;
    public final /* synthetic */ InstrumentSelectionBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstrumentSelectionBlockerPresenter$models$1$1$1(InstrumentSelectionBlockerPresenter instrumentSelectionBlockerPresenter, InstrumentLinkingOption instrumentLinkingOption, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = instrumentSelectionBlockerPresenter;
        this.$answer = instrumentLinkingOption;
        this.$submitting$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new InstrumentSelectionBlockerPresenter$models$1$1$1(this.this$0, this.$answer, this.$submitting$delegate, continuation, 0);
            default:
                return new InstrumentSelectionBlockerPresenter$models$1$1$1(this.this$0, this.$answer, this.$submitting$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InstrumentSelectionBlockerPresenter$models$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$submitting$delegate;
        InstrumentLinkingOption instrumentLinkingOption = this.$answer;
        InstrumentSelectionBlockerPresenter instrumentSelectionBlockerPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InstrumentSelectionBlockerScreen.InstrumentAction.Link link = new InstrumentSelectionBlockerScreen.InstrumentAction.Link(((InstrumentLinkingOption.Link) instrumentLinkingOption).cashInstrumentType);
                    CaptureCheckFaceKt$$ExternalSyntheticLambda5 captureCheckFaceKt$$ExternalSyntheticLambda5 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(22, mutableState);
                    this.label = 1;
                    if (InstrumentSelectionBlockerPresenter.access$submitAction(instrumentSelectionBlockerPresenter, link, captureCheckFaceKt$$ExternalSyntheticLambda5, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InstrumentLinkingOption.ReplaceInstrument replaceInstrument = (InstrumentLinkingOption.ReplaceInstrument) instrumentLinkingOption;
                    InstrumentSelectionBlockerScreen.InstrumentAction.Replace replace = new InstrumentSelectionBlockerScreen.InstrumentAction.Replace(replaceInstrument.cashInstrumentType, replaceInstrument.instrumentToken);
                    CaptureCheckFaceKt$$ExternalSyntheticLambda5 captureCheckFaceKt$$ExternalSyntheticLambda52 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(23, mutableState);
                    this.label = 1;
                    if (InstrumentSelectionBlockerPresenter.access$submitAction(instrumentSelectionBlockerPresenter, replace, captureCheckFaceKt$$ExternalSyntheticLambda52, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
