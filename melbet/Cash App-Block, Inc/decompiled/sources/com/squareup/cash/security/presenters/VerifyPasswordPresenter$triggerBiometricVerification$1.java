package com.squareup.cash.security.presenters;

import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class VerifyPasswordPresenter$triggerBiometricVerification$1 extends ContinuationImpl {
    public MutableState L$0;
    public String L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VerifyPasswordPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyPasswordPresenter$triggerBiometricVerification$1(VerifyPasswordPresenter verifyPasswordPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = verifyPasswordPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.triggerBiometricVerification(null, this);
    }
}
