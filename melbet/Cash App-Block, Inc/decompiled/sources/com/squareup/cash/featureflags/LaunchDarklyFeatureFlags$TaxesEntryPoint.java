package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$TaxesEntryPoint extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$TaxesEntryPoint INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("NONE", "NONE");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("NONE", "NONE"), new FeatureFlag$StringFeatureFlag$Value("EYR", "EYR"), new FeatureFlag$StringFeatureFlag$Value("E_FILE", "E_FILE"), new FeatureFlag$StringFeatureFlag$Value("TAX_HUB", "TAX_HUB")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$TaxesEntryPoint("cashclient/taxes_entry_point", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
