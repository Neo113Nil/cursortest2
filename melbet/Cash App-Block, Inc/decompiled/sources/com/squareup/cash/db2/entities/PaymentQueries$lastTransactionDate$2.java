package com.squareup.cash.db2.entities;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class PaymentQueries$lastTransactionDate$2 extends FunctionReferenceImpl implements Function2 {
    public static final PaymentQueries$lastTransactionDate$2 INSTANCE = new PaymentQueries$lastTransactionDate$2(2, LastTransactionDate.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/Long;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        str.getClass();
        return new LastTransactionDate(str, (Long) obj2);
    }
}
