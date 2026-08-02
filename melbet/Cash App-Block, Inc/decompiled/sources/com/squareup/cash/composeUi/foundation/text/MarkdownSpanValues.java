package com.squareup.cash.composeUi.foundation.text;

import androidx.compose.ui.text.SpanStyle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class MarkdownSpanValues {
    public static final MarkdownSpanValues Default = new MarkdownSpanValues((SpanStyle) null, 3);
    public final SpanStyle boldSpan;
    public final SpanStyle linkSpan;

    public /* synthetic */ MarkdownSpanValues(SpanStyle spanStyle, int i) {
        this((i & 1) != 0 ? null : spanStyle, (SpanStyle) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarkdownSpanValues)) {
            return false;
        }
        MarkdownSpanValues markdownSpanValues = (MarkdownSpanValues) obj;
        return Intrinsics.areEqual(this.linkSpan, markdownSpanValues.linkSpan) && Intrinsics.areEqual(this.boldSpan, markdownSpanValues.boldSpan);
    }

    public final int hashCode() {
        SpanStyle spanStyle = this.linkSpan;
        int hashCode = (spanStyle == null ? 0 : spanStyle.hashCode()) * 31;
        SpanStyle spanStyle2 = this.boldSpan;
        return hashCode + (spanStyle2 != null ? spanStyle2.hashCode() : 0);
    }

    public final String toString() {
        return "MarkdownSpanValues(linkSpan=" + this.linkSpan + ", boldSpan=" + this.boldSpan + ")";
    }

    public MarkdownSpanValues(SpanStyle spanStyle, SpanStyle spanStyle2) {
        this.linkSpan = spanStyle;
        this.boldSpan = spanStyle2;
    }
}
