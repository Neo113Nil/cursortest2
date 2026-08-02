package com.squareup.cash.multiplatform.accentcolors;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes8.dex */
public final class Color {
    public final String darkSrgb;
    public final String lightSrgb;

    public Color(String str, String str2) {
        this.lightSrgb = str;
        this.darkSrgb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Color)) {
            return false;
        }
        Color color = (Color) obj;
        return this.lightSrgb.equals(color.lightSrgb) && this.darkSrgb.equals(color.darkSrgb);
    }

    public final int hashCode() {
        return this.darkSrgb.hashCode() + (this.lightSrgb.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Color(lightSrgb=", this.lightSrgb, ", darkSrgb=", this.darkSrgb, ")");
    }
}
