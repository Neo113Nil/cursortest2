package com.squareup.cash.bitcoin.presenters.buy;

import com.squareup.cash.R;
import com.squareup.cash.bitcoin.navigation.BitcoinInboundNavigator;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.db2.profile.Effective_limits;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.Money;

/* loaded from: classes5.dex */
public final class BuyBitcoinNavigator {
    public final RealBitcoinInboundNavigator$Factory$Impl bitcoinInboundNavigatorFactory;
    public final AndroidStringManager stringManager;

    public BuyBitcoinNavigator(AndroidStringManager androidStringManager, RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl) {
        this.stringManager = androidStringManager;
        this.bitcoinInboundNavigatorFactory = realBitcoinInboundNavigator$Factory$Impl;
    }

    public final void navigate(BetterNavigator.ScreenNavigator screenNavigator, CustomerLimitsManager.TransactionLimit transactionLimit) {
        Money money;
        Long l;
        String str;
        if (transactionLimit == null || (money = transactionLimit.maxTransactionAmount) == null || (l = money.amount) == null || l.longValue() != 0) {
            BitcoinInboundNavigator.showTransferBitcoin$default(this.bitcoinInboundNavigatorFactory.create(screenNavigator), true, null, null, null, null, null, 504);
            return;
        }
        Effective_limits effective_limits = transactionLimit.customerLimit;
        if (effective_limits == null || (str = effective_limits.limit_exceeded_message) == null) {
            str = this.stringManager.get(R.string.bitcoin_buy_limit_reached_default_message);
        }
        screenNavigator.goTo(new ProfileScreens.ErrorScreen(str, null, 10));
    }
}
