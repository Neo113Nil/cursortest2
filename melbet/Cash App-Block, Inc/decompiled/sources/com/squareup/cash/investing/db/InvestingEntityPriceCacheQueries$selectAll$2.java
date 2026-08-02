package com.squareup.cash.investing.db;

import com.squareup.protos.cash.marketprices.CurrentPrice;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingEntityPriceCacheQueries$selectAll$2 extends FunctionReferenceImpl implements Function2 {
    public static final InvestingEntityPriceCacheQueries$selectAll$2 INSTANCE = new InvestingEntityPriceCacheQueries$selectAll$2(2, Investing_entity_price_cache.class, "<init>", "<init>(Ljava/lang/String;Lcom/squareup/protos/cash/marketprices/CurrentPrice;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        CurrentPrice currentPrice = (CurrentPrice) obj2;
        str.getClass();
        currentPrice.getClass();
        return new Investing_entity_price_cache(str, currentPrice);
    }
}
