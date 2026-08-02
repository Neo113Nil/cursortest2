package com.squareup.cash.borrow.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class ExpandedLoanHistoryListPresenter$models$pager$1$1$1$load$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ExpandedLoanHistoryListPresenter$models$pager$1$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandedLoanHistoryListPresenter$models$pager$1$1$1$load$1(ExpandedLoanHistoryListPresenter$models$pager$1$1$1 expandedLoanHistoryListPresenter$models$pager$1$1$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = expandedLoanHistoryListPresenter$models$pager$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.load(null, this);
    }
}
