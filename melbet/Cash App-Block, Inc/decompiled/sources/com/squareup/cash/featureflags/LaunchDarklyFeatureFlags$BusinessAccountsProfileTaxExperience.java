package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("DISABLED", "DISABLED");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("DISABLED", "DISABLED"), new FeatureFlag$StringFeatureFlag$Value("ENABLE_ALL", "ENABLE_ALL"), new FeatureFlag$StringFeatureFlag$Value("ENABLE_DOWNGRADE", "ENABLE_DOWNGRADE"), new FeatureFlag$StringFeatureFlag$Value("ENABLE_TAX_INFO", "ENABLE_TAX_INFO")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$BusinessAccountsProfileTaxExperience("cashclient/business_accounts_profile_tax_experience", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
