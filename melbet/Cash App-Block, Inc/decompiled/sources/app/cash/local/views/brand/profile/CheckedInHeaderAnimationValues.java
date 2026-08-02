package app.cash.local.views.brand.profile;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class CheckedInHeaderAnimationValues {
    public final float avatarAlpha;
    public final float avatarOffsetX;
    public final float avatarScale;
    public final float subtitleAlpha;
    public final float subtitleOffsetY;
    public final float textColumnBaseOffsetY;
    public final float textColumnOffsetY;
    public final float titleAlpha;
    public final float titleOffsetY;
    public final float titleRevealWidth;
    public final float titleWidth;

    public CheckedInHeaderAnimationValues(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.titleAlpha = f;
        this.titleOffsetY = f2;
        this.titleWidth = f3;
        this.titleRevealWidth = f4;
        this.subtitleAlpha = f5;
        this.subtitleOffsetY = f6;
        this.textColumnBaseOffsetY = f7;
        this.textColumnOffsetY = f8;
        this.avatarAlpha = f9;
        this.avatarScale = f10;
        this.avatarOffsetX = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckedInHeaderAnimationValues)) {
            return false;
        }
        CheckedInHeaderAnimationValues checkedInHeaderAnimationValues = (CheckedInHeaderAnimationValues) obj;
        return Float.compare(this.titleAlpha, checkedInHeaderAnimationValues.titleAlpha) == 0 && Dp.m1037equalsimpl0(this.titleOffsetY, checkedInHeaderAnimationValues.titleOffsetY) && Dp.m1037equalsimpl0(this.titleWidth, checkedInHeaderAnimationValues.titleWidth) && Dp.m1037equalsimpl0(this.titleRevealWidth, checkedInHeaderAnimationValues.titleRevealWidth) && Float.compare(this.subtitleAlpha, checkedInHeaderAnimationValues.subtitleAlpha) == 0 && Dp.m1037equalsimpl0(this.subtitleOffsetY, checkedInHeaderAnimationValues.subtitleOffsetY) && Dp.m1037equalsimpl0(this.textColumnBaseOffsetY, checkedInHeaderAnimationValues.textColumnBaseOffsetY) && Dp.m1037equalsimpl0(this.textColumnOffsetY, checkedInHeaderAnimationValues.textColumnOffsetY) && Float.compare(this.avatarAlpha, checkedInHeaderAnimationValues.avatarAlpha) == 0 && Float.compare(this.avatarScale, checkedInHeaderAnimationValues.avatarScale) == 0 && Dp.m1037equalsimpl0(this.avatarOffsetX, checkedInHeaderAnimationValues.avatarOffsetX);
    }

    public final int hashCode() {
        return Float.hashCode(this.avatarOffsetX) + CameraState$Type$EnumUnboxingLocalUtility.m(this.avatarScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.avatarAlpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.textColumnOffsetY, CameraState$Type$EnumUnboxingLocalUtility.m(this.textColumnBaseOffsetY, CameraState$Type$EnumUnboxingLocalUtility.m(this.subtitleOffsetY, CameraState$Type$EnumUnboxingLocalUtility.m(this.subtitleAlpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.titleRevealWidth, CameraState$Type$EnumUnboxingLocalUtility.m(this.titleWidth, CameraState$Type$EnumUnboxingLocalUtility.m(this.titleOffsetY, Float.hashCode(this.titleAlpha) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.titleOffsetY);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.titleWidth);
        String m1038toStringimpl3 = Dp.m1038toStringimpl(this.titleRevealWidth);
        String m1038toStringimpl4 = Dp.m1038toStringimpl(this.subtitleOffsetY);
        String m1038toStringimpl5 = Dp.m1038toStringimpl(this.textColumnBaseOffsetY);
        String m1038toStringimpl6 = Dp.m1038toStringimpl(this.textColumnOffsetY);
        String m1038toStringimpl7 = Dp.m1038toStringimpl(this.avatarOffsetX);
        StringBuilder sb = new StringBuilder("CheckedInHeaderAnimationValues(titleAlpha=");
        sb.append(this.titleAlpha);
        sb.append(", titleOffsetY=");
        sb.append(m1038toStringimpl);
        sb.append(", titleWidth=");
        Boxes$$ExternalSyntheticOutline1.m(sb, m1038toStringimpl2, ", titleRevealWidth=", m1038toStringimpl3, ", subtitleAlpha=");
        sb.append(this.subtitleAlpha);
        sb.append(", subtitleOffsetY=");
        sb.append(m1038toStringimpl4);
        sb.append(", textColumnBaseOffsetY=");
        Boxes$$ExternalSyntheticOutline1.m(sb, m1038toStringimpl5, ", textColumnOffsetY=", m1038toStringimpl6, ", avatarAlpha=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.avatarAlpha, ", avatarScale=", this.avatarScale, ", avatarOffsetX=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m1038toStringimpl7, ")");
    }
}
