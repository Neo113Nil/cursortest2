package com.squareup.cash.data.contacts;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealContactSyncEventAggregator$stopContactsReading$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealContactSyncEventAggregator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactSyncEventAggregator$stopContactsReading$1(RealContactSyncEventAggregator realContactSyncEventAggregator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realContactSyncEventAggregator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.stopContactsReading(this);
    }
}
