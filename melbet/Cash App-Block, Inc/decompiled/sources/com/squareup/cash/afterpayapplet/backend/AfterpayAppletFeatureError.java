package com.squareup.cash.afterpayapplet.backend;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.FeatureError;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes5.dex */
public abstract class AfterpayAppletFeatureError implements FeatureError {
    public static final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.AfterpayApplet.INSTANCE);
}
