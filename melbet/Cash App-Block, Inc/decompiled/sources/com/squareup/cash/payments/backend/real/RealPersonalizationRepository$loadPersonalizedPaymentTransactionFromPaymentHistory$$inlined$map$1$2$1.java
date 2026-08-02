package com.squareup.cash.payments.backend.real;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealP2pSettingsManager$select$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPersonalizationRepository$loadPersonalizedPaymentTransactionFromPaymentHistory$$inlined$map$1$2$1(RealP2pSettingsManager$select$$inlined$map$1$2 realP2pSettingsManager$select$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = realP2pSettingsManager$select$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
