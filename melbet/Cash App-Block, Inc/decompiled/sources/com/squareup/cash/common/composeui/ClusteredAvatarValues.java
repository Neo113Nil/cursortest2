package com.squareup.cash.common.composeui;

import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes6.dex */
public final class ClusteredAvatarValues {
    public static final ClusteredAvatarValues Size24 = new ClusteredAvatarValues(24.0f, 1.0f);
    public static final ClusteredAvatarValues Size48 = new ClusteredAvatarValues(48.0f, 2.0f);
    public final float clipGap;
    public final float size;

    public ClusteredAvatarValues(float f, float f2) {
        this.size = f;
        this.clipGap = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClusteredAvatarValues)) {
            return false;
        }
        ClusteredAvatarValues clusteredAvatarValues = (ClusteredAvatarValues) obj;
        return Dp.m1037equalsimpl0(this.size, clusteredAvatarValues.size) && Dp.m1037equalsimpl0(this.clipGap, clusteredAvatarValues.clipGap);
    }

    public final int hashCode() {
        return Float.hashCode(this.clipGap) + (Float.hashCode(this.size) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ClusteredAvatarValues(size=", Dp.m1038toStringimpl(this.size), ", clipGap=", Dp.m1038toStringimpl(this.clipGap), ")");
    }
}
