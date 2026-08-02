package com.squareup.cash.investing.scenarioplans;

import com.squareup.cash.blockers.data.BlockersData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InitiateInvestmentOrderScenarioPlan$produceResponseContext$1 extends ContinuationImpl {
    public BlockersData L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitiateInvestmentOrderScenarioPlan this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateInvestmentOrderScenarioPlan$produceResponseContext$1(InitiateInvestmentOrderScenarioPlan initiateInvestmentOrderScenarioPlan, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = initiateInvestmentOrderScenarioPlan;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.produceResponseContext(null, this);
    }
}
