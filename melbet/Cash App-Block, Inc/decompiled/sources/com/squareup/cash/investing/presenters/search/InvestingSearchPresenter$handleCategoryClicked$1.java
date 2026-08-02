package com.squareup.cash.investing.presenters.search;

import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingSearchPresenter$handleCategoryClicked$1 extends ContinuationImpl {
    public InvestingSearchViewEvent.CategoryClicked L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InvestingSearchPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingSearchPresenter$handleCategoryClicked$1(InvestingSearchPresenter investingSearchPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = investingSearchPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return InvestingSearchPresenter.access$handleCategoryClicked(this.this$0, null, this);
    }
}
