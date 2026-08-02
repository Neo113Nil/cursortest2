package com.squareup.cash.blockers.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class InputCardInfoPresenter$initiatePayment$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InputCardInfoPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputCardInfoPresenter$initiatePayment$1(InputCardInfoPresenter inputCardInfoPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = inputCardInfoPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return InputCardInfoPresenter.access$initiatePayment(this.this$0, null, this);
    }
}
