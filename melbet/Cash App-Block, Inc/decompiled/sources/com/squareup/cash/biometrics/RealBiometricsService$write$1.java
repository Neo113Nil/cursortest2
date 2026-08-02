package com.squareup.cash.biometrics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealBiometricsService$write$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBiometricsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBiometricsService$write$1(RealBiometricsService realBiometricsService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBiometricsService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.write(null, null, this);
    }
}
