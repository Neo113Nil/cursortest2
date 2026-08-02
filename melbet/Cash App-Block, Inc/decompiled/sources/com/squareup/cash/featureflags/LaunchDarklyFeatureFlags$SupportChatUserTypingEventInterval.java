package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$SupportChatUserTypingEventInterval extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$SupportChatUserTypingEventInterval INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("1000");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("1000"), new FeatureFlag$LongFeatureFlag.Value("10000"), new FeatureFlag$LongFeatureFlag.Value("3600000")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$SupportChatUserTypingEventInterval("cashclient/support_chat_user_typing_event_interval", value, listOf, 0);
    }
}
