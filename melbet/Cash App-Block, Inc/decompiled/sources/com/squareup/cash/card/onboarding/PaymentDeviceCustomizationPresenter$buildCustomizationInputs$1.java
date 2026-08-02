package com.squareup.cash.card.onboarding;

import com.squareup.protos.franklin.api.PaymentCardGlobalConfig;
import com.squareup.protos.franklin.api.PaymentDeviceOption;
import com.squareup.protos.franklin.cards.TouchData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentDeviceCustomizationPresenter$buildCustomizationInputs$1 extends ContinuationImpl {
    public int I$1;
    public PaymentDeviceOption L$0;
    public PaymentCardGlobalConfig L$1;
    public TouchData L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentDeviceCustomizationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDeviceCustomizationPresenter$buildCustomizationInputs$1(PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentDeviceCustomizationPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.buildCustomizationInputs(null, null, this);
    }
}
