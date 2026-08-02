package com.mikepenz.markdown.model;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class DefaultMarkdownDimens {
    public final float codeBackgroundCornerSize;
    public final float tableCellPadding;
    public final float tableCornerSize;

    public DefaultMarkdownDimens(float f, float f2, float f3) {
        this.codeBackgroundCornerSize = f;
        this.tableCellPadding = f2;
        this.tableCornerSize = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultMarkdownDimens)) {
            return false;
        }
        DefaultMarkdownDimens defaultMarkdownDimens = (DefaultMarkdownDimens) obj;
        return Dp.m1037equalsimpl0(1.0f, 1.0f) && Dp.m1037equalsimpl0(this.codeBackgroundCornerSize, defaultMarkdownDimens.codeBackgroundCornerSize) && Dp.m1037equalsimpl0(2.0f, 2.0f) && Dp.m1037equalsimpl0(Float.NaN, Float.NaN) && Dp.m1037equalsimpl0(160.0f, 160.0f) && Dp.m1037equalsimpl0(this.tableCellPadding, defaultMarkdownDimens.tableCellPadding) && Dp.m1037equalsimpl0(this.tableCornerSize, defaultMarkdownDimens.tableCornerSize);
    }

    public final int hashCode() {
        return Float.hashCode(this.tableCornerSize) + CameraState$Type$EnumUnboxingLocalUtility.m(this.tableCellPadding, CameraState$Type$EnumUnboxingLocalUtility.m(160.0f, CameraState$Type$EnumUnboxingLocalUtility.m(Float.NaN, CameraState$Type$EnumUnboxingLocalUtility.m(2.0f, CameraState$Type$EnumUnboxingLocalUtility.m(this.codeBackgroundCornerSize, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(1.0f);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.codeBackgroundCornerSize);
        String m1038toStringimpl3 = Dp.m1038toStringimpl(2.0f);
        String m1038toStringimpl4 = Dp.m1038toStringimpl(Float.NaN);
        String m1038toStringimpl5 = Dp.m1038toStringimpl(160.0f);
        String m1038toStringimpl6 = Dp.m1038toStringimpl(this.tableCellPadding);
        String m1038toStringimpl7 = Dp.m1038toStringimpl(this.tableCornerSize);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DefaultMarkdownDimens(dividerThickness=", m1038toStringimpl, ", codeBackgroundCornerSize=", m1038toStringimpl2, ", blockQuoteThickness=");
        Boxes$$ExternalSyntheticOutline1.m(m, m1038toStringimpl3, ", tableMaxWidth=", m1038toStringimpl4, ", tableCellWidth=");
        Boxes$$ExternalSyntheticOutline1.m(m, m1038toStringimpl5, ", tableCellPadding=", m1038toStringimpl6, ", tableCornerSize=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m1038toStringimpl7, ")");
    }
}
