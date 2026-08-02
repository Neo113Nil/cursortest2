package com.squareup.cash.arcade.components.avatar;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class AvatarSizeOverride {
    public final float badgeOffset;
    public final float badgePadding;
    public final float badgeSize;
    public final float iconSize;
    public final float size;
    public final long textSize;

    public AvatarSizeOverride(float f, float f2, int i, long j) {
        this(f, f2, j, (i & 8) != 0 ? Float.NaN : 8.0f, 24.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarSizeOverride)) {
            return false;
        }
        AvatarSizeOverride avatarSizeOverride = (AvatarSizeOverride) obj;
        return Dp.m1037equalsimpl0(this.size, avatarSizeOverride.size) && Dp.m1037equalsimpl0(this.iconSize, avatarSizeOverride.iconSize) && TextUnit.m1057equalsimpl0(this.textSize, avatarSizeOverride.textSize) && Dp.m1037equalsimpl0(this.badgeOffset, avatarSizeOverride.badgeOffset) && Dp.m1037equalsimpl0(this.badgeSize, avatarSizeOverride.badgeSize) && Dp.m1037equalsimpl0(this.badgePadding, avatarSizeOverride.badgePadding);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.iconSize, Float.hashCode(this.size) * 31, 31);
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        return Float.hashCode(this.badgePadding) + CameraState$Type$EnumUnboxingLocalUtility.m(this.badgeSize, CameraState$Type$EnumUnboxingLocalUtility.m(this.badgeOffset, Recorder$$ExternalSyntheticOutline2.m(m, 31, this.textSize), 31), 31);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.size);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.iconSize);
        String m1061toStringimpl = TextUnit.m1061toStringimpl(this.textSize);
        String m1038toStringimpl3 = Dp.m1038toStringimpl(this.badgeOffset);
        String m1038toStringimpl4 = Dp.m1038toStringimpl(this.badgeSize);
        String m1038toStringimpl5 = Dp.m1038toStringimpl(this.badgePadding);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AvatarSizeOverride(size=", m1038toStringimpl, ", iconSize=", m1038toStringimpl2, ", textSize=");
        Boxes$$ExternalSyntheticOutline1.m(m, m1061toStringimpl, ", badgeOffset=", m1038toStringimpl3, ", badgeSize=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m1038toStringimpl4, ", badgePadding=", m1038toStringimpl5, ")");
    }

    public AvatarSizeOverride(float f, float f2, long j, float f3, float f4) {
        this.size = f;
        this.iconSize = f2;
        this.textSize = j;
        this.badgeOffset = f3;
        this.badgeSize = f4;
        this.badgePadding = 4.0f;
    }
}
