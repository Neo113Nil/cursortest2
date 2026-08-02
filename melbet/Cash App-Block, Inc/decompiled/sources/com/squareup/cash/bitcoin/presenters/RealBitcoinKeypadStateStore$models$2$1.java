package com.squareup.cash.bitcoin.presenters;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatus;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$3$1;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public final class RealBitcoinKeypadStateStore$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $availableBalance$delegate;
    public final /* synthetic */ MutableState $bitcoinDisplayUnits$delegate;
    public /* synthetic */ Object $bitcoinState$delegate;
    public final /* synthetic */ Object $hasRestrictions$delegate;
    public final /* synthetic */ Object $idvStatus$delegate;
    public final /* synthetic */ Object $lightningWeeklyDepositLimitUsd$delegate;
    public final /* synthetic */ State $minimumWithdrawalLimit$delegate;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $restrictedUsdBalance$delegate;
    public final /* synthetic */ MutableState $valuePerBitcoin$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBitcoinKeypadStateStore$models$2$1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, Continuation continuation) {
        super(2, continuation);
        this.$bitcoinDisplayUnits$delegate = mutableState;
        this.$valuePerBitcoin$delegate = mutableState2;
        this.$bitcoinState$delegate = mutableState3;
        this.$hasRestrictions$delegate = mutableState4;
        this.$restrictedUsdBalance$delegate = mutableState5;
        this.$availableBalance$delegate = mutableState6;
        this.$minimumWithdrawalLimit$delegate = mutableState7;
        this.$idvStatus$delegate = mutableState8;
        this.$lightningWeeklyDepositLimitUsd$delegate = mutableState9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        State state = this.$minimumWithdrawalLimit$delegate;
        Object obj2 = this.$lightningWeeklyDepositLimitUsd$delegate;
        Object obj3 = this.$idvStatus$delegate;
        Object obj4 = this.$availableBalance$delegate;
        Object obj5 = this.$restrictedUsdBalance$delegate;
        Object obj6 = this.$hasRestrictions$delegate;
        switch (i) {
            case 0:
                return new RealBitcoinKeypadStateStore$models$2$1(this.$bitcoinDisplayUnits$delegate, this.$valuePerBitcoin$delegate, (MutableState) this.$bitcoinState$delegate, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) state, (MutableState) obj3, (MutableState) obj2, continuation);
            case 1:
                return new RealBitcoinKeypadStateStore$models$2$1((RealSheetState) this.$bitcoinState$delegate, (BitcoinTransferViewModel) obj6, (AmountDisplayState) obj5, (Function1) obj4, (MutableFloatState) state, (MutableFloatState) obj3, (State) obj2, this.$bitcoinDisplayUnits$delegate, this.$valuePerBitcoin$delegate, continuation);
            default:
                RealBitcoinKeypadStateStore$models$2$1 realBitcoinKeypadStateStore$models$2$1 = new RealBitcoinKeypadStateStore$models$2$1((PointerInputScope) obj6, (CardScene) obj5, (CoroutineScope) obj4, this.$minimumWithdrawalLimit$delegate, (MutableSharedFlow) obj3, this.$bitcoinDisplayUnits$delegate, this.$valuePerBitcoin$delegate, (MutableSharedFlow) obj2, continuation);
                realBitcoinKeypadStateStore$models$2$1.$bitcoinState$delegate = obj;
                return realBitcoinKeypadStateStore$models$2$1;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealBitcoinKeypadStateStore$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$valuePerBitcoin$delegate;
        MutableState mutableState2 = this.$bitcoinDisplayUnits$delegate;
        State state = this.$minimumWithdrawalLimit$delegate;
        Object obj2 = this.$lightningWeeklyDepositLimitUsd$delegate;
        Object obj3 = this.$idvStatus$delegate;
        Object obj4 = this.$availableBalance$delegate;
        Object obj5 = this.$restrictedUsdBalance$delegate;
        Object obj6 = this.$hasRestrictions$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealBitcoinKeypadStateStore.lastBitcoinDisplayUnits = (BitcoinDisplayUnits) mutableState2.getValue();
                RealBitcoinKeypadStateStore.lastValuePerBitcoin = (Money) mutableState.getValue();
                MutableState mutableState3 = (MutableState) this.$bitcoinState$delegate;
                mutableState3.setValue(BitcoinKeypadStateStore$State.copy$default((BitcoinKeypadStateStore$State) mutableState3.getValue(), null, null, (Money) mutableState.getValue(), (((BitcoinKeypadStateStore$State) mutableState3.getValue()).useRestrictedBalance && ((Boolean) ((MutableState) obj6).getValue()).booleanValue()) ? Moneys.convertBitcoinEquivalentAmount((Money) ((MutableState) obj5).getValue(), (Money) mutableState.getValue()) : (Money) ((MutableState) obj4).getValue(), (BitcoinDisplayUnits) mutableState2.getValue(), new Money(new Long(((Number) ((MutableState) state).getValue()).longValue()), CurrencyCode.BTC, 4), (Money) ((MutableState) obj2).getValue(), (CryptoIdvStatus) ((MutableState) obj3).getValue(), false, 3715));
                break;
            case 1:
                Function1 function1 = (Function1) obj4;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                float expandProgress = ((RealSheetState) this.$bitcoinState$delegate).getExpandProgress();
                MutableFloatState mutableFloatState = (MutableFloatState) state;
                float f = RecyclerView.DECELERATION_RATE;
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(expandProgress < 0.5f ? 1.0f - (expandProgress * 2.0f) : 0.0f);
                MutableFloatState mutableFloatState2 = (MutableFloatState) obj3;
                if (expandProgress >= 0.5f) {
                    f = (expandProgress - 0.5f) * 2.0f;
                }
                ((ParcelableSnapshotMutableFloatState) mutableFloatState2).setFloatValue(f);
                if (!((Boolean) ((State) obj2).getValue()).booleanValue()) {
                    break;
                } else {
                    BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj6;
                    if (expandProgress > 0.5d) {
                        if (!(bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.FullScreenContent)) {
                            AmountDisplayState.reset$default((AmountDisplayState) obj5, "0", 2);
                            mutableState2.setValue(Boolean.FALSE);
                            function1.invoke(new BitcoinTransferViewEvent.AmountEntered("0", 0L));
                            function1.invoke(BitcoinTransferViewEvent.Expanded.INSTANCE);
                        }
                    } else if (!(bitcoinTransferViewModel instanceof BitcoinTransferViewModel.Content.BottomSheetContent)) {
                        mutableState.setValue(Boolean.FALSE);
                        function1.invoke(new BitcoinTransferViewEvent.AmountEntered("0", 0L));
                        function1.invoke(BitcoinTransferViewEvent.Peeking.INSTANCE);
                    }
                    break;
                }
            default:
                CoroutineScope coroutineScope = (CoroutineScope) this.$bitcoinState$delegate;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new CardSchemePresenter$models$3$1((PointerInputScope) obj6, (CardScene) obj5, (CoroutineScope) obj4, this.$minimumWithdrawalLimit$delegate, (MutableSharedFlow) obj3, this.$bitcoinDisplayUnits$delegate, this.$valuePerBitcoin$delegate, (MutableSharedFlow) obj2, (Continuation) null), 1);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBitcoinKeypadStateStore$models$2$1(PointerInputScope pointerInputScope, CardScene cardScene, CoroutineScope coroutineScope, State state, MutableSharedFlow mutableSharedFlow, MutableState mutableState, MutableState mutableState2, MutableSharedFlow mutableSharedFlow2, Continuation continuation) {
        super(2, continuation);
        this.$hasRestrictions$delegate = pointerInputScope;
        this.$restrictedUsdBalance$delegate = cardScene;
        this.$availableBalance$delegate = coroutineScope;
        this.$minimumWithdrawalLimit$delegate = state;
        this.$idvStatus$delegate = mutableSharedFlow;
        this.$bitcoinDisplayUnits$delegate = mutableState;
        this.$valuePerBitcoin$delegate = mutableState2;
        this.$lightningWeeklyDepositLimitUsd$delegate = mutableSharedFlow2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBitcoinKeypadStateStore$models$2$1(RealSheetState realSheetState, BitcoinTransferViewModel bitcoinTransferViewModel, AmountDisplayState amountDisplayState, Function1 function1, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State state, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$bitcoinState$delegate = realSheetState;
        this.$hasRestrictions$delegate = bitcoinTransferViewModel;
        this.$restrictedUsdBalance$delegate = amountDisplayState;
        this.$availableBalance$delegate = function1;
        this.$minimumWithdrawalLimit$delegate = mutableFloatState;
        this.$idvStatus$delegate = mutableFloatState2;
        this.$lightningWeeklyDepositLimitUsd$delegate = state;
        this.$bitcoinDisplayUnits$delegate = mutableState;
        this.$valuePerBitcoin$delegate = mutableState2;
    }
}
