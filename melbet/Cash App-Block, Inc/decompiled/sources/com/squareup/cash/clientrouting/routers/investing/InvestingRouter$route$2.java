package com.squareup.cash.clientrouting.routers.investing;

import com.squareup.cash.clientrouting.data.RoutingParams;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingRouter$route$2 extends ContinuationImpl {
    public RoutingParams L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InvestingRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingRouter$route$2(InvestingRouter investingRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = investingRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route((RoutingParams) null, this);
    }
}
