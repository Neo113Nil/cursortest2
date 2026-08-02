package com.squareup.cash.security.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class VerifyPasswordPresenter$setOrVerifyPasswordApi$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VerifyPasswordPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPasswordPresenter$setOrVerifyPasswordApi$1(VerifyPasswordPresenter verifyPasswordPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = verifyPasswordPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.setOrVerifyPasswordApi(false, null, this);
    }
}
