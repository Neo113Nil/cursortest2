package com.squareup.cash.afterpayapplet.backend.real;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealAfterpayEligibleRetroTransactionsProvider$processTransactions$1 extends ContinuationImpl {
    public ArrayList L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAfterpayEligibleRetroTransactionsProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAfterpayEligibleRetroTransactionsProvider$processTransactions$1(RealAfterpayEligibleRetroTransactionsProvider realAfterpayEligibleRetroTransactionsProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAfterpayEligibleRetroTransactionsProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.processTransactions(null, this);
    }
}
