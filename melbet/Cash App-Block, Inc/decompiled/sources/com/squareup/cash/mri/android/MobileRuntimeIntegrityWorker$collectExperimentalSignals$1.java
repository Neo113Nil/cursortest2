package com.squareup.cash.mri.android;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class MobileRuntimeIntegrityWorker$collectExperimentalSignals$1 extends ContinuationImpl {
    public LinkedHashMap L$0;
    public ComputationalIntegrityConfig L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MobileRuntimeIntegrityWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileRuntimeIntegrityWorker$collectExperimentalSignals$1(MobileRuntimeIntegrityWorker mobileRuntimeIntegrityWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mobileRuntimeIntegrityWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return MobileRuntimeIntegrityWorker.access$collectExperimentalSignals(this.this$0, this);
    }
}
