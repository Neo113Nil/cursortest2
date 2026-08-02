package com.squareup.cash.deposits.physical.backend.real.barcode;

import com.squareup.cash.checks.CaptureCheckFacePresenter$models$2$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCashDepositBarcodeManager$barcodeInfo$$inlined$transform$1$1$1(CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
