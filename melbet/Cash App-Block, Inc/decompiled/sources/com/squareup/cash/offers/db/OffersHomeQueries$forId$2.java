package com.squareup.cash.offers.db;

import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersHomeQueries$forId$2 extends FunctionReferenceImpl implements Function3 {
    public static final OffersHomeQueries$forId$2 INSTANCE = new OffersHomeQueries$forId$2(3, OffersHome.class, "<init>", "<init>(JLjava/lang/Long;Lcom/squareup/protos/cash/cashsuggest/api/OffersTabHomeResponse;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OffersTabHomeResponse offersTabHomeResponse = (OffersTabHomeResponse) obj3;
        offersTabHomeResponse.getClass();
        return new OffersHome(((Number) obj).longValue(), (Long) obj2, offersTabHomeResponse);
    }
}
