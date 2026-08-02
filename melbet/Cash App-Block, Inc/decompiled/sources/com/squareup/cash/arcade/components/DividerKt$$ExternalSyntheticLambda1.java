package com.squareup.cash.arcade.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import com.google.android.gms.common.api.internal.zabr;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.bitcoin.views.applet.graph.BitcoinGraphHeaderKt;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetViewKt;
import com.squareup.cash.bitcoin.views.paidinbitcoin.PainInBitcoinUpsellViewKt;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsContentKt;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsViewKt;
import com.squareup.cash.blockers.views.WelcomeViewKt;
import com.squareup.cash.borrow.views.BorrowHomeKt;
import com.squareup.cash.earningstracker.views.components.EarningsHeaderKt;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.instruments.views.CardArtImageKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.money.views.HypeWelcomeUIKt;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import com.squareup.cash.nfc.views.NfcTapAnimationKt;
import com.squareup.cash.offers.views.UtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class DividerKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;

    public /* synthetic */ DividerKt$$ExternalSyntheticLambda1(Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ModalKt.VerticalDivider(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                MarketingMessageKt.DashedDividerWithCircles(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 2:
                AfterpaySearchViewKt.LoadingBody(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 3:
                AfterpayCardKt.Dimmer(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 4:
                BitcoinGraphHeaderKt.OfflineText(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 5:
                BitcoinAddressCopySheetViewKt.AddressCopyShimmerItem(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 6:
                BitcoinAddressCopySheetViewKt.ShimmerLabel(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 7:
                BitcoinAddressCopySheetViewKt.ShimmerIcon(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 8:
                BitcoinAddressCopySheetViewKt.ShimmerSubtitle(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 9:
                BitcoinAddressCopySheetViewKt.AddressCopyShimmer(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 10:
                PainInBitcoinUpsellViewKt.SignUpContent(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 11:
                BitcoinPerformanceDetailsContentKt.StaleDataHeader(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 12:
                BitcoinPerformanceDetailsViewKt.BitcoinPerformanceLoadingShimmerRow(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 13:
                WelcomeViewKt.WelcomeIconCircle(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 14:
                BorrowHomeKt.SectionDivider(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 15:
                zabr.BoostAddedDecoration(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 16:
                EarningsHeaderKt.EarningsHeaderShimmer(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 17:
                AllowanceViewKt.LoadingTitleAndSubtitle(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 18:
                AllowanceViewKt.U13CelebrationHero(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 19:
                CardArtImageKt.DefaultCardArt(modifier, composer, Updater.updateChangedFlags(7));
                break;
            case 20:
                CustomOrderKt.CollapsedWidget(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 21:
                MerchantProfileViewKt.MerchantBlockingEmptySection(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 22:
                HypeWelcomeUIKt.FullWidthTileLoadingShimmer(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 23:
                HypeWelcomeUIKt.UpsellTileLoadingShimmer(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 24:
                HypeWelcomeUIKt.BalanceAppletTileLoadingShimmer(modifier, composer, Updater.updateChangedFlags(7));
                break;
            case 25:
                HypeWelcomeUIKt.UninstalledTileLoadingShimmer(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 26:
                MoneybotMarkdownKt.SpacerVertical20(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 27:
                MoneybotMarkdownKt.SpacerVerticalSmall(modifier, composer, Updater.updateChangedFlags(1));
                break;
            case 28:
                NfcTapAnimationKt.NfcTapAnimation(modifier, composer, Updater.updateChangedFlags(1));
                break;
            default:
                UtilsKt.OffersTabLoadingProgress(modifier, composer, Updater.updateChangedFlags(7));
                break;
        }
        return Unit.INSTANCE;
    }
}
