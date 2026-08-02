package com.squareup.cash.family.familyhub.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPendingRequestActivityManager$formatActivityData$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPendingRequestActivityManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPendingRequestActivityManager$formatActivityData$1(RealPendingRequestActivityManager realPendingRequestActivityManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPendingRequestActivityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealPendingRequestActivityManager.access$formatActivityData(this.this$0, null, this);
    }
}
