package com.squareup.cash.arcade.components.timeline;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class IntRangeComparator implements Comparator {
    public static final IntRangeComparator INSTANCE = new IntRangeComparator();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        IntRange intRange = (IntRange) obj;
        IntRange intRange2 = (IntRange) obj2;
        intRange.getClass();
        intRange2.getClass();
        int compare = Intrinsics.compare(intRange.first, intRange2.first);
        return compare == 0 ? Intrinsics.compare(intRange.last, intRange2.last) : compare;
    }
}
