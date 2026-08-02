package com.squareup.cash.bitcoin.presenters.featureavailability;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class CashAppLiteBitcoinFeatureAvailabilityProvider implements BitcoinFeatureAvailabilityProvider {
    public final RealFeatureEligibilityRepository featureEligibilityRepository;

    public CashAppLiteBitcoinFeatureAvailabilityProvider(RealFeatureEligibilityRepository realFeatureEligibilityRepository) {
        this.featureEligibilityRepository = realFeatureEligibilityRepository;
    }

    @Override // com.squareup.cash.bitcoin.presenters.featureavailability.BitcoinFeatureAvailabilityProvider
    public final Flow isAutoInvestAvailable() {
        return new FinishSetupTileBadgeCounter(10, this.featureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.BITCOIN_AUTO_INVEST});
    }

    @Override // com.squareup.cash.bitcoin.presenters.featureavailability.BitcoinFeatureAvailabilityProvider
    public final AppLockMonitor$special$$inlined$map$2 isLimitsAvailable() {
        return new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
    }
}
