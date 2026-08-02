package com.squareup.cash.arcade.components.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes.dex */
public final class InputColors {
    public final long backgroundDefault;
    public final long borderActive;
    public final long borderColor;
    public final long helperIcon;
    public final long helperTextColor;
    public final long labelColor;
    public final long leadingIcon;
    public final long textColor;
    public final long trailingIcon;

    public InputColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.borderColor = j;
        this.borderActive = j2;
        this.textColor = j3;
        this.helperTextColor = j4;
        this.labelColor = j5;
        this.leadingIcon = j6;
        this.trailingIcon = j7;
        this.helperIcon = j8;
        this.backgroundDefault = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputColors)) {
            return false;
        }
        InputColors inputColors = (InputColors) obj;
        return Color.m676equalsimpl0(this.borderColor, inputColors.borderColor) && Color.m676equalsimpl0(this.borderActive, inputColors.borderActive) && Color.m676equalsimpl0(this.textColor, inputColors.textColor) && Color.m676equalsimpl0(this.helperTextColor, inputColors.helperTextColor) && Color.m676equalsimpl0(this.labelColor, inputColors.labelColor) && Color.m676equalsimpl0(this.leadingIcon, inputColors.leadingIcon) && Color.m676equalsimpl0(this.trailingIcon, inputColors.trailingIcon) && Color.m676equalsimpl0(this.helperIcon, inputColors.helperIcon) && Color.m676equalsimpl0(this.backgroundDefault, inputColors.backgroundDefault);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.backgroundDefault) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.borderColor) * 31, 31, this.borderActive), 31, this.textColor), 31, this.helperTextColor), 31, this.labelColor), 31, this.leadingIcon), 31, this.trailingIcon), 31, this.helperIcon);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.borderColor);
        String m682toStringimpl2 = Color.m682toStringimpl(this.borderActive);
        String m682toStringimpl3 = Color.m682toStringimpl(this.textColor);
        String m682toStringimpl4 = Color.m682toStringimpl(this.helperTextColor);
        String m682toStringimpl5 = Color.m682toStringimpl(this.labelColor);
        String m682toStringimpl6 = Color.m682toStringimpl(this.leadingIcon);
        String m682toStringimpl7 = Color.m682toStringimpl(this.trailingIcon);
        String m682toStringimpl8 = Color.m682toStringimpl(this.helperIcon);
        String m682toStringimpl9 = Color.m682toStringimpl(this.backgroundDefault);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InputColors(borderColor=", m682toStringimpl, ", borderActive=", m682toStringimpl2, ", textColor=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", helperTextColor=", m682toStringimpl4, ", labelColor=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl5, ", leadingIcon=", m682toStringimpl6, ", trailingIcon=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl7, ", helperIcon=", m682toStringimpl8, ", backgroundDefault=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl9, ")");
    }
}
