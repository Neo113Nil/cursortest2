package com.squareup.cash.data.contacts;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ContactSyncRoutineAggregator$hasNotStarted$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealContactSyncRoutineAggregator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSyncRoutineAggregator$hasNotStarted$1(RealContactSyncRoutineAggregator realContactSyncRoutineAggregator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realContactSyncRoutineAggregator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealContactSyncRoutineAggregator.hasNotStarted$suspendImpl(this.this$0, this);
    }
}
