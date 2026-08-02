package com.squareup.cash.db2.profile;

import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class ExtendedProfileDetailsQueries$forCustomerToken$2 extends FunctionReferenceImpl implements Function2 {
    public static final ExtendedProfileDetailsQueries$forCustomerToken$2 INSTANCE = new ExtendedProfileDetailsQueries$forCustomerToken$2(2, ExtendedProfileDetails.class, "<init>", "<init>(Ljava/lang/String;Lcom/squareup/protos/cash/cashface/api/GetProfileDetailsResponse;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        GetProfileDetailsResponse getProfileDetailsResponse = (GetProfileDetailsResponse) obj2;
        str.getClass();
        getProfileDetailsResponse.getClass();
        return new ExtendedProfileDetails(str, getProfileDetailsResponse);
    }
}
