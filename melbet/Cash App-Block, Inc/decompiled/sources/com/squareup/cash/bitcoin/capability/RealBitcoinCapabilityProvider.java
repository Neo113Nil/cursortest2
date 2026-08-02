package com.squareup.cash.bitcoin.capability;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.marketcapabilities.MarketCapabilityAvailability;
import com.squareup.cash.marketcapabilities.MarketCapabilityName;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class RealBitcoinCapabilityProvider {
    public final RealMarketCapabilitiesManager marketCapabilitiesManager;

    public RealBitcoinCapabilityProvider(RealMarketCapabilitiesManager realMarketCapabilitiesManager) {
        this.marketCapabilitiesManager = realMarketCapabilitiesManager;
    }

    public static AppLockMonitor$special$$inlined$map$2 isBTCxFlow() {
        return new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
    }

    public final boolean isAvailable(BitcoinCapability bitcoinCapability) {
        MarketCapabilityName marketCapabilityName;
        switch (bitcoinCapability.ordinal()) {
            case 0:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN;
                break;
            case 1:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_AUTO_INVEST_BUY;
                break;
            case 2:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_BOOSTS;
                break;
            case 3:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_BUY_CUSTOM;
                break;
            case 4:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_BUY_MARKET;
                break;
            case 5:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_DEPOSIT;
                break;
            case 6:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_GIFTING;
                break;
            case 7:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_LIGHTNING_DEPOSIT;
                break;
            case 8:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_LIGHTNING_WITHDRAW;
                break;
            case 9:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_P2P;
                break;
            case 10:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_PAYROLL;
                break;
            case 11:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_ROUNDUP;
                break;
            case 12:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_SELL_CUSTOM;
                break;
            case 13:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_SELL_MARKET;
                break;
            case 14:
                marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_WITHDRAW;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
        }
        MarketCapabilityAvailability currentAvailability = this.marketCapabilitiesManager.currentAvailability(marketCapabilityName);
        return currentAvailability != null && currentAvailability.isAvailable();
    }
}
