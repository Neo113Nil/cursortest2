package com.squareup.cash.investing.backend.real.families;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealDependentInvestmentEntities$getInvestmentDetailsMap$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealDependentInvestmentEntities this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDependentInvestmentEntities$getInvestmentDetailsMap$1(RealDependentInvestmentEntities realDependentInvestmentEntities, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realDependentInvestmentEntities;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getInvestmentDetailsMap(null, this);
    }
}
