package com.squareup.cash.recurringpayments.backend;

import com.squareup.protos.cash.p2pencoreedge.GetRecurringPaymentsRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealRecurringPaymentsManager$loadRecurringPayments$1 extends ContinuationImpl {
    public GetRecurringPaymentsRequest L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealRecurringPaymentsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealRecurringPaymentsManager$loadRecurringPayments$1(RealRecurringPaymentsManager realRecurringPaymentsManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realRecurringPaymentsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.loadRecurringPayments(null, this);
    }
}
