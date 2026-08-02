package androidx.compose.ui.text;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TextLayoutInput {
    public final long constraints;
    public final Density density;
    public final FontFamilyResolverImpl fontFamilyResolver;
    public final LayoutDirection layoutDirection;
    public final int maxLines;
    public final int overflow;
    public final List placeholders;
    public final boolean softWrap;
    public final TextStyle style;
    public final AnnotatedString text;

    public TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamilyResolverImpl fontFamilyResolverImpl, long j) {
        this.text = annotatedString;
        this.style = textStyle;
        this.placeholders = list;
        this.maxLines = i;
        this.softWrap = z;
        this.overflow = i2;
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = fontFamilyResolverImpl;
        this.constraints = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        return Intrinsics.areEqual(this.text, textLayoutInput.text) && Intrinsics.areEqual(this.style, textLayoutInput.style) && Intrinsics.areEqual(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && this.overflow == textLayoutInput.overflow && Intrinsics.areEqual(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && Intrinsics.areEqual(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && Constraints.m1019equalsimpl0(this.constraints, textLayoutInput.constraints);
    }

    public final int hashCode() {
        return Long.hashCode(this.constraints) + ((this.fontFamilyResolver.hashCode() + ((this.layoutDirection.hashCode() + ((this.density.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.overflow, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline1.m(this.style, this.text.hashCode() * 31, 31), 31, this.placeholders) + this.maxLines) * 31, 31, this.softWrap), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) TextOverflow.m1016toStringimpl(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m1029toStringimpl(this.constraints)) + ')';
    }
}
