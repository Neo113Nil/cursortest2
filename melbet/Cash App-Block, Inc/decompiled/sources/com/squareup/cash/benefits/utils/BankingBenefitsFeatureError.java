package com.squareup.cash.benefits.utils;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.FeatureError;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes5.dex */
public final class BankingBenefitsFeatureError implements FeatureError {
    public static final BankingBenefitsFeatureError INSTANCE = new BankingBenefitsFeatureError();
    public static final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.BankingBenefits.INSTANCE);

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return features;
    }
}
