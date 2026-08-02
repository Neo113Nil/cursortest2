package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$Mricomputationalintegritytimeoutmsandroid extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$Mricomputationalintegritytimeoutmsandroid INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("10000");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("0"), new FeatureFlag$LongFeatureFlag.Value("5000"), new FeatureFlag$LongFeatureFlag.Value("10000")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$Mricomputationalintegritytimeoutmsandroid("cashclient/mricomputationalintegritytimeoutmsandroid", value, listOf, 0);
    }
}
