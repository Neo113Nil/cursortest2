package androidx.compose.ui.text;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;

/* loaded from: classes3.dex */
public final class Placeholder {
    public final long height;
    public final int placeholderVerticalAlign;
    public final long width;

    public Placeholder(int i, long j, long j2) {
        this.width = j;
        this.height = j2;
        this.placeholderVerticalAlign = i;
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        if ((j & 1095216660480L) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if ((1095216660480L & j2) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return TextUnit.m1057equalsimpl0(this.width, placeholder.width) && TextUnit.m1057equalsimpl0(this.height, placeholder.height) && this.placeholderVerticalAlign == placeholder.placeholderVerticalAlign;
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m970getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m971getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m972getWidthXSAIIZE() {
        return this.width;
    }

    public final int hashCode() {
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        return Integer.hashCode(this.placeholderVerticalAlign) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.width) * 31, 31, this.height);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m1061toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m1061toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) TextPainterKt.m983toStringimpl(this.placeholderVerticalAlign)) + ')';
    }
}
