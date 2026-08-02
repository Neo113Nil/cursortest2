package com.squareup.cash.db2;

import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class CryptocurrencyConfigQueries$select$2 extends FunctionReferenceImpl implements Function5 {
    public static final CryptocurrencyConfigQueries$select$2 INSTANCE = new CryptocurrencyConfigQueries$select$2(5, CryptocurrencyConfig.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", 0);

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new CryptocurrencyConfig((Long) obj5, (String) obj, (String) obj2, (String) obj3, (String) obj4);
    }
}
