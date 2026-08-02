package com.squareup.cash.data.activity;

import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPaymentNavigator$cancelPayment$1 extends ContinuationImpl {
    public ClientScenario L$0;
    public String L$1;
    public String L$2;
    public Money L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPaymentNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPaymentNavigator$cancelPayment$1(RealPaymentNavigator realPaymentNavigator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPaymentNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.cancelPayment(null, null, null, null, null, this);
    }
}
