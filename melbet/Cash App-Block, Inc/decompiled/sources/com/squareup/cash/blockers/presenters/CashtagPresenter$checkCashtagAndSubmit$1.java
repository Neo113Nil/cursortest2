package com.squareup.cash.blockers.presenters;

import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class CashtagPresenter$checkCashtagAndSubmit$1 extends ContinuationImpl {
    public RealBrandFollowPresenter$models$2$1$1 L$1;
    public RealBrandFollowPresenter$models$2$1$1 L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashtagPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashtagPresenter$checkCashtagAndSubmit$1(CashtagPresenter cashtagPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cashtagPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CashtagPresenter.access$checkCashtagAndSubmit(this.this$0, null, null, null, this);
    }
}
