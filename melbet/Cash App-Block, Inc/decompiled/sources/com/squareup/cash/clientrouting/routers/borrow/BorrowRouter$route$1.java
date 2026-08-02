package com.squareup.cash.clientrouting.routers.borrow;

import com.squareup.cash.clientrouting.data.RoutingParams;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class BorrowRouter$route$1 extends ContinuationImpl {
    public RoutingParams L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BorrowRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowRouter$route$1(BorrowRouter borrowRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = borrowRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route(null, null, this);
    }
}
