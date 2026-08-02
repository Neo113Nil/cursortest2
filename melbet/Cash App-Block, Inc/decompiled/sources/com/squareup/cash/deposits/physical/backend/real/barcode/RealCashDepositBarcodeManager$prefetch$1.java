package com.squareup.cash.deposits.physical.backend.real.barcode;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealCashDepositBarcodeManager$prefetch$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealCashDepositBarcodeManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCashDepositBarcodeManager$prefetch$1(RealCashDepositBarcodeManager realCashDepositBarcodeManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realCashDepositBarcodeManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.prefetch(this);
    }
}
