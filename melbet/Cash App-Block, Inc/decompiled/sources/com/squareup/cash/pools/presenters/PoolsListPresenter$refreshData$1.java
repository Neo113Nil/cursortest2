package com.squareup.cash.pools.presenters;

import com.squareup.cash.pools.viewmodels.PoolCategory;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PoolsListPresenter$refreshData$1 extends ContinuationImpl {
    public PoolCategory L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PoolsListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsListPresenter$refreshData$1(PoolsListPresenter poolsListPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = poolsListPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PoolsListPresenter.access$refreshData(this.this$0, null, this);
    }
}
