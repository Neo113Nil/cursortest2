package com.squareup.cash.investing.presenters.stockdetails;

import com.squareup.cash.limits.presenters.LimitsPresenter$models$lambda$2$$inlined$map$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LimitsPresenter$models$lambda$2$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingStockDetailsPresenter$models$lambda$35$$inlined$map$1$2$1(LimitsPresenter$models$lambda$2$$inlined$map$1$2 limitsPresenter$models$lambda$2$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = limitsPresenter$models$lambda$2$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
