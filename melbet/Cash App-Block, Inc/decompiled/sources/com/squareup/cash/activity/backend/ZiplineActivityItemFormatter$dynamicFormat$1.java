package com.squareup.cash.activity.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class ZiplineActivityItemFormatter$dynamicFormat$1 extends ContinuationImpl {
    public FormattedPaymentHistoryActivityItem L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ZiplineActivityItemFormatter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineActivityItemFormatter$dynamicFormat$1(ZiplineActivityItemFormatter ziplineActivityItemFormatter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ziplineActivityItemFormatter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.dynamicFormat(null, this);
    }
}
