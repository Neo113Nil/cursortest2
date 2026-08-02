package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.squareup.cash.R;

/* loaded from: classes6.dex */
public final class GlitterDrawable extends GradientDrawable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlitterDrawable(Context context, boolean z) {
        super(z ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{context.getColor(R.color.card_glitter_start), context.getColor(R.color.card_glitter_middle), context.getColor(R.color.card_glitter_end)});
        context.getClass();
    }
}
