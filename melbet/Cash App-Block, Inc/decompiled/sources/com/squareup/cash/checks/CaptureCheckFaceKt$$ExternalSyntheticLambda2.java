package com.squareup.cash.checks;

import com.squareup.cash.checks.CaptureCheckFaceViewEvent;
import com.squareup.cash.checks.CheckDepositAmountViewEvent;
import com.squareup.cash.checks.ConfirmBackOfCheckEvent;
import com.squareup.cash.checks.ConfirmFrontOfCheckEvent;
import com.squareup.cash.checks.VerifyCheckDepositViewEvent;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageDialogViewEvent$Close;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageFullScreenViewEvent$FinishApp;
import com.squareup.cash.common.messaging.views.FailureMessageDialogView;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewEvent;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewEvent;
import com.squareup.cash.crypto.common.viewmodels.CryptoInsufficientFundsViewEvent;
import com.squareup.cash.crypto.common.views.CryptoCommonInsufficientFundsView;
import com.squareup.cash.deposits.physical.viewmodels.address.PhysicalDepositAddressEntryEvent;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CaptureCheckFaceKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda2(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CaptureCheckFaceViewEvent.GoBack goBack = CaptureCheckFaceViewEvent.GoBack.INSTANCE;
        CheckDepositAmountViewEvent.Close close = CheckDepositAmountViewEvent.Close.INSTANCE;
        FailureMessageFullScreenViewEvent$FinishApp failureMessageFullScreenViewEvent$FinishApp = FailureMessageFullScreenViewEvent$FinishApp.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(goBack);
                break;
            case 1:
                function1.invoke(goBack);
                break;
            case 2:
                function1.invoke(CaptureCheckFaceViewEvent.GoToSettings.INSTANCE);
                break;
            case 3:
                function1.invoke(close);
                break;
            case 4:
                function1.invoke(close);
                break;
            case 5:
                function1.invoke(CheckDepositAmountViewEvent.PrimaryButtonClicked.INSTANCE);
                break;
            case 6:
                function1.invoke(ConfirmBackOfCheckEvent.CloseClick.INSTANCE);
                break;
            case 7:
                function1.invoke(ConfirmBackOfCheckEvent.CallToActionClick.INSTANCE);
                break;
            case 8:
                function1.invoke(ConfirmFrontOfCheckEvent.CloseClick.INSTANCE);
                break;
            case 9:
                function1.invoke(ConfirmFrontOfCheckEvent.CallToActionClick.INSTANCE);
                break;
            case 10:
                function1.invoke(VerifyCheckDepositViewEvent.GoBack.INSTANCE);
                break;
            case 11:
                function1.invoke(new VerifyCheckDepositViewEvent.CaptureCheckImage(VerifyCheckDepositViewEvent.CaptureCheckImage.Face.FRONT));
                break;
            case 12:
                function1.invoke(new VerifyCheckDepositViewEvent.CaptureCheckImage(VerifyCheckDepositViewEvent.CaptureCheckImage.Face.BACK));
                break;
            case 13:
                function1.invoke(VerifyCheckDepositViewEvent.Exit.INSTANCE);
                break;
            case 14:
                function1.invoke(VerifyCheckDepositViewEvent.Submit.INSTANCE);
                break;
            case 15:
                int i2 = VerifyCheckDialogView.$r8$clinit;
                function1.invoke(new VerifyCheckDialogViewEvent$TapButton(AlertDialogResult.POSITIVE));
                break;
            case 16:
                int i3 = VerifyCheckDialogView.$r8$clinit;
                function1.invoke(new VerifyCheckDialogViewEvent$TapButton(AlertDialogResult.NEGATIVE));
                break;
            case 17:
                int i4 = FailureMessageDialogView.$r8$clinit;
                function1.invoke(FailureMessageDialogViewEvent$Close.INSTANCE);
                break;
            case 18:
                function1.invoke(failureMessageFullScreenViewEvent$FinishApp);
                break;
            case 19:
                function1.invoke(failureMessageFullScreenViewEvent$FinishApp);
                break;
            case 20:
                function1.invoke(new MainScreensViewEvent.TapSend(0L));
                break;
            case 21:
                function1.invoke(MainScreensViewEvent.TapMoneybot.INSTANCE);
                break;
            case 22:
                function1.invoke(BitcoinP2pConversionPercentageViewEvent.Exit.INSTANCE);
                break;
            case 23:
                function1.invoke(BitcoinP2pConversionPercentageViewEvent.TapCustomPercentage.INSTANCE);
                break;
            case 24:
                function1.invoke(BitcoinP2pConversionPercentageViewEvent.DismissAlert.INSTANCE);
                break;
            case 25:
                int i5 = CryptoCommonInsufficientFundsView.$r8$clinit;
                function1.invoke(CryptoInsufficientFundsViewEvent.OnCloseClicked.INSTANCE);
                break;
            case 26:
                int i6 = CryptoCommonInsufficientFundsView.$r8$clinit;
                function1.invoke(CryptoInsufficientFundsViewEvent.PositiveButtonClicked.INSTANCE);
                break;
            case 27:
                int i7 = CryptoCommonInsufficientFundsView.$r8$clinit;
                function1.invoke(CryptoInsufficientFundsViewEvent.NegativeButtonClicked.INSTANCE);
                break;
            case 28:
                function1.invoke(PhysicalDepositAddressEntryEvent.Exit.INSTANCE);
                break;
            default:
                function1.invoke(PhysicalDepositAddressEntryEvent.ClearAllAddressRecentClick.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
