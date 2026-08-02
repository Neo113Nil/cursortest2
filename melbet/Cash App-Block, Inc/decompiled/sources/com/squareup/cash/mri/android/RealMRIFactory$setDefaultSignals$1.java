package com.squareup.cash.mri.android;

import com.squareup.protos.cash.security.mri.api.v1.Signals;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealMRIFactory$setDefaultSignals$1 extends ContinuationImpl {
    public int I$0;
    public Boolean L$1;
    public Signals.Builder L$2;
    public Signals.Builder L$3;
    public Signals.Builder L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealMRIFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMRIFactory$setDefaultSignals$1(RealMRIFactory realMRIFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realMRIFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealMRIFactory.access$setDefaultSignals(this.this$0, null, null, this);
    }
}
