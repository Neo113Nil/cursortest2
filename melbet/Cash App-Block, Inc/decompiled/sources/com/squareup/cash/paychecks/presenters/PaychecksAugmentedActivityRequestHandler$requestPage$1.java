package com.squareup.cash.paychecks.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class PaychecksAugmentedActivityRequestHandler$requestPage$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PaychecksAugmentedActivityRequestHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaychecksAugmentedActivityRequestHandler$requestPage$1(PaychecksAugmentedActivityRequestHandler paychecksAugmentedActivityRequestHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = paychecksAugmentedActivityRequestHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.requestPage(null, null, this);
    }
}
