package com.squareup.cash.clientrouting.routers.tapToPay;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class TapToPayRouter$route$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TapToPayRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapToPayRouter$route$1(TapToPayRouter tapToPayRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tapToPayRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route(null, this);
    }
}
