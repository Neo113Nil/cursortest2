package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public enum FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options implements FeatureFlag$Option {
    Unassigned("UNASSIGNED"),
    Disabled("DISABLED"),
    Enabled("ENABLED");

    public final String identifier;

    FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options(String str) {
        this.identifier = str;
    }

    public final boolean enabled() {
        return this == Enabled;
    }

    @Override // com.squareup.cash.featureflags.FeatureFlag$Option
    public final String getIdentifier() {
        return this.identifier;
    }
}
