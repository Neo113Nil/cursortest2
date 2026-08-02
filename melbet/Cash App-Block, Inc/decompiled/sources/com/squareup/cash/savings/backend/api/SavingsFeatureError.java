package com.squareup.cash.savings.backend.api;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.FeatureError;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes7.dex */
public final class SavingsFeatureError implements FeatureError {
    public static final SavingsFeatureError INSTANCE = new SavingsFeatureError();
    public static final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Savings.INSTANCE);

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return features;
    }
}
