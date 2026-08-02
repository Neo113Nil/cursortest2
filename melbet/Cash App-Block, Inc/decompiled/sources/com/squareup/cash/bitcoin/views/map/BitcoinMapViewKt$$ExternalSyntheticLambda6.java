package com.squareup.cash.bitcoin.views.map;

import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapErrorEvent;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapOnboardingViewEvent;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewEvent;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinCardUpsellViewEvent;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinLandingViewEvent;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.roundups.BitcoinRoundUpsCardUpsellViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositCopyViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewEvent;
import com.squareup.cash.bitcoin.views.paidinbitcoin.PaidInBitcoinLandingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinMapViewKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BitcoinMapViewKt$$ExternalSyntheticLambda6(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PaidInBitcoinLandingViewEvent.Close close = PaidInBitcoinLandingViewEvent.Close.INSTANCE;
        StablecoinDepositOptionsViewEvent.CloseClicked closeClicked = StablecoinDepositOptionsViewEvent.CloseClicked.INSTANCE;
        StablecoinDepositViewEvent.CopyAddress copyAddress = StablecoinDepositViewEvent.CopyAddress.INSTANCE;
        StablecoinDepositViewEvent.BackPressed backPressed = StablecoinDepositViewEvent.BackPressed.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(BitcoinMapViewEvent.GoBack.INSTANCE);
                break;
            case 1:
                function1.invoke(BitcoinMapErrorEvent.NegativeActionSelected.INSTANCE);
                break;
            case 2:
                function1.invoke(BitcoinMapOnboardingViewEvent.GoBack.INSTANCE);
                break;
            case 3:
                function1.invoke(BitcoinMapOnboardingViewEvent.Continue.INSTANCE);
                break;
            case 4:
                function1.invoke(BitcoinMapViewEvent.Pay.INSTANCE);
                break;
            case 5:
                function1.invoke(BitcoinMapViewEvent.SearchLocations.INSTANCE);
                break;
            case 6:
                int i2 = PaidInBitcoinLandingView.$r8$clinit;
                function1.invoke(close);
                break;
            case 7:
                function1.invoke(close);
                break;
            case 8:
                function1.invoke(PaidInBitcoinLandingViewEvent.SetupDirectDeposit.INSTANCE);
                break;
            case 9:
                function1.invoke(PaidInBitcoinLandingViewEvent.SelectPercentage.INSTANCE);
                break;
            case 10:
                function1.invoke(PaidInBitcoinCardUpsellViewEvent.Close.INSTANCE);
                break;
            case 11:
                function1.invoke(PaidInBitcoinCardUpsellViewEvent.CardAction.INSTANCE);
                break;
            case 12:
                function1.invoke(BitcoinPerformanceDetailsViewEvent.BackClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(BitcoinPerformanceDetailsViewEvent.InfoBottomSheetClosed.INSTANCE);
                break;
            case 14:
                function1.invoke(BitcoinRoundUpsCardUpsellViewEvent.Close.INSTANCE);
                break;
            case 15:
                function1.invoke(BitcoinRoundUpsCardUpsellViewEvent.CardAction.INSTANCE);
                break;
            case 16:
                function1.invoke(SendStablecoinEvent.Withdraw.INSTANCE);
                break;
            case 17:
                function1.invoke(SendStablecoinEvent.ScanQrCode.INSTANCE);
                break;
            case 18:
                function1.invoke(StablecoinDepositCopyViewEvent.Back.INSTANCE);
                break;
            case 19:
                function1.invoke(StablecoinDepositCopyViewEvent.Copy.INSTANCE);
                break;
            case 20:
                function1.invoke(closeClicked);
                break;
            case 21:
                function1.invoke(closeClicked);
                break;
            case 22:
                function1.invoke(StablecoinDepositViewEvent.ChangeNetwork.INSTANCE);
                break;
            case 23:
                function1.invoke(StablecoinDepositViewEvent.TryAgainClicked.INSTANCE);
                break;
            case 24:
                function1.invoke(copyAddress);
                break;
            case 25:
                function1.invoke(copyAddress);
                break;
            case 26:
                function1.invoke(StablecoinDepositViewEvent.Share.INSTANCE);
                break;
            case 27:
                function1.invoke(backPressed);
                break;
            case 28:
                function1.invoke(backPressed);
                break;
            default:
                function1.invoke(StablecoinDepositViewEvent.HelpClicked.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
