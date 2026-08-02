package com.squareup.cash.buynowpaylater.presenters;

import androidx.paging.PagingSource;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class AfterPayOrderHubDataSource$load$1 extends ContinuationImpl {
    public PagingSource.LoadParams L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AfterPayOrderHubDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayOrderHubDataSource$load$1(AfterPayOrderHubDataSource afterPayOrderHubDataSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = afterPayOrderHubDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.load(null, this);
    }
}
