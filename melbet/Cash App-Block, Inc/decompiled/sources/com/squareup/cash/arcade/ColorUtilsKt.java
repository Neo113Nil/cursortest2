package com.squareup.cash.arcade;

import android.graphics.Color;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.trifle.Trifle;
import com.squareup.cash.arcade.RippleAlphas;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes.dex */
public abstract class ColorUtilsKt {
    public static final RippleAlphas darkAlphas = new RippleAlphas(new RippleAlpha(RecyclerView.DECELERATION_RATE, 0.2f, 0.1f, 0.2f), new RippleAlphas.Component(new RippleAlpha(RecyclerView.DECELERATION_RATE, 0.4f, 0.2f, 0.4f)));
    public static final RippleAlphas lightAlphas = new RippleAlphas(new RippleAlpha(RecyclerView.DECELERATION_RATE, 0.15f, 0.08f, 0.15f), new RippleAlphas.Component(new RippleAlpha(RecyclerView.DECELERATION_RATE, 0.4f, 0.2f, 0.4f)));

    /* renamed from: addLuminance-DxMtmZc, reason: not valid java name */
    public static final long m2984addLuminanceDxMtmZc(long j, float f) {
        float m;
        float abs;
        if (j == 16) {
            return j;
        }
        int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(j);
        float red = Color.red(m694toArgb8_81llA) / 255.0f;
        float green = Color.green(m694toArgb8_81llA) / 255.0f;
        float blue = Color.blue(m694toArgb8_81llA) / 255.0f;
        float max = Math.max(red, Math.max(green, blue));
        float min = Math.min(red, Math.min(green, blue));
        float f2 = max - min;
        float f3 = (max + min) / 2.0f;
        if (max == min) {
            m = 0.0f;
            abs = 0.0f;
        } else {
            m = max == red ? ((green - blue) / f2) % 6.0f : max == green ? Recorder$$ExternalSyntheticOutline2.m(blue, red, f2, 2.0f) : Recorder$$ExternalSyntheticOutline2.m(red, green, f2, 4.0f);
            abs = f2 / (1.0f - Math.abs((2.0f * f3) - 1.0f));
        }
        float f4 = (m * 60.0f) % 360.0f;
        if (f4 < RecyclerView.DECELERATION_RATE) {
            f4 += 360.0f;
        }
        float[] fArr = {RangesKt___RangesKt.coerceIn(f4, RecyclerView.DECELERATION_RATE, 360.0f), RangesKt___RangesKt.coerceIn(abs, RecyclerView.DECELERATION_RATE, 1.0f), RangesKt___RangesKt.coerceIn(f3, RecyclerView.DECELERATION_RATE, 1.0f)};
        float f5 = fArr[2] + f;
        fArr[2] = f5;
        float coerceIn = RangesKt___RangesKt.coerceIn(f5, RecyclerView.DECELERATION_RATE, 1.0f);
        fArr[2] = coerceIn;
        int i = androidx.compose.ui.graphics.Color.$r8$clinit;
        return Trifle.m1424hslJlNiLsg$default(fArr[0], fArr[1], coerceIn, androidx.compose.ui.graphics.Color.m677getAlphaimpl(j));
    }

    /* renamed from: asDisabled-DxMtmZc$default, reason: not valid java name */
    public static long m2985asDisabledDxMtmZc$default(long j) {
        return j == 16 ? j : androidx.compose.ui.graphics.Color.m675copywmQWz5c$default(0.3f, j, 14);
    }
}
