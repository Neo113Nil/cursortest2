package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$MriSigningTimeout extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$MriSigningTimeout INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("60");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("60"), new FeatureFlag$LongFeatureFlag.Value("120"), new FeatureFlag$LongFeatureFlag.Value("6")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$MriSigningTimeout("cashclient/mri_signing_timeout", value, listOf, 0);
    }
}
