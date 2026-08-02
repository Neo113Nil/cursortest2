package com.squareup.cash.bitcoin.views.exchange;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.investing.components.ArcadeMigrationUtilsKt$investingCryptoExchangeView$1;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewEvent;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinExchangeViewKt$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MutableState f$1;
    public final /* synthetic */ MutableState f$2;
    public final /* synthetic */ AmountDisplayState f$3;
    public final /* synthetic */ CoroutineScope f$4;
    public final /* synthetic */ RealSheetState f$5;

    public /* synthetic */ BitcoinExchangeViewKt$$ExternalSyntheticLambda8(Function1 function1, MutableState mutableState, MutableState mutableState2, AmountDisplayState amountDisplayState, ArcadeMigrationUtilsKt$investingCryptoExchangeView$1 arcadeMigrationUtilsKt$investingCryptoExchangeView$1, CoroutineScope coroutineScope, RealSheetState realSheetState) {
        this.f$0 = function1;
        this.f$1 = mutableState;
        this.f$2 = mutableState2;
        this.f$3 = amountDisplayState;
        this.f$4 = coroutineScope;
        this.f$5 = realSheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        RealSheetState realSheetState = this.f$5;
        CoroutineScope coroutineScope = this.f$4;
        AmountDisplayState amountDisplayState = this.f$3;
        MutableState mutableState = this.f$2;
        MutableState mutableState2 = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                BitcoinTransferViewEvent bitcoinTransferViewEvent = (BitcoinTransferViewEvent) obj;
                bitcoinTransferViewEvent.getClass();
                if (bitcoinTransferViewEvent instanceof BitcoinTransferViewEvent.ItemSelected) {
                    Object obj2 = ((BitcoinTransferViewEvent.ItemSelected) bitcoinTransferViewEvent).selection;
                    boolean z = obj2 instanceof AmountSelection.HasAmount;
                    mutableState2.setValue(Boolean.valueOf(z));
                    mutableState.setValue(Boolean.valueOf(z));
                    if (z) {
                        AmountSelection.HasAmount hasAmount = (AmountSelection.HasAmount) obj2;
                        AmountDisplayState.reset$default(amountDisplayState, BitcoinExchangeViewKt.amountString(hasAmount), 2);
                        function1.invoke(new BitcoinTransferViewEvent.AmountEntered(String.valueOf(hasAmount.getAmount()), hasAmount.getAmount()));
                    } else if (obj2 instanceof AmountSelection.TradeCustomize) {
                        AmountDisplayState.reset$default(amountDisplayState, "0", 2);
                        function1.invoke(new BitcoinTransferViewEvent.AmountEntered("0", 0L));
                        mutableState.setValue(Boolean.FALSE);
                        JobKt.launch$default(coroutineScope, null, null, new RealSheetState$peek$3(realSheetState, null, 9), 3);
                    }
                }
                function1.invoke(bitcoinTransferViewEvent);
                break;
            default:
                InvestingExchangeViewEvent investingExchangeViewEvent = (InvestingExchangeViewEvent) obj;
                investingExchangeViewEvent.getClass();
                if (investingExchangeViewEvent instanceof InvestingExchangeViewEvent.ItemSelected) {
                    Object obj3 = ((InvestingExchangeViewEvent.ItemSelected) investingExchangeViewEvent).selection;
                    boolean z2 = obj3 instanceof AmountSelection.HasAmount;
                    mutableState2.setValue(Boolean.valueOf(z2));
                    mutableState.setValue(Boolean.valueOf(z2));
                    if (z2) {
                        AmountSelection.HasAmount hasAmount2 = (AmountSelection.HasAmount) obj3;
                        AmountDisplayState.reset$default(amountDisplayState, ArcadeMigrationUtilsKt$investingCryptoExchangeView$1.amountString(hasAmount2), 2);
                        function1.invoke(new InvestingExchangeViewEvent.AmountEntered(String.valueOf(hasAmount2.getAmount()), hasAmount2.getAmount()));
                    } else if (obj3 instanceof AmountSelection.TradeCustomize) {
                        AmountDisplayState.reset$default(amountDisplayState, "0", 2);
                        function1.invoke(new InvestingExchangeViewEvent.AmountEntered("0", 0L));
                        mutableState.setValue(Boolean.FALSE);
                        JobKt.launch$default(coroutineScope, null, null, new RealSheetState$peek$3(realSheetState, null, 11), 3);
                    }
                }
                function1.invoke(investingExchangeViewEvent);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BitcoinExchangeViewKt$$ExternalSyntheticLambda8(Function1 function1, MutableState mutableState, MutableState mutableState2, AmountDisplayState amountDisplayState, CoroutineScope coroutineScope, RealSheetState realSheetState) {
        this.f$0 = function1;
        this.f$1 = mutableState;
        this.f$2 = mutableState2;
        this.f$3 = amountDisplayState;
        this.f$4 = coroutineScope;
        this.f$5 = realSheetState;
    }
}
