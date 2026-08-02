package com.squareup.cash.bitcoin.navigation;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.cdf.CryptoTradeSide;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.crypto.CryptoTradeSetLimitOrder;
import com.squareup.cash.cdf.crypto.CryptoTradeStart;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import kotlin.Pair;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public interface BitcoinInboundNavigator {
    static void showBitcoinTab$default(RealBitcoinInboundNavigator realBitcoinInboundNavigator, AppNavigateOpenSpace.Source source, int i) {
        if ((i & 2) != 0) {
            source = null;
        }
        realBitcoinInboundNavigator.navigator.goTo(new BitcoinHome(null, source, null, null, 12));
    }

    static void showTransferBitcoin$default(RealBitcoinInboundNavigator realBitcoinInboundNavigator, boolean z, BitcoinTransferScreen.OrderType.CustomOrder customOrder, BitcoinTransferScreen.SavedState savedState, Screen screen, Screen screen2, String str, int i) {
        Pair pair;
        Event cryptoTradeSetLimitOrder;
        int i2 = i & 8;
        Object obj = BitcoinTransferScreen.OrderType.Standard.INSTANCE;
        BitcoinTransferScreen.OrderType.CustomOrder customOrder2 = i2 != 0 ? obj : customOrder;
        BitcoinTransferScreen.SavedState savedState2 = (i & 32) != 0 ? null : savedState;
        Screen bitcoinHome = (i & 64) != 0 ? new BitcoinHome(null, null, null, null, 15) : screen;
        Screen screen3 = (i & 128) != 0 ? null : screen2;
        String str2 = (i & 256) != 0 ? null : str;
        realBitcoinInboundNavigator.getClass();
        realBitcoinInboundNavigator.navigator.goTo(new BitcoinTransferScreen(z, false, customOrder2, savedState2, bitcoinHome, screen3, str2, MLKEMEngine.KyberPolyBytes));
        if (z) {
            Locale locale = Locale.ROOT;
            "XUS".toLowerCase(locale).getClass();
            String lowerCase = "BTC".toLowerCase(locale);
            lowerCase.getClass();
            pair = new Pair(null, lowerCase);
        } else {
            String lowerCase2 = "BTC".toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            pair = new Pair(lowerCase2, null);
        }
        String str3 = (String) pair.first;
        String str4 = (String) pair.second;
        CryptoTradeSide cryptoTradeSide = z ? CryptoTradeSide.BUY : CryptoTradeSide.SELL;
        if (customOrder2.equals(obj)) {
            cryptoTradeSetLimitOrder = new CryptoTradeStart(cryptoTradeSide, str4, str3);
        } else {
            if (!(customOrder2 instanceof BitcoinTransferScreen.OrderType.CustomOrder)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            cryptoTradeSetLimitOrder = new CryptoTradeSetLimitOrder(cryptoTradeSide, str4, str3);
        }
        realBitcoinInboundNavigator.analytics.track(cryptoTradeSetLimitOrder, null);
    }
}
