package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentConfigurationPresenter$models$loadStablecoinQrScanOptions$1 extends ContinuationImpl {
    public PaymentConfigurationPresenter L$0;
    public MutableState L$1;
    public CoroutineScope L$2;
    public RealPaymentConfigurationRouter L$3;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PaymentConfigurationPresenter.access$models$loadStablecoinQrScanOptions(null, null, null, null, null, this);
    }
}
