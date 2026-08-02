package com.squareup.cash.deposits.physical.db;

import java.io.Serializable;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class BitcoinMapAddressSearchQueries$addresses$2 extends FunctionReferenceImpl implements Function7 {
    public static final BitcoinMapAddressSearchQueries$addresses$2 INSTANCE = new BitcoinMapAddressSearchQueries$addresses$2(7, BitcoinMapAddressSearch.class, "<init>", "<init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", 0);

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        String str = (String) obj;
        String str2 = (String) obj3;
        String str3 = (String) obj4;
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new BitcoinMapAddressSearch(str, ((Number) obj2).longValue(), str2, str3, (String) obj5, (Double) obj6, (Double) serializable);
    }
}
