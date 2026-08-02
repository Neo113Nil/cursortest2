package com.squareup.cash.security.presenters;

import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class BasePasswordPresenter$submitForm$1 extends ContinuationImpl {
    public MutableState L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BasePasswordPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePasswordPresenter$submitForm$1(BasePasswordPresenter basePasswordPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = basePasswordPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return BasePasswordPresenter.access$submitForm(this.this$0, null, null, this);
    }
}
