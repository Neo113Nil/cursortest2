package com.squareup.cash.moneybot.genie;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ResolvedStyle {
    public static final ResolvedStyle Empty = new ResolvedStyle(null, null, null);
    public final Color contentColor;
    public final TextStyle textStyle;
    public final Color tint;

    public ResolvedStyle(TextStyle textStyle, Color color, Color color2) {
        this.textStyle = textStyle;
        this.contentColor = color;
        this.tint = color2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedStyle)) {
            return false;
        }
        ResolvedStyle resolvedStyle = (ResolvedStyle) obj;
        return Intrinsics.areEqual(this.textStyle, resolvedStyle.textStyle) && Intrinsics.areEqual(this.contentColor, resolvedStyle.contentColor) && Intrinsics.areEqual(this.tint, resolvedStyle.tint);
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        TextStyle textStyle = this.textStyle;
        int hashCode2 = (textStyle == null ? 0 : textStyle.hashCode()) * 31;
        Color color = this.contentColor;
        if (color == null) {
            hashCode = 0;
        } else {
            long j = color.value;
            ULong.Companion companion = ULong.Companion;
            hashCode = Long.hashCode(j);
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Color color2 = this.tint;
        if (color2 != null) {
            long j2 = color2.value;
            ULong.Companion companion2 = ULong.Companion;
            i = Long.hashCode(j2);
        }
        return i2 + i;
    }

    public final String toString() {
        return "ResolvedStyle(textStyle=" + this.textStyle + ", contentColor=" + this.contentColor + ", tint=" + this.tint + ")";
    }
}
