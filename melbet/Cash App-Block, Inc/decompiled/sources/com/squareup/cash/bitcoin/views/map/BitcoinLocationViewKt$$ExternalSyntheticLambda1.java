package com.squareup.cash.bitcoin.views.map;

import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.WalletAddressOptionsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.deposits.copy.BitcoinDepositCopyViewEvent;
import com.squareup.cash.bitcoin.viewmodels.limits.BitcoinLimitsLoadingViewEvent$BackPressed;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewEvent;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapErrorEvent;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewEvent;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerEvent;
import com.squareup.cash.bitcoin.views.limits.BitcoinLimitsLoadingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinLocationViewKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BitcoinLocationViewKt$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        BitcoinDepositsViewEvent.BackPressed backPressed = BitcoinDepositsViewEvent.BackPressed.INSTANCE;
        WalletAddressOptionsViewEvent.CopyAddress copyAddress = WalletAddressOptionsViewEvent.CopyAddress.INSTANCE;
        BitcoinTransferViewEvent.ChangeOrderTypeClicked changeOrderTypeClicked = BitcoinTransferViewEvent.ChangeOrderTypeClicked.INSTANCE;
        BitcoinTransferViewEvent.ChangeInstrumentClicked changeInstrumentClicked = BitcoinTransferViewEvent.ChangeInstrumentClicked.INSTANCE;
        BitcoinTransferViewEvent.CloseButtonClicked closeButtonClicked = BitcoinTransferViewEvent.CloseButtonClicked.INSTANCE;
        BitcoinLocationViewEvent.Close close = BitcoinLocationViewEvent.Close.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(close);
                break;
            case 1:
                function1.invoke(backPressed);
                break;
            case 2:
                function1.invoke(backPressed);
                break;
            case 3:
                function1.invoke(copyAddress);
                break;
            case 4:
                function1.invoke(WalletAddressOptionsViewEvent.ShareAddress.INSTANCE);
                break;
            case 5:
                function1.invoke(WalletAddressOptionsViewEvent.Close.INSTANCE);
                break;
            case 6:
                function1.invoke(copyAddress);
                break;
            case 7:
                function1.invoke(BitcoinDepositCopyViewEvent.Retry.INSTANCE);
                break;
            case 8:
                function1.invoke(BitcoinDepositCopyViewEvent.CopyOnChainAddress.INSTANCE);
                break;
            case 9:
                function1.invoke(BitcoinDepositCopyViewEvent.CopyLightningInvoice.INSTANCE);
                break;
            case 10:
                function1.invoke(changeInstrumentClicked);
                break;
            case 11:
                function1.invoke(changeOrderTypeClicked);
                break;
            case 12:
                function1.invoke(new BitcoinTransferViewEvent.PercentageSelected(0.25f));
                break;
            case 13:
                function1.invoke(new BitcoinTransferViewEvent.PercentageSelected(0.5f));
                break;
            case 14:
                function1.invoke(new BitcoinTransferViewEvent.PercentageSelected(1.0f));
                break;
            case 15:
                function1.invoke(closeButtonClicked);
                break;
            case 16:
                function1.invoke(changeOrderTypeClicked);
                break;
            case 17:
                function1.invoke(changeInstrumentClicked);
                break;
            case 18:
                function1.invoke(BitcoinTransferViewEvent.Submit.INSTANCE);
                break;
            case 19:
                function1.invoke(closeButtonClicked);
                break;
            case 20:
                function1.invoke(BitcoinKeypadAmountPickerEvent.NoteClicked.INSTANCE);
                break;
            case 21:
                function1.invoke(BitcoinKeypadAmountPickerEvent.QrCodeScannerClicked.INSTANCE);
                break;
            case 22:
                function1.invoke(BitcoinKeypadAmountPickerEvent.CloseButtonClicked.INSTANCE);
                break;
            case 23:
                function1.invoke(BitcoinKeypadAmountPickerEvent.MaxButtonClicked.INSTANCE);
                break;
            case 24:
                function1.invoke(BitcoinKeypadAmountPickerEvent.ChangeCurrencyClicked.INSTANCE);
                break;
            case 25:
                int i2 = BitcoinLimitsLoadingView.$r8$clinit;
                function1.invoke(BitcoinLimitsLoadingViewEvent$BackPressed.INSTANCE);
                break;
            case 26:
                function1.invoke(BitcoinLocationViewEvent.OpenDirections.INSTANCE);
                break;
            case 27:
                function1.invoke(BitcoinLocationViewEvent.Pay.INSTANCE);
                break;
            case 28:
                function1.invoke(close);
                break;
            default:
                function1.invoke(BitcoinMapErrorEvent.PositiveActionSelected.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
