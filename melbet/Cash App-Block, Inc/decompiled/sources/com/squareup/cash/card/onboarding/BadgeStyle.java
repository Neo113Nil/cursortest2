package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BadgeStyle {
    public final Color backgroundColor;
    public final Color borderColor;
    public final String text;
    public final long textColor;

    public BadgeStyle(String str, long j, Color color, Color color2) {
        str.getClass();
        this.text = str;
        this.textColor = j;
        this.backgroundColor = color;
        this.borderColor = color2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeStyle)) {
            return false;
        }
        BadgeStyle badgeStyle = (BadgeStyle) obj;
        return Intrinsics.areEqual(this.text, badgeStyle.text) && Color.m676equalsimpl0(this.textColor, badgeStyle.textColor) && Intrinsics.areEqual(this.backgroundColor, badgeStyle.backgroundColor) && Intrinsics.areEqual(this.borderColor, badgeStyle.borderColor);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        int m = Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.textColor);
        Color color = this.backgroundColor;
        int hashCode2 = (m + (color == null ? 0 : Long.hashCode(color.value))) * 31;
        Color color2 = this.borderColor;
        return hashCode2 + (color2 != null ? Long.hashCode(color2.value) : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BadgeStyle(text=", this.text, ", textColor=", Color.m682toStringimpl(this.textColor), ", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(", borderColor=");
        m.append(this.borderColor);
        m.append(")");
        return m.toString();
    }
}
