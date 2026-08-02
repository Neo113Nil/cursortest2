package com.squareup.cash.retro.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class PaymentPlanDataBlockerPresenter$submit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentPlanDataBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentPlanDataBlockerPresenter$submit$1(PaymentPlanDataBlockerPresenter paymentPlanDataBlockerPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentPlanDataBlockerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PaymentPlanDataBlockerPresenter.access$submit(this.this$0, null, this);
    }
}
