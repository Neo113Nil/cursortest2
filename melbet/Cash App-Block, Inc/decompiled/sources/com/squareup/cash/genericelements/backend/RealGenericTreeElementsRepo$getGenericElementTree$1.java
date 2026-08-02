package com.squareup.cash.genericelements.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealGenericTreeElementsRepo$getGenericElementTree$1 extends ContinuationImpl {
    public String L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGenericTreeElementsRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGenericTreeElementsRepo$getGenericElementTree$1(RealGenericTreeElementsRepo realGenericTreeElementsRepo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realGenericTreeElementsRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getGenericElementTree(null, null, this);
    }
}
