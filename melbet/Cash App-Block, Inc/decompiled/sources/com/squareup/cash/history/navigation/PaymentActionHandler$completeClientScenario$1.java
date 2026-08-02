package com.squareup.cash.history.navigation;

import com.squareup.cash.payments.backend.api.PaymentAction;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentActionHandler$completeClientScenario$1 extends ContinuationImpl {
    public PaymentAction.CompleteClientScenarioAction L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentActionHandler$completeClientScenario$1(PaymentActionHandler paymentActionHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.completeClientScenario(null, this);
    }
}
