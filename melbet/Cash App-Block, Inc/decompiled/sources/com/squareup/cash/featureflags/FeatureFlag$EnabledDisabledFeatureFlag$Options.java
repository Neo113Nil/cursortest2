package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public enum FeatureFlag$EnabledDisabledFeatureFlag$Options implements FeatureFlag$Option {
    Disabled("DISABLED"),
    Enabled("ENABLED");

    public final String identifier;

    FeatureFlag$EnabledDisabledFeatureFlag$Options(String str) {
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
