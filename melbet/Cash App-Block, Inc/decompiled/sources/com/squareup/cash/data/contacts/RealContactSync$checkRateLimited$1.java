package com.squareup.cash.data.contacts;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealContactSync$checkRateLimited$1 extends ContinuationImpl {
    public Long L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealContactSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactSync$checkRateLimited$1(RealContactSync realContactSync, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realContactSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.checkRateLimited(null, this);
    }
}
