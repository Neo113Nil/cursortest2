package com.squareup.cash.bitcoin.views.compose;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class CopyCheckIconState$showCheck$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CopyCheckIconState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyCheckIconState$showCheck$1(CopyCheckIconState copyCheckIconState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = copyCheckIconState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.showCheck(this);
    }
}
