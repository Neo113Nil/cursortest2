package com.squareup.cash.shopping.backend.real;

import com.squareup.cash.shopping.backend.api.SearchQuery;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealProductSearchRepository$refreshFiltersInBackground$1 extends ContinuationImpl {
    public SearchQuery L$0;
    public MutexImpl L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealProductSearchRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealProductSearchRepository$refreshFiltersInBackground$1(RealProductSearchRepository realProductSearchRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realProductSearchRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.refreshFiltersInBackground(null, this);
    }
}
