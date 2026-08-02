package com.squareup.cash.mooncake.themes.theming;

import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class PressKt {
    public static final float[] hsl = new float[3];

    public static final int pressColor(ThemeInfo themeInfo, Integer num, boolean z) {
        themeInfo.getClass();
        int ordinal = themeInfo.theme.ordinal();
        float f = RecyclerView.DECELERATION_RATE;
        float[] fArr = hsl;
        if (ordinal == 0) {
            if (num == null) {
                return ColorUtils.setAlphaComponent(-16777216, z ? 17 : 13);
            }
            ColorUtils.colorToHSL(num.intValue(), fArr);
            float f2 = fArr[2];
            if (f2 > 0.25f) {
                float f3 = f2 - (z ? 0.11f : 0.05f);
                if (f3 >= RecyclerView.DECELERATION_RATE) {
                    f = f3;
                }
                fArr[2] = f;
            } else {
                float f4 = f2 + (z ? 0.48f : 0.2f);
                fArr[2] = f4 <= 1.0f ? f4 : 1.0f;
            }
            return ColorUtils.HSLToColor(fArr);
        }
        if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        if (num == null) {
            return ColorUtils.setAlphaComponent(-1, z ? 17 : 13);
        }
        ColorUtils.colorToHSL(num.intValue(), fArr);
        float f5 = fArr[2];
        if (f5 < 0.75f) {
            float f6 = f5 + (z ? 0.11f : 0.05f);
            fArr[2] = f6 <= 1.0f ? f6 : 1.0f;
        } else {
            float f7 = f5 - (z ? 0.48f : 0.2f);
            if (f7 >= RecyclerView.DECELERATION_RATE) {
                f = f7;
            }
            fArr[2] = f;
        }
        return ColorUtils.HSLToColor(fArr);
    }

    public static /* synthetic */ int pressColor$default(ThemeInfo themeInfo, Integer num, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        return pressColor(themeInfo, num, true);
    }
}
