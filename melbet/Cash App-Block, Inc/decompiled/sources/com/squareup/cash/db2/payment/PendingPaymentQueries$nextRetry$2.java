package com.squareup.cash.db2.payment;

import com.squareup.cash.db2.payment.pendingPayment.NextRetry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class PendingPaymentQueries$nextRetry$2 extends FunctionReferenceImpl implements Function1 {
    public static final PendingPaymentQueries$nextRetry$2 INSTANCE = new PendingPaymentQueries$nextRetry$2(1, NextRetry.class, "<init>", "<init>(Ljava/lang/Long;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new NextRetry((Long) obj);
    }
}
