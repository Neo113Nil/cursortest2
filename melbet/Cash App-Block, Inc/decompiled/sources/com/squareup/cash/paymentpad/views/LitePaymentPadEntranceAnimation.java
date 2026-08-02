package com.squareup.cash.paymentpad.views;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public abstract class LitePaymentPadEntranceAnimation {
    public static final CubicBezierEasing BLOOM_EXPANSION_EASING = new CubicBezierEasing(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.58f, 1.0f);
    public static final float CONTENT_INITIAL_OFFSET = 32.0f;

    public static CubicBezierEasing getBLOOM_EXPANSION_EASING() {
        return BLOOM_EXPANSION_EASING;
    }
}
