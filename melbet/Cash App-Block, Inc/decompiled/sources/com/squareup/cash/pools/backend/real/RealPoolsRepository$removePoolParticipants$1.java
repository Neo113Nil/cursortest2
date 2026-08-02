package com.squareup.cash.pools.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPoolsRepository$removePoolParticipants$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPoolsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPoolsRepository$removePoolParticipants$1(RealPoolsRepository realPoolsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPoolsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.removePoolParticipants(null, null, this);
    }
}
