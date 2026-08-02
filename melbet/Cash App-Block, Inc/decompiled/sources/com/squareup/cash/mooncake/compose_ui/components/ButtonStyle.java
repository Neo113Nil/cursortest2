package com.squareup.cash.mooncake.compose_ui.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Pair;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ButtonStyle {
    public final long backgroundColor;
    public final boolean hasRoundedCorners;
    public final boolean resizesOnTap;
    public final Pair strokeColor;
    public final long textColor;

    public ButtonStyle(long j, long j2, Pair pair, boolean z, int i) {
        pair = (i & 4) != 0 ? null : pair;
        boolean z2 = (i & 8) != 0;
        this.textColor = j;
        this.backgroundColor = j2;
        this.strokeColor = pair;
        this.resizesOnTap = z2;
        this.hasRoundedCorners = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonStyle)) {
            return false;
        }
        ButtonStyle buttonStyle = (ButtonStyle) obj;
        return Color.m676equalsimpl0(this.textColor, buttonStyle.textColor) && Color.m676equalsimpl0(this.backgroundColor, buttonStyle.backgroundColor) && Intrinsics.areEqual(this.strokeColor, buttonStyle.strokeColor) && this.resizesOnTap == buttonStyle.resizesOnTap && this.hasRoundedCorners == buttonStyle.hasRoundedCorners;
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        int m = Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.textColor) * 31, 31, this.backgroundColor);
        Pair pair = this.strokeColor;
        return Boolean.hashCode(this.hasRoundedCorners) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (pair == null ? 0 : pair.hashCode())) * 31, 31, this.resizesOnTap);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ButtonStyle(textColor=", Color.m682toStringimpl(this.textColor), ", backgroundColor=", Color.m682toStringimpl(this.backgroundColor), ", strokeColor=");
        m.append(this.strokeColor);
        m.append(", resizesOnTap=");
        m.append(this.resizesOnTap);
        m.append(", hasRoundedCorners=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.hasRoundedCorners, ")");
    }
}
