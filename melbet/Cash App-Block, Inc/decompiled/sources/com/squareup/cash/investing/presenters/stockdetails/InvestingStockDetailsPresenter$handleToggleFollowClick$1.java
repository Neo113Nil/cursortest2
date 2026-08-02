package com.squareup.cash.investing.presenters.stockdetails;

import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingStockDetailsPresenter$handleToggleFollowClick$1 extends ContinuationImpl {
    public SyncInvestmentHolding.InvestmentHoldingState L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InvestingStockDetailsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingStockDetailsPresenter$handleToggleFollowClick$1(InvestingStockDetailsPresenter investingStockDetailsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = investingStockDetailsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return InvestingStockDetailsPresenter.access$handleToggleFollowClick(this.this$0, null, null, this);
    }
}
