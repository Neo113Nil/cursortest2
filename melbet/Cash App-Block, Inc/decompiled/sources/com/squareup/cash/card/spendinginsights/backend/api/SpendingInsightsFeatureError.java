package com.squareup.cash.card.spendinginsights.backend.api;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.FeatureError;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes6.dex */
public final class SpendingInsightsFeatureError implements FeatureError {
    public static final SpendingInsightsFeatureError INSTANCE = new SpendingInsightsFeatureError();
    public static final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.SpendingInsights.INSTANCE);

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return features;
    }
}
