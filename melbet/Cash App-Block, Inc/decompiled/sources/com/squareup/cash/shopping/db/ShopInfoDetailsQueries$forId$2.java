package com.squareup.cash.shopping.db;

import com.squareup.protos.cash.cashsuggest.api.ShopInfoResponse;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShopInfoDetailsQueries$forId$2 extends FunctionReferenceImpl implements Function3 {
    public static final ShopInfoDetailsQueries$forId$2 INSTANCE = new ShopInfoDetailsQueries$forId$2(3, ShopInfoDetails.class, "<init>", "<init>(JJLcom/squareup/protos/cash/cashsuggest/api/ShopInfoResponse;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        ShopInfoResponse shopInfoResponse = (ShopInfoResponse) obj3;
        shopInfoResponse.getClass();
        return new ShopInfoDetails(longValue, longValue2, shopInfoResponse);
    }
}
