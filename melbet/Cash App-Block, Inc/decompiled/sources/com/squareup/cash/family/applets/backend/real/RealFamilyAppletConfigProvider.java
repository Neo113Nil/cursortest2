package com.squareup.cash.family.applets.backend.real;

import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$1;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;

/* loaded from: classes6.dex */
public final class RealFamilyAppletConfigProvider {
    public final RealFeatureEligibilityRepository featureEligibilityRepository;
    public final RealFamilyAccountsManager sponsorshipStateProvider;
    public final RealStatusAndLimitsManager statusAndLimitsManager;
    public final SyncValueReader syncValueReader;

    public RealFamilyAppletConfigProvider(SyncValueReader syncValueReader, RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealStatusAndLimitsManager realStatusAndLimitsManager, RealFamilyAccountsManager realFamilyAccountsManager) {
        this.syncValueReader = syncValueReader;
        this.featureEligibilityRepository = realFeatureEligibilityRepository;
        this.statusAndLimitsManager = realStatusAndLimitsManager;
        this.sponsorshipStateProvider = realFamilyAccountsManager;
    }

    public final FlowKt__MergeKt$flatMapMerge$$inlined$map$1 getFamilyAppletConfig() {
        return FlowKt.combine(this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.FamilyTile), this.featureEligibilityRepository.currentEligibleFeatures(), this.statusAndLimitsManager.hasPassedIdv(), this.sponsorshipStateProvider.isActivelySponsored(), new RealTabProvider$setup$1$1(this, null, 1));
    }
}
