package com.squareup.cash.card.onboarding;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class TagOrderConfirmationPresenter$handleContinue$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TagOrderConfirmationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagOrderConfirmationPresenter$handleContinue$1(TagOrderConfirmationPresenter tagOrderConfirmationPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tagOrderConfirmationPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TagOrderConfirmationPresenter.access$handleContinue(this.this$0, this);
    }
}
