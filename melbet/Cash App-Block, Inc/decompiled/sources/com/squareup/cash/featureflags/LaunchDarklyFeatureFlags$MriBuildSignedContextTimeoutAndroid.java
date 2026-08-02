package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class LaunchDarklyFeatureFlags$MriBuildSignedContextTimeoutAndroid extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$MriBuildSignedContextTimeoutAndroid INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("30");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("15"), new FeatureFlag$LongFeatureFlag.Value("30"), new FeatureFlag$LongFeatureFlag.Value("60")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$MriBuildSignedContextTimeoutAndroid("cashclient/mri_build_signed_context_timeout_android", value, listOf, 0);
    }
}
