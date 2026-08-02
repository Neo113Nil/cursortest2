package com.squareup.cash.bitcoin.presenters.send;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.crypto.CryptoSendStart;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public final class SendBitcoinNavigator {
    public final Analytics analytics;
    public final RealBitcoinFormatter bitcoinFormatter;
    public final RealBitcoinInboundNavigator$Factory$Impl bitcoinInboundNavigatorFactory;
    public final AndroidStringManager stringManager;

    public SendBitcoinNavigator(RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, Analytics analytics, AndroidStringManager androidStringManager, RealBitcoinFormatter realBitcoinFormatter) {
        this.bitcoinInboundNavigatorFactory = realBitcoinInboundNavigator$Factory$Impl;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.bitcoinFormatter = realBitcoinFormatter;
    }

    public final void navigate(BetterNavigator.ScreenNavigator screenNavigator, Long l, Money money) {
        Long l2 = money != null ? money.amount : null;
        if (l == null || l2 == null || l2.longValue() >= l.longValue()) {
            this.analytics.track(new CryptoSendStart(CryptoSendStart.CryptoSendStartSource.CRYPTO_TAB_SEND_BUTTON), null);
            this.bitcoinInboundNavigatorFactory.create(screenNavigator).navigator.goTo(new MoveBitcoinScreen(CryptoPaymentOrigin.BITCOIN_TAB));
            return;
        }
        BlockersData copy$default = BlockersData.copy$default(BlockersData.DUMMY, null, null, null, null, null, null, new BitcoinHome(null, null, null, null, 15), null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, ColorModel.Bitcoin.INSTANCE, null, null, null, null, false, null, null, null, -65, 65407);
        String format$default = RealBitcoinFormatter.format$default(this.bitcoinFormatter, BitcoinDisplayUnits.SATOSHIS, new Money(l, CurrencyCode.BTC, 4), false, 28);
        format$default.getClass();
        Resources resources = this.stringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.bitcoin_presenters_minimum_withdrawal_error)).format(new Object[]{format$default});
        format2.getClass();
        screenNavigator.goTo(new FailureMessageBlockerScreen(copy$default, format2, null, 4));
    }
}
