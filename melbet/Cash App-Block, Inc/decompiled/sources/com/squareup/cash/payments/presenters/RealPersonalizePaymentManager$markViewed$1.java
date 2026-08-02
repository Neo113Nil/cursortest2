package com.squareup.cash.payments.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPersonalizePaymentManager$markViewed$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPersonalizePaymentManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPersonalizePaymentManager$markViewed$1(RealPersonalizePaymentManager realPersonalizePaymentManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPersonalizePaymentManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.markViewed(null, this);
    }
}
