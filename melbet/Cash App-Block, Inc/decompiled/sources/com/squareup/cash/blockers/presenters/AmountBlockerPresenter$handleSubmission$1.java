package com.squareup.cash.blockers.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class AmountBlockerPresenter$handleSubmission$1 extends ContinuationImpl {
    public Function0 L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AmountBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountBlockerPresenter$handleSubmission$1(AmountBlockerPresenter amountBlockerPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = amountBlockerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return AmountBlockerPresenter.access$handleSubmission(this.this$0, null, null, null, this);
    }
}
