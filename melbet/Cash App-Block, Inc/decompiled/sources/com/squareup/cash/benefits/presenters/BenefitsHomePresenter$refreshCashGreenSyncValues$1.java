package com.squareup.cash.benefits.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BenefitsHomePresenter$refreshCashGreenSyncValues$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BenefitsHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsHomePresenter$refreshCashGreenSyncValues$1(BenefitsHomePresenter benefitsHomePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = benefitsHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return BenefitsHomePresenter.access$refreshCashGreenSyncValues(this.this$0, this);
    }
}
