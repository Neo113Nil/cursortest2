package com.squareup.cash.security.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class SetPasswordPresenter$setOrVerifyPasswordApi$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SetPasswordPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPasswordPresenter$setOrVerifyPasswordApi$1(SetPasswordPresenter setPasswordPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = setPasswordPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.setOrVerifyPasswordApi(false, null, this);
    }
}
