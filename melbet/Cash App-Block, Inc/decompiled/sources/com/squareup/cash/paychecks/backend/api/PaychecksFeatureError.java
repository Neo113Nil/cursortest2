package com.squareup.cash.paychecks.backend.api;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.FeatureError;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes6.dex */
public final class PaychecksFeatureError implements FeatureError {
    public static final PaychecksFeatureError INSTANCE = new PaychecksFeatureError();
    public static final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Paychecks.INSTANCE);

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return features;
    }
}
