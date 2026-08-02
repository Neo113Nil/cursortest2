package com.squareup.cash.investing.backend.real.analytics;

import com.squareup.cash.cdf.stock.EquityType;
import com.squareup.cash.cdf.stock.ScreenSource;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealInvestingAnalytics$trackStockSelectCategory$1 extends ContinuationImpl {
    public ScreenSource L$1;
    public EquityType L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealInvestingAnalytics this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInvestingAnalytics$trackStockSelectCategory$1(RealInvestingAnalytics realInvestingAnalytics, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realInvestingAnalytics;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.trackStockSelectCategory(null, null, null, this);
    }
}
