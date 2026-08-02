package com.squareup.cash.crypto.db;

import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class CryptoStatementQueries$forCategory$2 extends FunctionReferenceImpl implements Function6 {
    public static final CryptoStatementQueries$forCategory$2 INSTANCE = new CryptoStatementQueries$forCategory$2(6, Crypto_statement.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        long longValue = ((Number) obj4).longValue();
        String str4 = (String) obj5;
        String str5 = (String) obj6;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new Crypto_statement(str, str2, str3, longValue, str4, str5);
    }
}
