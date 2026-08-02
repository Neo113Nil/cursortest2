package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public enum FeatureFlag$MarketCapabilityMigrationFeatureFlag$Options implements FeatureFlag$Option {
    UseMigrationFallback("USE_MIGRATION_FALLBACK"),
    UseMarketCapability("USE_MCF");

    public final String identifier;

    FeatureFlag$MarketCapabilityMigrationFeatureFlag$Options(String str) {
        this.identifier = str;
    }

    @Override // com.squareup.cash.featureflags.FeatureFlag$Option
    public final String getIdentifier() {
        return this.identifier;
    }
}
