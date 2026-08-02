package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$Mricomputationalintegritymemorycostkbandroid extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$Mricomputationalintegritymemorycostkbandroid INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("8192");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("0"), new FeatureFlag$LongFeatureFlag.Value("8192"), new FeatureFlag$LongFeatureFlag.Value("16384")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$Mricomputationalintegritymemorycostkbandroid("cashclient/mricomputationalintegritymemorycostkbandroid", value, listOf, 0);
    }
}
