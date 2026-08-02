package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class LaunchDarklyFeatureFlags$CdpInteractivitySessionTimeout extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$CdpInteractivitySessionTimeout INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("300");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("300"), new FeatureFlag$LongFeatureFlag.Value("600"), new FeatureFlag$LongFeatureFlag.Value("120")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$CdpInteractivitySessionTimeout("cashclient/cdp_interactivity_session_timeout", value, listOf, 0);
    }
}
