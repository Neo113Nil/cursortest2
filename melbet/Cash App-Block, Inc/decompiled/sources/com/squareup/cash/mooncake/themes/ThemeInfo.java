package com.squareup.cash.mooncake.themes;

import com.squareup.cash.arcade.Colors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ThemeInfo {
    public final Colors arcadeColors;
    public final ColorPalette colorPalette;
    public final Theme theme;

    public ThemeInfo(Theme theme, ColorPalette colorPalette, Colors colors) {
        colorPalette.getClass();
        colors.getClass();
        this.theme = theme;
        this.colorPalette = colorPalette;
        this.arcadeColors = colors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeInfo)) {
            return false;
        }
        ThemeInfo themeInfo = (ThemeInfo) obj;
        return this.theme == themeInfo.theme && Intrinsics.areEqual(this.colorPalette, themeInfo.colorPalette) && Intrinsics.areEqual(this.arcadeColors, themeInfo.arcadeColors);
    }

    public final int hashCode() {
        return this.arcadeColors.hashCode() + ((this.colorPalette.hashCode() + (this.theme.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ThemeInfo(theme=" + this.theme + ", colorPalette=" + this.colorPalette + ", arcadeColors=" + this.arcadeColors + ")";
    }
}
