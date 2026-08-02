package com.squareup.cash.featureflags;

import com.squareup.protos.franklin.common.FeatureFlagSource;

/* loaded from: classes.dex */
public interface FeatureFlagInterceptor {
    void intercept(String str, String str2, boolean z, boolean z2, FeatureFlagSource featureFlagSource);
}
