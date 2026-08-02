package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.viewmodels.CashtagViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class CashtagPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $cashtagStatus$delegate;
    public final /* synthetic */ CashtagViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $registeringCashtag$delegate;
    public int label;
    public final /* synthetic */ CashtagPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashtagPresenter$models$3$1(CashtagPresenter cashtagPresenter, CashtagViewEvent cashtagViewEvent, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cashtagPresenter;
        this.$event = cashtagViewEvent;
        this.$cashtagStatus$delegate = mutableState;
        this.$registeringCashtag$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CashtagPresenter$models$3$1(this.this$0, this.$event, this.$cashtagStatus$delegate, this.$registeringCashtag$delegate, continuation, 0);
            default:
                return new CashtagPresenter$models$3$1(this.this$0, this.$event, this.$cashtagStatus$delegate, this.$registeringCashtag$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CashtagPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$registeringCashtag$delegate;
        MutableState mutableState2 = this.$cashtagStatus$delegate;
        CashtagViewEvent cashtagViewEvent = this.$event;
        CashtagPresenter cashtagPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = ((CashtagViewEvent.NextClick) cashtagViewEvent).cashtagInput;
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(10, mutableState2);
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$12 = new RealBrandFollowPresenter$models$2$1$1(11, mutableState);
                    this.label = 1;
                    if (CashtagPresenter.access$checkCashtagAndSubmit(cashtagPresenter, str, realBrandFollowPresenter$models$2$1$1, realBrandFollowPresenter$models$2$1$12, this) == coroutineSingletons) {
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
                    String str2 = ((CashtagViewEvent.DialogPositiveResult) cashtagViewEvent).cashtag;
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$13 = new RealBrandFollowPresenter$models$2$1$1(12, mutableState2);
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$14 = new RealBrandFollowPresenter$models$2$1$1(13, mutableState);
                    this.label = 1;
                    if (cashtagPresenter.submitCashtag(str2, realBrandFollowPresenter$models$2$1$13, realBrandFollowPresenter$models$2$1$14, this) == coroutineSingletons2) {
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
