package com.squareup.cash.bitcoin.views.deposits;

import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.disabled.DependentBitcoinDisabledViewEvent$CtaClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.map.BitcoinMapCardWidgetViewEvent$OnCardClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.pendingidv.BitcoinHomePendingIdvWidgetViewEvent$PendingIdvClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.performance.BitcoinPerformanceSummaryViewEvent$DetailsClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendReceiveBottomSheetViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.sendreceive.BitcoinSendRestrictionViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsInfoViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsViewEvent;
import com.squareup.cash.bitcoin.viewmodels.autowithdraw.BitcoinAutoWithdrawUpsellViewEvent;
import com.squareup.cash.bitcoin.viewmodels.dependents.BitcoinDependentWelcomeViewEvent;
import com.squareup.cash.bitcoin.views.applet.sendreceive.BitcoinSendReceiveBottomSheetView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinDepositsViewKt$$ExternalSyntheticLambda11 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BitcoinDepositsViewKt$$ExternalSyntheticLambda11(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        BitcoinPerformanceSummaryViewEvent$DetailsClicked bitcoinPerformanceSummaryViewEvent$DetailsClicked = BitcoinPerformanceSummaryViewEvent$DetailsClicked.INSTANCE;
        BitcoinSendRestrictionViewEvent.CloseClicked closeClicked = BitcoinSendRestrictionViewEvent.CloseClicked.INSTANCE;
        BitcoinDepositsViewEvent.CopyAddress copyAddress = BitcoinDepositsViewEvent.CopyAddress.INSTANCE;
        BitcoinDepositsViewEvent.AdjustAmount adjustAmount = BitcoinDepositsViewEvent.AdjustAmount.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(copyAddress);
                break;
            case 1:
                function1.invoke(DependentBitcoinDisabledViewEvent$CtaClicked.INSTANCE);
                break;
            case 2:
                function1.invoke(BitcoinStoriesWidgetViewEvent.OnRefresh.INSTANCE);
                break;
            case 3:
                function1.invoke(BitcoinHomePendingIdvWidgetViewEvent$PendingIdvClicked.INSTANCE);
                break;
            case 4:
                function1.invoke(BitcoinMapCardWidgetViewEvent$OnCardClicked.INSTANCE);
                break;
            case 5:
                function1.invoke(bitcoinPerformanceSummaryViewEvent$DetailsClicked);
                break;
            case 6:
                function1.invoke(bitcoinPerformanceSummaryViewEvent$DetailsClicked);
                break;
            case 7:
                int i2 = BitcoinSendReceiveBottomSheetView.$r8$clinit;
                function1.invoke(BitcoinSendReceiveBottomSheetViewEvent.CloseClicked.INSTANCE);
                break;
            case 8:
                function1.invoke(BitcoinSendReceiveBottomSheetViewEvent.SendClicked.INSTANCE);
                break;
            case 9:
                function1.invoke(BitcoinSendReceiveBottomSheetViewEvent.ReceiveClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(closeClicked);
                break;
            case 11:
                function1.invoke(closeClicked);
                break;
            case 12:
                function1.invoke(BitcoinSendRestrictionViewEvent.LearnMoreClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(BitcoinSendRestrictionViewEvent.DoneClicked.INSTANCE);
                break;
            case 14:
                function1.invoke(BitcoinStackingToolsInfoViewEvent.BackClicked.INSTANCE);
                break;
            case 15:
                function1.invoke(BitcoinStackingToolsViewEvent.LearnMoreClicked.INSTANCE);
                break;
            case 16:
                function1.invoke(BitcoinStackingToolsViewEvent.ReceiveAsBitcoinClicked.INSTANCE);
                break;
            case 17:
                function1.invoke(BitcoinStackingToolsViewEvent.RoundUpsClicked.INSTANCE);
                break;
            case 18:
                function1.invoke(BitcoinStackingToolsViewEvent.AutoInvestClicked.INSTANCE);
                break;
            case 19:
                function1.invoke(BitcoinStackingToolsViewEvent.PaidInBitcoinClicked.INSTANCE);
                break;
            case 20:
                function1.invoke(BitcoinAutoWithdrawUpsellViewEvent.Close.INSTANCE);
                break;
            case 21:
                function1.invoke(BitcoinAutoWithdrawUpsellViewEvent.GetBitkeyClicked.INSTANCE);
                break;
            case 22:
                function1.invoke(BitcoinAutoWithdrawUpsellViewEvent.GetStartedClicked.INSTANCE);
                break;
            case 23:
                function1.invoke(BitcoinDependentWelcomeViewEvent.Close.INSTANCE);
                break;
            case 24:
                function1.invoke(BitcoinDependentWelcomeViewEvent.CtaTapped.INSTANCE);
                break;
            case 25:
                function1.invoke(BitcoinDepositsViewEvent.TryAgainClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(copyAddress);
                break;
            case 27:
                function1.invoke(adjustAmount);
                break;
            case 28:
                function1.invoke(adjustAmount);
                break;
            default:
                function1.invoke(BitcoinDepositsViewEvent.Share.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
