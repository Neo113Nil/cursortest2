package com.squareup.cash.clientrouting.routers.transfers;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.protos.franklin.api.DepositPreference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CashOutRouter$routeToCashOut$1 extends ContinuationImpl {
    public Long L$0;
    public String L$1;
    public Navigator L$10;
    public DepositPreference L$2;
    public RoutingParams L$3;
    public BalanceSnapshot L$4;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashOutRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashOutRouter$routeToCashOut$1(CashOutRouter cashOutRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cashOutRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.routeToCashOut(null, null, null, null, false, this);
    }
}
