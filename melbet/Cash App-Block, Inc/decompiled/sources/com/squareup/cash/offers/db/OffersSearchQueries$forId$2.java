package com.squareup.cash.offers.db;

import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersSearchQueries$forId$2 extends FunctionReferenceImpl implements Function4 {
    public static final OffersSearchQueries$forId$2 INSTANCE = new OffersSearchQueries$forId$2(4, OffersSearch.class, "<init>", "<init>(JLcom/squareup/protos/cash/cashsuggest/api/OffersTabSearchResponse;Ljava/lang/Long;J)V", 0);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        OffersTabSearchResponse offersTabSearchResponse = (OffersTabSearchResponse) obj2;
        long longValue = ((Number) obj4).longValue();
        offersTabSearchResponse.getClass();
        return new OffersSearch(((Number) obj).longValue(), offersTabSearchResponse, (Long) obj3, longValue);
    }
}
