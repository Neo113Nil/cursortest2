package com.squareup.cash.investing.presenters.stockdetails;

import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewEvent;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingStockDetailsPresenter$handleCategoryClick$1 extends ContinuationImpl {
    public InvestingStockDetailsViewEvent.CategoryClick L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InvestingStockDetailsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingStockDetailsPresenter$handleCategoryClick$1(InvestingStockDetailsPresenter investingStockDetailsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = investingStockDetailsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return InvestingStockDetailsPresenter.access$handleCategoryClick(this.this$0, null, null, this);
    }
}
