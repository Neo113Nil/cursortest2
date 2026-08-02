package com.squareup.cash.offers.db;

import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersCollectionDetailQueries$forToken$2 extends FunctionReferenceImpl implements Function3 {
    public static final OffersCollectionDetailQueries$forToken$2 INSTANCE = new OffersCollectionDetailQueries$forToken$2(3, OffersCollectionDetail.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/Long;Lcom/squareup/protos/cash/cashsuggest/api/OffersTabCollectionResponse;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        OffersTabCollectionResponse offersTabCollectionResponse = (OffersTabCollectionResponse) obj3;
        str.getClass();
        offersTabCollectionResponse.getClass();
        return new OffersCollectionDetail(str, (Long) obj2, offersTabCollectionResponse);
    }
}
