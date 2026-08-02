package app.cash.local.views.cart;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class CartBannerStyle {
    public final long backgroundColor;
    public final float horizontalPadding;
    public final long textAndIconColor;
    public final float verticalPadding;

    public CartBannerStyle(float f, float f2, long j, long j2) {
        this.horizontalPadding = f;
        this.verticalPadding = f2;
        this.backgroundColor = j;
        this.textAndIconColor = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartBannerStyle)) {
            return false;
        }
        CartBannerStyle cartBannerStyle = (CartBannerStyle) obj;
        return Dp.m1037equalsimpl0(this.horizontalPadding, cartBannerStyle.horizontalPadding) && Dp.m1037equalsimpl0(this.verticalPadding, cartBannerStyle.verticalPadding) && Color.m676equalsimpl0(this.backgroundColor, cartBannerStyle.backgroundColor) && Color.m676equalsimpl0(this.textAndIconColor, cartBannerStyle.textAndIconColor);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.verticalPadding, Float.hashCode(this.horizontalPadding) * 31, 31);
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.textAndIconColor) + Recorder$$ExternalSyntheticOutline2.m(m, 31, this.backgroundColor);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.horizontalPadding);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.verticalPadding);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CartBannerStyle(horizontalPadding=", m1038toStringimpl, ", verticalPadding=", m1038toStringimpl2, ", backgroundColor="), Color.m682toStringimpl(this.backgroundColor), ", textAndIconColor=", Color.m682toStringimpl(this.textAndIconColor), ")");
    }
}
