package com.squareup.cash.bitcoin.graph.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.bitcoin.graph.api.model.BitcoinGraphModel;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphSmoother;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataResponse;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.protos.franklin.common.PriceTick;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealBitcoinGraphModelCache {
    public final ConcurrentHashMap bitcoinGraphModelCache = new ConcurrentHashMap();
    public final AndroidClock clock;
    public final AndroidDateFormatManager dateFormatManager;
    public final RealInvestingGraphSmoother investingGraphSmoother;

    public RealBitcoinGraphModelCache(RealInvestingGraphSmoother realInvestingGraphSmoother, AndroidClock androidClock, AndroidDateFormatManager androidDateFormatManager) {
        this.investingGraphSmoother = realInvestingGraphSmoother;
        this.clock = androidClock;
        this.dateFormatManager = androidDateFormatManager;
    }

    public final ArrayList mapToPoints(List list, HistoricalRange historicalRange) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            PriceTick priceTick = (PriceTick) obj;
            float f = i;
            priceTick.price_cents.getClass();
            arrayList.add(new InvestingGraphContentModel.Point(f, r1.longValue(), InvestingGraphContentModel.LineDashEffect.SOLID, InvestingGraphContentModel.PointTreatment.NONE, new InvestingGraphContentModel.NonComparableStringProvider(new CopyCodeKt$$ExternalSyntheticLambda4(9, historicalRange, priceTick, this))));
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processAndCache(HistoricalRange historicalRange, PolledData polledData, ContinuationImpl continuationImpl) {
        RealBitcoinGraphModelCache$processAndCache$1 realBitcoinGraphModelCache$processAndCache$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        PriceTick priceTick;
        int max;
        ArrayList mapToPoints;
        PolledData polledData2;
        int i2;
        ArrayList arrayList;
        PriceTick priceTick2;
        Object withContext;
        HistoricalRange historicalRange2;
        List list;
        ArrayList arrayList2;
        PriceTick priceTick3;
        PriceTick priceTick4;
        ArrayList arrayList3;
        PolledData polledData3;
        HistoricalRange historicalRange3 = historicalRange;
        RealInvestingGraphSmoother realInvestingGraphSmoother = this.investingGraphSmoother;
        CoroutineContext coroutineContext = realInvestingGraphSmoother.computationDispatcher;
        if (continuationImpl instanceof RealBitcoinGraphModelCache$processAndCache$1) {
            realBitcoinGraphModelCache$processAndCache$1 = (RealBitcoinGraphModelCache$processAndCache$1) continuationImpl;
            int i3 = realBitcoinGraphModelCache$processAndCache$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realBitcoinGraphModelCache$processAndCache$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realBitcoinGraphModelCache$processAndCache$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBitcoinGraphModelCache$processAndCache$1.label;
                int i4 = 29;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PriceHistory priceHistory = ((GetHistoricalExchangeDataResponse) polledData.getValue()).price_history;
                    if (priceHistory == null) {
                        return null;
                    }
                    List list2 = priceHistory.price_ticks;
                    PriceTick priceTick5 = (PriceTick) CollectionsKt.first(list2);
                    priceTick = (PriceTick) CollectionsKt.last(list2);
                    max = Integer.max(1, list2.size() / 100);
                    ArrayList flatten = CollectionsKt__IterablesKt.flatten(CollectionsKt.windowed$default(list2, 1, max, 4));
                    ArrayList mapToPoints2 = mapToPoints(list2, historicalRange3);
                    mapToPoints = mapToPoints(flatten, historicalRange3);
                    realBitcoinGraphModelCache$processAndCache$1.L$0 = historicalRange3;
                    polledData2 = polledData;
                    realBitcoinGraphModelCache$processAndCache$1.L$1 = polledData2;
                    realBitcoinGraphModelCache$processAndCache$1.L$4 = priceTick5;
                    realBitcoinGraphModelCache$processAndCache$1.L$5 = priceTick;
                    realBitcoinGraphModelCache$processAndCache$1.L$7 = mapToPoints2;
                    realBitcoinGraphModelCache$processAndCache$1.L$8 = mapToPoints;
                    i2 = 0;
                    realBitcoinGraphModelCache$processAndCache$1.I$0 = 0;
                    realBitcoinGraphModelCache$processAndCache$1.I$1 = max;
                    realBitcoinGraphModelCache$processAndCache$1.label = 1;
                    Object withContext2 = JobKt.withContext(coroutineContext, new MainPaymentView$Content$2$1(realInvestingGraphSmoother, mapToPoints2, continuation, i4), realBitcoinGraphModelCache$processAndCache$1);
                    if (withContext2 != coroutineSingletons) {
                        arrayList = mapToPoints2;
                        obj = withContext2;
                        priceTick2 = priceTick5;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = realBitcoinGraphModelCache$processAndCache$1.L$9;
                    List list4 = realBitcoinGraphModelCache$processAndCache$1.L$8;
                    List list5 = realBitcoinGraphModelCache$processAndCache$1.L$7;
                    priceTick3 = realBitcoinGraphModelCache$processAndCache$1.L$5;
                    priceTick4 = realBitcoinGraphModelCache$processAndCache$1.L$4;
                    polledData3 = realBitcoinGraphModelCache$processAndCache$1.L$1;
                    historicalRange2 = realBitcoinGraphModelCache$processAndCache$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    list = list3;
                    arrayList3 = list4;
                    arrayList2 = list5;
                    Long l = priceTick4.price_cents;
                    l.getClass();
                    long longValue = l.longValue();
                    Long l2 = priceTick3.price_cents;
                    l2.getClass();
                    BitcoinGraphModel bitcoinGraphModel = new BitcoinGraphModel(arrayList2, list, arrayList3, (List) obj, longValue, l2.longValue(), polledData3.isStale());
                    this.bitcoinGraphModelCache.put(historicalRange2, bitcoinGraphModel);
                    return bitcoinGraphModel;
                }
                int i5 = realBitcoinGraphModelCache$processAndCache$1.I$1;
                int i6 = realBitcoinGraphModelCache$processAndCache$1.I$0;
                List list6 = realBitcoinGraphModelCache$processAndCache$1.L$8;
                List list7 = realBitcoinGraphModelCache$processAndCache$1.L$7;
                PriceTick priceTick6 = realBitcoinGraphModelCache$processAndCache$1.L$5;
                PriceTick priceTick7 = realBitcoinGraphModelCache$processAndCache$1.L$4;
                PolledData polledData4 = realBitcoinGraphModelCache$processAndCache$1.L$1;
                HistoricalRange historicalRange4 = realBitcoinGraphModelCache$processAndCache$1.L$0;
                SafeTrace.throwOnFailure(obj);
                max = i5;
                historicalRange3 = historicalRange4;
                priceTick = priceTick6;
                mapToPoints = list6;
                priceTick2 = priceTick7;
                polledData2 = polledData4;
                i2 = i6;
                arrayList = list7;
                List list8 = (List) obj;
                realBitcoinGraphModelCache$processAndCache$1.L$0 = historicalRange3;
                realBitcoinGraphModelCache$processAndCache$1.L$1 = polledData2;
                realBitcoinGraphModelCache$processAndCache$1.L$4 = priceTick2;
                realBitcoinGraphModelCache$processAndCache$1.L$5 = priceTick;
                realBitcoinGraphModelCache$processAndCache$1.L$7 = arrayList;
                realBitcoinGraphModelCache$processAndCache$1.L$8 = mapToPoints;
                realBitcoinGraphModelCache$processAndCache$1.L$9 = list8;
                realBitcoinGraphModelCache$processAndCache$1.I$0 = i2;
                realBitcoinGraphModelCache$processAndCache$1.I$1 = max;
                realBitcoinGraphModelCache$processAndCache$1.label = 2;
                withContext = JobKt.withContext(coroutineContext, new MainPaymentView$Content$2$1(realInvestingGraphSmoother, mapToPoints, continuation, 29), realBitcoinGraphModelCache$processAndCache$1);
                if (withContext != coroutineSingletons) {
                    historicalRange2 = historicalRange3;
                    list = list8;
                    obj = withContext;
                    arrayList2 = arrayList;
                    priceTick3 = priceTick;
                    priceTick4 = priceTick2;
                    arrayList3 = mapToPoints;
                    polledData3 = polledData2;
                    Long l3 = priceTick4.price_cents;
                    l3.getClass();
                    long longValue2 = l3.longValue();
                    Long l22 = priceTick3.price_cents;
                    l22.getClass();
                    BitcoinGraphModel bitcoinGraphModel2 = new BitcoinGraphModel(arrayList2, list, arrayList3, (List) obj, longValue2, l22.longValue(), polledData3.isStale());
                    this.bitcoinGraphModelCache.put(historicalRange2, bitcoinGraphModel2);
                    return bitcoinGraphModel2;
                }
                return coroutineSingletons;
            }
        }
        realBitcoinGraphModelCache$processAndCache$1 = new RealBitcoinGraphModelCache$processAndCache$1(this, continuationImpl);
        Object obj2 = realBitcoinGraphModelCache$processAndCache$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBitcoinGraphModelCache$processAndCache$1.label;
        int i42 = 29;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        List list82 = (List) obj2;
        realBitcoinGraphModelCache$processAndCache$1.L$0 = historicalRange3;
        realBitcoinGraphModelCache$processAndCache$1.L$1 = polledData2;
        realBitcoinGraphModelCache$processAndCache$1.L$4 = priceTick2;
        realBitcoinGraphModelCache$processAndCache$1.L$5 = priceTick;
        realBitcoinGraphModelCache$processAndCache$1.L$7 = arrayList;
        realBitcoinGraphModelCache$processAndCache$1.L$8 = mapToPoints;
        realBitcoinGraphModelCache$processAndCache$1.L$9 = list82;
        realBitcoinGraphModelCache$processAndCache$1.I$0 = i2;
        realBitcoinGraphModelCache$processAndCache$1.I$1 = max;
        realBitcoinGraphModelCache$processAndCache$1.label = 2;
        withContext = JobKt.withContext(coroutineContext, new MainPaymentView$Content$2$1(realInvestingGraphSmoother, mapToPoints, continuation2, 29), realBitcoinGraphModelCache$processAndCache$1);
        if (withContext != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
