package com.squareup.cash.blockers.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class EarnerEnrollmentBlockerPresenter$progressToNextScreen$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EarnerEnrollmentBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarnerEnrollmentBlockerPresenter$progressToNextScreen$1(EarnerEnrollmentBlockerPresenter earnerEnrollmentBlockerPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = earnerEnrollmentBlockerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return EarnerEnrollmentBlockerPresenter.access$progressToNextScreen(this.this$0, null, this);
    }
}
