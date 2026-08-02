package com.squareup.cash.observability.backend.real.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealRequestObserver$maybeObserveRequest$1 extends ContinuationImpl {
    public String L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealRequestObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealRequestObserver$maybeObserveRequest$1(RealRequestObserver realRequestObserver, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realRequestObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.maybeObserveRequest(null, null, null, null, this);
    }
}
