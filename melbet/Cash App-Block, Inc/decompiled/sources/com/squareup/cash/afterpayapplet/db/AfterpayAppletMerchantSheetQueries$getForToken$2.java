package com.squareup.cash.afterpayapplet.db;

import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheetResponse;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpayAppletMerchantSheetQueries$getForToken$2 extends FunctionReferenceImpl implements Function3 {
    public static final AfterpayAppletMerchantSheetQueries$getForToken$2 INSTANCE = new AfterpayAppletMerchantSheetQueries$getForToken$2(3, AfterpayAppletMerchantSheet.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/Long;Lcom/squareup/protos/cash/cashsuggest/api/AfterpayMerchantSheetResponse;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        AfterpayMerchantSheetResponse afterpayMerchantSheetResponse = (AfterpayMerchantSheetResponse) obj3;
        str.getClass();
        afterpayMerchantSheetResponse.getClass();
        return new AfterpayAppletMerchantSheet(str, (Long) obj2, afterpayMerchantSheetResponse);
    }
}
