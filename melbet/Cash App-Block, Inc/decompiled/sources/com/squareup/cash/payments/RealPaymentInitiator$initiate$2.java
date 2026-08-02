package com.squareup.cash.payments;

import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.protos.common.Money;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPaymentInitiator$initiate$2 extends ContinuationImpl {
    public Money L$1;
    public List L$3;
    public InstrumentSelectionData L$4;
    public List L$9;
    public boolean Z$1;
    public boolean Z$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPaymentInitiator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPaymentInitiator$initiate$2(RealPaymentInitiator realPaymentInitiator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPaymentInitiator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.initiate(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, this);
    }
}
