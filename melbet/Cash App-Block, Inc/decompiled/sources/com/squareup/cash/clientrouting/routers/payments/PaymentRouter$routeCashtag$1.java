package com.squareup.cash.clientrouting.routers.payments;

import com.squareup.cash.clientrouting.analytics.RouteAnalyticsParams$ViewPayCashtagAnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.common.CurrencyCode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PaymentRouter$routeCashtag$1 extends ContinuationImpl {
    public String L$0;
    public String L$1;
    public String L$2;
    public String L$3;
    public RoutingParams L$4;
    public RouteAnalyticsParams$ViewPayCashtagAnalyticsParams L$5;
    public Recipient L$6;
    public CurrencyCode L$7;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaymentRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentRouter$routeCashtag$1(PaymentRouter paymentRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paymentRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.routeCashtag(null, null, null, null, null, false, false, this);
    }
}
