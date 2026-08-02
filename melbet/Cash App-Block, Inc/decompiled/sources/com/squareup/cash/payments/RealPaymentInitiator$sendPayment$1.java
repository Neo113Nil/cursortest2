package com.squareup.cash.payments;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPaymentInitiator$sendPayment$1 extends ContinuationImpl {
    public PaymentInitiatorData L$0;
    public ClientScenario L$1;
    public Screen L$2;
    public Screen L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPaymentInitiator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPaymentInitiator$sendPayment$1(RealPaymentInitiator realPaymentInitiator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPaymentInitiator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.sendPayment(null, null, null, null, this);
    }
}
