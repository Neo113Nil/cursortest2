package com.squareup.cash.card.onboarding;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.franklin.api.PaymentDeviceOption;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentDeviceCustomizationPresenter$submitBlocker$1 extends ContinuationImpl {
    public String L$0;
    public PaymentDeviceOption L$1;
    public BlockersData L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentDeviceCustomizationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDeviceCustomizationPresenter$submitBlocker$1(PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentDeviceCustomizationPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PaymentDeviceCustomizationPresenter.access$submitBlocker(this.this$0, null, this);
    }
}
