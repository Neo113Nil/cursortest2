package com.squareup.cash.arcade.components.input;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes5.dex */
public final class InputChipColors {
    public final long borderActive;
    public final long borderColor;
    public final long iconColor;
    public final long textColor;

    public InputChipColors(long j, long j2, long j3, long j4) {
        this.borderColor = j;
        this.borderActive = j2;
        this.textColor = j3;
        this.iconColor = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputChipColors)) {
            return false;
        }
        InputChipColors inputChipColors = (InputChipColors) obj;
        return Color.m676equalsimpl0(this.borderColor, inputChipColors.borderColor) && Color.m676equalsimpl0(this.borderActive, inputChipColors.borderActive) && Color.m676equalsimpl0(this.textColor, inputChipColors.textColor) && Color.m676equalsimpl0(this.iconColor, inputChipColors.iconColor);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.iconColor) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.borderColor) * 31, 31, this.borderActive), 31, this.textColor);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.borderColor);
        String m682toStringimpl2 = Color.m682toStringimpl(this.borderActive);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InputChipColors(borderColor=", m682toStringimpl, ", borderActive=", m682toStringimpl2, ", textColor="), Color.m682toStringimpl(this.textColor), ", iconColor=", Color.m682toStringimpl(this.iconColor), ")");
    }
}
