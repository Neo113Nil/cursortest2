package com.squareup.cash.charting.components;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* renamed from: com.squareup.cash.charting.components.ChartWithYAxisKt$calculateVerticalPadding-wH6b6FI$$inlined$sortedBy$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ChartWithYAxisKt$calculateVerticalPaddingwH6b6FI$$inlined$sortedBy$1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((AxisPlacement) obj).yOffset), Float.valueOf(((AxisPlacement) obj2).yOffset));
    }
}
