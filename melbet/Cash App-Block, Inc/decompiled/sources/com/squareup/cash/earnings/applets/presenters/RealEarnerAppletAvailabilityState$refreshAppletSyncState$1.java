package com.squareup.cash.earnings.applets.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealEarnerAppletAvailabilityState$refreshAppletSyncState$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealEarnerAppletAvailabilityState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealEarnerAppletAvailabilityState$refreshAppletSyncState$1(RealEarnerAppletAvailabilityState realEarnerAppletAvailabilityState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realEarnerAppletAvailabilityState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.refreshAppletSyncState(this);
    }
}
