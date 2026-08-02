package com.squareup.cash.card.spendinginsights.backend.api.model;

import com.squareup.protos.cash.ui.Color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ColoredText {
    public final Color color;
    public final String text;

    public ColoredText(Color color, String str) {
        str.getClass();
        color.getClass();
        this.text = str;
        this.color = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColoredText)) {
            return false;
        }
        ColoredText coloredText = (ColoredText) obj;
        return Intrinsics.areEqual(this.text, coloredText.text) && Intrinsics.areEqual(this.color, coloredText.color);
    }

    public final int hashCode() {
        return this.color.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "ColoredText(text=" + this.text + ", color=" + this.color + ")";
    }
}
