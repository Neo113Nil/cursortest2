package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class ElevationOverlayProvider {
    public static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    public final int colorSurface;
    public final float displayDensity;
    public final int elevationOverlayAccentColor;
    public final int elevationOverlayColor;
    public final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(Context context) {
        boolean resolveBoolean = MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false);
        Integer colorOrNull = MaterialColors.getColorOrNull(context, R.attr.elevationOverlayColor);
        int intValue = colorOrNull != null ? colorOrNull.intValue() : 0;
        Integer colorOrNull2 = MaterialColors.getColorOrNull(context, R.attr.elevationOverlayAccentColor);
        int intValue2 = colorOrNull2 != null ? colorOrNull2.intValue() : 0;
        Integer colorOrNull3 = MaterialColors.getColorOrNull(context, R.attr.colorSurface);
        int intValue3 = colorOrNull3 != null ? colorOrNull3.intValue() : 0;
        float f = context.getResources().getDisplayMetrics().density;
        this.elevationOverlayEnabled = resolveBoolean;
        this.elevationOverlayColor = intValue;
        this.elevationOverlayAccentColor = intValue2;
        this.colorSurface = intValue3;
        this.displayDensity = f;
    }

    public final int compositeOverlayIfNeeded(float f, int i) {
        int i2;
        if (!this.elevationOverlayEnabled || ColorUtils.setAlphaComponent(i, 255) != this.colorSurface) {
            return i;
        }
        float min = (this.displayDensity <= RecyclerView.DECELERATION_RATE || f <= RecyclerView.DECELERATION_RATE) ? 0.0f : Math.min(((((float) Math.log1p(f / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int layer = MaterialColors.layer(min, ColorUtils.setAlphaComponent(i, 255), this.elevationOverlayColor);
        if (min > RecyclerView.DECELERATION_RATE && (i2 = this.elevationOverlayAccentColor) != 0) {
            layer = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i2, OVERLAY_ACCENT_COLOR_ALPHA), layer);
        }
        return ColorUtils.setAlphaComponent(layer, alpha);
    }
}
