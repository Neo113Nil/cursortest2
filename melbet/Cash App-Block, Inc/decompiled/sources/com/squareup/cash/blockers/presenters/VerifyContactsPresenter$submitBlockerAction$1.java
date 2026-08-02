package com.squareup.cash.blockers.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class VerifyContactsPresenter$submitBlockerAction$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VerifyContactsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyContactsPresenter$submitBlockerAction$1(VerifyContactsPresenter verifyContactsPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = verifyContactsPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return VerifyContactsPresenter.access$submitBlockerAction(this.this$0, null, this);
    }
}
