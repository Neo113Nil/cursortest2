package com.squareup.cash.history.navigation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentActionHandler$sendConfirm$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentActionHandler$sendConfirm$1(PaymentActionHandler paymentActionHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PaymentActionHandler.access$sendConfirm(this.this$0, null, null, this);
    }
}
