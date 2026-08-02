package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class FormBlockerPresenter$models$handleSubmitAction$1 extends ContinuationImpl {
    public FormBlockerPresenter L$0;
    public MutableState L$2;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FormBlockerPresenter.access$models$handleSubmitAction(null, null, null, null, null, this);
    }
}
