package com.squareup.cash.mooncake.theming;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.android.StringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class ThemablesKt {
    public static final int contrastAdjustedColor(int i, int i2, int i3) {
        return (Color.alpha(i2) >= 255 && ColorUtils.calculateContrast(i, i2) < 1.5d) ? i3 : i;
    }

    public static final Integer forTheme(com.squareup.protos.cash.ui.Color color, ThemeInfo themeInfo) {
        Color.ModeVariant modeVariant;
        color.getClass();
        themeInfo.getClass();
        int ordinal = themeInfo.theme.ordinal();
        if (ordinal == 0) {
            modeVariant = color.light;
            modeVariant.getClass();
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            modeVariant = color.dark;
            if (modeVariant == null) {
                modeVariant = color.light;
                modeVariant.getClass();
            }
        }
        return StringsKt.safeParseColor(modeVariant.srgb, new ScannerView.AnonymousClass3(1, Timber.Forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 1));
    }

    public static final String urlForTheme(Image image, ThemeInfo themeInfo) {
        image.getClass();
        themeInfo.getClass();
        int ordinal = themeInfo.theme.ordinal();
        if (ordinal == 0) {
            String str = image.light_url;
            str.getClass();
            return str;
        }
        if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String str2 = image.dark_url;
        if (str2 != null) {
            String str3 = kotlin.text.StringsKt.isBlank(str2) ? null : str2;
            if (str3 != null) {
                return str3;
            }
        }
        String str4 = image.light_url;
        str4.getClass();
        return str4;
    }
}
