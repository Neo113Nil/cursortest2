package com.squareup.cash.mooncake.resources;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.cash.arcade.values.Color;
import com.squareup.cash.arcade.treehouse.ColorBindingsKt;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.ui.Color;
import com.squareup.util.android.StringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes5.dex */
public abstract class ColorsKt {
    public static final int toColorInt(Color.Code code, Theme theme) {
        int ordinal = theme.ordinal();
        if (ordinal == 0) {
            return StringsKt.strictParseColor(code.light.srgb);
        }
        if (ordinal == 1) {
            Color.ModeVariant modeVariant = code.dark;
            return modeVariant != null ? StringsKt.strictParseColor(modeVariant.srgb) : StringsKt.strictParseColor(code.light.srgb);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    public static int toColorInt$default(Color color, ThemeInfo themeInfo) {
        Lazy lazy = ResourcesKt.mooncakeResourceIndex;
        color.getClass();
        themeInfo.getClass();
        Theme theme = themeInfo.theme;
        lazy.getClass();
        if (color instanceof Color.Code) {
            return toColorInt((Color.Code) color, theme);
        }
        if (!(color instanceof Color.Id)) {
            if (color instanceof Color.Token) {
                return ColorKt.m694toArgb8_81llA(ColorBindingsKt.getColorById(themeInfo.arcadeColors, ((Color.Token) color).id));
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        Color.Code code = (Color.Code) ((Map) lazy.value).get(color);
        Integer valueOf = code != null ? Integer.valueOf(toColorInt(code, theme)) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        Handlers$$ExternalSyntheticBUOutline0.m(color, "Unexpected Color.ID: ");
        return 0;
    }

    public static final long toComposeColor(Color color, ThemeInfo themeInfo, Composer composer) {
        color.getClass();
        themeInfo.getClass();
        Lazy lazy = ResourcesKt.mooncakeResourceIndex;
        if (color instanceof Color.Code) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-803691146);
            androidx.compose.ui.graphics.Color composeColor = toComposeColor(toProto(color, lazy), gapComposer);
            if (composeColor == null) {
                Handlers$$ExternalSyntheticBUOutline0.m(color, "Unexpected Color.Code: ");
                return 0L;
            }
            long j = composeColor.value;
            gapComposer.end(false);
            return j;
        }
        if (!(color instanceof Color.Id)) {
            if (!(color instanceof Color.Token)) {
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, -803692015, false);
            }
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-803682130);
            gapComposer2.end(false);
            return ColorBindingsKt.getColorById(themeInfo.arcadeColors, ((Color.Token) color).id);
        }
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(-803687462);
        Color.Code code = (Color.Code) ((Map) lazy.value).get(color);
        androidx.compose.ui.graphics.Color color2 = null;
        com.squareup.protos.cash.ui.Color proto = code != null ? toProto(code, lazy) : null;
        if (proto == null) {
            gapComposer3.startReplaceGroup(855553432);
        } else {
            gapComposer3.startReplaceGroup(-803685495);
            color2 = toComposeColor(proto, gapComposer3);
        }
        gapComposer3.end(false);
        if (color2 == null) {
            Handlers$$ExternalSyntheticBUOutline0.m(color, "Unexpected Color.ID: ");
            return 0L;
        }
        long j2 = color2.value;
        gapComposer3.end(false);
        return j2;
    }

    public static final com.squareup.protos.cash.ui.Color toProto(Color color, Lazy lazy) {
        Color.Code code;
        color.getClass();
        lazy.getClass();
        Color.ModeVariant modeVariant = null;
        if ((color instanceof Color.Token) || (color instanceof Color.Id)) {
            Object obj = ((Map) lazy.value).get(color);
            if (obj == null) {
                Handlers$$ExternalSyntheticBUOutline0.m(color, "Unexpected color: ");
                return null;
            }
            code = (Color.Code) obj;
        } else {
            if (!(color instanceof Color.Code)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            code = (Color.Code) color;
        }
        Color.ModeVariant modeVariant2 = code.light;
        Color.ModeVariant modeVariant3 = new Color.ModeVariant(modeVariant2.srgb, modeVariant2.p3, modeVariant2.highContrastSrgb, modeVariant2.highContrastP3, null, 16, null);
        Color.ModeVariant modeVariant4 = code.dark;
        if (modeVariant4 != null) {
            modeVariant = new Color.ModeVariant(modeVariant4.srgb, modeVariant4.p3, modeVariant4.highContrastSrgb, modeVariant4.highContrastP3, null, 16, null);
        }
        return new com.squareup.protos.cash.ui.Color(modeVariant3, modeVariant, 4);
    }

    public static final androidx.compose.ui.graphics.Color toComposeColor(com.squareup.protos.cash.ui.Color color, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1255630725);
        Integer forTheme = ThemablesKt.forTheme(color, ThemeHelpersKt.themeInfo((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)));
        gapComposer.end(false);
        if (forTheme != null) {
            return new androidx.compose.ui.graphics.Color(ColorKt.Color(forTheme.intValue()));
        }
        return null;
    }
}
