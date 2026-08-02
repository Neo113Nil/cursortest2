package com.bugsnag.android;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FeatureFlagState extends BaseObservable {
    public final FeatureFlags featureFlags;

    public FeatureFlagState(FeatureFlags featureFlags) {
        this.featureFlags = featureFlags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeatureFlagState) && Intrinsics.areEqual(this.featureFlags, ((FeatureFlagState) obj).featureFlags);
    }

    public final int hashCode() {
        return this.featureFlags.hashCode();
    }

    public final String toString() {
        return "FeatureFlagState(featureFlags=" + this.featureFlags + ')';
    }
}
