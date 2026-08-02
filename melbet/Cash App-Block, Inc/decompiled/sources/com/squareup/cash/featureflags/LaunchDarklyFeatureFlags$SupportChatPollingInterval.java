package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$SupportChatPollingInterval extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$SupportChatPollingInterval INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("10");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("300"), new FeatureFlag$LongFeatureFlag.Value("5"), new FeatureFlag$LongFeatureFlag.Value("60"), new FeatureFlag$LongFeatureFlag.Value("30"), new FeatureFlag$LongFeatureFlag.Value("10"), new FeatureFlag$LongFeatureFlag.Value("120")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$SupportChatPollingInterval("cashclient/support_chat_polling_interval", value, listOf, 0);
    }
}
