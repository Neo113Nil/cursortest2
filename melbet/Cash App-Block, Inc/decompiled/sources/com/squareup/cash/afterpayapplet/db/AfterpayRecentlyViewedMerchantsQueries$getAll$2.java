package com.squareup.cash.afterpayapplet.db;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpayRecentlyViewedMerchantsQueries$getAll$2 extends FunctionReferenceImpl implements Function3 {
    public static final AfterpayRecentlyViewedMerchantsQueries$getAll$2 INSTANCE = new AfterpayRecentlyViewedMerchantsQueries$getAll$2(3, AfterpayRecentlyViewedMerchant.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        str.getClass();
        return new AfterpayRecentlyViewedMerchant(str, (Long) obj2, (Boolean) obj3);
    }
}
