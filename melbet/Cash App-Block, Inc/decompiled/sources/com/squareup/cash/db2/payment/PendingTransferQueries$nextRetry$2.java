package com.squareup.cash.db2.payment;

import com.squareup.cash.db2.payment.pendingTransfer.NextRetry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class PendingTransferQueries$nextRetry$2 extends FunctionReferenceImpl implements Function1 {
    public static final PendingTransferQueries$nextRetry$2 INSTANCE = new PendingTransferQueries$nextRetry$2(1, NextRetry.class, "<init>", "<init>(Ljava/lang/Long;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new NextRetry((Long) obj);
    }
}
