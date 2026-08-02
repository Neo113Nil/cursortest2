package com.squareup.cash.bitcoin.presenters.limits.util;

import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes5.dex */
public final class NonCustodialBitcoinLimitsProvider implements BitcoinLimitsProvider {
    public static final Money UNLIMITED = new Money((Long) Long.MAX_VALUE, CurrencyCode.USD, 4);
    public final AppLockMonitor$special$$inlined$map$2 buyLimit;
    public final RealCryptoBalanceRepo cryptoBalanceRepo;
    public final CurrencyConverter$Factory currencyConverterFactory;
    public final AppLockMonitor$special$$inlined$map$2 lightningWeeklyDepositLimitUsd;
    public final AppLockMonitor$special$$inlined$map$2 minimumWithdrawalLimit;
    public final DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 sellLimit;

    public NonCustodialBitcoinLimitsProvider(RealCryptoBalanceRepo realCryptoBalanceRepo, CurrencyConverter$Factory currencyConverter$Factory, RealJurisdictionConfigManager realJurisdictionConfigManager) {
        this.cryptoBalanceRepo = realCryptoBalanceRepo;
        this.currencyConverterFactory = currencyConverter$Factory;
        CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(realJurisdictionConfigManager.select(), 12);
        int i = 19;
        this.buyLimit = new AppLockMonitor$special$$inlined$map$2(new CustomerLimitsManager.TransactionLimit(null, UNLIMITED), i);
        this.sellLimit = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new CardModelView$cardHeat$$inlined$map$1(FlowKt.transformLatest(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(cardModelView$cardHeat$$inlined$map$1, 24), new AnchoredDraggableNode$drag$2(null, this, 5)), 11), i);
        this.minimumWithdrawalLimit = new AppLockMonitor$special$$inlined$map$2(1L, i);
        this.lightningWeeklyDepositLimitUsd = new AppLockMonitor$special$$inlined$map$2(new Money((Long) 100000000000L, CurrencyCode.USD, 4), i);
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
