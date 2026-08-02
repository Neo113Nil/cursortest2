package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$SupportChatFileSizeLimit extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$SupportChatFileSizeLimit INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("25");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("10"), new FeatureFlag$LongFeatureFlag.Value("11"), new FeatureFlag$LongFeatureFlag.Value("25")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$SupportChatFileSizeLimit("cashclient/support_chat_file_size_limit", value, listOf, 0);
    }
}
