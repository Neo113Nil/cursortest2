package com.squareup.cash.crypto.backend.eligibility;

import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes4.dex */
public final class RealBitcoinEligibilityRepo {
    public final FeatureFlagManager featureFlagManager;
    public final RealProfileManager profileManager;
    public final Lazy statusProvider$delegate = LazyKt.lazy(new SsnViewKt$$ExternalSyntheticLambda4(this, 29));
    public final SyncValueReader syncValueReader;

    public RealBitcoinEligibilityRepo(FeatureFlagManager featureFlagManager, RealProfileManager realProfileManager, SyncValueReader syncValueReader) {
        this.featureFlagManager = featureFlagManager;
        this.profileManager = realProfileManager;
        this.syncValueReader = syncValueReader;
    }
}
