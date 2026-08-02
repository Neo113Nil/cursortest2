package com.squareup.cash.portfolio.graphs;

import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class RealInvestingGraphSmoother {
    public final CoroutineContext computationDispatcher;

    public RealInvestingGraphSmoother(CoroutineContext coroutineContext) {
        this.computationDispatcher = coroutineContext;
    }

    public static ArrayList smoothPointsBlocking(List list) {
        list.getClass();
        int size = ((int) (list.size() * 0.055f)) / 2;
        List list2 = list;
        int i = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            InvestingGraphContentModel.Point point = (InvestingGraphContentModel.Point) obj;
            int i5 = 1;
            IntRange intRange = new IntRange(i3 - size, i3 + size, 1);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, i));
            IntProgressionIterator it = intRange.iterator();
            double d = 0.0d;
            while (it.hasNext) {
                int clamp = MathUtils.clamp(it.nextInt(), i2, list.size() - i5);
                double pow = Math.pow((size - Math.abs(i3 - clamp)) + i5, 1.0d);
                d += pow;
                arrayList2.add(Double.valueOf(((InvestingGraphContentModel.Point) list.get(clamp)).getY() * pow));
                i2 = 0;
                i5 = 1;
            }
            arrayList.add(InvestingGraphContentModel.Point.copy$default(point, RecyclerView.DECELERATION_RATE, (float) (CollectionsKt.sumOfDouble(arrayList2) / d), 29));
            i3 = i4;
            i = 10;
            i2 = 0;
        }
        return arrayList;
    }
}
