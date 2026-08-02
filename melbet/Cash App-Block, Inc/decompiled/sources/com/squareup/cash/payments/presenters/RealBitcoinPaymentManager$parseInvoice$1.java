package com.squareup.cash.payments.presenters;

import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealBitcoinPaymentManager$parseInvoice$1 extends ContinuationImpl {
    public CryptoPaymentOrigin L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBitcoinPaymentManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBitcoinPaymentManager$parseInvoice$1(RealBitcoinPaymentManager realBitcoinPaymentManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBitcoinPaymentManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.parseInvoice(null, null, this);
    }
}
