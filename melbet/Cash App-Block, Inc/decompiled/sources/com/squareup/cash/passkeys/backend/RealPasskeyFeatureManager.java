package com.squareup.cash.passkeys.backend;

import com.squareup.cash.featureflags.FeatureFlagManager;

/* loaded from: classes.dex */
public final class RealPasskeyFeatureManager {
    public final FeatureFlagManager featureFlagManager;

    public RealPasskeyFeatureManager(FeatureFlagManager featureFlagManager) {
        this.featureFlagManager = featureFlagManager;
    }
}
