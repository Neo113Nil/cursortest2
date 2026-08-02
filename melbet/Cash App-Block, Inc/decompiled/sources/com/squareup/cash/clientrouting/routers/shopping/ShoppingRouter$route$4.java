package com.squareup.cash.clientrouting.routers.shopping;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ShoppingRouter$route$4 extends ContinuationImpl {
    public ClientRoute.ViewCashOfferInAppBrowser L$0;
    public RoutingParams L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ShoppingRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingRouter$route$4(ShoppingRouter shoppingRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = shoppingRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route(null, null, this);
    }
}
