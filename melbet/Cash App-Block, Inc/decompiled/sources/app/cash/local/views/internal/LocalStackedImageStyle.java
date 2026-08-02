package app.cash.local.views.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class LocalStackedImageStyle {
    public final boolean alignToBounds;
    public final long imageBackgroundColor;
    public final long imageBorderColor;
    public final float imageCornerRadius;
    public final float imageSize;
    public final float step;

    public LocalStackedImageStyle(float f, float f2, long j, float f3, long j2, boolean z) {
        this.imageSize = f;
        this.step = f2;
        this.imageBackgroundColor = j;
        this.imageCornerRadius = f3;
        this.imageBorderColor = j2;
        this.alignToBounds = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalStackedImageStyle)) {
            return false;
        }
        LocalStackedImageStyle localStackedImageStyle = (LocalStackedImageStyle) obj;
        return Dp.m1037equalsimpl0(this.imageSize, localStackedImageStyle.imageSize) && Dp.m1037equalsimpl0(this.step, localStackedImageStyle.step) && Color.m676equalsimpl0(this.imageBackgroundColor, localStackedImageStyle.imageBackgroundColor) && Dp.m1037equalsimpl0(this.imageCornerRadius, localStackedImageStyle.imageCornerRadius) && Dp.m1037equalsimpl0(1.0f, 1.0f) && Color.m676equalsimpl0(this.imageBorderColor, localStackedImageStyle.imageBorderColor) && this.alignToBounds == localStackedImageStyle.alignToBounds;
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.step, Float.hashCode(this.imageSize) * 31, 31);
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Boolean.hashCode(this.alignToBounds) + Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, CameraState$Type$EnumUnboxingLocalUtility.m(this.imageCornerRadius, Recorder$$ExternalSyntheticOutline2.m(m, 31, this.imageBackgroundColor), 31), 31), 31, this.imageBorderColor);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.imageSize);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.step);
        String m682toStringimpl = Color.m682toStringimpl(this.imageBackgroundColor);
        String m1038toStringimpl3 = Dp.m1038toStringimpl(this.imageCornerRadius);
        String m1038toStringimpl4 = Dp.m1038toStringimpl(1.0f);
        String m682toStringimpl2 = Color.m682toStringimpl(this.imageBorderColor);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalStackedImageStyle(imageSize=", m1038toStringimpl, ", step=", m1038toStringimpl2, ", imageBackgroundColor=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl, ", imageCornerRadius=", m1038toStringimpl3, ", imageBorderWidth=");
        Boxes$$ExternalSyntheticOutline1.m(m, m1038toStringimpl4, ", imageBorderColor=", m682toStringimpl2, ", alignToBounds=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.alignToBounds, ")");
    }
}
