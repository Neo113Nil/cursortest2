package com.squareup.cash.google.pay;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class GooglePayPresenter$reportFailure$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GooglePayPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPresenter$reportFailure$1(GooglePayPresenter googlePayPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = googlePayPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return GooglePayPresenter.access$reportFailure(this.this$0, null, this);
    }
}
