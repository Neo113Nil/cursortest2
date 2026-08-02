package com.mikepenz.markdown.compose.extendedspans;

import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class ExtendedSpans {
    public List drawInstructions = EmptyList.INSTANCE;
    public final List painters;

    public ExtendedSpans(RoundedCornerSpanPainter... roundedCornerSpanPainterArr) {
        this.painters = ArraysKt___ArraysKt.toList(roundedCornerSpanPainterArr);
    }
}
