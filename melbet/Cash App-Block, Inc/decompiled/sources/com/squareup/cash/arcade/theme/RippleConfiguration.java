package com.squareup.cash.arcade.theme;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import kotlin.ULong;

/* loaded from: classes.dex */
public final class RippleConfiguration {
    public final long color;
    public final RippleAlpha rippleAlpha;

    public RippleConfiguration(long j, RippleAlpha rippleAlpha) {
        this.color = j;
        this.rippleAlpha = rippleAlpha;
    }

    /* renamed from: copy-DxMtmZc$default, reason: not valid java name */
    public static RippleConfiguration m3399copyDxMtmZc$default(RippleConfiguration rippleConfiguration, long j, RippleAlpha rippleAlpha, int i) {
        if ((i & 1) != 0) {
            j = rippleConfiguration.color;
        }
        if ((i & 2) != 0) {
            rippleAlpha = rippleConfiguration.rippleAlpha;
        }
        rippleConfiguration.getClass();
        return new RippleConfiguration(j, rippleAlpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.m676equalsimpl0(this.color, rippleConfiguration.color) && this.rippleAlpha.equals(rippleConfiguration.rippleAlpha);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return this.rippleAlpha.hashCode() + (Long.hashCode(this.color) * 31);
    }

    public final String toString() {
        return "RippleConfiguration(color=" + Color.m682toStringimpl(this.color) + ", rippleAlpha=" + this.rippleAlpha + ")";
    }
}
