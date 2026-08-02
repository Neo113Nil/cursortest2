package com.squareup.cash.bitcoin.presenters.featureavailability;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public interface BitcoinFeatureAvailabilityProvider {
    Flow isAutoInvestAvailable();

    AppLockMonitor$special$$inlined$map$2 isLimitsAvailable();
}
