package com.squareup.cash.arcade.components.avatar;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class AvatarSizeImpl {
    public final float badgeOffset;
    public final float badgePadding;
    public final float badgeSize;
    public final float iconSize;
    public final float size;
    public final long textSize;

    public AvatarSizeImpl(float f, float f2, long j, float f3, float f4, float f5) {
        this.size = f;
        this.iconSize = f2;
        this.textSize = j;
        this.badgeOffset = f3;
        this.badgeSize = f4;
        this.badgePadding = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarSizeImpl)) {
            return false;
        }
        AvatarSizeImpl avatarSizeImpl = (AvatarSizeImpl) obj;
        return Dp.m1037equalsimpl0(this.size, avatarSizeImpl.size) && Dp.m1037equalsimpl0(this.iconSize, avatarSizeImpl.iconSize) && TextUnit.m1057equalsimpl0(this.textSize, avatarSizeImpl.textSize) && Dp.m1037equalsimpl0(this.badgeOffset, avatarSizeImpl.badgeOffset) && Dp.m1037equalsimpl0(this.badgeSize, avatarSizeImpl.badgeSize) && Dp.m1037equalsimpl0(this.badgePadding, avatarSizeImpl.badgePadding);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.iconSize, Float.hashCode(this.size) * 31, 31);
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        return Float.hashCode(this.badgePadding) + CameraState$Type$EnumUnboxingLocalUtility.m(this.badgeSize, CameraState$Type$EnumUnboxingLocalUtility.m(this.badgeOffset, Recorder$$ExternalSyntheticOutline2.m(m, 31, this.textSize), 31), 31);
    }

    public final TextStyle textStyle(Composer composer) {
        TextStyle textStyle = ((Typography) ((GapComposer) composer).consume(ArcadeThemeKt.LocalTypography)).hero;
        FontWeight fontWeight = new FontWeight(500);
        long j = this.textSize;
        return TextStyle.m994copyp1EtxEg$default(textStyle, 0L, j, fontWeight, null, 0L, null, 0L, null, null, null, 3, j, null, null, 0, 16613369);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.size);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.iconSize);
        String m1061toStringimpl = TextUnit.m1061toStringimpl(this.textSize);
        String m1038toStringimpl3 = Dp.m1038toStringimpl(this.badgeOffset);
        String m1038toStringimpl4 = Dp.m1038toStringimpl(this.badgeSize);
        String m1038toStringimpl5 = Dp.m1038toStringimpl(this.badgePadding);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AvatarSizeImpl(size=", m1038toStringimpl, ", iconSize=", m1038toStringimpl2, ", textSize=");
        Boxes$$ExternalSyntheticOutline1.m(m, m1061toStringimpl, ", badgeOffset=", m1038toStringimpl3, ", badgeSize=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m1038toStringimpl4, ", badgePadding=", m1038toStringimpl5, ")");
    }
}
