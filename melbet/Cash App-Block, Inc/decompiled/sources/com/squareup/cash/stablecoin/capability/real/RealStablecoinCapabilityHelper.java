package com.squareup.cash.stablecoin.capability.real;

import com.squareup.cash.crypto.backend.idv.RealCryptoIdvStatusRepo$idvStatus$1;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinBtcxStablecoin;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.marketcapabilities.MarketCapabilityName;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesManager;
import com.squareup.cash.stablecoin.capability.api.StablecoinCapability;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes.dex */
public final class RealStablecoinCapabilityHelper {
    public final FeatureFlagManager featureFlagManager;
    public final RealMarketCapabilitiesManager marketCapabilitiesManager;

    public RealStablecoinCapabilityHelper(FeatureFlagManager featureFlagManager, RealMarketCapabilitiesManager realMarketCapabilitiesManager) {
        this.featureFlagManager = featureFlagManager;
        this.marketCapabilitiesManager = realMarketCapabilitiesManager;
    }

    public static MarketCapabilityName mapToMarketCapability(StablecoinCapability stablecoinCapability) {
        int ordinal = stablecoinCapability.ordinal();
        if (ordinal == 0) {
            return MarketCapabilityName.CRYPTO_XUS;
        }
        if (ordinal == 1) {
            return MarketCapabilityName.CRYPTO_FIAT_TO_XUS_MARKET;
        }
        if (ordinal == 2) {
            return MarketCapabilityName.CRYPTO_BTC_TO_XUS_MARKET;
        }
        if (ordinal == 3) {
            return MarketCapabilityName.CRYPTO_XUS_TO_BTC_MARKET;
        }
        if (ordinal == 4) {
            return MarketCapabilityName.CRYPTO_XUS_TO_FIAT_MARKET;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 isAvailableFlow(StablecoinCapability stablecoinCapability) {
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((RealFeatureFlagManager) this.featureFlagManager).peekValues(LaunchDarklyFeatureFlags$BitcoinBtcxStablecoin.INSTANCE), FlowKt.distinctUntilChanged(new InviteContactsPresenter$special$$inlined$map$1(this.marketCapabilitiesManager.capabilitiesFlow, mapToMarketCapability(stablecoinCapability), 16)), new RealCryptoIdvStatusRepo$idvStatus$1(this), 0);
    }
}
