package com.squareup.cash.directdeposit.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealFormPdfProvider$downloadPdf$1 extends ContinuationImpl {
    public String L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealFormPdfProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFormPdfProvider$downloadPdf$1(RealFormPdfProvider realFormPdfProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realFormPdfProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.downloadPdf(null, null, this);
    }
}
