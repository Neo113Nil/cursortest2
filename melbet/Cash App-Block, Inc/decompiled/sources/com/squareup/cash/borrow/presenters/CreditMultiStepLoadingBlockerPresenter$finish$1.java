package com.squareup.cash.borrow.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class CreditMultiStepLoadingBlockerPresenter$finish$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CreditMultiStepLoadingBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditMultiStepLoadingBlockerPresenter$finish$1(CreditMultiStepLoadingBlockerPresenter creditMultiStepLoadingBlockerPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = creditMultiStepLoadingBlockerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CreditMultiStepLoadingBlockerPresenter.access$finish(this.this$0, this);
    }
}
