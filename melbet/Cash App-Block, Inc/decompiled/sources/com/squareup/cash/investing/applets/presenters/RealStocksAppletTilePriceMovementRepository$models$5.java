package com.squareup.cash.investing.applets.presenters;

import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.Triple;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealStocksAppletTilePriceMovementRepository$models$5 extends AdaptedFunctionReference implements Function4 {
    public static final RealStocksAppletTilePriceMovementRepository$models$5 INSTANCE = new RealStocksAppletTilePriceMovementRepository$models$5(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj3;
        bool.booleanValue();
        HistoricalRange historicalRange = RealStocksAppletTilePriceMovementRepository.STOCKS_RANGE;
        return new Triple((PolledData) obj, (PolledData) obj2, bool);
    }
}
