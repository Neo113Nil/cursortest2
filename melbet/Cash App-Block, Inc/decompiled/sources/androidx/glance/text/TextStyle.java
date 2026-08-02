package androidx.glance.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.glance.unit.FixedColorProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class TextStyle {
    public final FixedColorProvider color;
    public final TextUnit fontSize;
    public final FontWeight fontWeight;
    public final TextAlign textAlign;

    public TextStyle(FixedColorProvider fixedColorProvider, TextUnit textUnit, FontWeight fontWeight, TextAlign textAlign, int i) {
        textUnit = (i & 2) != 0 ? null : textUnit;
        fontWeight = (i & 4) != 0 ? null : fontWeight;
        textAlign = (i & 16) != 0 ? null : textAlign;
        this.color = fixedColorProvider;
        this.fontSize = textUnit;
        this.fontWeight = fontWeight;
        this.textAlign = textAlign;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return Intrinsics.areEqual(this.color, textStyle.color) && Intrinsics.areEqual(this.fontSize, textStyle.fontSize) && Intrinsics.areEqual(this.fontWeight, textStyle.fontWeight) && Intrinsics.areEqual(this.textAlign, textStyle.textAlign);
    }

    public final int hashCode() {
        int hashCode = this.color.hashCode() * 31;
        TextUnit textUnit = this.fontSize;
        return (((((hashCode + (textUnit != null ? Long.hashCode(textUnit.packedValue) : 0)) * 31) + (this.fontWeight != null ? Integer.hashCode(500) : 0)) * 29791) + (this.textAlign != null ? Integer.hashCode(3) : 0)) * 31;
    }

    public final String toString() {
        return "TextStyle(color=" + this.color + ", fontSize=" + this.fontSize + ", fontWeight=" + this.fontWeight + ", fontStyle=null, textDecoration=null, textAlign=" + this.textAlign + ", fontFamily=null)";
    }
}
