package com.squareup.cash.nearby.backend;

import com.squareup.protos.cash.paymenttemplate.v1.CreatePaymentTemplateRequest;
import com.squareup.protos.cash.paymenttemplate.v1.PaymentTemplateService;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealNearbyRepository$createPaymentTemplate$1 extends ContinuationImpl {
    public CreatePaymentTemplateRequest L$0;
    public PaymentTemplateService L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MarkwonConfiguration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealNearbyRepository$createPaymentTemplate$1(MarkwonConfiguration markwonConfiguration, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = markwonConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.createPaymentTemplate(null, this);
    }
}
