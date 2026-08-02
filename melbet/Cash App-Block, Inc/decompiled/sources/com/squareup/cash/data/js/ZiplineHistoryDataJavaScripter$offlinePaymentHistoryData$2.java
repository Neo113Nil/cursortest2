package com.squareup.cash.data.js;

import com.squareup.protos.franklin.common.TransferFundsRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class ZiplineHistoryDataJavaScripter$offlinePaymentHistoryData$2 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ZiplineHistoryDataJavaScripter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineHistoryDataJavaScripter$offlinePaymentHistoryData$2(ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ziplineHistoryDataJavaScripter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.offlinePaymentHistoryData((TransferFundsRequest) null, this);
    }
}
