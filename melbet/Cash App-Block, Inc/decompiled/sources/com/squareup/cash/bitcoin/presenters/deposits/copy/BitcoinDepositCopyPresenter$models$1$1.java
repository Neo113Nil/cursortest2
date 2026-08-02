package com.squareup.cash.bitcoin.presenters.deposits.copy;

import androidx.compose.runtime.MutableState;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinDepositCopyPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $loadedInvoice$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $viewModel$delegate;
    public int label;
    public final /* synthetic */ DisclosurePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitcoinDepositCopyPresenter$models$1$1(DisclosurePresenter disclosurePresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = disclosurePresenter;
        this.$loadedInvoice$delegate = mutableState;
        this.$viewModel$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new BitcoinDepositCopyPresenter$models$1$1(this.this$0, this.$loadedInvoice$delegate, this.$viewModel$delegate, continuation, 0);
            default:
                return new BitcoinDepositCopyPresenter$models$1$1(this.this$0, this.$loadedInvoice$delegate, this.$viewModel$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BitcoinDepositCopyPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$viewModel$delegate;
        MutableState mutableState2 = this.$loadedInvoice$delegate;
        DisclosurePresenter disclosurePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashCardKt$$ExternalSyntheticLambda0 cashCardKt$$ExternalSyntheticLambda0 = new CashCardKt$$ExternalSyntheticLambda0(6, mutableState2);
                    CashCardKt$$ExternalSyntheticLambda0 cashCardKt$$ExternalSyntheticLambda02 = new CashCardKt$$ExternalSyntheticLambda0(7, mutableState);
                    this.label = 1;
                    if (DisclosurePresenter.access$loadLightningInvoice(disclosurePresenter, cashCardKt$$ExternalSyntheticLambda0, cashCardKt$$ExternalSyntheticLambda02, this) == coroutineSingletons) {
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
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(8, mutableState2);
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$12 = new RealBrandFollowPresenter$models$2$1$1(9, mutableState);
                    this.label = 1;
                    if (DisclosurePresenter.access$loadLightningInvoice(disclosurePresenter, realBrandFollowPresenter$models$2$1$1, realBrandFollowPresenter$models$2$1$12, this) == coroutineSingletons2) {
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
