package com.squareup.cash.portfolio.graphs;

import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda10;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.cash.portfolios.BalanceTick;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.LongRange;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class RealInvestingGraphCalculator {
    public final AndroidClock clock;
    public final AndroidDateFormatManager dateFormatManager;
    public final BooleanPreference shownFirstPurchase;
    public final AndroidStringManager stringManager;

    public RealInvestingGraphCalculator(AndroidStringManager androidStringManager, AndroidClock androidClock, AndroidDateFormatManager androidDateFormatManager, RealInvestingGraphSmoother realInvestingGraphSmoother, BooleanPreference booleanPreference) {
        this.stringManager = androidStringManager;
        this.clock = androidClock;
        this.dateFormatManager = androidDateFormatManager;
        this.shownFirstPurchase = booleanPreference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GraphPresenterData presenterDataFor(GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse, HistoricalRange historicalRange, TextGeometricTransformKt textGeometricTransformKt, boolean z, Float f) {
        SparseArrayCompat sparseArrayCompat;
        LongRange longRange;
        Integer num;
        long j;
        long j2;
        Object obj;
        Object obj2;
        List list;
        long j3;
        boolean z2;
        getPortfoliosHistoricalDataResponse.getClass();
        historicalRange.getClass();
        textGeometricTransformKt.getClass();
        BalanceHistory balanceHistory = getPortfoliosHistoricalDataResponse.balance_history;
        Throwable th = null;
        if (balanceHistory == null) {
            return null;
        }
        Long l = balanceHistory.tick_frequency_ms;
        List list2 = balanceHistory.balance_ticks;
        if (list2.isEmpty()) {
            return new GraphPresenterData(new SparseArrayCompat((Object) null), HistoricalRange.DAY, new InvestingGraphContentModel.Loading(textGeometricTransformKt, 15), new LongRange(0L, 0L));
        }
        float size = list2.size() - 1.0f;
        SparseArrayCompat sparseArrayCompat2 = new SparseArrayCompat(list2.size());
        Long l2 = balanceHistory.end_time;
        l2.getClass();
        long longValue = l2.longValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(longValue);
        Long l3 = balanceHistory.start_time;
        l3.getClass();
        long millis2 = timeUnit.toMillis(l3.longValue());
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        List list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator it = list3.iterator();
        int i = 0;
        Long l4 = null;
        int i2 = 0;
        while (true) {
            Throwable th2 = th;
            if (!it.hasNext()) {
                List list4 = list3;
                long j4 = millis;
                Long l5 = l;
                List list5 = list2;
                long j5 = millis2;
                ref$ObjectRef.element = arrayList;
                if (historicalRange == HistoricalRange.DAY) {
                    Long l6 = ((BalanceTick) CollectionsKt.last(list5)).time_sec;
                    l6.getClass();
                    long millis3 = timeUnit.toMillis(l6.longValue());
                    Long l7 = ((BalanceTick) CollectionsKt.first(list5)).time_sec;
                    l7.getClass();
                    long millis4 = timeUnit.toMillis(l7.longValue());
                    Long l8 = ((BalanceTick) CollectionsKt.last(list5)).time_sec;
                    l8.getClass();
                    long longValue2 = l8.longValue();
                    Long l9 = ((BalanceTick) CollectionsKt.first(list5)).time_sec;
                    l9.getClass();
                    long longValue3 = longValue2 - l9.longValue();
                    boolean z3 = z && ((BalanceTick) CollectionsKt.first(list5)).display_text != null;
                    if (z3 || longValue3 / 60 < 30) {
                        ((BalanceTick) CollectionsKt.first(list5)).amount_cents.getClass();
                        j = millis3;
                        j2 = millis4;
                        long max = Math.max(100L, (long) (r2.longValue() * 0.01d));
                        obj = new LongRange(-max, max);
                    } else {
                        j = millis3;
                        j2 = millis4;
                        obj = th2;
                    }
                    l5.getClass();
                    size += (j4 - j) / l5.longValue();
                    if (z3) {
                        int longValue4 = (int) ((j2 - j5) / l5.longValue());
                        float f2 = longValue4;
                        size += f2;
                        sparseArrayCompat2 = new SparseArrayCompat(th2);
                        ArrayList arrayList2 = new ArrayList();
                        Integer[] numArr = {0};
                        if (longValue4 > 1) {
                            Integer valueOf = Integer.valueOf(longValue4 - 1);
                            Object[] copyOf = Arrays.copyOf(numArr, 2);
                            copyOf[1] = valueOf;
                            numArr = (Integer[]) copyOf;
                        }
                        int length = numArr.length;
                        int i3 = 0;
                        Object obj3 = obj;
                        while (i3 < length) {
                            int intValue = numArr[i3].intValue();
                            arrayList2.add(new InvestingGraphContentModel.Point(intValue, ((InvestingGraphContentModel.Point) CollectionsKt.first((List) ref$ObjectRef.element)).y, InvestingGraphContentModel.LineDashEffect.SOLID_GRAY, InvestingGraphContentModel.PointTreatment.NONE, new InvestingGraphContentModel.NonComparableStringProvider(new BottomSheet$$ExternalSyntheticLambda2(this, 7))));
                            sparseArrayCompat2.append(intValue, CollectionsKt.first(list5));
                            i3++;
                            obj3 = obj3;
                            longValue4 = longValue4;
                            f2 = f2;
                        }
                        int i4 = longValue4;
                        obj2 = obj3;
                        float f3 = f2;
                        Iterable<InvestingGraphContentModel.Point> iterable = (Iterable) ref$ObjectRef.element;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                        for (InvestingGraphContentModel.Point point : iterable) {
                            arrayList3.add(InvestingGraphContentModel.Point.copy$default(point, point.x + f3, RecyclerView.DECELERATION_RATE, 30));
                        }
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList2);
                        for (Object obj4 : list4) {
                            int i5 = i + 1;
                            if (i < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            sparseArrayCompat2.append(i + i4, (BalanceTick) obj4);
                            i = i5;
                        }
                        ref$ObjectRef.element = arrayList2;
                        BooleanPreference booleanPreference = this.shownFirstPurchase;
                        if (!booleanPreference.get()) {
                            booleanPreference.set(true);
                            longRange = obj2;
                            num = Integer.valueOf(numArr.length);
                            sparseArrayCompat = sparseArrayCompat2;
                            List list6 = (List) ref$ObjectRef.element;
                            return new GraphPresenterData(sparseArrayCompat, historicalRange, new InvestingGraphContentModel.Loaded(list6, RealInvestingGraphSmoother.smoothPointsBlocking(list6), size, textGeometricTransformKt, longRange, num, historicalRange != HistoricalRange.DAY ? f : null, null, null, MLKEMEngine.KyberPolyBytes), new LongRange(j5, j4));
                        }
                    } else {
                        obj2 = obj;
                    }
                    longRange = obj2;
                    sparseArrayCompat = sparseArrayCompat2;
                } else {
                    sparseArrayCompat = sparseArrayCompat2;
                    longRange = null;
                }
                num = null;
                List list62 = (List) ref$ObjectRef.element;
                return new GraphPresenterData(sparseArrayCompat, historicalRange, new InvestingGraphContentModel.Loaded(list62, RealInvestingGraphSmoother.smoothPointsBlocking(list62), size, textGeometricTransformKt, longRange, num, historicalRange != HistoricalRange.DAY ? f : null, null, null, MLKEMEngine.KyberPolyBytes), new LongRange(j5, j4));
            }
            Object next = it.next();
            int i6 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw th2;
            }
            BalanceTick balanceTick = (BalanceTick) next;
            sparseArrayCompat2.append(i2, balanceTick);
            if (l4 != null && l4.longValue() == 0) {
                list = list3;
                Long l10 = balanceTick.amount_cents;
                if (l10 != null && l10.longValue() == 0) {
                    j3 = millis2;
                    z2 = true;
                    ArrayList arrayList4 = arrayList;
                    long j6 = millis;
                    Long l11 = l;
                    Iterator it2 = it;
                    long j7 = j3;
                    List list7 = list2;
                    InvestingGraphContentModel.NonComparableStringProvider nonComparableStringProvider = new InvestingGraphContentModel.NonComparableStringProvider(new ShiftListViewKt$$ExternalSyntheticLambda10(historicalRange, balanceTick, this, z2, 5));
                    InvestingGraphContentModel.LineDashEffect lineDashEffect = !z2 ? InvestingGraphContentModel.LineDashEffect.SOLID_GRAY : InvestingGraphContentModel.LineDashEffect.SOLID;
                    Long l12 = balanceTick.amount_cents;
                    float f4 = i2;
                    balanceTick.gain_amount_cents.getClass();
                    arrayList4.add(new InvestingGraphContentModel.Point(f4, r5.longValue(), lineDashEffect, balanceTick.display_text != null ? InvestingGraphContentModel.PointTreatment.NONE : InvestingGraphContentModel.PointTreatment.DOT, nonComparableStringProvider));
                    List list8 = list;
                    l4 = l12;
                    list3 = list8;
                    millis2 = j7;
                    arrayList = arrayList4;
                    l = l11;
                    th = th2;
                    i2 = i6;
                    list2 = list7;
                    millis = j6;
                    it = it2;
                }
            } else {
                list = list3;
            }
            j3 = millis2;
            z2 = false;
            ArrayList arrayList42 = arrayList;
            long j62 = millis;
            Long l112 = l;
            Iterator it22 = it;
            long j72 = j3;
            List list72 = list2;
            InvestingGraphContentModel.NonComparableStringProvider nonComparableStringProvider2 = new InvestingGraphContentModel.NonComparableStringProvider(new ShiftListViewKt$$ExternalSyntheticLambda10(historicalRange, balanceTick, this, z2, 5));
            InvestingGraphContentModel.LineDashEffect lineDashEffect2 = !z2 ? InvestingGraphContentModel.LineDashEffect.SOLID_GRAY : InvestingGraphContentModel.LineDashEffect.SOLID;
            Long l122 = balanceTick.amount_cents;
            float f42 = i2;
            balanceTick.gain_amount_cents.getClass();
            arrayList42.add(new InvestingGraphContentModel.Point(f42, r5.longValue(), lineDashEffect2, balanceTick.display_text != null ? InvestingGraphContentModel.PointTreatment.NONE : InvestingGraphContentModel.PointTreatment.DOT, nonComparableStringProvider2));
            List list82 = list;
            l4 = l122;
            list3 = list82;
            millis2 = j72;
            arrayList = arrayList42;
            l = l112;
            th = th2;
            i2 = i6;
            list2 = list72;
            millis = j62;
            it = it22;
        }
    }
}
