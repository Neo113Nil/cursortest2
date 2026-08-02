package com.squareup.cash.investing.presenters.holdings;

import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingEtfHoldingsPresenter$models$lambda$0$$inlined$map$1$2$1(InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2 investingPortfolioPresenter$models$lambda$6$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = investingPortfolioPresenter$models$lambda$6$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
