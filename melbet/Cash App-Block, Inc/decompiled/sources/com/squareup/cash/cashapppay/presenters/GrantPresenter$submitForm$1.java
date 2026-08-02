package com.squareup.cash.cashapppay.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class GrantPresenter$submitForm$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GrantPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrantPresenter$submitForm$1(GrantPresenter grantPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = grantPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return GrantPresenter.access$submitForm(this.this$0, null, this);
    }
}
