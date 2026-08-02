package com.squareup.cash.bitcoin.presenters.map;

import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.BitcoinWidgetAllowlistProvider;
import com.squareup.cash.bitcoin.presenters.investing.RealBitcoinSponsoredStateRepo;
import com.squareup.cash.crypto.backend.eligibility.BitcoinEligibility;
import com.squareup.cash.crypto.backend.eligibility.RealBitcoinEligibilityRepo;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$BitcoinMapEnabledInNy;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes5.dex */
public final class RealBitcoinMapEligibilityManager {
    public final RealBitcoinEligibilityRepo bitcoinEligibilityRepo;
    public final BitcoinWidgetAllowlistProvider bitcoinWidgetAllowlistProvider;
    public final FeatureFlagManager featureFlagManager;
    public final RealBitcoinSponsoredStateRepo sponsoredStateRepo;

    public RealBitcoinMapEligibilityManager(FeatureFlagManager featureFlagManager, RealBitcoinEligibilityRepo realBitcoinEligibilityRepo, RealBitcoinSponsoredStateRepo realBitcoinSponsoredStateRepo, BitcoinWidgetAllowlistProvider bitcoinWidgetAllowlistProvider) {
        this.featureFlagManager = featureFlagManager;
        this.bitcoinEligibilityRepo = realBitcoinEligibilityRepo;
        this.sponsoredStateRepo = realBitcoinSponsoredStateRepo;
        this.bitcoinWidgetAllowlistProvider = bitcoinWidgetAllowlistProvider;
    }

    public final FinishSetupTileBadgeCounter isEligible() {
        return FlowKt.combine(this.sponsoredStateRepo.sponsorshipStateProvider.isSponsored(), isLightningWithdrawEligible(), this.bitcoinWidgetAllowlistProvider.allowedWidgets(), new RealBitcoinMapEligibilityManager$isEligible$1(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$BitcoinMapEnabledInNy.INSTANCE)).enabled(), null));
    }

    public final DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 isLightningWithdrawEligible() {
        return new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new RealTransferManager$addCash$$inlined$map$1((Flow) this.bitcoinEligibilityRepo.statusProvider$delegate.getValue(), BitcoinEligibility.LIGHTNING_WITHDRAW, 17), 20);
    }
}
