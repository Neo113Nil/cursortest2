package com.squareup.cash.google.pay.payments.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealGooglePayPaymentsClient$loadPaymentData$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGooglePayPaymentsClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGooglePayPaymentsClient$loadPaymentData$1(RealGooglePayPaymentsClient realGooglePayPaymentsClient, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realGooglePayPaymentsClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.loadPaymentData(null, this);
    }
}
