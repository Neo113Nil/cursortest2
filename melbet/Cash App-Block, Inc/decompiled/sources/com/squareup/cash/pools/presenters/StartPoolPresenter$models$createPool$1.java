package com.squareup.cash.pools.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.pools.backend.api.CreatePoolResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class StartPoolPresenter$models$createPool$1 extends ContinuationImpl {
    public StartPoolPresenter L$0;
    public MutableState L$1;
    public CreatePoolResult L$4;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return StartPoolPresenter.access$models$createPool(null, null, null, null, this);
    }
}
