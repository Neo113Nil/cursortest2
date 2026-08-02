package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.squareup.cash.recipients.data.Recipient;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class MainPaymentPresenter$models$addRecipient$1 extends ContinuationImpl {
    public MainPaymentPresenter L$0;
    public MutableState L$1;
    public MutableState L$2;
    public State L$3;
    public String L$4;
    public Recipient L$5;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return MainPaymentPresenter.models$addRecipient(null, null, null, null, null, null, this);
    }
}
