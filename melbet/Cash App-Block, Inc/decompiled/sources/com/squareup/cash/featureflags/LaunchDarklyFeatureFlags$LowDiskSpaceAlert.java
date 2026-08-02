package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$LowDiskSpaceAlert extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$LowDiskSpaceAlert INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("0");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("24"), new FeatureFlag$LongFeatureFlag.Value("0"), new FeatureFlag$LongFeatureFlag.Value("48")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$LowDiskSpaceAlert("cashclient/low_disk_space_alert", value, listOf, 0);
    }
}
