package com.squareup.cash.bitcoin.presenters.applet.stackingtools;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.RealPaidInBitcoinStateManager;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.screens.BitcoinStackingToolsInfoScreen;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsInfoViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class BitcoinStackingToolsInfoPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BitcoinStackingToolsInfoScreen args;
    public final CryptoFlowStarter cryptoFlowStarter;
    public final FeatureFlagManager featureFlagManager;
    public final IssuedCardManager issuedCardManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealPaidInBitcoinNavigator paidInBitcoinNavigator;
    public final RealPaidInBitcoinStateManager paidInBitcoinStateManager;
    public final AndroidStringManager stringManager;

    public BitcoinStackingToolsInfoPresenter(AndroidStringManager androidStringManager, RealPaidInBitcoinStateManager realPaidInBitcoinStateManager, CryptoFlowStarter cryptoFlowStarter, Analytics analytics, IssuedCardManager issuedCardManager, FeatureFlagManager featureFlagManager, RealPaidInBitcoinNavigator$Factory$Impl realPaidInBitcoinNavigator$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, BitcoinStackingToolsInfoScreen bitcoinStackingToolsInfoScreen) {
        bitcoinStackingToolsInfoScreen.getClass();
        this.stringManager = androidStringManager;
        this.paidInBitcoinStateManager = realPaidInBitcoinStateManager;
        this.cryptoFlowStarter = cryptoFlowStarter;
        this.analytics = analytics;
        this.issuedCardManager = issuedCardManager;
        this.featureFlagManager = featureFlagManager;
        this.navigator = screenNavigator;
        this.args = bitcoinStackingToolsInfoScreen;
        this.paidInBitcoinNavigator = realPaidInBitcoinNavigator$Factory$Impl.create(screenNavigator);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1992366021);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(this.paidInBitcoinStateManager.states(gapComposer), gapComposer);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            MoneyTabPresenter$models$lambda$17$$inlined$map$1 moneyTabPresenter$models$lambda$17$$inlined$map$1 = new MoneyTabPresenter$models$lambda$17$$inlined$map$1(((RealIssuedCardManager) this.issuedCardManager).getIssuedCardOrNull(), 6);
            gapComposer.updateRememberedValue(moneyTabPresenter$models$lambda$17$$inlined$map$1);
            rememberedValue = moneyTabPresenter$models$lambda$17$$inlined$map$1;
        }
        Updater.LaunchedEffect(gapComposer, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, Updater.collectAsState((Flow) rememberedValue, Boolean.FALSE, null, gapComposer, 48, 2), rememberUpdatedState, 15));
        int ordinal = this.args.f1052type.ordinal();
        AndroidStringManager androidStringManager = this.stringManager;
        if (ordinal == 0) {
            bitcoinStackingToolsInfoViewModel = new BitcoinStackingToolsInfoViewModel(true, CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem[]{new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.CardBasic24, androidStringManager.get(R.string.bitcoin_presenters_stacking_round_ups_disabled_subtitle), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_round_ups_item_one_subtitle), null), new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.Deposit24, androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_round_ups_item_two_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_round_ups_item_two_subtitle), null)}), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_round_ups_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_round_ups_subtitle), BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType.ROUND_UPS, androidStringManager.get(R.string.bitcoin_presenters_continue_cta));
        } else if (ordinal != 1) {
            FeatureFlagManager featureFlagManager = this.featureFlagManager;
            if (ordinal == 2) {
                boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest.INSTANCE)).enabled();
                bitcoinStackingToolsInfoViewModel = new BitcoinStackingToolsInfoViewModel(true, CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem[]{new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.Deposit24, androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_auto_invest_item_one_title), androidStringManager.get(enabled ? R.string.bitcoin_presenters_stacking_tools_info_auto_invest_item_one_new_minimum_subtitle : R.string.bitcoin_presenters_stacking_tools_info_auto_invest_item_one_subtitle), null), new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.CardBasic24, androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_auto_invest_item_two_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_auto_invest_item_two_subtitle), null), new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.DiscountPercentage24, androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_auto_invest_item_three_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_auto_invest_item_three_subtitle), null)}), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_auto_invest_title), androidStringManager.get(enabled ? R.string.bitcoin_presenters_stacking_tools_info_auto_invest_subtitle_with_monthly : R.string.bitcoin_presenters_stacking_tools_info_auto_invest_subtitle), BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType.AUTO_INVEST, androidStringManager.get(R.string.bitcoin_presenters_continue_cta));
            } else if (ordinal == 3) {
                bitcoinStackingToolsInfoViewModel = new BitcoinStackingToolsInfoViewModel(false, CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem[]{new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.RoundUps24, androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_round_ups_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_learn_more_item_one_subtitle), BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType.ROUND_UPS), new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.RecurringAutomatic24, androidStringManager.get(R.string.bitcoin_presenters_stacking_auto_invest_title), androidStringManager.get(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest.INSTANCE)).enabled() ? R.string.bitcoin_presenters_stacking_tools_info_learn_more_item_two_subtitle_with_monthly : R.string.bitcoin_presenters_stacking_tools_info_learn_more_item_two_subtitle), BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType.AUTO_INVEST), new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.Deposit24, androidStringManager.get(R.string.bitcoin_presenters_stacking_pib_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_learn_more_item_three_subtitle), BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType.PAID_IN_BITCOIN)}), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_learn_more_title), null, BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType.LEARN_MORE, null);
            } else {
                if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                bitcoinStackingToolsInfoViewModel = new BitcoinStackingToolsInfoViewModel(false, CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem[]{new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.Investing24, androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_receive_as_bitcoin_item_one_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_receive_as_bitcoin_item_one_subtitle), null), new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.TransferP2P24, androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_receive_as_bitcoin_item_two_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_receive_as_bitcoin_item_two_subtitle), null), new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.Wallet24, androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_receive_as_bitcoin_item_three_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_receive_as_bitcoin_item_three_subtitle), null)}), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_receive_as_bitcoin_title), null, BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType.RECEIVE_P2P_AS_BITCOIN, androidStringManager.get(R.string.bitcoin_presenters_continue_cta));
            }
        } else {
            bitcoinStackingToolsInfoViewModel = new BitcoinStackingToolsInfoViewModel(true, CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem[]{new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.Deposit24, androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_pib_item_one_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_pib_item_one_subtitle), null), new BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoItem(Icons.DiscountPercentage24, androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_pib_item_two_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_pib_item_two_subtitle), null)}), androidStringManager.get(R.string.paid_in_bitcoin_widget_title), androidStringManager.get(R.string.bitcoin_presenters_stacking_tools_info_pib_subtitle), BitcoinStackingToolsInfoViewModel.BitcoinStackingToolsInfoType.PAID_IN_BITCOIN, androidStringManager.get(R.string.bitcoin_presenters_continue_cta));
        }
        gapComposer.end(false);
        return bitcoinStackingToolsInfoViewModel;
    }
}
