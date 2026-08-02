package com.squareup.cash.activity.backend.loader;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class ReceiptGetRequestHandler$requestItem$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ReceiptGetRequestHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptGetRequestHandler$requestItem$1(ReceiptGetRequestHandler receiptGetRequestHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = receiptGetRequestHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.requestItem(null, null, this);
    }
}
