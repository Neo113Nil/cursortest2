package com.squareup.cash.offers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FittedTextState {
    public final int maxLines;
    public final long minFontSize;
    public final int overflow;
    public final TextStyle style;
    public final String text;

    public FittedTextState(String str, TextStyle textStyle, int i, long j, int i2) {
        str.getClass();
        this.text = str;
        this.style = textStyle;
        this.maxLines = i;
        this.minFontSize = j;
        this.overflow = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FittedTextState)) {
            return false;
        }
        FittedTextState fittedTextState = (FittedTextState) obj;
        return Intrinsics.areEqual(this.text, fittedTextState.text) && this.style.equals(fittedTextState.style) && this.maxLines == fittedTextState.maxLines && TextUnit.m1057equalsimpl0(this.minFontSize, fittedTextState.minFontSize) && this.overflow == fittedTextState.overflow;
    }

    public final int hashCode() {
        return Integer.hashCode(this.overflow) + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxLines, Recorder$$ExternalSyntheticOutline1.m(this.style, this.text.hashCode() * 31, 31), 31), 31, this.minFontSize);
    }

    public final String toString() {
        String m1061toStringimpl = TextUnit.m1061toStringimpl(this.minFontSize);
        String m1016toStringimpl = TextOverflow.m1016toStringimpl(this.overflow);
        StringBuilder sb = new StringBuilder("FittedTextState(text=");
        sb.append(this.text);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", maxLines=");
        sb.append(this.maxLines);
        sb.append(", minFontSize=");
        sb.append(m1061toStringimpl);
        sb.append(", overflow=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m1016toStringimpl, ")");
    }
}
