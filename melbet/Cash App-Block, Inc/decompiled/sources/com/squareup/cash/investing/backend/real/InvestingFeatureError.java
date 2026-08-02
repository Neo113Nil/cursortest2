package com.squareup.cash.investing.backend.real;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.FeatureError;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes6.dex */
public abstract class InvestingFeatureError implements FeatureError {
    public static final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Investing.INSTANCE);
}
