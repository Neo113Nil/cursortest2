package com.squareup.address.typeahead.backend.real;

import com.squareup.address.typeahead.backend.api.SearchLocation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealLocationSearchClient$getDetails$1 extends ContinuationImpl {
    public SearchLocation L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealLocationSearchClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLocationSearchClient$getDetails$1(RealLocationSearchClient realLocationSearchClient, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realLocationSearchClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getDetails(null, null, this);
    }
}
