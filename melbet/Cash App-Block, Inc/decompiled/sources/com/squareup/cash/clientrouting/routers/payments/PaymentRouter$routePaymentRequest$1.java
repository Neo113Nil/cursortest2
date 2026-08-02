package com.squareup.cash.clientrouting.routers.payments;

import com.squareup.cash.clientrouting.analytics.RouteAnalyticsParams$ViewPayCashtagAnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.db.contacts.Recipient;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentRouter$routePaymentRequest$1 extends ContinuationImpl {
    public RoutingParams L$0;
    public Recipient L$1;
    public String L$2;
    public String L$3;
    public RouteAnalyticsParams$ViewPayCashtagAnalyticsParams L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentRouter$routePaymentRequest$1(PaymentRouter paymentRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.routePaymentRequest(null, null, null, null, this);
    }
}
