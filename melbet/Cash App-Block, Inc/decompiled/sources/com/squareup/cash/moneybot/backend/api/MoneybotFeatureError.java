package com.squareup.cash.moneybot.backend.api;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.FeatureError;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes6.dex */
public final class MoneybotFeatureError implements FeatureError {
    public static final MoneybotFeatureError INSTANCE = new MoneybotFeatureError();
    public static final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Moneybot.INSTANCE);

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return features;
    }
}
