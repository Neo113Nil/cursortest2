package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$GpsCollectDataDelayMinutes extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$GpsCollectDataDelayMinutes INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("60");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("60"), new FeatureFlag$LongFeatureFlag.Value("0"), new FeatureFlag$LongFeatureFlag.Value("1")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$GpsCollectDataDelayMinutes("cashclient/gps_collect_data_delay_minutes", value, listOf, 0);
    }
}
