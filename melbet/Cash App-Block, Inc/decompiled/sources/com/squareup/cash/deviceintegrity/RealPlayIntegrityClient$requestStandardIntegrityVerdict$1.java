package com.squareup.cash.deviceintegrity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPlayIntegrityClient$requestStandardIntegrityVerdict$1 extends ContinuationImpl {
    public String L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPlayIntegrityClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPlayIntegrityClient$requestStandardIntegrityVerdict$1(RealPlayIntegrityClient realPlayIntegrityClient, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPlayIntegrityClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.requestStandardIntegrityVerdict(null, this);
    }
}
