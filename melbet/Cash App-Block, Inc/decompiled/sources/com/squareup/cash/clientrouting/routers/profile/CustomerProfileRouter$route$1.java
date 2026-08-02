package com.squareup.cash.clientrouting.routers.profile;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.db.contacts.Recipient;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CustomerProfileRouter$route$1 extends ContinuationImpl {
    public ClientRoute.ViewCustomerProfileWithButtonsConfig L$0;
    public RoutingParams L$1;
    public String L$2;
    public String L$3;
    public Recipient L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CustomerProfileRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerProfileRouter$route$1(CustomerProfileRouter customerProfileRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = customerProfileRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route((ClientRoute.ViewCustomerProfileWithButtonsConfig) null, (RoutingParams) null, this);
    }
}
