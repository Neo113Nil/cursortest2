package com.squareup.cash.payments.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentLoadingPresenter$initiatePayment$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentLoadingPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLoadingPresenter$initiatePayment$1(PaymentLoadingPresenter paymentLoadingPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentLoadingPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PaymentLoadingPresenter.access$initiatePayment(this.this$0, this);
    }
}
