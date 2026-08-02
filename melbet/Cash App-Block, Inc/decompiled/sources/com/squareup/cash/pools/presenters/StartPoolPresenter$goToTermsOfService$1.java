package com.squareup.cash.pools.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class StartPoolPresenter$goToTermsOfService$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StartPoolPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartPoolPresenter$goToTermsOfService$1(StartPoolPresenter startPoolPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = startPoolPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return StartPoolPresenter.access$goToTermsOfService(this.this$0, this);
    }
}
