package com.squareup.cash.investing.presenters.stockdetails;

import com.squareup.cash.history.payments.presenters.CounterpartyPageRequestHandler;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingStockDetailsActivityRequestHandler$requestPage$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CounterpartyPageRequestHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingStockDetailsActivityRequestHandler$requestPage$1(CounterpartyPageRequestHandler counterpartyPageRequestHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = counterpartyPageRequestHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.requestPage(null, null, this);
    }
}
