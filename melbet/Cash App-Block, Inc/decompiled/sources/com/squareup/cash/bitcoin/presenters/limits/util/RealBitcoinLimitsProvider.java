package com.squareup.cash.bitcoin.presenters.limits.util;

import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.CryptocurrencyConfigQueries$select$2;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$LightningWeeklyDepositLimitAmount;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$filter$1;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes5.dex */
public final class RealBitcoinLimitsProvider implements BitcoinLimitsProvider {
    public final ChannelFlowTransformLatest buyLimit;
    public final RealCryptoBalanceRepo cryptoBalanceRepo;
    public final CurrencyConverter$Factory currencyConverterFactory;
    public final CustomerLimitsManager customerLimitsManager;
    public final PaymentActionHandler$transform$$inlined$filter$1 lightningWeeklyDepositLimitUsd;
    public final RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 minimumWithdrawalLimit;
    public final ChannelFlowTransformLatest sellLimit;

    /* JADX WARN: Multi-variable type inference failed */
    public RealBitcoinLimitsProvider(RealCryptoBalanceRepo realCryptoBalanceRepo, CustomerLimitsManager customerLimitsManager, CurrencyConverter$Factory currencyConverter$Factory, AppConfigManager appConfigManager, RealJurisdictionConfigManager realJurisdictionConfigManager, FeatureFlagManager featureFlagManager) {
        this.cryptoBalanceRepo = realCryptoBalanceRepo;
        this.customerLimitsManager = customerLimitsManager;
        this.currencyConverterFactory = currencyConverter$Factory;
        int i = 24;
        Continuation continuation = null;
        this.buyLimit = FlowKt.transformLatest(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new CardModelView$cardHeat$$inlined$map$1(realJurisdictionConfigManager.select(), 14), i), new RealBitcoinLimitsProvider$special$$inlined$flatMapLatest$1(continuation, this, 0));
        int i2 = 1;
        int i3 = 2;
        this.sellLimit = FlowKt.transformLatest(new CardModelView$cardHeat$$inlined$map$1(FlowKt.transformLatest(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new CardModelView$cardHeat$$inlined$map$1(realJurisdictionConfigManager.select(), 15), i), new RealBitcoinLimitsProvider$special$$inlined$flatMapLatest$1(continuation, this, i2)), 13), new RealBitcoinLimitsProvider$special$$inlined$flatMapLatest$1(continuation, this, i3));
        RealAppConfigManager realAppConfigManager = (RealAppConfigManager) appConfigManager;
        SessionQueries sessionQueries = realAppConfigManager.cryptocurrencyConfigQueries;
        sessionQueries.getClass();
        CryptocurrencyConfigQueries$select$2 cryptocurrencyConfigQueries$select$2 = CryptocurrencyConfigQueries$select$2.INSTANCE;
        SqlDriver sqlDriver = sessionQueries.driver;
        SessionQueries$$ExternalSyntheticLambda1 sessionQueries$$ExternalSyntheticLambda1 = new SessionQueries$$ExternalSyntheticLambda1(21, 0 == true ? 1 : 0);
        sqlDriver.getClass();
        this.minimumWithdrawalLimit = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new RealAppConfigManager$cashLiteConfig$$inlined$map$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(59292854, new String[]{"cryptocurrencyConfig"}, sqlDriver, "CryptocurrencyConfig.sq", "select", "SELECT cryptocurrencyConfig.btc_welcome_message, cryptocurrencyConfig.learn_about_btc_button_text, cryptocurrencyConfig.learn_about_btc_url, cryptocurrencyConfig.dismiss_button_text, cryptocurrencyConfig.minimum_withdrawal_limit_sats\nFROM cryptocurrencyConfig", sessionQueries$$ExternalSyntheticLambda1)), realAppConfigManager.ioDispatcher), i3), i);
        this.lightningWeeklyDepositLimitUsd = new PaymentActionHandler$transform$$inlined$filter$1(new AppLockMonitor$special$$inlined$map$2(((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(JsonFeatureFlags$LightningWeeklyDepositLimitAmount.INSTANCE), 19), i2);
    }

    @Override // com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider
    public final Flow getBuyLimit() {
        return this.buyLimit;
    }

    @Override // com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider
    public final Flow getLightningWeeklyDepositLimitUsd() {
        return this.lightningWeeklyDepositLimitUsd;
    }

    @Override // com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider
    public final Flow getMinimumWithdrawalLimit() {
        return this.minimumWithdrawalLimit;
    }

    @Override // com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider
    public final Flow getSellLimit() {
        return this.sellLimit;
    }
}
