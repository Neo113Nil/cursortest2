package com.squareup.cash.afterpayapplet.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class AfterpaySearchPresenter$models$performSearch$1 extends ContinuationImpl {
    public LocalHomePresenter L$1;
    public Ref$ObjectRef L$2;
    public MutableState L$3;
    public MutableState L$4;
    public MutableState L$5;
    public MutableState L$6;
    public ArrayList L$7;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalHomePresenter.access$models$performSearch(null, null, null, null, null, null, null, this);
    }
}
