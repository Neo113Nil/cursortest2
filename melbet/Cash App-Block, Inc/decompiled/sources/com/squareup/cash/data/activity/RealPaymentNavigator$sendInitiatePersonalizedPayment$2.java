package com.squareup.cash.data.activity;

import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPaymentNavigator$sendInitiatePersonalizedPayment$2 extends ContinuationImpl {
    public InitiatePersonalizedPaymentRequest L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPaymentNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPaymentNavigator$sendInitiatePersonalizedPayment$2(RealPaymentNavigator realPaymentNavigator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPaymentNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.sendInitiatePersonalizedPayment(null, null, null, null, this);
    }
}
