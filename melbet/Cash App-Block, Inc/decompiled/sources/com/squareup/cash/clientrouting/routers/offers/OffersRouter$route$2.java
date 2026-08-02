package com.squareup.cash.clientrouting.routers.offers;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class OffersRouter$route$2 extends ContinuationImpl {
    public ClientRoute.ViewOffersSheetV2 L$0;
    public RoutingParams L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ OffersRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersRouter$route$2(OffersRouter offersRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = offersRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route((ClientRoute.ViewOffersSheetV2) null, (RoutingParams) null, this);
    }
}
