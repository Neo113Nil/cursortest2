package com.squareup.cash.mri.android;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealMRIFactory$buildSignedSerializedMRIContext$1 extends ContinuationImpl {
    public MRIUseCase L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealMRIFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMRIFactory$buildSignedSerializedMRIContext$1(RealMRIFactory realMRIFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realMRIFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.buildSignedSerializedMRIContext(null, null, this);
    }
}
