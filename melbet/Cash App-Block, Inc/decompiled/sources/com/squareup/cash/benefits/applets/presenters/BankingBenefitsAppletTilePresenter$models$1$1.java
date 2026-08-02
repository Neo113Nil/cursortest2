package com.squareup.cash.benefits.applets.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import squareup.cash.bankingbenefits.ui.CashGreenV1;

/* loaded from: classes7.dex */
public final class BankingBenefitsAppletTilePresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $cashGreen$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ LinkedAccountsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BankingBenefitsAppletTilePresenter$models$1$1(LinkedAccountsPresenter linkedAccountsPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = linkedAccountsPresenter;
        this.$cashGreen$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$cashGreen$delegate;
        LinkedAccountsPresenter linkedAccountsPresenter = this.this$0;
        switch (i) {
            case 0:
                return new BankingBenefitsAppletTilePresenter$models$1$1(linkedAccountsPresenter, mutableState, continuation, 0);
            default:
                return new BankingBenefitsAppletTilePresenter$models$1$1(linkedAccountsPresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BankingBenefitsAppletTilePresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$cashGreen$delegate;
        LinkedAccountsPresenter linkedAccountsPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashGreenV1 cashGreenV1 = (CashGreenV1) mutableState.getValue();
                    this.label = 1;
                    if (LinkedAccountsPresenter.access$onTileClick(linkedAccountsPresenter, cashGreenV1, false, this) == coroutineSingletons) {
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
                    CashGreenV1 cashGreenV12 = (CashGreenV1) mutableState.getValue();
                    this.label = 1;
                    if (LinkedAccountsPresenter.access$onTileClick(linkedAccountsPresenter, cashGreenV12, true, this) == coroutineSingletons2) {
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
