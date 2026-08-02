package com.squareup.cash.arcade.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes5.dex */
public final class CopyCodeColors {
    public final long copyIconColor;
    public final long leadingIconColor;
    public final long textColorBody;
    public final long textColorLabel;

    public CopyCodeColors(long j, long j2, long j3, long j4) {
        this.textColorLabel = j;
        this.textColorBody = j2;
        this.copyIconColor = j3;
        this.leadingIconColor = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyCodeColors)) {
            return false;
        }
        CopyCodeColors copyCodeColors = (CopyCodeColors) obj;
        return Color.m676equalsimpl0(this.textColorLabel, copyCodeColors.textColorLabel) && Color.m676equalsimpl0(this.textColorBody, copyCodeColors.textColorBody) && Color.m676equalsimpl0(this.copyIconColor, copyCodeColors.copyIconColor) && Color.m676equalsimpl0(this.leadingIconColor, copyCodeColors.leadingIconColor);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.leadingIconColor) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.textColorLabel) * 31, 31, this.textColorBody), 31, this.copyIconColor);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.textColorLabel);
        String m682toStringimpl2 = Color.m682toStringimpl(this.textColorBody);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CopyCodeColors(textColorLabel=", m682toStringimpl, ", textColorBody=", m682toStringimpl2, ", copyIconColor="), Color.m682toStringimpl(this.copyIconColor), ", leadingIconColor=", Color.m682toStringimpl(this.leadingIconColor), ")");
    }
}
