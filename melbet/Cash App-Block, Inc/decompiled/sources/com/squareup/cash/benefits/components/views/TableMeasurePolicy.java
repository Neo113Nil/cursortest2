package com.squareup.cash.benefits.components.views;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes5.dex */
public final class TableMeasurePolicy implements MultiContentMeasurePolicy {
    public final int columns;

    public TableMeasurePolicy(int i) {
        this.columns = i;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo263measure3p2s80s(MeasureScope measureScope, List list, long j) {
        measureScope.getClass();
        int roundToInt = MathKt__MathJVMKt.roundToInt(Constraints.m1025getMaxWidthimpl(j) * 0.25f);
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
        IntRange until = RangesKt___RangesKt.until(1, this.columns);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        IntProgressionIterator it = until.iterator();
        while (it.hasNext) {
            int nextInt = it.nextInt();
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            int maxIntrinsicWidth = ((Measurable) ((List) it2.next()).get(nextInt)).maxIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j));
            if (maxIntrinsicWidth < roundToInt) {
                maxIntrinsicWidth = roundToInt;
            }
            while (it2.hasNext()) {
                int maxIntrinsicWidth2 = ((Measurable) ((List) it2.next()).get(nextInt)).maxIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j));
                if (maxIntrinsicWidth2 < roundToInt) {
                    maxIntrinsicWidth2 = roundToInt;
                }
                if (maxIntrinsicWidth < maxIntrinsicWidth2) {
                    maxIntrinsicWidth = maxIntrinsicWidth2;
                }
            }
            arrayList.add(Integer.valueOf(maxIntrinsicWidth));
        }
        mutableListOf.addAll(arrayList);
        mutableListOf.set(0, Integer.valueOf(Constraints.m1025getMaxWidthimpl(j) - CollectionsKt.sumOfInt(mutableListOf)));
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((List) it3.next()).iterator();
            if (!it4.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            int maxIntrinsicHeight = ((Measurable) it4.next()).maxIntrinsicHeight(((Number) mutableListOf.get(0)).intValue());
            while (it4.hasNext()) {
                int maxIntrinsicHeight2 = ((Measurable) it4.next()).maxIntrinsicHeight(((Number) mutableListOf.get(0)).intValue());
                if (maxIntrinsicHeight < maxIntrinsicHeight2) {
                    maxIntrinsicHeight = maxIntrinsicHeight2;
                }
            }
            arrayList2.add(Integer.valueOf(maxIntrinsicHeight));
        }
        return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), CollectionsKt.sumOfInt(arrayList2), new CaptureCheckFaceKt$$ExternalSyntheticLambda11(1, (ArrayList) list, mutableListOf, arrayList2));
    }
}
