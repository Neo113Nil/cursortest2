package com.squareup.cash.mooncake.compose_ui.components;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ButtonSize {
    public final float horizontal;
    public final float minHeight;
    public final TextStyle textStyle;
    public final float vertical;

    public ButtonSize(float f, float f2, TextStyle textStyle, float f3) {
        textStyle.getClass();
        this.horizontal = f;
        this.vertical = f2;
        this.textStyle = textStyle;
        this.minHeight = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonSize)) {
            return false;
        }
        ButtonSize buttonSize = (ButtonSize) obj;
        return Dp.m1037equalsimpl0(this.horizontal, buttonSize.horizontal) && Dp.m1037equalsimpl0(this.vertical, buttonSize.vertical) && Intrinsics.areEqual(this.textStyle, buttonSize.textStyle) && Dp.m1037equalsimpl0(this.minHeight, buttonSize.minHeight);
    }

    public final int hashCode() {
        return Float.hashCode(this.minHeight) + Recorder$$ExternalSyntheticOutline1.m(this.textStyle, CameraState$Type$EnumUnboxingLocalUtility.m(this.vertical, Float.hashCode(this.horizontal) * 31, 31), 31);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.horizontal);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.vertical);
        String m1038toStringimpl3 = Dp.m1038toStringimpl(this.minHeight);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ButtonSize(horizontal=", m1038toStringimpl, ", vertical=", m1038toStringimpl2, ", textStyle=");
        m.append(this.textStyle);
        m.append(", minHeight=");
        m.append(m1038toStringimpl3);
        m.append(")");
        return m.toString();
    }
}
