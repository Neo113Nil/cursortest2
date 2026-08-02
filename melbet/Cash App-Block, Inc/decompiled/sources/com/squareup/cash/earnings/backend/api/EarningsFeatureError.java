package com.squareup.cash.earnings.backend.api;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.FeatureError;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes6.dex */
public abstract class EarningsFeatureError implements FeatureError {
    public static final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Earnings.INSTANCE);
}
