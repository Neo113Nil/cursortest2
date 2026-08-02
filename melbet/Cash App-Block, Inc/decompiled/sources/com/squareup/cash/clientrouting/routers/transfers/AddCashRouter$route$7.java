package com.squareup.cash.clientrouting.routers.transfers;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.protos.common.Money;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class AddCashRouter$route$7 extends ContinuationImpl {
    public int I$0;
    public RoutingParams L$1;
    public Money L$3;
    public String L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AddCashRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCashRouter$route$7(AddCashRouter addCashRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = addCashRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route((ClientRoute.ViewAddCashHalfSheetWithEntry) null, (RoutingParams) null, this);
    }
}
