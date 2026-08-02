package com.squareup.cash.arcade.theme;

import androidx.compose.foundation.ImageKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.recyclerview.widget.RecyclerView;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class RippleKt {
    public static final DynamicProvidableCompositionLocal LocalRippleConfiguration = new DynamicProvidableCompositionLocal(new SvgDecoder$$ExternalSyntheticLambda0(22));

    public static final Modifier clickableWithUnboundedRipple(Modifier modifier, Function0 function0, Composer composer) {
        modifier.getClass();
        function0.getClass();
        return ImageKt.m182clickableO2vRcR0$default(modifier, null, m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, composer, 48, 13), false, null, null, function0, 28);
    }

    /* renamed from: ripple-YJYuY3k, reason: not valid java name */
    public static final RippleNodeFactory m3400rippleYJYuY3k(final long j, boolean z, float f, RippleAlpha rippleAlpha, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = Color.Unspecified;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            f = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            rippleAlpha = null;
        }
        boolean changed = ((GapComposer) composer).changed(j);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new ColorProducer() { // from class: com.squareup.cash.arcade.theme.RippleKt$ripple$1$1
                @Override // androidx.compose.ui.graphics.ColorProducer
                /* renamed from: invoke-0d7_KjU */
                public final long mo501invoke0d7_KjU() {
                    return j;
                }
            };
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return new RippleNodeFactory((ColorProducer) rememberedValue, z, f, rippleAlpha);
    }
}
