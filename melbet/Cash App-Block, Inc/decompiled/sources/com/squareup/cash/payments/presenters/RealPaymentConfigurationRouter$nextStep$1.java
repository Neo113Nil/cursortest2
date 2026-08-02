package com.squareup.cash.payments.presenters;

import com.squareup.cash.payments.screens.PaymentConfigurationStep;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPaymentConfigurationRouter$nextStep$1 extends ContinuationImpl {
    public int I$0;
    public PaymentRouterData L$0;
    public PaymentConfigurationStep L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPaymentConfigurationRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPaymentConfigurationRouter$nextStep$1(RealPaymentConfigurationRouter realPaymentConfigurationRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPaymentConfigurationRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.nextStep(null, this);
    }
}
