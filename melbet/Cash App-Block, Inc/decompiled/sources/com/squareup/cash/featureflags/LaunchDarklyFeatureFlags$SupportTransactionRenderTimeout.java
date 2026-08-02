package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$SupportTransactionRenderTimeout extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$SupportTransactionRenderTimeout INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("6000");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("6000"), new FeatureFlag$LongFeatureFlag.Value("1000")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$SupportTransactionRenderTimeout("cashclient/support_transaction_render_timeout", value, listOf, 0);
    }
}
