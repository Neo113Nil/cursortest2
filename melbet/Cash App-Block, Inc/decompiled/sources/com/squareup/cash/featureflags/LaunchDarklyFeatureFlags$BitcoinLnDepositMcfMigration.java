package com.squareup.cash.featureflags;

import androidx.compose.runtime.AbstractApplier;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$BitcoinLnDepositMcfMigration extends AbstractApplier {
    public static final LaunchDarklyFeatureFlags$BitcoinLnDepositMcfMigration INSTANCE;

    static {
        FeatureFlag$MarketCapabilityMigrationFeatureFlag$Options featureFlag$MarketCapabilityMigrationFeatureFlag$Options = FeatureFlag$MarketCapabilityMigrationFeatureFlag$Options.UseMigrationFallback;
        INSTANCE = new LaunchDarklyFeatureFlags$BitcoinLnDepositMcfMigration("cashclient/bitcoin_ln_deposit_mcf_migration", featureFlag$MarketCapabilityMigrationFeatureFlag$Options, CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$MarketCapabilityMigrationFeatureFlag$Options[]{featureFlag$MarketCapabilityMigrationFeatureFlag$Options, FeatureFlag$MarketCapabilityMigrationFeatureFlag$Options.UseMarketCapability}));
    }
}
