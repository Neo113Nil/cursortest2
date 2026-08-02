package com.squareup.cash.globalsearch.backend.real;

import com.squareup.protos.cash.discover.api.app.v2.api.SearchRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealGlobalSearchRepository$search$1 extends ContinuationImpl {
    public String L$0;
    public SearchRequest.Origin L$1;
    public String L$2;
    public String L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGlobalSearchRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGlobalSearchRepository$search$1(RealGlobalSearchRepository realGlobalSearchRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realGlobalSearchRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.search(null, null, null, null, this);
    }
}
