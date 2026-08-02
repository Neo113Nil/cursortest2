package com.squareup.cash.bitcoin.presenters.featureavailability;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class DefaultBitcoinFeatureAvailabilityProvider implements BitcoinFeatureAvailabilityProvider {
    @Override // com.squareup.cash.bitcoin.presenters.featureavailability.BitcoinFeatureAvailabilityProvider
    public final Flow isAutoInvestAvailable() {
        return new AppLockMonitor$special$$inlined$map$2(Boolean.TRUE, 19);
    }

    @Override // com.squareup.cash.bitcoin.presenters.featureavailability.BitcoinFeatureAvailabilityProvider
    public final AppLockMonitor$special$$inlined$map$2 isLimitsAvailable() {
        return new AppLockMonitor$special$$inlined$map$2(Boolean.TRUE, 19);
    }
}
