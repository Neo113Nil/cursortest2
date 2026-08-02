package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$SupportPhonePollInterval extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$SupportPhonePollInterval INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("30");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("60"), new FeatureFlag$LongFeatureFlag.Value("30"), new FeatureFlag$LongFeatureFlag.Value("10")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$SupportPhonePollInterval("cashclient/support_phone_poll_interval", value, listOf, 0);
    }
}
