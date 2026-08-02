package com.squareup.cash.investing.presenters;

import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1(RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621 c00621, Continuation continuation) {
        super(continuation);
        this.this$0 = c00621;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
