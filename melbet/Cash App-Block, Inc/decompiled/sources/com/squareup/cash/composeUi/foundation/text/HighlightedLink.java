package com.squareup.cash.composeUi.foundation.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class HighlightedLink {
    public final long color;
    public final AnnotatedString.Range link;

    public HighlightedLink(AnnotatedString.Range range, long j) {
        range.getClass();
        this.link = range;
        this.color = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightedLink)) {
            return false;
        }
        HighlightedLink highlightedLink = (HighlightedLink) obj;
        return Intrinsics.areEqual(this.link, highlightedLink.link) && Color.m676equalsimpl0(this.color, highlightedLink.color);
    }

    public final int hashCode() {
        int hashCode = this.link.hashCode() * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.color) + hashCode;
    }

    public final String toString() {
        return "HighlightedLink(link=" + this.link + ", color=" + Color.m682toStringimpl(this.color) + ")";
    }
}
