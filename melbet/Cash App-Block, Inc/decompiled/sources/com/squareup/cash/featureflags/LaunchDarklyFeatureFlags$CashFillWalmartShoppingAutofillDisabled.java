package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$CashFillWalmartShoppingAutofillDisabled extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$CashFillWalmartShoppingAutofillDisabled INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("DISABLED", "DISABLED");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("DISABLED", "DISABLED"), new FeatureFlag$StringFeatureFlag$Value("SPECTATOR", "SPECTATOR"), new FeatureFlag$StringFeatureFlag$Value("ENABLED", "ENABLED")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$CashFillWalmartShoppingAutofillDisabled("cashclient/cash_fill_walmart_shopping_autofill_disabled", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
