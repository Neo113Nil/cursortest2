package androidx.compose.ui.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PlatformTextStyle {
    public final PlatformParagraphStyle paragraphStyle;
    public final PlatformSpanStyle spanStyle;

    public PlatformTextStyle(boolean z) {
        this(null, new PlatformParagraphStyle(z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        return Intrinsics.areEqual(this.paragraphStyle, platformTextStyle.paragraphStyle) && Intrinsics.areEqual(this.spanStyle, platformTextStyle.spanStyle);
    }

    public final int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int hashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphStyle;
        return hashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphStyle + ')';
    }

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphStyle = platformParagraphStyle;
    }
}
