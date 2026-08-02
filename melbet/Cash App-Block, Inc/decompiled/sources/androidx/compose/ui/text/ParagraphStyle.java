package androidx.compose.ui.text;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ParagraphStyle implements AnnotatedString.Annotation {
    public final int hyphens;
    public final int lineBreak;
    public final long lineHeight;
    public final LineHeightStyle lineHeightStyle;
    public final PlatformParagraphStyle platformStyle;
    public final int textAlign;
    public final int textDirection;
    public final TextIndent textIndent;
    public final TextMotion textMotion;

    public ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this.textAlign = i;
        this.textDirection = i2;
        this.lineHeight = j;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i3;
        this.hyphens = i4;
        this.textMotion = textMotion;
        if (TextUnit.m1057equalsimpl0(j, TextUnit.Unspecified) || TextUnit.m1059getValueimpl(j) >= RecyclerView.DECELERATION_RATE) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("lineHeight can't be negative (" + TextUnit.m1059getValueimpl(j) + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        if (this.textAlign != paragraphStyle.textAlign || this.textDirection != paragraphStyle.textDirection || !TextUnit.m1057equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) || !Intrinsics.areEqual(this.textIndent, paragraphStyle.textIndent) || !Intrinsics.areEqual(this.platformStyle, paragraphStyle.platformStyle) || !Intrinsics.areEqual(this.lineHeightStyle, paragraphStyle.lineHeightStyle)) {
            return false;
        }
        int i = paragraphStyle.lineBreak;
        int i2 = LineBreak.Simple;
        return this.lineBreak == i && this.hyphens == paragraphStyle.hyphens && Intrinsics.areEqual(this.textMotion, paragraphStyle.textMotion);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.textDirection, Integer.hashCode(this.textAlign) * 31, 31);
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(m, 31, this.lineHeight);
        TextIndent textIndent = this.textIndent;
        int hashCode = (m2 + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int hashCode2 = (hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int hashCode3 = (hashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31;
        int i = LineBreak.Simple;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.hyphens, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.lineBreak, hashCode3, 31), 31);
        TextMotion textMotion = this.textMotion;
        return m3 + (textMotion != null ? textMotion.hashCode() : 0);
    }

    public final ParagraphStyle merge(ParagraphStyle paragraphStyle) {
        return paragraphStyle == null ? this : ParagraphStyleKt.m969fastMergej5T8yCg(this, paragraphStyle.textAlign, paragraphStyle.textDirection, paragraphStyle.lineHeight, paragraphStyle.textIndent, paragraphStyle.platformStyle, paragraphStyle.lineHeightStyle, paragraphStyle.lineBreak, paragraphStyle.hyphens, paragraphStyle.textMotion);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m1013toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m1014toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m1061toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m1010toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m1008toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ParagraphStyle(int i, TextIndent textIndent, int i2) {
        this(r1, 0, r3, textIndent, null, null, 0, 0, null);
        int i3 = (i2 & 1) != 0 ? 0 : i;
        long j = TextUnit.Unspecified;
        textIndent = (i2 & 8) != 0 ? null : textIndent;
        int i4 = LineBreak.Simple;
    }
}
